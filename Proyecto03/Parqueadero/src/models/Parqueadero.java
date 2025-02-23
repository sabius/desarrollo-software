package models;



import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Parqueadero {
    private final List<Vehiculo> vehiculos;

    public Parqueadero() {
        this.vehiculos = new ArrayList<>();
    }

    public void registrarEntrada(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public double registrarSalida(String placa) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getPlaca().equals(placa)) {
                LocalDateTime horaSalida = LocalDateTime.now();
                long horasEstadia = java.time.Duration.between(vehiculo.getHoraEntrada(), horaSalida).toHours();
                double costo = calcularCosto(vehiculo, horasEstadia);
                vehiculos.remove(vehiculo);
                return costo;
            }
        }
        throw new IllegalArgumentException("Vehículo no encontrado en el parqueadero.");
    }

    public List<Vehiculo> consultarEstado() {
        return new ArrayList<>(vehiculos);
    }

    private double calcularCosto(Vehiculo vehiculo, long horasEstadia) {
        double tarifaPorHora;
        if (vehiculo instanceof models.Automovil) {
            tarifaPorHora = 5000; // Tarifa por hora para automóviles
        } else if (vehiculo instanceof Motocicleta) {
            tarifaPorHora = 3000; // Tarifa por hora para motocicletas
        } else if (vehiculo instanceof Camion) {
            tarifaPorHora = 10000; // Tarifa por hora para camiones
        } else {
            throw new IllegalArgumentException("Tipo de vehículo desconocido.");
        }
        return tarifaPorHora * Math.ceil(horasEstadia);
    }
}