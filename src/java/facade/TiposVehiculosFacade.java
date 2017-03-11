/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entities.TiposVehiculos;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author User
 */
@Stateless
public class TiposVehiculosFacade extends AbstractFacade<TiposVehiculos> {

    @PersistenceContext(unitName = "pruebaProyectoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TiposVehiculosFacade() {
        super(TiposVehiculos.class);
    }
    
}
