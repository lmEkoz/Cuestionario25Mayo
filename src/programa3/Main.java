package programa3;

public class Main {
    public static void main(String[] args) {
        Cafes cafe1 = new Cafes("Cafe Americano", "cafe en grano", "mediana");
        Bocadillos bocadillo1 = new Bocadillos("Torta de Jamón", "Pan", "Jamón", "plato extendido"); 
    
        cafe1.preparar();
        cafe1.servir();
        
        bocadillo1.preparar();
        bocadillo1.servir();
    }  
}
