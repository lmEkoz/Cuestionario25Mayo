package programa1;

public class Trabajadores {
    String nombre;
    int numeroEmpleado;
    int sueldo;
    
    public Trabajadores(String nombre, int numeroEmpleado, int sueldo){
        this.nombre = nombre;
        this.numeroEmpleado = numeroEmpleado;
        this.sueldo = sueldo;
    }

    public Trabajadores(String nombre, int sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }
    
    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public int getSueldo() {
        return sueldo;
    }

    public boolean setNombre(String nombre) {
        if(nombre.length() > 0){
            this.nombre = nombre;
            return true;
        }
        return false;
    }

    public boolean setNumeroEmpleado(int numeroEmpleado) {
        if(numeroEmpleado > 0){
            this.numeroEmpleado = numeroEmpleado;
            return true;
        }
        return false;
    }

    public boolean setSueldo(int sueldo) {
        if(sueldo > 0){
            this.sueldo = sueldo;
            return true;
        }
        return false;
    }


    public String printState(){
        return "\nNombre: " + this.nombre + "\n Numero de empleado: " + this.numeroEmpleado + "\n Sueldo: " + this.sueldo;
    }
}
