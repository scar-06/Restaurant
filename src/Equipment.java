public class Equipment {
    private String name;
    private String function;
    private int units;

    public Equipment(String name, String function, int units) {
        this.name = name;
        this.function = function;
        this.units = units;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }
}
