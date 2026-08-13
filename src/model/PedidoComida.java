package model;

public class PedidoComida extends Pedido {

    public PedidoComida(int idPedido, String direccionEntrega, String tipoPedido) {
        super(idPedido, direccionEntrega, tipoPedido);
    }

    @Override
    public void asignarRepartidor() {
        System.out.println("[Pedido Comida]");
        System.out.println("Asignando repartidor...");
    }

    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Verificando mochila termica... OK");
        System.out.println("Pedido asignado a " + nombreRepartidor);
    }
}