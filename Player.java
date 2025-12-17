public class Player{
    private int playerId;
    private String name;
    private int age;
    private int skillLevel;
    public Player(int playerId, String name, int age, int skillLevel){
        this.playerId = playerId;
        this.name = name;
        this.age = age;
        this.skillLevel = skillLevel;
    }
    public String getName(){
        return name;
    }

    public int getSkillLevel(){
        return skillLevel;
    }

    public String toString(){
        return playerId + " | " +  name + " | Age: " + age + " | Skill level: " + skillLevel;
    }
}