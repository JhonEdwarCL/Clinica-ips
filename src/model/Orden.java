package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Orden {

    protected String numeroOrden;
    protected String cedulaPaciente;
    protected String cedulaMedico;
    protected List<ItemOrden> items;

    public Orden(String numeroOrden, String cedulaPaciente, String cedulaMedico) {
        this.numeroOrden = numeroOrden;
        this.cedulaPaciente = cedulaPaciente;
        this.cedulaMedico = cedulaMedico;
        this.items = new ArrayList<>();
    }

    public void agregarItem(ItemOrden item) {
        items.add(item);
    }

    public abstract double calcularTotal();
}
