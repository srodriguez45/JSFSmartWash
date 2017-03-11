/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entities.InsumosOperarios;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author User
 */
@Stateless
public class InsumosOperariosFacade extends AbstractFacade<InsumosOperarios> {

    @PersistenceContext(unitName = "pruebaProyectoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public InsumosOperariosFacade() {
        super(InsumosOperarios.class);
    }
    
}
