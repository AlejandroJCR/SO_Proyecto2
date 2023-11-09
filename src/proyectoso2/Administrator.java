package proyectoso2;

public class Administrator extends Thread{
    BattleArena arena;
    int turn = 0;
    
    public Administrator(BattleArena arena){
        this.arena = arena;
    }
    
    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            arena.waitSemaphore();
            turn++;
            if(turn % 3 == 0){
                int random = (int)(Math.random() * 100);
                if(random <= 80){

                }
            }  
            arena.releaseSemaphore();
        }   
    }
}
