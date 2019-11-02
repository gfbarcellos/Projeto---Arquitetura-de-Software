package br.ucs.DAO;

import br.ucs.modelo.Local;
import java.util.List;
import javax.persistence.Query;

public class LocalDAO extends DAO {

    public static List<Local> retornarTodos() {
        try {
            Query query = conectorMySQLDB.createEntityManager().createNativeQuery("select * from local", Local.class);
            return query.getResultList();
        } catch (Exception e) {
            return null;
        }
    }

    public static Local retornarLocalPorId(Integer id) {
        try {
            Query query = conectorMySQLDB.createEntityManager().createNativeQuery("select * from local where id_local = ?", Local.class).setParameter(1, id);
            return (Local) query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

}
