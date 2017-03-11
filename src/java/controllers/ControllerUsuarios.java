/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.Ciudades;
import entities.Usuarios;
import facade.CiudadesFacade;
import facade.RolesFacade;
import facade.UsuariosFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;

/**
 *
 * @author User
 */
@Named(value = "controllerUsuarios")
@SessionScoped
public class ControllerUsuarios implements Serializable {

    /**
     * Creates a new instance of ControllerUsuarios
     */
    
    //importaciones de los Facade
    @EJB
    UsuariosFacade usuariosFacade;
    
    @EJB
    RolesFacade rolesFacade;
    
    @EJB
    CiudadesFacade ciudadesFacade;
    Ciudades ciudades;
    
    //variables del controlador usuario
    Usuarios usuarios;
    List<Usuarios> listaUsuarios;
    
    public ControllerUsuarios() {
    }
    
    @PostConstruct
    public void init() {
        this.usuarios = new Usuarios();
        //listaUsuarios = usuariosFacade.findAll(); //opcion para hacerlo desde el constructor
    }
    
    public List<Usuarios> consultarUsuarios() {
        
        this.listaUsuarios = usuariosFacade.findAll();
        return listaUsuarios;
        
    }
    
    public void crearUsuario() {
        
        this.usuarios.setCiudadId(ciudadesFacade.find(ciudades.getId()));
        usuariosFacade.create(this.usuarios);
        
    }
    
    public void eliminarUsuario() {
        
        usuariosFacade.remove(this.usuarios);
    
    }
    
    public void actualizarUsuario() {
        
        this.usuarios.setCiudadId(ciudadesFacade.find(ciudades.getId()));        
        usuariosFacade.edit(this.usuarios);
        
    }
    
    //completamos con getter y setter
    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

    public List<Usuarios> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuarios> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
    
    
    
    
    
    
    
}
