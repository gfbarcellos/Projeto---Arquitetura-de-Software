/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucs.DAO;

import br.ucs.modelo.ColetaResiduo;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Matheus
 */
public class ColetaResiduoDAO extends DAO {

    public static List<ColetaResiduo> retornarTodos() {
        try {
            Query query = conectorMySQLDB.createEntityManager().createNativeQuery("select * from coleta_residuo", ColetaResiduo.class);
            return query.getResultList();
        } catch (Exception e) {
            return null;
        }
    }

    public static ColetaResiduo retornarColetaResiduoPorId(Integer id) {
        try {
            Query query = conectorMySQLDB.createEntityManager().createNativeQuery("select * from coleta_residuo where id_coleta_residuo = ?", ColetaResiduo.class).setParameter(1, id);
            return (ColetaResiduo) query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

    public static List<Object[]> retornarDadosParaRelatorio(Integer mes, Integer ano) {
        try {
            Query query = conectorMySQLDB.createEntityManager().createNativeQuery("select sum(c.qtd),r.nm_residuo_solido from coleta_residuo c\n"
                    + "inner join residuo_solido r on r.id_residuo_solido = c.id_residuo_solido\n"
                    + "inner join coleta o on o.id_coleta = c.id_coleta\n"
                    + "where  month(o.dt_coleta) = ? and year(o.dt_coleta) = ?\n"
                    + "group by c.id_residuo_solido");
            query.setParameter(1, mes);
            query.setParameter(2, ano);
            return query.getResultList();
        } catch (Exception e) {
            return null;
        }
    }
}
