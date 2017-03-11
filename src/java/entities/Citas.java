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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
@Table(name = "citas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Citas.findAll", query = "SELECT c FROM Citas c")
    , @NamedQuery(name = "Citas.findById", query = "SELECT c FROM Citas c WHERE c.id = :id")
    , @NamedQuery(name = "Citas.findByFechaInicio", query = "SELECT c FROM Citas c WHERE c.fechaInicio = :fechaInicio")
    , @NamedQuery(name = "Citas.findByFechaFinalizacion", query = "SELECT c FROM Citas c WHERE c.fechaFinalizacion = :fechaFinalizacion")
    , @NamedQuery(name = "Citas.findByEstado", query = "SELECT c FROM Citas c WHERE c.estado = :estado")
    , @NamedQuery(name = "Citas.findByCalificacion", query = "SELECT c FROM Citas c WHERE c.calificacion = :calificacion")
    , @NamedQuery(name = "Citas.findByComentario", query = "SELECT c FROM Citas c WHERE c.comentario = :comentario")
    , @NamedQuery(name = "Citas.findByFechaCreacion", query = "SELECT c FROM Citas c WHERE c.fechaCreacion = :fechaCreacion")
    , @NamedQuery(name = "Citas.findByFechaModificacion", query = "SELECT c FROM Citas c WHERE c.fechaModificacion = :fechaModificacion")})
public class Citas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_inicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_finalizacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFinalizacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "estado")
    private String estado;
    @Column(name = "calificacion")
    private Integer calificacion;
    @Size(max = 45)
    @Column(name = "comentario")
    private String comentario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_modificacion")
    @Temporal(TemporalType.DATE)
    private Date fechaModificacion;
    @JoinTable(name = "servicios_citas", joinColumns = {
        @JoinColumn(name = "citas_id", referencedColumnName = "id")}, inverseJoinColumns = {
        @JoinColumn(name = "servicios_id", referencedColumnName = "id")})
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Servicios> serviciosList;
    @JoinColumn(name = "operarios_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Operarios operariosId;
    @JoinColumn(name = "vehiculo_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Vehiculos vehiculoId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "citaId", fetch = FetchType.LAZY)
    private List<Pagos> pagosList;

    public Citas() {
    }

    public Citas(Integer id) {
        this.id = id;
    }

    public Citas(Integer id, Date fechaInicio, Date fechaFinalizacion, String estado, Date fechaCreacion, Date fechaModificacion) {
        this.id = id;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.estado = estado;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(Date fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
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
    public List<Servicios> getServiciosList() {
        return serviciosList;
    }

    public void setServiciosList(List<Servicios> serviciosList) {
        this.serviciosList = serviciosList;
    }

    public Operarios getOperariosId() {
        return operariosId;
    }

    public void setOperariosId(Operarios operariosId) {
        this.operariosId = operariosId;
    }

    public Vehiculos getVehiculoId() {
        return vehiculoId;
    }

    public void setVehiculoId(Vehiculos vehiculoId) {
        this.vehiculoId = vehiculoId;
    }

    @XmlTransient
    public List<Pagos> getPagosList() {
        return pagosList;
    }

    public void setPagosList(List<Pagos> pagosList) {
        this.pagosList = pagosList;
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
        if (!(object instanceof Citas)) {
            return false;
        }
        Citas other = (Citas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Citas[ id=" + id + " ]";
    }
    
}
