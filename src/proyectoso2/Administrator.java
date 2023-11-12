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
            Character[] fighters = arena.getFighters();
            if(fighters[0] != null || fighters[1] != null){
                arena.releaseSemaphore();
                continue;
            }
                          
            System.out.println("admin");
            turn++;
            
            // Set fighters
            arena.fighter1 = arena.chooseFighter(arena.studio1);
            arena.fighter2 = arena.chooseFighter(arena.studio2);
            
            System.out.println(arena.fighter1.name);
            System.out.println(arena.fighter2.name);
            
            arena.studio1.updateCounter();
            arena.studio2.updateCounter();
            
            if(turn % 3 == 0){
                int random = (int)(Math.random() * 100);
                if(random <= 80){
                    arena.studio1.addNewCharacterToQueue();
                    arena.studio2.addNewCharacterToQueue();
                }
            }  
            arena.releaseSemaphore();
        }   
    }
}
