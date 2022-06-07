package programa2;

public class Personas extends Trabajadores {
    String nombre;
    int claveEmpleado;

    public void tarea() {
        System.out.println(super.tarea);
    }
    
    public Personas(String nombre, String area, String tarea){
        super(area, tarea);
        this.nombre = nombre;
    }

    public Personas(String nombre, int claveEmpleado, String area, String tarea) {
        super(area, tarea);
        this.nombre = nombre;
        this.claveEmpleado = claveEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public int getClaveEmpleado() {
        return claveEmpleado;
    }

    public boolean setNombre(String nombre) {
        if(nombre.length() > 0){
            this.nombre = nombre;
            return true;
        }
        return false;
    }

    public boolean setClaveEmpleado(int claveEmpleado) {
        if(claveEmpleado > 0){
            this.claveEmpleado = claveEmpleado;
            return true;
        }
        return false;
    }

    public String printState(){
        return "\nNombre: " + this.nombre + "\nClave de empleado: " + this.claveEmpleado + "\nArea: " + this.area ;
    }
}
