package targets;

import exceptions.CoordinateException;
import lombok.Data;

@Data
public class Coordinate {


    private int row;
    private int initialColumn;
    private int finalColumn;
    private int length;

    Coordinate(CoordinateBuilder builder) {
        this.row = builder.getRow();
        this.initialColumn = builder.getInitialColumn();
        this.finalColumn = builder.getFinalColumn();
        this.length = builder.getLength();
        this.validateStatus();
    }
    private void validateStatus(){
        if (this.row <= 0 || this.initialColumn <= 0 || this.finalColumn <= 0 || this.length <= 0) {
            throw new CoordinateException(this);
        }
    }

    public static CoordinateBuilder withRow(int row) {
        return new CoordinateBuilder(row);
    }

    public String toString() {
        return "Coordinate(row=" + this.row + ", initialColumn=" + this.initialColumn + ", finalColumn=" + this.finalColumn + ", length=" + this.length + ")";
    }


}
