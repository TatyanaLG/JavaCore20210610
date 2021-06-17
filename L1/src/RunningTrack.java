public class RunningTrack {
    protected int length;

    public RunningTrack(int aLength){
        this.length = aLength;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    //public String done(int aPotential){
    public boolean done(int aPotential){
        //System.out.println("Препятствие БЕГОВАЯ ДОРОЖКА не пройдено");
        //return "Препятствие БЕГОВАЯ ДОРОЖКА не пройдено";
        if (aPotential >= this.length) {
            //System.out.println("Препятствие БЕГОВАЯ ДОРОЖКА пройдено");
            //return "Препятствие БЕГОВАЯ ДОРОЖКА пройдено";
            return true;
        }
        else return false;
    }

}
