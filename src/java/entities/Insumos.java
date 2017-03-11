/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author User
 */
@Entity
@Table(name = "insumos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Insumos.findAll", query = "SELECT i FROM Insumos i")
    , @NamedQuery(name = "Insumos.findById", query = "SELECT i FROM Insumos i WHERE i.id = :id")
    , @NamedQuery(name = "Insumos.findByNombre", query = "SELECT i FROM Insumos i WHERE i.nombre = :nombre")
    , @NamedQuery(name = "Insumos.findByValor", query = "SELECT i FROM Insumos i WHERE i.valor = :valor")
    , @NamedQuery(name = "Insumos.findByTipoAsignacion", query = "SELECT i FROM Insumos i WHERE i.tipoAsignacion = :tipoAsignacion")
    , @NamedQuery(name = "Insumos.findByEstado", query = "SELECT i FROM Insumos i WHERE i.estado = :estado")
    , @NamedQuery(name = "Insumos.findByFechaCreacion", query = "SELECT i FROM Insumos i WHERE i.fechaCreacion = :fechaCreacion")
    , @NamedQuery(name = "Insumos.findByFechaModificacion", query = "SELECT i FROM Insumos i WHERE i.fechaModificacion = :fechaModificacion")})
public class Insumos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor")
    private int valor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "tipo_asignacion")
    private String tipoAsignacion;
    @Column(name = "estado")
    private Boolean estado;
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;
    @Column(name = "fecha_modificacion")
    @Temporal(TemporalType.DATE)
    private Date fechaModificacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "insumos", fetch = FetchType.LAZY)
    private List<InsumosOperarios> insumosOperariosList;

    public Insumos() {
    }

    public Insumos(Integer id) {
        this.id = id;
    }

    public Insumos(Integer id, int valor, String tipoAsignacion) {
        this.id = id;
        this.valor = valor;
        this.tipoAsignacion = tipoAsignacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getTipoAsignacion() {
        return tipoAsignacion;
    }

    public void setTipoAsignacion(String tipoAsignacion) {
        this.tipoAsignacion = tipoAsignacion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    @XmlTransient
    public List<InsumosOperarios> getInsumosOperariosList() {
        return insumosOperariosList;
    }

    public void setInsumosOperariosList(List<InsumosOperarios> insumosOperariosList) {
        this.insumosOperariosList = insumosOperariosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Insumos)) {
            return false;
        }
        Insumos other = (Insumos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Insumos[ id=" + id + " ]";
    }
    
}
