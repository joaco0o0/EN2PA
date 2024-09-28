package org.example;

import org.example.Pedido.Pedido;
import org.example.Processing.ProcesadorPedidos;

public class Main {
    public static void main(String[] args) {
        ProcesadorPedidos procesador = new ProcesadorPedidos(10); // Pool de 10 hilos

        // Crear algunos pedidos (normales y urgentes)
        Pedido pedido1 = new Pedido(1, false);
        Pedido pedido2 = new Pedido(2, true); // Pedido urgente
        Pedido pedido3 = new Pedido(3, false);

        // Procesar pedidos
        procesador.procesarPedido(pedido1);
        procesador.procesarPedido(pedido2);
        procesador.procesarPedido(pedido3);

        // Cerrar el sistema
        procesador.shutdown();
    }
}
