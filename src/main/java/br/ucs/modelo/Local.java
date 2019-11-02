
package br.ucs.modelo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CascadeType;
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
@Table(name = "local")
public class Local extends Modelo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id_local")
    private Integer idLocal;
    
    @Column(name = "nm_local")
    private String nmLocal;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idLocalDestino")
    private Collection<Coleta> coletaCollection;

    public Local() {
    }

    public Local(Integer idLocal) {
        this.idLocal = idLocal;
    }

    public Integer getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(Integer idLocal) {
        this.idLocal = idLocal;
    }

    public String getNmLocal() {
        return nmLocal;
    }

    public void setNmLocal(String nmLocal) {
        this.nmLocal = nmLocal;
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
        hash += (idLocal != null ? idLocal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Local)) {
            return false;
        }
        Local other = (Local) object;
        if ((this.idLocal == null && other.idLocal != null) || (this.idLocal != null && !this.idLocal.equals(other.idLocal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Local[ idLocal=" + idLocal + " ]";
    }
    
}
