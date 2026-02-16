package model;

public class OrdenMedicamento extends Orden {

    public OrdenMedicamento(String numeroOrden,
                            String cedulaPaciente,
                            String cedulaMedico) {
        super(numeroOrden, cedulaPaciente, cedulaMedico);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (ItemOrden item : items) {
            total += item.calcularCosto();
        }
        return total;
    }
}
