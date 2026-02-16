package model;

public abstract class ItemOrden {

    protected int numeroItem;

    public ItemOrden(int numeroItem) {
        this.numeroItem = numeroItem;
    }

    public abstract double calcularCosto();
}
