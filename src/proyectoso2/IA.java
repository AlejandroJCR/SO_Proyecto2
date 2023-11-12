package proyectoso2;

public class IA extends Thread{
    BattleArena arena;
    int velocity;
    enum Result {WINNER, TIE, NULL}
    enum Status {WAITING, PROCESSING, ANNOUNCING}
    
    public IA(BattleArena arena, int velocity) {
        this.arena = arena;
        this.velocity = velocity;
    }
    
    public void processWinner(Character fighter1, Character fighter2){
        // Choose winner based on its attributes
        // Store winner in list of winners
        // Erase loser from simulation
        Character winner = fighter1;
        arena.winners.append(winner);
        if(winner.equals(fighter1)){
            arena.studio1.winners++;
        } else {
            arena.studio2.winners++;
        }
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
                arena.waitSemaphore();
                Character[] fighters = arena.getFighters();
                if(fighters[0] == null || fighters[1] == null){
                    arena.releaseSemaphore();
                    continue;
                }
                System.out.println("ia");
                // Wait for result
                Thread.sleep(10*1000/velocity);
                
                
                
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
