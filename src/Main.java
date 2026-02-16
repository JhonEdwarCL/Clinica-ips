import enums.Genero;
import model.*;

public class Main {

    public static void main(String[] args) {

        // Crear paciente
        Paciente paciente = new Paciente("123", "Carlos Perez", Genero.MASCULINO);

        // Crear póliza activa
        PolizaSeguro poliza = new PolizaSeguro("Sura", true);
        paciente.setPoliza(poliza);

        // Crear médico
        Medico medico = new Medico("Dr. Gomez", "999");

        // Crear orden
        OrdenMedicamento orden = new OrdenMedicamento("001", paciente.getCedula(), medico.getCedula());

        // Agregar medicamento
        ItemMedicamento item1 = new ItemMedicamento(1, "Acetaminofen", 20000);
        orden.agregarItem(item1);

        // Crear factura
        Factura factura = new Factura(paciente, orden);

        System.out.println("Total orden: " + orden.calcularTotal());
        System.out.println("Pago paciente: " + factura.calcularPago());
    }
}
