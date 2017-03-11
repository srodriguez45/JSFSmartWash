/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.Ciudades;
import facade.CiudadesFacade;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author User
 */
@Named(value = "controllerCiudades")
@Dependent
public class controllerCiudades {
    
    @EJB
    CiudadesFacade ciudadesFacade;
    Ciudades ciudades;
    List<Ciudades> listaCiudades;
    
    /**
     * Creates a new instance of controllerCiudades
     */
    public controllerCiudades() {
    }
    

    @PostConstruct
    public void init() {
        this.ciudades = new Ciudades();
        //listaUsuarios = usuariosFacade.findAll(); //opcion para hacerlo desde el constructor
    }
    
    public List<Ciudades> consultarCiudades() {
        
        this.listaCiudades = ciudadesFacade.findAll();
        return listaCiudades;
        
    }
    
    public void crearUsuario() {
        
        ciudadesFacade.create(this.ciudades);
        
    }

    public CiudadesFacade getCiudadesFacade() {
        return ciudadesFacade;
    }

    public void setCiudadesFacade(CiudadesFacade ciudadesFacade) {
        this.ciudadesFacade = ciudadesFacade;
    }

    public Ciudades getCiudades() {
        return ciudades;
    }

    public void setCiudades(Ciudades ciudades) {
        this.ciudades = ciudades;
    }

    public List<Ciudades> getListaCiudades() {
        return listaCiudades;
    }

    public void setListaCiudades(List<Ciudades> listaCiudades) {
        this.listaCiudades = listaCiudades;
    }
    
    
    
    
    
}
