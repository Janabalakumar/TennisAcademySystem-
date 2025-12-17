import java.util.ArrayList;
public class TrainingSession {
    private Coach coach;
    private ArrayList<Player> players = new ArrayList<>();
    private String sessionType;

    public TrainingSession(Coach coach, String sessionType){
        this.coach = coach;
        this.sessionType = sessionType;
    }

    public void addPlayer(Player player){
        players.add(player);
        System.out.println(player.getName() + " Added to Session");
    }

    public void showSessionDetails(){
        System.out.println("Session Type " + sessionType);
        System.out.println("Coach: " + coach.getName());
        System.out.println("Players: ");
        for(Player p : players){
            System.out.println(p);
        }
    }
}