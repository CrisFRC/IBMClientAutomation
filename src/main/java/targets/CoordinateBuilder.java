package targets;

import lombok.Data;

@Data
public class CoordinateBuilder {

    private int row;
    private int initialColumn;
    private int finalColumn;
    private int length;

    CoordinateBuilder(int row) {
        this.row = row;
    }

    public CoordinateBuilder withInitialColumn(int initialColumn) {
        this.initialColumn = initialColumn;
        return this;
    }

    public CoordinateBuilder withFinalColumn(int finalColumn) {
        this.finalColumn = finalColumn;
        return this;
    }

    public Coordinate andLength(int length) {
        this.length = length;
        this.calculateFinalColumnIfItIsEmpty(length);
        return new Coordinate(this);
    }

    private void calculateFinalColumnIfItIsEmpty(int length) {
        if (this.finalColumn == 0) {
            this.finalColumn = this.initialColumn + length - 1;
        }
    }


}
