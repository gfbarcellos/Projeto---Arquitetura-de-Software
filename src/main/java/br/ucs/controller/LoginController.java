/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucs.controller;

import br.ucs.DAO.UsuarioDAO;
import br.ucs.modelo.Usuario;

/**
 *
 * @author Matheus
 */
public class LoginController {

    public static boolean autenticarUsuario(String email, String senha) {
        Usuario usuario = UsuarioDAO.retonarUsuarioPorEmail(email);
        if (usuario == null) {
            return false;
        } else {
            if (usuario.getSenhaUsuario().equals(senha)) {
                return true;
            } else {
                return false;
            }
        }
    }

}
