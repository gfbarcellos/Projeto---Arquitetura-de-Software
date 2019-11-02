
package br.ucs.modelo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author gfbarcellos
 */
@Entity
@Table(name = "municipio")
public class Municipio extends Modelo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id_municipio")
    private Integer idMunicipio;
    
    @Column(name = "nm_municipio")
    private String nmMunicipio;
    
    @Column(name = "pop_total")
    private Integer popTotal;
    
    @Column(name = "pop_urbana")
    private Integer popUrbana;
    
    @OneToMany(mappedBy = "idMunicipio")
    private Collection<Licitacao> licitacaoCollection;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMunicipio")
    private Collection<Coleta> coletaCollection;

    public Municipio() {
    }

    public Municipio(Integer idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public Integer getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(Integer idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public String getNmMunicipio() {
        return nmMunicipio;
    }

    public void setNmMunicipio(String nmMunicipio) {
        this.nmMunicipio = nmMunicipio;
    }

    public Integer getPopTotal() {
        return popTotal;
    }

    public void setPopTotal(Integer popTotal) {
        this.popTotal = popTotal;
    }

    public Integer getPopUrbana() {
        return popUrbana;
    }

    public void setPopUrbana(Integer popUrbana) {
        this.popUrbana = popUrbana;
    }

    @XmlTransient
    public Collection<Licitacao> getLicitacaoCollection() {
        return licitacaoCollection;
    }

    public void setLicitacaoCollection(Collection<Licitacao> licitacaoCollection) {
        this.licitacaoCollection = licitacaoCollection;
    }

    @XmlTransient
    public Collection<Coleta> getColetaCollection() {
        return coletaCollection;
    }

    public void setColetaCollection(Collection<Coleta> coletaCollection) {
        this.coletaCollection = coletaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMunicipio != null ? idMunicipio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Municipio)) {
            return false;
        }
        Municipio other = (Municipio) object;
        if ((this.idMunicipio == null && other.idMunicipio != null) || (this.idMunicipio != null && !this.idMunicipio.equals(other.idMunicipio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Municipio[ idMunicipio=" + idMunicipio + " ]";
    }
    
}
