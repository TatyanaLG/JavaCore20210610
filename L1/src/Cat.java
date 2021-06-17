public class Cat {
    protected String name;
    protected int potentialHigh;
    protected int potentialLength;
//    protected int hWall;
//    protected int lRunningTrack;

    public Cat(String aName,
//               int ahWall,
//               int alRunningTrack,
//               Wall ahWall,
//               RunningTrack alRunningTrack,
               int aPotentialHigh,
               int aPotentialLength
               ){
        this.name = aName;
        //this.hWall = ahWall.getHigh();
        //this.lRunningTrack = alRunningTrack.;
        this.potentialHigh = aPotentialHigh;
        this.potentialLength = aPotentialLength;
    }

    void run(){
        System.out.println("Кот бежит");
    }

    void jump(){
        System.out.println("Кот прыгает");
//        Wall catWall = new Wall(this.hWall);
//        RunningTrack catRT = new RunningTrack()(this.lRunningTrack)
//        catWall.done(this.potentialHigh);
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
