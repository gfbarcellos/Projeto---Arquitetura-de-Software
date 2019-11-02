
package br.ucs.modelo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author gfbarcellos
 */
@Entity
@Table(name = "residuo_solido")

public class ResiduoSolido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id_residuo_solido")
    private Integer idResiduoSolido;
    
    @Column(name = "nm_residuo_solido")
    private String nmResiduoSolido;
    
    @OneToMany(mappedBy = "idResiduoSolido")
    private Collection<ColetaResiduo> coletaResiduoCollection;
    
    @OneToMany(mappedBy = "residuoSolidoPai")
    private Collection<ResiduoSolido> residuoSolidoCollection;
    
    @JoinColumn(name = "residuo_solido_pai", referencedColumnName = "id_residuo_solido")
    @ManyToOne
    private ResiduoSolido residuoSolidoPai;
    
    @JoinColumn(name = "id_tipo_residuo_solido", referencedColumnName = "id_tipo_residuo_solido")
    @ManyToOne
    private TipoResiduoSolido idTipoResiduoSolido;

    public ResiduoSolido() {
    }

    public ResiduoSolido(Integer idResiduoSolido) {
        this.idResiduoSolido = idResiduoSolido;
    }

    public Integer getIdResiduoSolido() {
        return idResiduoSolido;
    }

    public void setIdResiduoSolido(Integer idResiduoSolido) {
        this.idResiduoSolido = idResiduoSolido;
    }

    public String getNmResiduoSolido() {
        return nmResiduoSolido;
    }

    public void setNmResiduoSolido(String nmResiduoSolido) {
        this.nmResiduoSolido = nmResiduoSolido;
    }

    public Collection<ColetaResiduo> getColetaResiduoCollection() {
        return coletaResiduoCollection;
    }

    public void setColetaResiduoCollection(Collection<ColetaResiduo> coletaResiduoCollection) {
        this.coletaResiduoCollection = coletaResiduoCollection;
    }

    public Collection<ResiduoSolido> getResiduoSolidoCollection() {
        return residuoSolidoCollection;
    }

    public void setResiduoSolidoCollection(Collection<ResiduoSolido> residuoSolidoCollection) {
        this.residuoSolidoCollection = residuoSolidoCollection;
    }

    public ResiduoSolido getResiduoSolidoPai() {
        return residuoSolidoPai;
    }

    public void setResiduoSolidoPai(ResiduoSolido residuoSolidoPai) {
        this.residuoSolidoPai = residuoSolidoPai;
    }

    public TipoResiduoSolido getIdTipoResiduoSolido() {
        return idTipoResiduoSolido;
    }

    public void setIdTipoResiduoSolido(TipoResiduoSolido idTipoResiduoSolido) {
        this.idTipoResiduoSolido = idTipoResiduoSolido;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idResiduoSolido != null ? idResiduoSolido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ResiduoSolido)) {
            return false;
        }
        ResiduoSolido other = (ResiduoSolido) object;
        if ((this.idResiduoSolido == null && other.idResiduoSolido != null) || (this.idResiduoSolido != null && !this.idResiduoSolido.equals(other.idResiduoSolido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.ResiduoSolido[ idResiduoSolido=" + idResiduoSolido + " ]";
    }
    
}
