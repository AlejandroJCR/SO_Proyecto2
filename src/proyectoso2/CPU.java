package proyectoso2;

public class CPU extends Thread{
    BattleArena arena;
    int velocity;
    enum Result {WINNER, TIE, NULL}
    
    public CPU(BattleArena arena, int velocity) {
        this.arena = arena;
        this.velocity = velocity;
    }
    
    public void processWinner(Character fighter1, Character fighter2){
        // Choose winner based on its attributes
        // Store winner in list of winners
        // Erase loser from simulation
    }
    
    public void processTie(Character fighter1, Character fighter2){
        // Put both caracters in their priority 1 queue
        arena.studio1.addToP1(fighter1);
        arena.studio2.addToP1(fighter2);
    }
    
    public void processNull(Character fighter1, Character fighter2){
        // Put both caracters in their reenforcement queue
        arena.studio1.addToP1(fighter1);
        arena.studio2.addToP1(fighter2);
    }
    
    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                
                // Wait for result
                Thread.sleep(10*1000/velocity);
                
                arena.waitSemaphore();
                
                Character[] fighters = arena.getFighters();
                if(fighters[0] == null || fighters[1] == null){
                    arena.releaseSemaphore();
                    continue;
                }
                
                // Process result
                int random = (int)(Math.random() * 100);
                if(random <= 40){
                    processWinner(fighters[0], fighters[1]);
                } else if(random <= 67){
                    processTie(fighters[0], fighters[1]);
                } else {
                    processNull(fighters[0], fighters[1]);
                }     
                
                arena.releaseSemaphore();
            }   
        } catch(InterruptedException e){
            //Thread killed
        }
        
    }
}
