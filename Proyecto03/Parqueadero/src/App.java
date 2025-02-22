import models.Vehiculo;
// import models.Camion;

public class App {
    public static void main(String[] args) throws Exception {
        Vehiculo picanto = new Vehiculo(
          "ABC 123",
          "Kia",
          "Picanto",
          java.time.LocalDateTime.now()
        );

        Vehiculo honda = new Vehiculo(
          "EEX 475",
          "Honda",
          "k42",
          java.time.LocalDateTime.now()
        );

        System.out.println("la placa de picanto es: " + picanto.getPlaca());
        
        picanto.setPlaca("ZXC 987");
        System.out.println("la placa de picanto es: " +picanto.getPlaca());
            
        System.out.println("la marca de honda es: " + honda.getMarca());
    }
}
