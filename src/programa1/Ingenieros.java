package programa1;

public class Ingenieros extends Trabajadores {
    String nombreArea;

    public Ingenieros(String nombreArea, String nombre,  int sueldo) {
        super(nombre, sueldo);
        this.nombreArea = nombreArea;
    }

    public String getNombreArea() {
        return nombreArea;
    }

    public boolean setNombreArea(String nombreArea) {
        if(nombreArea.length()>0){
            this.nombreArea = nombreArea;
            return true;
        }
        return false;
    }

    public String printState(){
        return "\nNombre: " + this.nombre + "\nNombre de area: " + this.nombreArea + "\nSueldo: " + this.sueldo + "\n";
    }

}
