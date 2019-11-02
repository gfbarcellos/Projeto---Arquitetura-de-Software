
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
@Table(name = "empresa")
public class Empresa extends Modelo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id_empresa")    
    private Integer idEmpresa;
    
    @Column(name = "nm_empresa")
    private String nmEmpresa;
    
    @Column(name = "cnpj")
    private String cnpj;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpresa")
    private Collection<Veiculo> veiculoCollection;
    
    @OneToMany(mappedBy = "idEmpresa")
    private Collection<Licitacao> licitacaoCollection;
    
    @OneToMany(mappedBy = "idEmpresa")
    private Collection<Coleta> coletaCollection;
    

    public Empresa() {
    }

    public Empresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNmEmpresa() {
        return nmEmpresa;
    }

    public void setNmEmpresa(String nmEmpresa) {
        this.nmEmpresa = nmEmpresa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Collection<Veiculo> getVeiculoCollection() {
        return veiculoCollection;
    }

    public void setVeiculoCollection(Collection<Veiculo> veiculoCollection) {
        this.veiculoCollection = veiculoCollection;
    }

    public Collection<Licitacao> getLicitacaoCollection() {
        return licitacaoCollection;
    }

    public void setLicitacaoCollection(Collection<Licitacao> licitacaoCollection) {
        this.licitacaoCollection = licitacaoCollection;
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
        hash += (idEmpresa != null ? idEmpresa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empresa)) {
            return false;
        }
        Empresa other = (Empresa) object;
        if ((this.idEmpresa == null && other.idEmpresa != null) || (this.idEmpresa != null && !this.idEmpresa.equals(other.idEmpresa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Empresa[ idEmpresa=" + idEmpresa + " ]";
    }
    
}
