// Imports para codificar UTF-8 y ver tildes
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import services.EmpresaService;
import services.StandService;
import services.VisitanteService;
import services.ReporteService;
import enums.Sectores;
public class Feriaempresarial {
  public static void main(String[] args) {
    // Se forza la codificación a UTF-8
    try {
      System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8.name()));
    } catch (Exception e) {
      System.err.println("No se pudo establecer la codificación UTF-8");
    }

    EmpresaService empresaService = new EmpresaService();
    StandService standService = new StandService();
    VisitanteService visitanteService = new VisitanteService();

    System.out.println("\nRegistrando empresas");
    empresaService.registrarEmpresa("Tech Corp", Sectores.TECNOLOGIA, "test@techcorp.com");
    empresaService.registrarEmpresa("Umbrella", Sectores.SALUD, "t-virus@umbrella.com");
    empresaService.registrarEmpresa("Sactrom", Sectores.TECNOLOGIA, "Sactr@sactrom.com");

    System.out.println("\nRegistrando visitantes");
    visitanteService.registrarVisitante("Bruce Wayne", 123456, "bruce@wayne.com");
    visitanteService.registrarVisitante("Barry Allen", 987456, "barry@allen.com");

    // Se utiliza el servicio de reportes para ver los resultados
    ReporteService.generarReporteFeria(empresaService, standService, visitanteService);
  }
}
