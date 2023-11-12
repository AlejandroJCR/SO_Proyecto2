package proyectoso2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Studio {
    String name;
    int winners;
    Queue<Character> p1, p2, p3, reinforcement, characters;
    
    public Studio(String name){
        this.name = name;
        p1 = new Queue<>();
        p2 = new Queue<>();
        p3 = new Queue<>();
        reinforcement = new Queue<>();
        characters = new Queue<>();
        loadCharacters();
    }
    
    public void loadCharacters(){
        String filename = System.getProperty("user.dir") + "\\src\\" + name + "Characters.txt" ;
      
        try{
           File myObj = new File(filename);
           Scanner myReader = new Scanner(myObj);
           
           for(int i=0; i < 10; i++){
                String line = myReader.nextLine();
                String nameC = line;
                line = myReader.nextLine();
                int hp = Integer. parseInt(line.split(": ")[1]);
                line = myReader.nextLine();
                int strength = Integer. parseInt(line.split(": ")[1]);
                line = myReader.nextLine();
                int agility = Integer. parseInt(line.split(": ")[1]);
                line = myReader.nextLine();
                String abilities = line.split(": ")[1];
                line = myReader.nextLine();
                
                Character newCharacter = new Character(nameC, hp, strength, agility, abilities);
                System.out.println(nameC + newCharacter.qualityAttrs);
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
    
    public void addNewCharacterToQueue(){
        Character c = characters.dequeue();
        switch(c.qualityAttrs){
            case 0 -> p3.enqueue(c);
            case 1, 2 -> p2.enqueue(c);
            case 3 -> p1.enqueue(c);                     
        }
    }
    
    public void updateCounter(){
        Node<Character> node = p2.front;
        while(node != null){
            Character c = node.data;
            boolean movePriority = c.updateCounter();
            if(movePriority){
                p2.remove(c);
                p1.enqueue(c);
            }
            node = node.next;
        }
        
        node = p3.front;
        while(node != null){
            Character c = node.data;
            boolean movePriority = c.updateCounter();
            if(movePriority){
                p3.remove(c);
                p2.enqueue(c);
            }
            node = node.next;
        }
    }
}
