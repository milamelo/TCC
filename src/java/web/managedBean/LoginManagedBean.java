/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.managedBean;

import entidades.Usuario;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import negocio.services.LoginService;

/**
 *
 * @author Camila
 */
@ManagedBean(name = "loginMB")
@SessionScoped()
public class LoginManagedBean {
    
    private Usuario usuario = new Usuario();

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public void logar() throws Exception {
        LoginService loginService = new LoginService();
        loginService.logar(usuario);
    }
}
