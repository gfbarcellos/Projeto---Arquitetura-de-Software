package br.ucs.DAO;

import br.ucs.constants.AcaoDBEnum;
import br.ucs.modelo.Modelo;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class DAO {

    public static EntityManagerFactory conectorMySQLDB;

    public static void persistir(Modelo objeto, AcaoDBEnum acao) {
        EntityManager manager = null;
        try {
            manager = conectorMySQLDB.createEntityManager();
            manager.getTransaction().begin();
            switch (acao) {
                case INSERT:
                    manager.persist(objeto);
                break;
                case UPDATE:
                    manager.merge(objeto);
                break;
                case DELETE:
                    if (!manager.contains(objeto)) {
                        objeto=manager.merge(objeto);
                    }
                    manager.remove(objeto);
                break;
            }
            manager.getTransaction().commit();
        } finally {
            if (manager != null) {
                manager.close();
            }
        }
    }

}
