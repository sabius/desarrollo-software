package models;

import java.time.LocalDateTime;

public class Vehiculo {
    private String placa;
    private String marca;
    private String modelo;
    private LocalDateTime horaEntrada;
    protected String tipoCombustible;
    private int valorTarifa;

    // Constructor
    public Vehiculo(String placa, String marca, String modelo, LocalDateTime horaEntrada, String tipoCombustible, int valorTarifa) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.horaEntrada = horaEntrada;
        this.tipoCombustible = tipoCombustible;
        this.valorTarifa = valorTarifa;
    }

    // Getters and setters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public int getValorTarifa() {
        return valorTarifa;
    }

    public void setValorTarifa(int valorTarifa) {
        this.valorTarifa = valorTarifa;
    }
}