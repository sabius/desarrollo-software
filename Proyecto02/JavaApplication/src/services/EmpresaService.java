/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
    
    public void registrarEmpresa(String nombre, Sectores sector, String email){
        Empresa empresa = new Empresa(nombre, sector, email);
        empresas.add(empresa);
    }
    
    public List<Empresa> listarEmpresas() {
        return empresas;
    }
    
    public void eliminarEmpresa(String nombre) {
        empresas.removeIf(e -> e.getNombre().equalsIgnoreCase(nombre));
    }
}
