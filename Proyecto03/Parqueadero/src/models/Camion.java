package models;



import java.time.LocalDateTime;

public class Camion extends Vehiculo {
    private double  CapacidadCarga ;
 

    // Constructor
    public Camion(String placa, String marca, String modelo, LocalDateTime horaEntrada, int valorTarifa, double CapacidadCarga) {
        super(placa, marca, modelo, horaEntrada, modelo, valorTarifa);
        this.CapacidadCarga = CapacidadCarga;
       
    }

    // Getters and setters

    public double getTipoCapacidadCarga() {
        return CapacidadCarga;
    }

    public void setTipoCapacidadCarga(double CapacidadCarga) {
        this.CapacidadCarga = CapacidadCarga;
    }

}