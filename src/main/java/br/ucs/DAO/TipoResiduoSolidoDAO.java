/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucs.DAO;

import br.ucs.modelo.TipoResiduoSolido;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Matheus
 */
public class TipoResiduoSolidoDAO extends DAO {

    public static List<TipoResiduoSolido> retornarTodos() {
        try {
            Query query = conectorMySQLDB.createEntityManager().createNativeQuery("select * from tipo_residuo_solido", TipoResiduoSolido.class);
            return query.getResultList();
        } catch (Exception e) {
            return null;
        }
    }

    public static TipoResiduoSolido retornarTipoResiduoSolidoPorId(Integer id) {
        try {
            Query query = conectorMySQLDB.createEntityManager().createNativeQuery("select * from tipo_residuo_solido where id_tipo_residuo_solido = ?", TipoResiduoSolido.class).setParameter(1, id);
            return (TipoResiduoSolido) query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }
}