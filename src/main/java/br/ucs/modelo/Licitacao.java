
package br.ucs.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author gfbarcellos
 */
@Entity
@Table(name = "licitacao")

public class Licitacao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id_licitacao")
    private Integer idLicitacao;
    
    @Column(name = "dt_assinatura_licitacao")
    @Temporal(TemporalType.DATE)
    private Date dtAssinaturaLicitacao;
    
    @Column(name = "dt_validade")
    @Temporal(TemporalType.DATE)
    private Date dtValidade;
    
   
    @Column(name = "valor")
    private Float valor;
    
    @JoinColumn(name = "id_municipio", referencedColumnName = "id_municipio") 
    @ManyToOne
    private Municipio idMunicipio;
    
    @JoinColumn(name = "id_empresa", referencedColumnName = "id_empresa")
    @ManyToOne
    private Empresa idEmpresa;

    public Licitacao() {
    }

    public Licitacao(Integer idLicitacao) {
        this.idLicitacao = idLicitacao;
    }

    public Integer getIdLicitacao() {
        return idLicitacao;
    }

    public void setIdLicitacao(Integer idLicitacao) {
        this.idLicitacao = idLicitacao;
    }

    public Date getDtAssinaturaLicitacao() {
        return dtAssinaturaLicitacao;
    }

    public void setDtAssinaturaLicitacao(Date dtAssinaturaLicitacao) {
        this.dtAssinaturaLicitacao = dtAssinaturaLicitacao;
    }

    public Date getDtValidade() {
        return dtValidade;
    }

    public void setDtValidade(Date dtValidade) {
        this.dtValidade = dtValidade;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Municipio getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(Municipio idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public Empresa getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Empresa idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLicitacao != null ? idLicitacao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Licitacao)) {
            return false;
        }
        Licitacao other = (Licitacao) object;
        if ((this.idLicitacao == null && other.idLicitacao != null) || (this.idLicitacao != null && !this.idLicitacao.equals(other.idLicitacao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Licitacao[ idLicitacao=" + idLicitacao + " ]";
    }
    
}
