package programa3;

public class Bocadillos implements Alimentos{

    private String nombre;
    private String ingrediente1;
    private String ingrediente2;
    private String enplatado;

    public Bocadillos(String nombre, String ingrediente1, String ingrediente2, String enplatado){
        this.nombre = nombre;
        this.ingrediente1 = ingrediente1;
        this.ingrediente2 = ingrediente2;
        this.enplatado = enplatado;
    }

    public void servir(){
        System.out.println("Servir: \n\t Una " + this.nombre + " en un " + this.enplatado);          
    }
    
    public void preparar(){
        System.out.println("\nPreparar: \n\t Una " + this.nombre + " con " + this.ingrediente1 + " y " + this.ingrediente2);
    }
}
