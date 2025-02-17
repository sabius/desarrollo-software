package enums;

public enum Tamanos {
  PEQUENO("PEQUENO"),
  MEDIANO("MEDIANO"),
  GRANDE("GRANDE");
  
  private final String descripcion;
  
  Tamanos(String descripcion) {
      this.descripcion = descripcion;
  }
  
  public String getDescripcion() {
      return descripcion;
  }
}
