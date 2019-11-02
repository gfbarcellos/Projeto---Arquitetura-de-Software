
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
@Table(name = "tipo_residuo_solido")

public class TipoResiduoSolido extends Modelo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id_tipo_residuo_solido")
    private Integer idTipoResiduoSolido;
    
    @Column(name = "nm_tipo_residuo_solido")
    private String nmTipoResiduoSolido;
    
    @OneToMany(mappedBy = "idTipoResiduoSolido")
    private Collection<ResiduoSolido> residuoSolidoCollection;

    public TipoResiduoSolido() {
    }

    public TipoResiduoSolido(Integer idTipoResiduoSolido) {
        this.idTipoResiduoSolido = idTipoResiduoSolido;
    }

    public Integer getIdTipoResiduoSolido() {
        return idTipoResiduoSolido;
    }

    public void setIdTipoResiduoSolido(Integer idTipoResiduoSolido) {
        this.idTipoResiduoSolido = idTipoResiduoSolido;
    }

    public String getNmTipoResiduoSolido() {
        return nmTipoResiduoSolido;
    }

    public void setNmTipoResiduoSolido(String nmTipoResiduoSolido) {
        this.nmTipoResiduoSolido = nmTipoResiduoSolido;
    }

    public Collection<ResiduoSolido> getResiduoSolidoCollection() {
        return residuoSolidoCollection;
    }

    public void setResiduoSolidoCollection(Collection<ResiduoSolido> residuoSolidoCollection) {
        this.residuoSolidoCollection = residuoSolidoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoResiduoSolido != null ? idTipoResiduoSolido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoResiduoSolido)) {
            return false;
        }
        TipoResiduoSolido other = (TipoResiduoSolido) object;
        if ((this.idTipoResiduoSolido == null && other.idTipoResiduoSolido != null) || (this.idTipoResiduoSolido != null && !this.idTipoResiduoSolido.equals(other.idTipoResiduoSolido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.TipoResiduoSolido[ idTipoResiduoSolido=" + idTipoResiduoSolido + " ]";
    }
    
}
