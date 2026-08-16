package Gestion_Pedidos;

public class PedidoEncomienda extends Pedido {

    private double pesoKg;
    private boolean embalajeCorrecto;

    public PedidoEncomienda(int idPedido, String direccionEntrega, double pesoKg, boolean embalajeCorrecto) {
        super(idPedido, direccionEntrega, "Pedido Encomienda");
        this.pesoKg = pesoKg;
        this.embalajeCorrecto = embalajeCorrecto;
    }

    // Sobreescritura: lógica propia para encomiendas (peso y embalaje)
    @Override
    public void asignarRepartidor() {
        super.asignarRepartidor();
    }

    // Sobrecarga: incluye validación propia del tipo de pedido (peso/embalaje)
    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        if (embalajeCorrecto && pesoKg <= 20) {
            System.out.println("→ Validando peso y embalaje... OK");
            System.out.println("→ Pedido asignado a " + nombreRepartidor);
        } else {
            System.out.println("→ Validando peso y embalaje... FALLIDA (peso: " + pesoKg
                    + " kg, embalaje correcto: " + embalajeCorrecto + ")");
            System.out.println("→ No se pudo asignar el pedido a " + nombreRepartidor);
        }
    }
}
