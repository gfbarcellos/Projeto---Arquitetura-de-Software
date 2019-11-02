/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucs.DAO;

import br.ucs.modelo.Municipio;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Matheus
 */
public class MunicipioDAO extends DAO {

    public static List<Municipio> retornarTodos() {
        try {
            Query query = conectorMySQLDB.createEntityManager().createNativeQuery("select * from municipio", Municipio.class);
            return query.getResultList();
        } catch (Exception e) {
            return null;
        }
    }

    public static Municipio retornarMunicipioPorId(Integer id) {
        try {
            Query query = conectorMySQLDB.createEntityManager().createNativeQuery("select * from municipio where id_municipio = ?", Municipio.class).setParameter(1, id);
            return (Municipio) query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }
}
