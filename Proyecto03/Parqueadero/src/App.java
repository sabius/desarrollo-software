import models.Camion;
import models.Vehiculo;
// import models.Camion;

public class App {
    public static void main(String[] args) throws Exception {
        Vehiculo picanto = new Vehiculo(
          "ABC 123",
          "Kia",
          "Picanto",
          java.time.LocalDateTime.now(),
          "diesel",
          3000  
        );

        Vehiculo honda = new Vehiculo(
          "EEX 475",
          "Honda",
          "k42",
          java.time.LocalDateTime.now(),
          "Gasolina",
          5000
        );

        Camion camion = new Camion(
          "EEX 475",
          "frod",
          "k42",
          java.time.LocalDate.now(),
          "Gasolina",
          5000
        );

        System.out.println("la marca de veiculo es: " + picanto.getMarca());
        System.out.println("la marca de veiculo es: " + honda.getMarca());
        System.out.println("la marca de camion es: " + camion.getMarca());
    }
}
