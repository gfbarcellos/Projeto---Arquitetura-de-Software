/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucs.DAO;

import br.ucs.modelo.Coleta;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Matheus
 */
public class ColetaDAO extends DAO {

    public static List<Coleta> retornarTodos() {
        try {
            Query query = conectorMySQLDB.createEntityManager().createNativeQuery("select * from coleta", Coleta.class);
            return query.getResultList();
        } catch (Exception e) {
            return null;
        }
    }

    public static Coleta retornarColetaPorId(Integer id) {
        try {
            Query query = conectorMySQLDB.createEntityManager().createNativeQuery("select * from coleta where id_coleta = ?", Coleta.class).setParameter(1, id);
            return (Coleta) query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }
}
