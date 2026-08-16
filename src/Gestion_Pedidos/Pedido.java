package Gestion_Pedidos;

public class Pedido {

    protected int idPedido;
    protected String direccionEntrega;
    protected String tipoPedido;

    public Pedido(int idPedido, String direccionEntrega, String tipoPedido) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.tipoPedido = tipoPedido;
    }

    // Método sobrescrito por las subclases: comportamiento genérico
    public void asignarRepartidor() {
        System.out.println("[" + tipoPedido + "]");
        System.out.println("Asignando repartidor...");
    }

    // Método sobrecargado: misma funcionalidad, distinta firma (agrega validaciones propias en cada subclase)
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("→ Pedido asignado a " + nombreRepartidor);
    }

    public int getIdPedido() {
        return idPedido;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public String getTipoPedido() {
        return tipoPedido;
    }
}
