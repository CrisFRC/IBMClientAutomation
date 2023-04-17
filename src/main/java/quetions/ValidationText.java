package quetions;

import targets.Coordinate;
import targets.Target;
import tasks.GetString;

public class ValidationText {

    private Target target;

    public ValidationText(Target target) {

        this.target = target;

    }

    public static String of(Target target){
        Coordinate coordinate = target.getCoordinate();
        return GetString.getString(coordinate.getRow(),coordinate.getInitialColumn(),coordinate.getLength()).trim();
    }
}
