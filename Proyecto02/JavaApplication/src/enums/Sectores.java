/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enums;

/**
 *
 * @author gonzalodaniel
 */
public enum Sectores {
    TECNOLOGIA("Tecnología"),
    SALUD("Salud"),
    EDUCACION("Educación"),
    FINANZAS("Finanzas"),
    MANUFACTURA("Manufactura"),
    ALIMENTOS("Alimentos");

    private final String descripcion;

    Sectores(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
