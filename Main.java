public class Main {
    public static void main(String[] args){
        Player p1 = new Player(1 , "Jana", 18, 3);
        Player p2 = new Player(2, "Rajesh", 20, 3);

        Coach coach = new Coach(101, "Durai Dilip Kumar", "ForeHand and Serve");

        TrainingSession session = new TrainingSession(coach, "Morning Practice");

        session.addPlayer(p1);
        session.addPlayer(p2);

        TennisAcademy academy = new TennisAcademy();
        academy.startSession(session);
    }
}
