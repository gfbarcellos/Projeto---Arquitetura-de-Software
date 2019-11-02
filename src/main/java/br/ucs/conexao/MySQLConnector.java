/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucs.conexao;

import br.ucs.DAO.DAO;
import java.util.HashMap;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author msoliveira4
 */
public class MySQLConnector {

    /**
     * MySQL
     */
    /**
     * URL do banco quente do MySQL.
     */
    public static final String MYSQL_URL_BANCO_QUENTE = "jdbc:mysql://localhost:3306/projeto?useTimezone=true&serverTimezone=America/Sao_Paulo&autoReconnect=true&zeroDateTimeBehavior=convertToNull";

    /**
     * Usuário acesso ao MySQL
     */
    public static final String MYSQL_USER_NAME = "root";

    /**
     * Senha acesso ao MySQL
     */
    public static final String MYSQL_PASSWORD = "master";

    public static final String FALHA_CONEXAO = "Falha de Conexao Banco de Dados";

    /**
     * URL para acesso ao MySQL.
     */
    private static String mySqlURL;

    public static String getMySqlURL() {
        return mySqlURL;
    }

    public static void setarQuente() {
        //set informações MySql
        mySqlURL = MYSQL_URL_BANCO_QUENTE;
    }

    //Chaves das propriedades de conexão.
    private static final String JAVAX_PERSISTENCE_JDBC_DRIVER = "javax.persistence.jdbc.driver",
            JAVAX_PERSISTENCE_JDBC_URL = "javax.persistence.jdbc.url",
            JAVAX_PERSISTENCE_JDBC_USER = "javax.persistence.jdbc.user",
            JAVAX_PERSISTENCE_JDBC_PASSWORD = "javax.persistence.jdbc.password",
            ECLIPSELINK_CACHE_SHARED_DEFAULT = "eclipselink.cache.shared.default",
            ECLIPSELINK_CONNECTION_POOL_DEFAULT_MAX = "eclipselink.connection-pool.default.max",
            ECLIPSELINK_LOGGING_LEVEL = "eclipselink.logging.level",
            ECLIPSELINK_QUERY_RESULTS_CACHE = "eclipselink.query-results-cache",
            ECLIPSELINK_REFRESH = "eclipselink.refresh",
            ECLIPSELINK_WEAVING = "eclipselink.weaving",
            AUTO_RECONECT_POOL_FACTORY = "connection.autoReconnectForPools",
            AUTO_RECONECT = "connection.autoReconnect";

    //Valores das propriedades de conexão.
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver",
            PERSISTENCE_UNIT_NAME = "NossoUP";

    public static EntityManagerFactory adicionarConector() {
        HashMap<String, Object> properties = new HashMap<>(9);
        properties.put(JAVAX_PERSISTENCE_JDBC_DRIVER, DRIVER);
        properties.put(JAVAX_PERSISTENCE_JDBC_URL, getMySqlURL());
        properties.put(JAVAX_PERSISTENCE_JDBC_USER, MYSQL_USER_NAME);
        properties.put(JAVAX_PERSISTENCE_JDBC_PASSWORD, MYSQL_PASSWORD);
        properties.put(ECLIPSELINK_CACHE_SHARED_DEFAULT, "false");
        properties.put(ECLIPSELINK_LOGGING_LEVEL, "WARNING");
        properties.put(ECLIPSELINK_QUERY_RESULTS_CACHE, "false");
        properties.put(ECLIPSELINK_REFRESH, "true");
        properties.put(ECLIPSELINK_WEAVING, "static");
        properties.put(AUTO_RECONECT_POOL_FACTORY, "true");
        properties.put(AUTO_RECONECT, "true");
        properties.put(ECLIPSELINK_CONNECTION_POOL_DEFAULT_MAX, "3");
        EntityManagerFactory conectorJavaMySQL = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME, properties);
        DAO.conectorMySQLDB = conectorJavaMySQL;
        return conectorJavaMySQL;
    }

   public static void removerConector() {
        if (DAO.conectorMySQLDB != null) {
            if (DAO.conectorMySQLDB.isOpen()) {
                DAO.conectorMySQLDB.close();
            }
        }
    }
}
    