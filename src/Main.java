import Gestion_Pedidos.PedidoComida;
import Gestion_Pedidos.PedidoEncomienda;
import Gestion_Pedidos.PedidoExpress;

public class Main {
    public static void main(String[] args) {

        PedidoComida pedidoComida = new PedidoComida(1, "Av. Siempre Viva 123", true);
        PedidoEncomienda pedidoEncomienda = new PedidoEncomienda(2, "Calle Los Aromos 456", 12.5, true);
        PedidoExpress pedidoExpress = new PedidoExpress(3, "Pasaje Las Rosas 789", 1.8, true);

        pedidoComida.asignarRepartidor();                 // versión sobrescrita
        pedidoComida.asignarRepartidor("Juan Pérez");      // versión sobrecargada
        System.out.println();

        pedidoEncomienda.asignarRepartidor();
        pedidoEncomienda.asignarRepartidor("Camila Soto");
        System.out.println();

        pedidoExpress.asignarRepartidor();
        pedidoExpress.asignarRepartidor("Luis Díaz");
        System.out.println();

        // Casos con validación fallida, para demostrar el comportamiento diferenciado
        PedidoComida pedidoComidaSinMochila = new PedidoComida(4, "Calle El Sol 321", false);
        pedidoComidaSinMochila.asignarRepartidor();
        pedidoComidaSinMochila.asignarRepartidor("Ana Torres");
        System.out.println();

        PedidoEncomienda pedidoEncomiendaMalEmbalada = new PedidoEncomienda(5, "Av. Central 654", 25.0, false);
        pedidoEncomiendaMalEmbalada.asignarRepartidor();
        pedidoEncomiendaMalEmbalada.asignarRepartidor("Luis Vidal");
        System.out.println();

        PedidoExpress pedidoExpressSinDisponibilidad = new PedidoExpress(6, "Calle Nueva 987", 5.2, false);
        pedidoExpressSinDisponibilidad.asignarRepartidor();
        pedidoExpressSinDisponibilidad.asignarRepartidor("Pedro Gómez");
    }
}
