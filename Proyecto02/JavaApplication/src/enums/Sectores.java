package enums;

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
