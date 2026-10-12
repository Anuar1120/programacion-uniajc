package estructuracolas;

public class Repartidor {
String numSS;           
    String nombre;
    int diasTrabajados;
    String ultimaEntidad;   

    public Repartidor(String numSS, String nombre, int diasTrabajados, String ultimaEntidad) {
        this.numSS = numSS;
        this.nombre = nombre;
        this.diasTrabajados = diasTrabajados;
        this.ultimaEntidad = ultimaEntidad;
    }

    @Override
    public String toString() {
        return numSS + " | " + nombre + " | dias: " + diasTrabajados
                + " | ultima entidad: " + ultimaEntidad;
    }
}