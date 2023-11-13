package proyectoso2;
        
public class Character {
    String PID;
    int priority;
    int counter;
    
    //Atributes
    String name;
    int qualityAttrs = 0;
    int hitPoints, strength, agility;
    String abilities;
    
    public Character(String name, int hitPoints, int stregth, int agility, String abilities){
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = stregth;
        this.agility = agility;
        this.abilities = abilities;
        counter = 0;
        getInitialPriority();
    }
    
    public void checkQuality(int probability){
        int random = (int)(Math.random() * 100);
        if(random <= probability){
            qualityAttrs++;
        }   
    }
    
    public boolean updateCounter(){
        counter++;
        if(counter == 8){
            if(priority != 1){
                counter = 0;
                priority -= 1;
                return true;
            }
        }
        return false;
    }
    
    public void getInitialPriority(){
        checkQuality(60); //Abilities
        checkQuality(70); // Hit Points
        checkQuality(50); // Strenght
        checkQuality(40); // Agility
        
        switch(qualityAttrs){
            case 0 -> priority = 3;
            case 1, 2 -> priority = 2;
            case 3 -> priority = 1;                     
        }
    }
}
