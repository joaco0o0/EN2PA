package org.example.Processing;

import org.example.Pedido.Pedido;

public class Envio implements Runnable {
    private Pedido pedido;

    public Envio(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void run() {
        System.out.println("Enviando pedido " + pedido);
        try {
            Thread.sleep(200); // Simulación de envío
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
