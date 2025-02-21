package services;

import models.Empresa;
import models.Stand;
import models.Visitante;

import java.util.List;

public class ReporteService {

  public static void generarReporteFeria(EmpresaService empresaService, StandService standService, VisitanteService visitanteService) {
    System.out.println("\n===== REPORTE DE FERIA EMPRESARIAL =====");

    // Reporte de Empresas
    System.out.println("\n--- Empresas Registradas ---");
    List<Empresa> empresas = empresaService.listarEmpresas();
    if (empresas.isEmpty()) {
      System.out.println("No hay empresas registradas.");
    } else {
      for (Empresa empresa : empresas) {
        System.out.println(
          "- " + empresa.getNombre() +
          " | Sector: " + empresa.getSector() +
          " | Contacto: " + empresa.getEmail());
      }
    }

    // Reporte de Stands
    System.out.println("\n--- Stands Disponibles ---");
    List<Stand> stands = standService.listarStandsDisponibles();
    if (stands.isEmpty()) {
      System.out.println("No hay stands disponibles.");
    } else {
      for (Stand stand : stands) {
        System.out.println(
          "- Stand " + stand.getNumero() + 
          " | Ubicación: " + stand.getUbicacion().getDescripcion() +
          " | Tamaño: " + stand.getTamano());
      }
    }

    // Reporte de Visitantes
    System.out.println("\n--- Visitantes Registrados ---");
    List<Visitante> visitantes = visitanteService.listarVisitantes();
    if (visitantes.isEmpty()) {
      System.out.println("No hay visitantes registrados.");
    } else {
      for (Visitante visitante : visitantes) {
        System.out.println(
          "- " + visitante.getNombre() + 
          " | Identificación: " + visitante.getIdentificacion() +
          " | Email: " + visitante.getEmail());
      }
    }

    System.out.println("\n===== FIN DEL REPORTE =====");
  }
}
