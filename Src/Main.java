public class Main {
    public static void main(String[] args) {
        FitnessTracker judy = new FitnessTracker("Judy", 10,6,1998,"judys@gmail.com",
                125478548,"Stray",60,"120/60",20000);
        FitnessTracker ann = new FitnessTracker("Ann", 20,9,1997,"annhar@gmail.com",
                145845896,"Heil",72,"140/80",10000);
        FitnessTracker stan = new FitnessTracker("Stan", 4,12,2000,"stank@gmail.com",
                112512545,"Killy",90,"130/60",30000);

        ann.printAccountInfo();
        judy.printAccountInfo();
        stan.printAccountInfo();

        judy.setWeight(judy.getWeight()-5);
        judy.setCountStep(30000);
        stan.setBloodPressure("140/80");
        stan.setSurname("Cubrik");

        ann.printAccountInfo();
        judy.printAccountInfo();
        stan.printAccountInfo();



    }
}
