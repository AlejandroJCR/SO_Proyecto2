package proyectoso2;
import java.util.concurrent.Semaphore;


public class BattleArena {
    Proyecto2GUI GUI;
    Semaphore semArena;
    Character fighter1, fighter2;
    Studio studio1, studio2;
    LinkedList<Character> winners; 
    
    public BattleArena(Proyecto2GUI GUI){
        semArena =  new Semaphore(1);
        studio1 = new Studio("Nintendo");
        studio2 = new Studio("Capcom");
        winners = new LinkedList<>();
        this.GUI = GUI;
    }
    
    public Character chooseFighter(Studio studio){
        Character c = null;
        if(!studio.p1.isEmpty()){
            c = studio.p1.dequeue();
            if(studio.name.equals("Nintendo"))
                GUI.updateP1QueueS1();
            else
                GUI.updateP1QueueS2();
        }
        else if(!studio.p2.isEmpty()){
            c = studio.p2.dequeue();
            if(studio.name.equals("Nintendo"))
                GUI.updateP2QueueS1();
            else
                GUI.updateP2QueueS2();
        }
        else if(!studio.p3.isEmpty()){
            c = studio.p3.dequeue();
            if(studio.name.equals("Nintendo"))
                GUI.updateP3QueueS1();
            else
                GUI.updateP3QueueS2();
        }
        return c;
    }
                    
    public Character[] getFighters(){
        Character[] fighters = new Character[2];
        fighters[0] = fighter1;
        fighters[1] = fighter2;
        return fighters;
    }
    
    public void addWinner(Character winner){
        winners.append(winner);
    }
    
    public void waitSemaphore(){
        try{
            semArena.acquire();
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught");
        }
    }
    
    public void releaseSemaphore(){
        semArena.release();
    }
}