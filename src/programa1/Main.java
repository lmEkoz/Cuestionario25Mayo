package programa1;

public class Main{
    public static void main(String[] args) {
        defJefeDepartamento();
        defIngeniero();
    }
    public static void defJefeDepartamento(){
        JefesDepartamento jefe1 = new JefesDepartamento("Jimenez", 22, 10000, "Sistemas");
        System.out.println(jefe1.printState());
    }

    public static void defIngeniero(){
        Ingenieros ingeniero1 = new Ingenieros("Mantenimiento", "Rodriguez", 8000);
        System.out.println(ingeniero1.printState());
    }
}

