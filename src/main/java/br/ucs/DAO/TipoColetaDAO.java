/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucs.DAO;

import br.ucs.modelo.TipoColeta;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Matheus
 */
public class TipoColetaDAO extends DAO {

    public static List<TipoColeta> retornarTodos() {
        try {
            Query query = conectorMySQLDB.createEntityManager().createNativeQuery("select * from tipo_coleta", TipoColeta.class);
            return query.getResultList();
        } catch (Exception e) {
            return null;
        }
    }

    public static TipoColeta retornarTipoColetaPorId(Integer id) {
        try {
            Query query = conectorMySQLDB.createEntityManager().createNativeQuery("select * from tipo_coleta where id_coleta = ?", TipoColeta.class).setParameter(1, id);
            return (TipoColeta) query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }
}
