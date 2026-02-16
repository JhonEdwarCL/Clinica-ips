package model;

public class PolizaSeguro {

    private String nombreCompania;
    private boolean activa;

    public PolizaSeguro(String nombreCompania, boolean activa) {
        this.nombreCompania = nombreCompania;
        this.activa = activa;
    }

    public boolean estaActiva() {
        return activa;
    }

    public String getNombreCompania() {
        return nombreCompania;
    }
}
