
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
@Table(name = "veiculo")
public class Veiculo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id_veiculo")
    private Integer idVeiculo;
    
    @Column(name = "nm_veiculo")
    private String nmVeiculo;
    
    @Column(name = "placa")
    private Integer placa;
    
    @Column(name = "km_total")
    private Float kmTotal;
    
    @JoinColumn(name = "id_empresa", referencedColumnName = "id_empresa")
    @ManyToOne(optional = false)
    private Empresa idEmpresa;
    
    @OneToMany(mappedBy = "idVeiculo")
    private Collection<Coleta> coletaCollection;

    public Veiculo() {
    }

    public Veiculo(Integer idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public Integer getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(Integer idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public String getNmVeiculo() {
        return nmVeiculo;
    }

    public void setNmVeiculo(String nmVeiculo) {
        this.nmVeiculo = nmVeiculo;
    }

    public Integer getPlaca() {
        return placa;
    }

    public void setPlaca(Integer placa) {
        this.placa = placa;
    }

    public Float getKmTotal() {
        return kmTotal;
    }

    public void setKmTotal(Float kmTotal) {
        this.kmTotal = kmTotal;
    }

    public Empresa getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Empresa idEmpresa) {
        this.idEmpresa = idEmpresa;
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
        hash += (idVeiculo != null ? idVeiculo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Veiculo)) {
            return false;
        }
        Veiculo other = (Veiculo) object;
        if ((this.idVeiculo == null && other.idVeiculo != null) || (this.idVeiculo != null && !this.idVeiculo.equals(other.idVeiculo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Veiculo[ idVeiculo=" + idVeiculo + " ]";
    }
    
}
