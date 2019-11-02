
package br.ucs.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author gfbarcellos
 */
@Entity
@Table(name = "coleta_residuo")
public class ColetaResiduo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id_coleta_residuo")
    private Integer idColetaResiduo;

    @Column(name = "qtd")
    private Float qtd;

    @JoinColumn(name = "id_coleta", referencedColumnName = "id_coleta")
    @ManyToOne
    private Coleta idColeta;

    @JoinColumn(name = "id_residuo_solido", referencedColumnName = "id_residuo_solido")
    @ManyToOne
    private ResiduoSolido idResiduoSolido;

    public ColetaResiduo() {
    }

    public ColetaResiduo(Integer idColetaResiduo) {
        this.idColetaResiduo = idColetaResiduo;
    }

    public Integer getIdColetaResiduo() {
        return idColetaResiduo;
    }

    public void setIdColetaResiduo(Integer idColetaResiduo) {
        this.idColetaResiduo = idColetaResiduo;
    }

    public Float getQtd() {
        return qtd;
    }

    public void setQtd(Float qtd) {
        this.qtd = qtd;
    }

    public Coleta getIdColeta() {
        return idColeta;
    }

    public void setIdColeta(Coleta idColeta) {
        this.idColeta = idColeta;
    }

    public ResiduoSolido getIdResiduoSolido() {
        return idResiduoSolido;
    }

    public void setIdResiduoSolido(ResiduoSolido idResiduoSolido) {
        this.idResiduoSolido = idResiduoSolido;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idColetaResiduo != null ? idColetaResiduo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ColetaResiduo)) {
            return false;
        }
        ColetaResiduo other = (ColetaResiduo) object;
        if ((this.idColetaResiduo == null && other.idColetaResiduo != null) || (this.idColetaResiduo != null && !this.idColetaResiduo.equals(other.idColetaResiduo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.ColetaResiduo[ idColetaResiduo=" + idColetaResiduo + " ]";
    }
    
}
