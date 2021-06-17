public class Human {
    protected String name;
    protected int potentialHigh;
    protected int potentialLength;
    //public Huma

    public Human(String aName,
                 int aMaxHigh,
                 int aMaxLength){
        this.name = aName;
        this.potentialHigh = aMaxHigh;
        this.potentialLength= aMaxHigh;
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

    void run(){
        System.out.println("Человек бежит");
    }

    void jump(){
        System.out.println("Человек прыгает");
    }
}
