import org.example.Pedido.Pedido;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PedidoTest {
    @Test
    public void testPrioridadPedido() {
        Pedido pedidoNormal = new Pedido(1, false);
        Pedido pedidoUrgente = new Pedido(2, true);
        assertTrue(pedidoUrgente.compareTo(pedidoNormal) < 0);  // Urgente tiene prioridad
    }
}
