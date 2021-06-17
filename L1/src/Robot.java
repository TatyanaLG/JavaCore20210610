public class Robot {
    protected String name;
    protected int potentialHigh;
    protected int potentialLength;

    public Robot(String aName,
                 int aMaxHigh,
                 int aMaxLength) {
        this.name = aName;
        this.potentialHigh = aMaxHigh;
        this.potentialLength = aMaxLength;
    }

    void run() {
        System.out.println("Робот бежит");
    }

    void jump() {
        System.out.println("Робот прыгает");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPotentialHigh() {
        return potentialHigh;
    }

    public void setPotentialHigh(int potentialHigh) {
        this.potentialHigh = potentialHigh;
    }

    public int getPotentialLength() {
        return potentialLength;
    }

    public void setPotentialLength(int potentialLength) {
        this.potentialLength = potentialLength;
    }
}
