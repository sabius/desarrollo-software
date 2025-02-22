package models;

import java.time.LocalDateTime;

public class Vehiculo {
    private String placa;
    private String marca;
    private String modelo;
    private java.time.LocalDateTime horaEntrada;

    // Constructor
    public Vehiculo(String placa, String marca, String modelo, LocalDateTime horaEntrada) {
      this.placa = placa;
      this.marca = marca;
      this.modelo = modelo;
      this.horaEntrada = horaEntrada;
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

    public java.time.LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }
    
    public void setHoraEntrada(java.time.LocalDateTime horaEntrada) {
      this.horaEntrada = horaEntrada;
    }
}