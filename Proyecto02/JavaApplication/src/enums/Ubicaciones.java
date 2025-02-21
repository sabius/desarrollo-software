package enums;

public enum Ubicaciones {
    PABELLON_A_STAND_1("Pabellón A, Stand 1"),
    PABELLON_A_STAND_2("Pabellón A, Stand 2"),
    PABELLON_A_STAND_3("Pabellón A, Stand 3"),
    PABELLON_A_STAND_4("Pabellón A, Stand 4");

    private final String descripcion;

    Ubicaciones(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
