public class Coach {
      private int coachId;
      private String name;
      private String specialization; 
      
      public Coach(int coachId, String name, String specialization){
        this.coachId = coachId;
        this.name = name;
        this.specialization = specialization;
      }

      public String getName(){
        return name;
      }

      public String toString(){
        return coachId + " | Coach name: " + name + " | Specialzation: " + specialization;
      }
}
