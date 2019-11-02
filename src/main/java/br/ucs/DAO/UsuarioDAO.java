/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucs.DAO;

import static br.ucs.DAO.DAO.conectorMySQLDB;
import br.ucs.modelo.Usuario;
import javax.persistence.Query;

/**
 *
 * @author Matheus
 */
public class UsuarioDAO extends DAO{
    
    public static Usuario retonarUsuarioPorEmail(String email){
        try {
            Query query = conectorMySQLDB.createEntityManager().createNativeQuery("select a.* from usuario a where a.email_usuario = ?1",Usuario.class);
            query.setParameter(1, email);
            return (Usuario) query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

    public static Usuario retornarUsuarioPorId(Integer id) {
        try {
            Query query = conectorMySQLDB.createEntityManager().createNativeQuery("select * from usuario where id_usuario = ?", Usuario.class).setParameter(1, id);
            return (Usuario) query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }
    
}
