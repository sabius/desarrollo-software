package services;

import models.Visitante;
import models.Empresa;
import models.Stand;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class VisitanteService {
  private final List<Visitante> visitantes;

  public VisitanteService() {
    this.visitantes = new ArrayList<>();
  }

  public Visitante registrarVisitante(String nombre, int identificacion, String email){
      Visitante visitante = new Visitante(nombre, identificacion, email);
      visitantes.add(visitante);
      
      return visitante;
  }
  
  public List<Visitante> listarVisitantes() {
      return this.visitantes;
  }
  
  public void eliminarVisitante(String nombre) {
      this.visitantes.removeIf(e -> e.getNombre().equalsIgnoreCase(nombre));
  }

  public boolean modificarVisitante(int identificacion, String nuevoNombre, String nuevoEmail) {
    Optional<Visitante> visitanteOpt = visitantes.stream()
      .filter(v -> v.getIdentificacion() == identificacion)
      .findFirst();

    if (visitanteOpt.isPresent()) {
      Visitante visitante = visitanteOpt.get();
      visitante.setNombre(nuevoNombre);
      visitante.setEmail(nuevoEmail);
      return true; // Retirna true cuando la modificación fue exitosa.
    }

    return false; // Retorna false cuando no se encontró el visitante.
  }

  public boolean visitarStand(Empresa empresa, Stand stand) {
    System.out.println(
      "\n Stand: " + stand.getNumero()
    );

    return true;
  }
}
