package proyectoso2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Studio {
    String name;
    int winners;
    Queue<Character> p1, p2, p3, reinforcement;
    LinkedList<Character> characters; 
    
    public Studio(String name){
        this.name = name;
        p1 = new Queue<>();
        p2 = new Queue<>();
        p3 = new Queue<>();
        reinforcement = new Queue<>();
        characters = new LinkedList();
        loadCharacters();
    }
    
    public void loadCharacters(){
        String filename = System.getProperty("user.dir") + "\\src\\" + name + "Characters.txt" ;
      
        try{
           File myObj = new File(filename);
           Scanner myReader = new Scanner(myObj);
           
           for(int i=0; i < 10; i++){
                String line = myReader.nextLine();
                String name = line;
                line = myReader.nextLine();
                int hp = Integer. parseInt(line.split(": ")[1]);
                line = myReader.nextLine();
                int strength = Integer. parseInt(line.split(": ")[1]);
                line = myReader.nextLine();
                int agility = Integer. parseInt(line.split(": ")[1]);
                line = myReader.nextLine();
                String abilities = line.split(": ")[1];
                line = myReader.nextLine();
                
                Character newCharacter = new Character(name, hp, strength, agility, abilities);
                characters.append(newCharacter);
                
                switch(newCharacter.qualityAttrs){
                    case 0 -> p3.enqueue(newCharacter);
                    case 1, 2 -> p2.enqueue(newCharacter);
                    case 3 -> p1.enqueue(newCharacter);                     
                }
           }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
    public void addToP1(Character fighter){
        p1.enqueue(fighter);
    }
    
    public void addToReinforcement(Character fighter){
        p1.enqueue(fighter);
    }
}
