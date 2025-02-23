package models;

import java.time.LocalDateTime;

public class Motocicleta extends Vehiculo {
    private String placa;
    private String marca;
    private String modelo;
    private java.time.LocalDateTime horaEntrada;
    private int valorTarifa;
    private int cilindraje;

    // Constructor
    public Motocicleta(String placa, String marca, String modelo, LocalDateTime horaEntrada, String tipoCombustible, int valorTarifa, int cilindraje) {
        super(placa, marca, modelo, horaEntrada, tipoCombustible, valorTarifa);
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.horaEntrada = horaEntrada;
        this.valorTarifa = valorTarifa;
        this.cilindraje = cilindraje;
    }

    // Getters and setters
    @Override
    public String getPlaca() {
        return placa;
    }

    @Override
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public java.time.LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    @Override
    public void setHoraEntrada(java.time.LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    @Override
    public int getValorTarifa() {
        return valorTarifa;
    }

    @Override
    public void setValorTarifa(int valorTarifa) {
        this.valorTarifa = valorTarifa;
    }

    public int getCilindraje() {return cilindraje;}public void setCilindraje(int cilindraje) { this.cilindraje = cilindraje;}
}

    



