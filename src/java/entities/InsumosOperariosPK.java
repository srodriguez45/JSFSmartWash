/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author User
 */
@Embeddable
public class InsumosOperariosPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id")
    private int id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "insumo_id")
    private int insumoId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "operarios_id")
    private int operariosId;

    public InsumosOperariosPK() {
    }

    public InsumosOperariosPK(int id, int insumoId, int operariosId) {
        this.id = id;
        this.insumoId = insumoId;
        this.operariosId = operariosId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInsumoId() {
        return insumoId;
    }

    public void setInsumoId(int insumoId) {
        this.insumoId = insumoId;
    }

    public int getOperariosId() {
        return operariosId;
    }

    public void setOperariosId(int operariosId) {
        this.operariosId = operariosId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        hash += (int) insumoId;
        hash += (int) operariosId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InsumosOperariosPK)) {
            return false;
        }
        InsumosOperariosPK other = (InsumosOperariosPK) object;
        if (this.id != other.id) {
            return false;
        }
        if (this.insumoId != other.insumoId) {
            return false;
        }
        if (this.operariosId != other.operariosId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.InsumosOperariosPK[ id=" + id + ", insumoId=" + insumoId + ", operariosId=" + operariosId + " ]";
    }
    
}
