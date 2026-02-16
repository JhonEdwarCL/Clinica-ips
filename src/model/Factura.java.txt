package model;

public class Factura {

    private Paciente paciente;
    private Orden orden;

    public Factura(Paciente paciente, Orden orden) {
        this.paciente = paciente;
        this.orden = orden;
    }

    public double calcularPago() {

        double total = orden.calcularTotal();

        if (paciente.getPoliza() != null &&
            paciente.getPoliza().estaActiva()) {

            return 50000; // copago fijo
        }

        return total;
    }
}
