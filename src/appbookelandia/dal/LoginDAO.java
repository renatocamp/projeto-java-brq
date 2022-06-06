/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appbookelandia.dal;

import appbookelandia.model.Login;
import java.sql.SQLException;
import java.sql.PreparedStatement;


public class LoginDAO implements ICrud<Login>{
    
    private Conexao conexao;
    
    public LoginDAO(){
        this.conexao = new Conexao();
    }

    @Override
    public Login recupera(String id) throws SQLException {
        
        return null;
        
    }

    @Override
    public void altera(Login t) throws SQLException {
        
    }

    @Override
    public void exclui(Login t) throws SQLException {
        
    }

    @Override
    public void adiciona(Login t) throws SQLException {
        
        String sql = "insert into clientes (email, senha,) values (? ,?,);";
        PreparedStatement ps = conexao.getConnection().prepareStatement(sql);
        ps.setString(1, t.getEmail());
        ps.setString(2, t.getSenha());
        ps.execute();
        conexao.getConnection().commit();
        conexao.getConnection().close();
    }
    
}
