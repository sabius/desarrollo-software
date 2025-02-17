package services;


import models.Stand;
import models.Empresa;
import enums.Ubicaciones;
import enums.Tamanos;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author gonzalodaniel
 */
public class StandService {
    private final List<Stand> stands;
    
    public StandService() {
        this.stands = new ArrayList<>();
        stands.add(new Stand(1, Ubicaciones.PABELLON_A_STAND_1, Tamanos.GRANDE));
        stands.add(new Stand(2, Ubicaciones.PABELLON_A_STAND_2, Tamanos.MEDIANO));
        stands.add(new Stand(3, Ubicaciones.PABELLON_A_STAND_3, Tamanos.PEQUENO));
    }
    
    public List<Stand> listarStandsDisponibles() {
        List<Stand> disponibles = new ArrayList<>();
        
        for(Stand stand : stands) {
            if(stand.getOcupado()) {
                disponibles.add(stand);
            }
        }

        return disponibles;
    }
    
    public void asignarStand(int numero, String empresa) {
        for (Stand stand : stands) {
            if(stand.getNumero() == numero && !stand.getOcupado()) {
                stand.setOcupado(true);
                stand.setEmpresa(Optional.ofNullable(empresa));
            }
        }
    }
}
