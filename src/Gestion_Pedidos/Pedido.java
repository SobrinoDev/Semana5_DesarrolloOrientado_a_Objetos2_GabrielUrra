package Gestion_Pedidos;

public abstract class Pedido {

    protected int idPedido;
    protected String direccionEntrega;
    protected double distanciaKm;
    protected String tipoPedido;

    public Pedido(int idPedido, String direccionEntrega, double distanciaKm, String tipoPedido) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.distanciaKm = distanciaKm;
        this.tipoPedido = tipoPedido;
    }

    public void mostrarResumen() {
        System.out.printf("%s #%03d%n%n", getClass().getSimpleName(), idPedido);
        System.out.println("Dirección: " + direccionEntrega);
        System.out.println("Distancia: " + formatDistanciaKm() + " km");
    }

    public abstract int calcularTiempoEntrega();

    public void asignarRepartidor() {
        System.out.println("[" + tipoPedido + "]");
        System.out.println("Asignando repartidor...");
    }

    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("→ Pedido asignado a " + nombreRepartidor);
    }

    private String formatDistanciaKm() {
        if (distanciaKm == Math.rint(distanciaKm)) {
            return String.valueOf((int) distanciaKm);
        }
        return String.valueOf(distanciaKm);
    }

    public int getIdPedido() {
        return idPedido;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public String getTipoPedido() {
        return tipoPedido;
    }
}
