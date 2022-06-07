package programa2;


public class Main {
    public static void main(String[] args) {
        defRobots();
        defPersonas();
    }

    public static void defRobots() {

        Robots robot1 = new Robots("R1", "04", "solda una pieza de giro durante 3 minutos");
        System.out.println(robot1.printState());
        robot1.tarea();
    }

    public static void defPersonas() {
        Personas persona1 = new Personas("Moreno", 117, "13", "coloca un toldo durante 15 minutos");
        System.out.println(persona1.printState());
        persona1.tarea();
    }
}
