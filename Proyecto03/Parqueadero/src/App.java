import models.Vehiculo;
import models.Camion;

public class App {
    public static void main(String[] args) throws Exception {
        Camion frordcCamion = new Vehiculo("ABC123", "kia", "cmion", "10am" );
        Vehiculo honda = new Vehiculo( "eexx75", "honda", "k42", "1pm");




        System.out.println("la placa de picanto es: " + picanto.getPlaca());
        
        picanto.setPlaca("ssZ987");   
        System.out.println("la placa de picanto es: " +picanto.getPlaca());
            
        System.out.println("la marca de honda es: " + honda.getMarca());
    }
}
