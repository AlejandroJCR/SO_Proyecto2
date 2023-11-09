package proyectoso2;

public class CPU extends Thread{
    BattleArena arena;
    enum Result {WINNER, TIE, NULL}
    
    public CPU(BattleArena arena) {
        this.arena = arena;
    }
    
    public void processWinner(){
        // Choose winner based on its attributes
        // Store winner in list of winners
        // Erase loser from simulation
    }
    
    public void processTie(){
        // Put both caracters in their priority 1 queue IN THE LAST POSITION
    }
    
    public void processNull(){
        // Put both caracters in their reenforcement queue
    }
    
    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                
                // Wait for result
                Thread.sleep(10*1000);
                
                // Process result
                int random = (int)(Math.random() * 100);
                if(random <= 40){
                    processWinner();
                } else if(random <= 67){
                    processTie();
                } else {
                    processNull();
                }     
            }   
        } catch(InterruptedException e){
            //Thread killed
        }
        
    }
}
