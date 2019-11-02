
package br.ucs.modelo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author gfbarcellos
 */
@Entity
@Table(name = "tipo_coleta")
public class TipoColeta extends Modelo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id_coleta")
    private Integer idColeta;
    
    @Column(name = "nm_tipo_coleta")
    private String nmTipoColeta;
    
    @OneToMany(mappedBy = "idTipoColeta")
    private Collection<Coleta> coletaCollection;

    public TipoColeta() {
    }

    public TipoColeta(Integer idColeta) {
        this.idColeta = idColeta;
    }

    public Integer getIdColeta() {
        return idColeta;
    }

    public void setIdColeta(Integer idColeta) {
        this.idColeta = idColeta;
    }

    public String getNmTipoColeta() {
        return nmTipoColeta;
    }

    public void setNmTipoColeta(String nmTipoColeta) {
        this.nmTipoColeta = nmTipoColeta;
    }

    public Collection<Coleta> getColetaCollection() {
        return coletaCollection;
    }

    public void setColetaCollection(Collection<Coleta> coletaCollection) {
        this.coletaCollection = coletaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idColeta != null ? idColeta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoColeta)) {
            return false;
        }
        TipoColeta other = (TipoColeta) object;
        if ((this.idColeta == null && other.idColeta != null) || (this.idColeta != null && !this.idColeta.equals(other.idColeta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.TipoColeta[ idColeta=" + idColeta + " ]";
    }
    
}
