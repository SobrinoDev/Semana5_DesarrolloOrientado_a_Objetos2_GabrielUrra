package Gestion_Pedidos;

public class PedidoComida extends Pedido {

    private boolean mochilaTermica;

    public PedidoComida(int idPedido, String direccionEntrega, boolean mochilaTermica) {
        super(idPedido, direccionEntrega, "Pedido Comida");
        this.mochilaTermica = mochilaTermica;
    }

    // Sobreescritura: lógica propia para pedidos de comida
    @Override
    public void asignarRepartidor() {
        super.asignarRepartidor();
    }

    // Sobrecarga: incluye validación propia del tipo de pedido (mochila térmica)
    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        if (mochilaTermica) {
            System.out.println("→ Verificando mochila térmica... OK");
            System.out.println("→ Pedido asignado a " + nombreRepartidor);
        } else {
            System.out.println("→ Verificando mochila térmica... FALLIDA (no cuenta con mochila térmica)");
            System.out.println("→ No se pudo asignar el pedido a " + nombreRepartidor);
        }
    }
}
