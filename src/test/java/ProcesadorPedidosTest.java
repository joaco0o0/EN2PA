import org.example.Pedido.Pedido;
import org.example.Processing.ProcesadorPedidos;
import org.junit.Test;

public class ProcesadorPedidosTest {

    @Test
    public void testProcesarPedidos() {
        ProcesadorPedidos procesador = new ProcesadorPedidos(5);

        // Crear algunos pedidos
        Pedido pedido1 = new Pedido(1, false);
        Pedido pedido2 = new Pedido(2, true); // Pedido urgente
        Pedido pedido3 = new Pedido(3, false);

        // Procesar los pedidos
        procesador.procesarPedido(pedido1);
        procesador.procesarPedido(pedido2);
        procesador.procesarPedido(pedido3);

        // Verificar que todo se procesa sin errores
        procesador.shutdown();
    }
}
