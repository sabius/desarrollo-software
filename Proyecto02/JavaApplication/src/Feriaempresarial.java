
 import services.EmpresaService;
 import enums.Sectores;
 import models.Empresa;
 
 import java.util.List;
 
 /**
  *
  * @author Gonzalo Daniel
  */
 public class Feriaempresarial {
  public static void main(String[] args) {
    EmpresaService empresaService = new EmpresaService();
    
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
  }
 }
