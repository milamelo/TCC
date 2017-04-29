/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio.services;

import conexao.dao.DAOUsuario;
import entidades.Usuario;

/**
 *
 * @author Camila
 */
public class LoginService {
    
    private DAOUsuario daoUsuario;
    
    public LoginService() {
        daoUsuario = new DAOUsuario();
    }
    
    public void logar(final Usuario usuario) throws Exception {
        if (daoUsuario.logar(usuario)) {
            System.out.println("logado!");
        } else {
            System.out.println("usuario ou senha inválidos!");
        }
    }
}
