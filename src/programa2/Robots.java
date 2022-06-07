package programa2;

public class Robots extends Trabajadores {
    String numeroRobot;

    public void tarea() {
        System.out.println(super.tarea);
    }

    public Robots(String numeroRobot, String area, String tarea) {
        super(area, tarea);
        this.numeroRobot = numeroRobot;
    }

    public String getNumeroRobot() {
        return numeroRobot;
    }

    public boolean setNumeroRobot(String numeroRobot) {
        if(numeroRobot.length()>0){
            this.numeroRobot = numeroRobot;
            return true;
        }
        return false;
    }

    public String printState(){
        return "\nNumero de robot: " + this.numeroRobot + "\nArea: " + this.area;
    }
}
