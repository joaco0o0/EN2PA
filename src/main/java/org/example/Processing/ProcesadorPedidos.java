package org.example.Processing;

import org.example.Pedido.Pedido;

import java.util.concurrent.*;

public class ProcesadorPedidos {
    private final ExecutorService executor;
    private final BlockingQueue<Runnable> queue;

    public ProcesadorPedidos(int nThreads) {
        queue = new PriorityBlockingQueue<>();
        executor = new ThreadPoolExecutor(nThreads, nThreads, 0L, TimeUnit.MILLISECONDS, queue);
    }

    public void procesarPedido(Pedido pedido) {
        executor.execute(new ProcesamientoPago(pedido));
        executor.execute(new EmpaquetadoPedidos(pedido));
        executor.execute(new Envio(pedido));
    }

    public void shutdown() {
        executor.shutdown();
        try {
            if (!executor.awaitTermination(60, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }
}
