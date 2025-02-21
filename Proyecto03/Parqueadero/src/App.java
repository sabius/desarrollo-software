import models.Vehiculo;

public class App {
    public static void main(String[] args) throws Exception {
        Vehiculo picanto = new Vehiculo("ABC123", "kia", "picanto", "10am" );
        Vehiculo honda = new Vehiculo( "eexx75", "honda", "k42", "1pm");




        System.out.println("la placa de picanto es: " + picanto.getPlaca());
        
        picanto.setPlaca("ssZ987");   
        System.out.println("la placa de picanto es: " +picanto.getPlaca());
            
        System.out.println("la marca de honda es: " + honda.getMarca());
    }
}
