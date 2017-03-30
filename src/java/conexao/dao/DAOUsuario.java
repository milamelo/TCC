/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao.dao;

import conexao.Conexao;
import entidades.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Camila
 */
public class DAOUsuario extends Conexao {
    
    public DAOUsuario() {
        
    }
    
    public boolean logar(final Usuario usuario) throws SQLException, ClassNotFoundException {
        boolean logado = false;
        Connection conexao;
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        
        try {
            sql = new StringBuilder();
            sql.append(" SELECT * "); 
            sql.append("   FROM USUARIO ");
            sql.append("  WHERE EMAIL = ? ");
            sql.append("    AND SENHA = ? ");
            
            conexao = abrirConexao();
            preparedStatement = conexao.prepareStatement(sql.toString());
            int i = 1;
            preparedStatement.setString(i++, usuario.getEmail());
            preparedStatement.setString(i++, usuario.getSenha());
            
            resultSet = preparedStatement.executeQuery();
            logado = resultSet.next();
        } catch(SQLException e) {
            throw new SQLException("Erro: DAOUsuario.logar \n" + e.getMessage());
        }
        return logado;
    }
}
