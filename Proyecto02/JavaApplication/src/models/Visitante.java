/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author gonzalodaniel
 */
public class Visitante {
    private String nombre;
    private String identificacion;
    private String email;
    
    public void Stand(String nombre, String identificacion, String email) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.email = email;
    }
    
    // Getters y setters
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getNombre() { return this.nombre; }
    
    public void setIdentificacion(String identificacion) { this.identificacion = identificacion; }
    public String getIdentificacion() { return this.identificacion; }

    public void setEmail(String email) { this.email = email; }
    public String getEmail() { return this.email; }
}
