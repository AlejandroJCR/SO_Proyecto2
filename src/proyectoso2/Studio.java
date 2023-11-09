package proyectoso2;

public class Studio {
    String name;
    Queue<Character> p1, p2, p3, reinforcement;
    
    public Studio(String name){
        this.name = name;
        p1 = new Queue<>();
        p2 = new Queue<>();
        p3 = new Queue<>();
        reinforcement = new Queue<>();
    }
}
