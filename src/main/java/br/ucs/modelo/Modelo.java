
package br.ucs.modelo;

import br.ucs.DAO.DAO;
import br.ucs.constants.AcaoDBEnum;

public class Modelo {

    protected AcaoDBEnum acao;

    public AcaoDBEnum getAcao() {
        return acao;
    }

    public void setAcao(AcaoDBEnum acao) {
        this.acao = acao;
    }
    
    public boolean salvar(boolean setarMensagens) {

        //Pega o DAO.
        try {
            //Salva o objeto no banco conforme a ação.
            DAO.persistir(this, acao);
            //Tudo certo.
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

}
