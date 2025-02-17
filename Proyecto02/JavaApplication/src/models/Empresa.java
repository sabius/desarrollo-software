package models;

import enums.Sectores;

public class Empresa {
  private String nombre;
  private Sectores sector;
  private String email;

  public Empresa(String nombre, Sectores sector, String email) {
    this.nombre = nombre;
    this.sector = sector;
    this.email = email;
  }

  // Getters y setters
  public String getNombre() { return nombre;}
  public void setNombre(String nombre) { this.nombre = nombre; }

  public Sectores getSector() { return sector; }
  public void setSector(Sectores sector) { this.sector = sector; }

  public String getEmail() { return email; }
  public void setEmail(String email) { this.email = email; }
}