package models;

public class Visitante {
    private String nombre;
    private int identificacion;
    private String email;

    public Visitante(String nombre, int identificacion, String email) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.email = email;
    }

    // Getters y setters
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getNombre() { return this.nombre; }
    
    public void setIdentificacion(int identificacion) { this.identificacion = identificacion; }
    public int getIdentificacion() { return this.identificacion; }

    public void setEmail(String email) { this.email = email; }
    public String getEmail() { return this.email; }
}
