package model;

public class ItemMedicamento extends ItemOrden {

    private String nombre;
    private double costo;

    public ItemMedicamento(int numeroItem, String nombre, double costo) {
        super(numeroItem);
        this.nombre = nombre;
        this.costo = costo;
    }

    @Override
    public double calcularCosto() {
        return costo;
    }
}
