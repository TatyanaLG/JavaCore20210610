public class Wall {
    protected int high;

    public Wall(int aHigh){
        this.high = aHigh;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    //public String done(int aPotential){
    public Boolean done(int aPotential){
        //            System.out.println("Препятствие СТЕНА не пройдено");
        //return "Препятствие СТЕНА не пройдено";
        if (aPotential >= this.high) {
//            System.out.println("Препятствие СТЕНА пройдено");
            //return "Препятствие СТЕНА пройдено";
            return true;
        }
        else return false;
    }
}
