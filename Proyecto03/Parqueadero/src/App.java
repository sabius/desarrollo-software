import models.Automovil;
import models.Camion;
import models.Motocicleta;
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

        Automovil toyota = new Automovil(
          "XYZ 789",
          "Toyota",
          "Corolla",
          java.time.LocalDateTime.now(),
          "Gasolina",
          7000
        );

        Motocicleta yamaha = new Motocicleta(
          "LMN 456",
          "Yamaha",
          "R15",
          java.time.LocalDateTime.now(),
          "Gasolina",
          2000,
          150
        );

        System.out.println("la marca de veiculo es: " + picanto.getMarca());
        System.out.println("la marca de veiculo es: " + honda.getMarca());
        System.out.println("la marca de camion es: " + camion.getMarca());
        System.out.println("la marca de automovil es: " + toyota.getMarca());
        System.out.println("la marca de motocicleta es: " + yamaha.getCilindraje());
    }
}
