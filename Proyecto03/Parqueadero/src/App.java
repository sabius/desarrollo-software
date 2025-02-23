import java.time.LocalDateTime;
import java.util.Scanner;
import models.*;

public class App {
    public static void main(String[] args) {
        Parqueadero parqueadero = new Parqueadero();
        boolean running = true;

        try (Scanner scanner = new Scanner(System.in)) {
            while (running) {
                System.out.println("Seleccione una opción:");
                System.out.println("1. Ingresar un vehículo");
                System.out.println("2. Registrar la salida de un vehículo");
                System.out.println("3. Consultar el estado del parqueadero");
                System.out.println("4. Salir");

                int opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir la nueva línea

                switch (opcion) {
                    case 1 -> registroVehiculo(parqueadero, scanner);
                    case 2 -> registrarSalida(parqueadero, scanner);
                    case 3 -> consultarEstado(parqueadero);
                    case 4 -> running = false;
                    default -> System.out.println("Opción no válida. Intente de nuevo.");
                }
            }
        }
    }

    private static void registroVehiculo(Parqueadero parqueadero, Scanner scanner) {
        System.out.println("Ingrese el tipo de vehículo (1. Automóvil, 2. Motocicleta, 3. Camión):");
        int tipo = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        System.out.println("Ingrese la placa:");
        String placa = scanner.nextLine();

        System.out.println("Ingrese la marca:");
        String marca = scanner.nextLine();

        System.out.println("Ingrese el modelo:");
        String modelo = scanner.nextLine();

        LocalDateTime horaEntrada = LocalDateTime.now();
        int valorTarifa;
        Vehiculo vehiculo;

        switch (tipo) {
            case 1 -> {
                valorTarifa = 5000;
                System.out.println("Ingrese el tipo de combustible:");
                String tipoCombustible = scanner.nextLine();
                vehiculo = new Automovil(placa, marca, modelo, horaEntrada, valorTarifa, tipoCombustible);
            }
            case 2 -> {
                valorTarifa = 3000;
                System.out.println("Ingrese el cilindraje:");
                int cilindraje = scanner.nextInt();
                scanner.nextLine(); // Consumir la nueva línea
                vehiculo = new Motocicleta(placa, marca, modelo, horaEntrada, valorTarifa, cilindraje);
            }
            case 3 -> {
                valorTarifa = 10000;
                System.out.println("Ingrese la capacidad de carga:");
                double capacidadCarga = scanner.nextDouble();
                scanner.nextLine(); // Consumir la nueva línea
                System.out.println("Ingrese el tipo de carga:");
                @SuppressWarnings("unused")
                String tipoCarga = scanner.nextLine();
                vehiculo = new Camion(placa, marca, modelo, horaEntrada, valorTarifa, capacidadCarga);
            }
            default -> {
                System.out.println("Tipo de vehículo no válido.");
                return;
            }
        }

        parqueadero.registrarEntrada(vehiculo);
        System.out.println("Vehículo ingresado correctamente.");
    }

    private static void registrarSalida(Parqueadero parqueadero, Scanner scanner) {
        System.out.println("Ingrese la placa del vehículo que va a salir:");
        String placa = scanner.nextLine();

        try {
            double costo = parqueadero.registrarSalida(placa);
            System.out.println("El costo total es: $" + costo);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void consultarEstado(Parqueadero parqueadero) {
        System.out.println("Vehículos presentes en el parqueadero:");
        for (Object vehiculo : parqueadero.consultarEstado()) {
            if (vehiculo instanceof Vehiculo) {
                Vehiculo v = (Vehiculo) vehiculo;
                System.out.println("Placa: " + v.getPlaca() + ", Marca: " + v.getMarca() + ", Modelo: " + v.getModelo());
            }
        }
    }
}