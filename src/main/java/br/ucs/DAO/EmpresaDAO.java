/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucs.DAO;

import br.ucs.modelo.Empresa;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Matheus
 */
public class EmpresaDAO extends DAO {

    public static List<Empresa> retornarTodos() {
        try {
            Query query = conectorMySQLDB.createEntityManager().createNativeQuery("select * from empresa", Empresa.class);
            return query.getResultList();
        } catch (Exception e) {
            return null;
        }
    }

    public static Empresa retornarEmpresaPorId(Integer id) {
        try {
            Query query = conectorMySQLDB.createEntityManager().createNativeQuery("select * from empresa where id_empresa = ?", Empresa.class).setParameter(1, id);
            return (Empresa) query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }
}
