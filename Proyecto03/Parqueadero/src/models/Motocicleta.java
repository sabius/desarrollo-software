package models;

import java.time.LocalDateTime;

public class Motocicleta extends Vehiculo {

    private int cilindraje;
        // Constructor
        public Motocicleta(String placa, String marca, String modelo, LocalDateTime horaEntrada, int valorTarifa, int cilindraje) {
            super(placa, marca, modelo, horaEntrada, modelo, valorTarifa);
    
            this.cilindraje = cilindraje;
    }

    // Getters and setters

    public int getCilindraje() {return cilindraje;}public void setCilindraje(int cilindraje) { this.cilindraje = cilindraje;}
}

    



