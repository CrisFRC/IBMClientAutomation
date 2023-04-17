package targets;




import controller.LocateText;
import exceptions.CoordinateException;
import exceptions.TagException;

import java.util.Optional;

public class EmulatorTarget extends Target {

    private Coordinate coordinate;
    private Optional<String> tag;
    EmulatorTarget(String targetElementName, String tag) {
        super(targetElementName);
        this.tag = Optional.of(tag);
        this.locatedByTag(tag);
    }

    EmulatorTarget(String targetElementName, Coordinate coordinateSelector ){
        super(targetElementName);
        this.coordinate = coordinateSelector;
        this.tag = Optional.empty();
    }

    private void locatedByTag(String tag) {
        try {
            String[] position = LocateText.locateText(tag).split("/");
            this.coordinate = Coordinate.withRow(Integer.parseInt(position[0])).withInitialColumn(Integer.parseInt(position[1])).withFinalColumn(Integer.parseInt(position[2])).andLength(Integer.parseInt(position[3]));
        } catch (CoordinateException var3) {
            throw new TagException(tag, var3);
        }
    }

    public void update() {
        this.tag.ifPresent(this::locatedByTag);
    }

    public Target called(String name) {
        return this.tag.map(s -> new EmulatorTarget(name, s)).
                orElseGet(() -> new EmulatorTarget(name, this.coordinate));
    }

    public String getTag() {
        return (String)this.tag.orElse("");
    }

    public Coordinate getCoordinate() {
        return this.coordinate;
    }

}
