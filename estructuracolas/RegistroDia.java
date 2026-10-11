package estructuracolas;

public class RegistroDia {
    String numSS;
    String entidad;

    public RegistroDia(String numSS, String entidad) {
        this.numSS = numSS;
        this.entidad = entidad;
    }

    @Override
    public String toString() {
        return numSS + "->" + entidad;
    }
}
