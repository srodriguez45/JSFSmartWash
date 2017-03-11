/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author User
 */
@Entity
@Table(name = "insumos_operarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InsumosOperarios.findAll", query = "SELECT i FROM InsumosOperarios i")
    , @NamedQuery(name = "InsumosOperarios.findById", query = "SELECT i FROM InsumosOperarios i WHERE i.insumosOperariosPK.id = :id")
    , @NamedQuery(name = "InsumosOperarios.findByInsumoId", query = "SELECT i FROM InsumosOperarios i WHERE i.insumosOperariosPK.insumoId = :insumoId")
    , @NamedQuery(name = "InsumosOperarios.findByOperariosId", query = "SELECT i FROM InsumosOperarios i WHERE i.insumosOperariosPK.operariosId = :operariosId")
    , @NamedQuery(name = "InsumosOperarios.findByFechaAdjunto", query = "SELECT i FROM InsumosOperarios i WHERE i.fechaAdjunto = :fechaAdjunto")
    , @NamedQuery(name = "InsumosOperarios.findByEstado", query = "SELECT i FROM InsumosOperarios i WHERE i.estado = :estado")})
public class InsumosOperarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InsumosOperariosPK insumosOperariosPK;
    @Column(name = "fecha_adjunto")
    @Temporal(TemporalType.DATE)
    private Date fechaAdjunto;
    @Column(name = "estado")
    private Boolean estado;
    @JoinColumn(name = "insumo_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Insumos insumos;
    @JoinColumn(name = "operarios_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Operarios operarios;

    public InsumosOperarios() {
    }

    public InsumosOperarios(InsumosOperariosPK insumosOperariosPK) {
        this.insumosOperariosPK = insumosOperariosPK;
    }

    public InsumosOperarios(int id, int insumoId, int operariosId) {
        this.insumosOperariosPK = new InsumosOperariosPK(id, insumoId, operariosId);
    }

    public InsumosOperariosPK getInsumosOperariosPK() {
        return insumosOperariosPK;
    }

    public void setInsumosOperariosPK(InsumosOperariosPK insumosOperariosPK) {
        this.insumosOperariosPK = insumosOperariosPK;
    }

    public Date getFechaAdjunto() {
        return fechaAdjunto;
    }

    public void setFechaAdjunto(Date fechaAdjunto) {
        this.fechaAdjunto = fechaAdjunto;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Insumos getInsumos() {
        return insumos;
    }

    public void setInsumos(Insumos insumos) {
        this.insumos = insumos;
    }

    public Operarios getOperarios() {
        return operarios;
    }

    public void setOperarios(Operarios operarios) {
        this.operarios = operarios;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (insumosOperariosPK != null ? insumosOperariosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InsumosOperarios)) {
            return false;
        }
        InsumosOperarios other = (InsumosOperarios) object;
        if ((this.insumosOperariosPK == null && other.insumosOperariosPK != null) || (this.insumosOperariosPK != null && !this.insumosOperariosPK.equals(other.insumosOperariosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.InsumosOperarios[ insumosOperariosPK=" + insumosOperariosPK + " ]";
    }
    
}
