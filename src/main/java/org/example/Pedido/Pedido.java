package org.example.Pedido;

public class Pedido implements Comparable<Pedido> {
    private int id;
    private boolean urgente;

    public Pedido(int id, boolean urgente) {
        this.id = id;
        this.urgente = urgente;
    }

    public boolean isUrgente() {
        return urgente;
    }

    @Override
    public int compareTo(Pedido o) {
        return Boolean.compare(o.isUrgente(), this.urgente); // Prioriza los pedidos urgentes
    }

    @Override
    public String toString() {
        return "Pedido " + id + (urgente ? " (Urgente)" : "");
    }
}
