
import services.EmpresaService;
import services.StandService;
import enums.Sectores;
import models.Empresa;
import models.Stand;

import java.util.List;
 
 /**
  *
  * @author Agregar autores acá
  */
 public class Feriaempresarial {
  public static void main(String[] args) {
    EmpresaService empresaService = new EmpresaService();
    StandService standService = new StandService();
    
    // Registrar empresas
    System.out.println("\nRegistrando 2 empresas");
    empresaService.registrarEmpresa("Tech Corp", Sectores.TECNOLOGIA, "test@techcorp.com");
    empresaService.registrarEmpresa("Umbrella", Sectores.SALUD, "t-virus@umbrella.com");
    
    
    // Listar empresas registradas
    System.out.println("\nEmpresas registradas:");
    List<Empresa> empresas = empresaService.listarEmpresas();
    for (Empresa empresa : empresas) {
      System.out.println("- " + empresa.getNombre() + " | Sector: " + empresa.getSector().getDescripcion() + " | Email: " + empresa.getEmail());
    }
    
    // Eliminar una empresa
    empresaService.eliminarEmpresa("Tech Corp");
    
    // Listar empresas después de la eliminación
    System.out.println("\nEmpresas después de eliminar Tech Corp:");
    empresas = empresaService.listarEmpresas();
    for (Empresa empresa : empresas) {
      System.out.println("- " + empresa.getNombre() + " | Sector: " + empresa.getSector().getDescripcion() + " | Email: " + empresa.getEmail());
    }


    // Listar stands disponibles
    System.out.println("\nStands disponibles:");
    for (Stand stand : standService.listarStandsDisponibles()) {
        System.out.println("- Stand " + stand.getNumero() + " | Ubicación: " + stand.getUbicacion().getDescripcion() + " | Tamaño: " + stand.getTamano());
    }

    // Asignar un stand a una empresa
    standService.asignarStand(1, "Tech Corp");

    // Listar stands después de asignación
    System.out.println("\nStands después de asignación:");
    for (Stand stand : standService.listarStandsDisponibles()) {
        System.out.println("- Stand " + stand.getNumero() + " | Ubicación: " + stand.getUbicacion().getDescripcion() + " | Tamaño: " + stand.getTamano());
    }
  }
 }
