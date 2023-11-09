package proyectoso2;

public class Character {
    String PID;
    int priority;
    int counter;
    
    //Atributes
    String name;
    int qualityAttrs = 0;
    int hitPoints, strength, agility;
    
    public Character(){
        counter = 0;
        getInitialPriority();
    }
    
    public void checkQuality(int probability){
        int random = (int)(Math.random() * 100);
        if(random <= probability){
            qualityAttrs++;
        }   
    }
    
    public void updateCounter(){
        counter++;
        if(counter == 8){
            if(priority != 1){
                counter = 0;
                priority -= 1;
            }
        }
    }
    
    public void getInitialPriority(){
        checkQuality(60); //Abilities
        checkQuality(70); // Hit Points
        checkQuality(50); // Strenght
        checkQuality(40); // Agility
    }
}
