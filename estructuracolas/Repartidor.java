package estructuracolas;

public class Repartidor {
String numSS;           // numero de seguridad social
    String nombre;
    int diasTrabajados;
    String ultimaEntidad;   // ultima entidad anunciada

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