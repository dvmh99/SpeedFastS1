package app;

import java.util.Scanner;
import model.Pedido;
import model.PedidoComida;
import model.PedidoEncomienda;
import model.PedidoExpress;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== SPEEDFAST =====");
            System.out.println("1. Pedido de comida");
            System.out.println("2. Pedido de encomienda");
            System.out.println("3. Pedido express");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = scanner.nextInt();

            Pedido pedido;

            switch (opcion) {

                case 1:
                    pedido = new PedidoComida(
                            1,
                            "Av. Las Condes 1234",
                            "Comida"
                    );

                    pedido.asignarRepartidor();
                    pedido.asignarRepartidor("Juan Perez");
                    break;

                case 2:
                    pedido = new PedidoEncomienda(
                            2,
                            "Av. Providencia 5678",
                            "Encomienda"
                    );

                    pedido.asignarRepartidor();
                    pedido.asignarRepartidor("Diego Martinez");
                    break;

                case 3:
                    pedido = new PedidoExpress(
                            3,
                            "Av. Pajaritos 910",
                            "Express"
                    );

                    pedido.asignarRepartidor();
                    pedido.asignarRepartidor("Luis Diaz");
                    break;

                case 4:
                    System.out.println("Saliendo de SpeedFast...");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 4);

        scanner.close();
    }
}