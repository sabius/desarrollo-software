package services;

import models.Stand;
import enums.Ubicaciones;
import enums.Tamanos;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StandService {
    private final List<Stand> stands;

    public StandService() {
        this.stands = new ArrayList<>();
        stands.add(new Stand(1, Ubicaciones.PABELLON_A_STAND_1, Tamanos.GRANDE));
        stands.add(new Stand(2, Ubicaciones.PABELLON_A_STAND_2, Tamanos.MEDIANO));
        stands.add(new Stand(3, Ubicaciones.PABELLON_A_STAND_3, Tamanos.PEQUENO));
        stands.add(new Stand(4, Ubicaciones.PABELLON_A_STAND_4, Tamanos.GRANDE));
    }
    
    public Stand getStand(int numero) {
        for (Stand stand : stands) {
            if (stand.getNumero() == numero) {
                return stand;
            }
        }
        return null; // Si no se encuentra el stand, retorna null
    }

    public List<Stand> listarStandsDisponibles() {
        List<Stand> disponibles = new ArrayList<>();

        for (Stand stand : stands) {
            if (!stand.getOcupado()) {
                disponibles.add(stand);
            }
        }

        return disponibles;
    }

    public List<Stand> listarStands() {
        return new ArrayList<>(stands);
    }

    public boolean asignarStand(int numero, String empresa) {
        boolean asignado = false;
        
        for (Stand stand : stands) {
            if (stand.getNumero() == numero && !stand.getOcupado()) {
                stand.setOcupado(true);
                stand.setEmpresa(Optional.ofNullable(empresa));
                asignado = true;
            }
        }
        
        return asignado;
    }
}
