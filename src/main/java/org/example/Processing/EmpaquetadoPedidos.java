package org.example.Processing;


import org.example.Pedido.Pedido;

public class EmpaquetadoPedidos implements Runnable {
    private Pedido pedido;

    public EmpaquetadoPedidos(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void run() {
        System.out.println("Empaquetando pedido " + pedido);
        try {
            Thread.sleep(150); // Simulación de empaquetado
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
