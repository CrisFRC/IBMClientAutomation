package targets;

import exceptions.TagException;

public abstract class Target {

    protected String targetElementName;

    public Target(String targetElementName) {
        this.targetElementName = targetElementName;
    }

    public String toString() {
        return this.targetElementName;
    }

    public static TargetBuilder the(String targetElementName) {
        return new TargetBuilder(targetElementName);
    }

    public abstract Target called(String var1) throws TagException;

    public abstract String getTag();

    public abstract Coordinate getCoordinate();

    public abstract void update();

    public String getName() {
        return this.targetElementName;
    }

}
