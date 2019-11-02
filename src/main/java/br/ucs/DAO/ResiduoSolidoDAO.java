/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucs.DAO;

import br.ucs.modelo.ResiduoSolido;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Matheus
 */
public class ResiduoSolidoDAO extends DAO {

    public static List<ResiduoSolido> retornarTodos() {
        try {
            Query query = conectorMySQLDB.createEntityManager().createNativeQuery("select * from residuo_solido", ResiduoSolido.class);
            return query.getResultList();
        } catch (Exception e) {
            return null;
        }
    }

    public static ResiduoSolido retornarResiduoSolidoPorId(Integer id) {
        try {
            Query query = conectorMySQLDB.createEntityManager().createNativeQuery("select * from residuo_solido where id_residuo_solido = ?", ResiduoSolido.class).setParameter(1, id);
            return (ResiduoSolido) query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }
}
