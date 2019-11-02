
package br.ucs.modelo;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author gfbarcellos
 */
@Entity
@Table(name = "coleta")
public class Coleta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id_coleta")
    private Integer idColeta;
    
    @Column(name = "dt_coleta")
    @Temporal(TemporalType.DATE)
    private Date dtColeta;
    
    @Column(name = "urbano_rural")
    private Character urbanoRural;
    
    @Column(name = "km_feita")
    private Float kmFeita;
    
    @OneToMany(mappedBy = "idColeta")    
    private Collection<ColetaResiduo> coletaResiduoCollection;
    
    @JoinColumn(name = "id_municipio", referencedColumnName = "id_municipio")
    @ManyToOne(optional = false)
    private Municipio idMunicipio;
    
    @JoinColumn(name = "id_local_destino", referencedColumnName = "id_local")
    @ManyToOne(optional = false)
    private Local idLocalDestino;
    
    @JoinColumn(name = "id_veiculo", referencedColumnName = "id_veiculo")
    @ManyToOne
    private Veiculo idVeiculo;
    
    @JoinColumn(name = "id_empresa", referencedColumnName = "id_empresa")
    @ManyToOne
    private Empresa idEmpresa;
    
    @JoinColumn(name = "id_tipo_coleta", referencedColumnName = "id_coleta")
    @ManyToOne
    private TipoColeta idTipoColeta;

    public Coleta() {
    }

    public Coleta(Integer idColeta) {
        this.idColeta = idColeta;
    }

    public Coleta(Integer idColeta, Date dtColeta, Character urbanoRural) {
        this.idColeta = idColeta;
        this.dtColeta = dtColeta;
        this.urbanoRural = urbanoRural;
    }

    public Integer getIdColeta() {
        return idColeta;
    }

    public void setIdColeta(Integer idColeta) {
        this.idColeta = idColeta;
    }

    public Date getDtColeta() {
        return dtColeta;
    }

    public void setDtColeta(Date dtColeta) {
        this.dtColeta = dtColeta;
    }

    public Character getUrbanoRural() {
        return urbanoRural;
    }

    public void setUrbanoRural(Character urbanoRural) {
        this.urbanoRural = urbanoRural;
    }

    public Float getKmFeita() {
        return kmFeita;
    }

    public void setKmFeita(Float kmFeita) {
        this.kmFeita = kmFeita;
    }


    public Collection<ColetaResiduo> getColetaResiduoCollection() {
        return coletaResiduoCollection;
    }

    public void setColetaResiduoCollection(Collection<ColetaResiduo> coletaResiduoCollection) {
        this.coletaResiduoCollection = coletaResiduoCollection;
    }

    public Municipio getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(Municipio idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public Local getIdLocalDestino() {
        return idLocalDestino;
    }

    public void setIdLocalDestino(Local idLocalDestino) {
        this.idLocalDestino = idLocalDestino;
    }

    public Veiculo getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(Veiculo idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public Empresa getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Empresa idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public TipoColeta getIdTipoColeta() {
        return idTipoColeta;
    }

    public void setIdTipoColeta(TipoColeta idTipoColeta) {
        this.idTipoColeta = idTipoColeta;
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
        if (!(object instanceof Coleta)) {
            return false;
        }
        Coleta other = (Coleta) object;
        if ((this.idColeta == null && other.idColeta != null) || (this.idColeta != null && !this.idColeta.equals(other.idColeta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Coleta[ idColeta=" + idColeta + " ]";
    }
    
}
