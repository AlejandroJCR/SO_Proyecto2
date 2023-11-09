package proyectoso2;
import java.util.concurrent.Semaphore;


public class BattleArena {
    Semaphore semArena;
    Character fighter1, fighter2;
    Studio studio1, studio2;
    
    public BattleArena(){
        semArena =  new Semaphore(1);
        studio1 = new Studio("Nintendo");
        studio2 = new Studio("Capcom");
    }
    
    public void setFighters(Character fighter1, Character fighter2){
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
    }
    
    public Character[] getFighters(){
        Character[] fighters = new Character[2];
        fighters[0] = fighter1;
        fighters[1] = fighter2;
        return fighters;
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