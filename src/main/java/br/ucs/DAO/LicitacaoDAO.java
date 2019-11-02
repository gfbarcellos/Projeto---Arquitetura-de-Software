/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucs.DAO;

import br.ucs.modelo.Licitacao;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Matheus
 */
public class LicitacaoDAO extends DAO {

    public static List<Licitacao> retornarTodos() {
        try {
            Query query = conectorMySQLDB.createEntityManager().createNativeQuery("select * from licitacao", Licitacao.class);
            return query.getResultList();
        } catch (Exception e) {
            return null;
        }
    }

    public static Licitacao retornarLicitacaoPorId(Integer id) {
        try {
            Query query = conectorMySQLDB.createEntityManager().createNativeQuery("select * from licitacao where id_licitacao = ?", Licitacao.class).setParameter(1, id);
            return (Licitacao) query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }
}
