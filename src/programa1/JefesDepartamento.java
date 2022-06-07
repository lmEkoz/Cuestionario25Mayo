package programa1;

public class JefesDepartamento extends Trabajadores{
    String nombreDepartamento;

    public JefesDepartamento(String nombre, int numeroEmpleado, int sueldo, String nombreDepartamento) {
        super(nombre, numeroEmpleado, sueldo);
        this.nombreDepartamento = nombreDepartamento;
    }
    
    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public boolean setNombreDepartamento(String nombreDepartamento) {
        if(nombreDepartamento.length()>0){
            this.nombreDepartamento = nombreDepartamento;
            return true;
        }
        return false;
    }

    public String printState(){
        return "\nNombre: " + this.nombre + "\nNombre de departamento: " + this.nombreDepartamento + "\nSueldo: " + this.sueldo + "\nNumero de empleado: " + this.numeroEmpleado + "\n";
    }
}
