package br.ucs.main;

import br.ucs.conexao.MySQLConnector;
import br.ucs.view.Login;

public class Main {
    public static void main(String[] args){
        MySQLConnector.setarQuente();
        MySQLConnector.adicionarConector();
        //
        Login tela = new Login();
        tela.setVisible(true);
    }    
}
