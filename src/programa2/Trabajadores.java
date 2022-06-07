package programa2;

abstract class Trabajadores {
    String area;
    String tarea;

    public void tarea() {
        System.out.println("Tarea");
    }

    public Trabajadores(String area, String tarea) {
        this.area = area;
        this.tarea = tarea;
    }

    public String getArea() {
        return area;
    }

    public String getTarea() {
        return tarea;
    }

    public boolean setArea(String area) {
        if(area.length()>0){
            this.area = area;
            return true;
        }
        return false;
    }

    public boolean setTarea(String tarea) {
        if(tarea.length()>0){
            this.tarea = tarea;
            return true;
        }
        return false;
    }
}
