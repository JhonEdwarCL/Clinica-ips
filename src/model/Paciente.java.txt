package model;

import enums.Genero;

public class Paciente {

    private String cedula;
    private String nombre;
    private Genero genero;
    private PolizaSeguro poliza;

    public Paciente(String cedula, String nombre, Genero genero) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.genero = genero;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public Genero getGenero() {
        return genero;
    }

    public PolizaSeguro getPoliza() {
        return poliza;
    }

    public void setPoliza(PolizaSeguro poliza) {
        this.poliza = poliza;
    }
}
