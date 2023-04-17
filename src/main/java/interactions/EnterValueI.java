package interactions;

import targets.Coordinate;
import targets.Target;
import tasks.PutString;

public class EnterValueI {

    private Coordinate coordinate;
    private  String name;
    private  String text;
    private Target target;


    public EnterValueI(String text, Target target) {
        this.text = text;
        this.target = target;
        this.target.update();
        this.name = this.target.getName();
        this.coordinate = this.target.getCoordinate();
    }

    private int getColumn(){
        return this.target.getTag().isEmpty() ? this.coordinate.getInitialColumn() : this.coordinate.getFinalColumn();
    }

    public void enterValue(){
        PutString.putString(this.text, this.coordinate.getRow(), this.getColumn());
    }




}
