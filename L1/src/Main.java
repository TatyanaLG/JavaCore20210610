public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Cat", 1, 100);
        cat1.jump();
        cat1.run();

        Human human1 = new Human("Human", 2, 1000);
        human1.jump();
        human1.run();

        Robot robot1 = new Robot("Robot", 1, 5000);
        robot1.jump();
        robot1.run();

        Wall wall1 = new Wall(1);
        Wall wall2 = new Wall(2);

        RunningTrack rt1 = new RunningTrack(100);
        RunningTrack rt2 = new RunningTrack(5000);


        Object [] participant = {cat1, human1, robot1};
        Object [][] obstacles = {{wall1, rt1},{wall1, rt2},{wall2, rt2}};
        Wall tmpWall;
        RunningTrack tmpRT;
        Cat tmpCat;
        Human tmpHuman;
        Robot tmpRobot;
        String sName;
        int iHigh;
        int iLength;

        System.out.println(participant[0].getClass().toString());
        String str;
        for (int i = 0;  i < participant.length; i++){
            str = (participant[i].getClass().toString());
            switch (str) {
                case "class Cat":
                    tmpCat = (Cat) participant[i];
                    sName = tmpCat.name;
                    iHigh= tmpCat.potentialHigh;
                    iLength = tmpCat.potentialLength;
                break;

                case "class Human":
                    tmpHuman = (Human) participant[i];
                    sName = tmpHuman.name;
                    iHigh= tmpHuman.potentialHigh;
                    iLength = tmpHuman.potentialLength;
                break;

                case "class Robot":
                    tmpRobot = (Robot) participant[i];
                    sName = tmpRobot.name;
                    iHigh= tmpRobot.potentialHigh;
                    iLength = tmpRobot.potentialLength;
                break;
                default:
                    throw new IllegalStateException("Unexpected value: " + str);
            }


            tmpWall = (Wall) obstacles[i][0];
            tmpRT = (RunningTrack)obstacles[i][1];

            if (tmpWall.done(iHigh)) {
                System.out.println(sName + ": препятствие СТЕНА пройдено.");
                if (tmpRT.done(iLength)) {
                    System.out.println(sName + ": препятствие БЕГОВАЯ ДОРОЖКА пройдено.");
                }
                else{
                    System.out.println(sName + ": препятствие БЕГОВАЯ ДОРОЖКА не пройдено.");
                }
            }
            else {
                System.out.println(sName + ": препятствие СТЕНА не пройдено.");
                System.out.println(sName + " сошел с дистанции.");
            }
            //System.out.println(sName + ": " + tmpWall.done(iHigh));
            //System.out.println(sName + ": " + tmpRT.done(iLength));
            System.out.println("====================");


        }
    }
}
