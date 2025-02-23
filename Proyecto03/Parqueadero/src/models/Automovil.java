package models;

import java.time.LocalDateTime;

public class Automovil extends Vehiculo {

    // Constructor
    public Automovil(String placa, String marca, String modelo, LocalDateTime horaEntrada, int valorTarifa, String tipoCombustible) {
        super(placa, marca, modelo, horaEntrada, tipoCombustible, valorTarifa);
        this.tipoCombustible = tipoCombustible;
            super.setTipoCombustible(tipoCombustible);
        }

  

    // Getters and setters
    public String gettipoCombustible() {
        return tipoCombustible;
    }

    public void settipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
}