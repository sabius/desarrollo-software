package services;

import models.Empresa;
import enums.Sectores;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gonzalodaniel
 */
public class EmpresaService {
    private final List<Empresa> empresas;
    
    public EmpresaService() {
        this.empresas = new ArrayList<>();
    }

    public Empresa registrarEmpresa(String nombre, Sectores sector, String email){
        Empresa empresa = new Empresa(nombre, sector, email);
        empresas.add(empresa);
        
        return empresa;
    }

    public List<Empresa> listarEmpresas() {
        return empresas;
    }

    public void eliminarEmpresa(String nombre) {
        empresas.removeIf(e -> e.getNombre().equalsIgnoreCase(nombre));
    }
}
