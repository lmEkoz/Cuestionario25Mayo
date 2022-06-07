package programa3;

public class Cafes implements Alimentos {
        
    private String nombre;
    private String ingrediente1;
    private String tamano;

    public Cafes(String nombre, String ingrediente1, String tamano){
        this.nombre = nombre;
        this.ingrediente1 = ingrediente1;
        this.tamano = tamano;
    }

    public void servir(){
        System.out.println("Servir: \n\t Un " + this.nombre + " en una taza " + this.tamano);          
    }
    
    public void preparar(){
        System.out.println("\nPreparar: \n\t Un " + this.nombre + " con 2 onzas de " + this.ingrediente1);
    }
}
