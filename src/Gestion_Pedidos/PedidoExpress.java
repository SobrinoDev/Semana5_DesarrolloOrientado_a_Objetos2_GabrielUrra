package Gestion_Pedidos;

public class PedidoExpress extends Pedido {

    private double distanciaKm;
    private boolean disponibilidadInmediata;

    public PedidoExpress(int idPedido, String direccionEntrega, double distanciaKm, boolean disponibilidadInmediata) {
        super(idPedido, direccionEntrega, "Pedido Express");
        this.distanciaKm = distanciaKm;
        this.disponibilidadInmediata = disponibilidadInmediata;
    }

    // Sobreescritura: se asigna al repartidor más cercano con disponibilidad inmediata
    @Override
    public void asignarRepartidor() {
        super.asignarRepartidor();
    }

    // Sobrecarga: incluye validación propia del tipo de pedido (cercanía/disponibilidad)
    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        if (disponibilidadInmediata) {
            System.out.println("→ Repartidor más cercano con disponibilidad inmediata encontrado.");
            System.out.println("→ Pedido asignado a " + nombreRepartidor);
        } else {
            System.out.println("→ No se encontró repartidor cercano con disponibilidad inmediata.");
            System.out.println("→ No se pudo asignar el pedido a " + nombreRepartidor);
        }
    }
}
