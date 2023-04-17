package targets;

public class TargetBuilder {
    private String targetElementName;

    TargetBuilder(String targetElementName) {
        this.targetElementName = targetElementName;
    }

    public Target locatedByTag(String tag) {
        return new EmulatorTarget(this.targetElementName, tag);
    }

    public Target locatedByCoordinate(Coordinate coordinateSelector) {
        return new EmulatorTarget(this.targetElementName, coordinateSelector);
    }

}
