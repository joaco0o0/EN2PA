package org.example.Processing;

import org.example.Pedido.Pedido;

public class ProcesamientoPago implements Runnable {
    private Pedido pedido;

    public ProcesamientoPago(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void run() {
        System.out.println("Procesando pago para " + pedido);
        try {
            Thread.sleep(100); // Simulación de procesamiento
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
