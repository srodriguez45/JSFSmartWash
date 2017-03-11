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
@Table(name = "pagos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pagos.findAll", query = "SELECT p FROM Pagos p")
    , @NamedQuery(name = "Pagos.findById", query = "SELECT p FROM Pagos p WHERE p.id = :id")
    , @NamedQuery(name = "Pagos.findByConcepto", query = "SELECT p FROM Pagos p WHERE p.concepto = :concepto")
    , @NamedQuery(name = "Pagos.findByValor", query = "SELECT p FROM Pagos p WHERE p.valor = :valor")
    , @NamedQuery(name = "Pagos.findByIva", query = "SELECT p FROM Pagos p WHERE p.iva = :iva")
    , @NamedQuery(name = "Pagos.findByValorTotal", query = "SELECT p FROM Pagos p WHERE p.valorTotal = :valorTotal")
    , @NamedQuery(name = "Pagos.findByEstado", query = "SELECT p FROM Pagos p WHERE p.estado = :estado")
    , @NamedQuery(name = "Pagos.findByFechaCreacion", query = "SELECT p FROM Pagos p WHERE p.fechaCreacion = :fechaCreacion")
    , @NamedQuery(name = "Pagos.findByFechaModificacion", query = "SELECT p FROM Pagos p WHERE p.fechaModificacion = :fechaModificacion")})
public class Pagos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "concepto")
    private String concepto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor")
    private float valor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "iva")
    private int iva;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor_total")
    private float valorTotal;
    @Column(name = "estado")
    private Integer estado;
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;
    @Column(name = "fecha_modificacion")
    @Temporal(TemporalType.DATE)
    private Date fechaModificacion;
    @JoinColumn(name = "cita_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Citas citaId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pagoId", fetch = FetchType.LAZY)
    private List<Comisiones> comisionesList;

    public Pagos() {
    }

    public Pagos(Integer id) {
        this.id = id;
    }

    public Pagos(Integer id, String concepto, float valor, int iva, float valorTotal) {
        this.id = id;
        this.concepto = concepto;
        this.valor = valor;
        this.iva = iva;
        this.valorTotal = valorTotal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
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

    public Citas getCitaId() {
        return citaId;
    }

    public void setCitaId(Citas citaId) {
        this.citaId = citaId;
    }

    @XmlTransient
    public List<Comisiones> getComisionesList() {
        return comisionesList;
    }

    public void setComisionesList(List<Comisiones> comisionesList) {
        this.comisionesList = comisionesList;
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
        if (!(object instanceof Pagos)) {
            return false;
        }
        Pagos other = (Pagos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Pagos[ id=" + id + " ]";
    }
    
}
