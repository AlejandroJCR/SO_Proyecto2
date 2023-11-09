package proyectoso2;

public class ProyectoSO2 {
    static BattleArena arena;
    static Administrator admin;
    static IA cpu;
    
    public static void main(String[] args) {
        arena = new BattleArena();
        admin = new Administrator(arena);
        cpu = new IA(arena, 4);
    }
}
