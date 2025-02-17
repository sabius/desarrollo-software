package models;

import enums.Ubicaciones;
import enums.Tamanos;

import java.util.Optional;

public class Stand {
  private int numero;
  private Ubicaciones ubicacion;
  private Tamanos tamano;
  private boolean ocupado;
  private Optional<Empresa> empresa;

  public Stand(int numero, Ubicaciones ubicacion, Tamanos tamano) {
    this.numero = numero;
    this.ubicacion = ubicacion;
    this.tamano = tamano;
    this.ocupado = false;
    this.empresa = null;
  }

  // Getters y setters
  public int getNumero() {
    return this.numero;
  }
  public void setNumero(int numero) {
    this.numero = numero;
  }

  public Ubicaciones getUbicacion() {
    return this.ubicacion;
  }
  public void setUbicacion(Ubicaciones ubicacion) {
    this.ubicacion = ubicacion;
  }

  public Tamanos getTamano() {
    return this.tamano;
  }
  public void setTamano(Tamanos tamano) {
    this.tamano = tamano;
  }
  
  public boolean getOcupado() {
    return this.ocupado;
  }
  public void setOcupado(boolean ocupado) {
    this.ocupado = ocupado;
  }

  public Optional<Empresa> getEmpresa() {
    return this.empresa;
  }
  public void setEmpresa(Optional<Empresa> empresa) {
      this.empresa = empresa;
  }
}