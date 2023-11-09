package proyectoso2;

public class ProyectoSO2 {
    static BattleArena arena;
    static Administrator admin;
    static CPU cpu;
    
    public static void main(String[] args) {
        arena = new BattleArena();
        admin = new Administrator(arena);
        cpu = new CPU(arena, 4);
    }
}
