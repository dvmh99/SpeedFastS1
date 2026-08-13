package model;

public class PedidoExpress extends Pedido {

    public PedidoExpress(int idPedido, String direccionEntrega, String tipoPedido) {
        super(idPedido, direccionEntrega, tipoPedido);
    }

    @Override
    public void asignarRepartidor() {
        System.out.println("[Pedido Express]");
        System.out.println("Asignando repartidor...");
    }

    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Buscando repartidor mas cercano con disponibilidad inmediata... OK");
        System.out.println("Pedido asignado a " + nombreRepartidor);
    }
}