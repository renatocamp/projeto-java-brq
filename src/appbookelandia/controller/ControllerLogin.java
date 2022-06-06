/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appbookelandia.controller;


import appbookelandia.dal.ClienteDAO;
import appbookelandia.dal.LoginDAO;
import appbookelandia.model.Login;
import appbookelandia.model.NivelDeAcesso;
import appbookelandia.view.FrmLogin;
import java.sql.SQLException;


public class ControllerLogin {
    
    private FrmLogin view;

    public ControllerLogin(FrmLogin view) {
        this.view = view;
    }
    
    public void criarLogin(){
        
        Login login = new Login();
        
        login.setEmail(view.getTxtEmail().getText());
        login.setSenha(view.getTxtSenha().getPassword().toString());
    }
    
    public void cadastrarLogin() throws SQLException {
        
        Login login = new Login();
        login.setEmail(view.getTxtEmail().getText());
        login.setSenha(view.getTxtSenha().getPassword().toString());
        login.setNivelAcesso(NivelDeAcesso.Cliente);
        login.setStatus(true);
        
        LoginDAO loginDAO = new LoginDAO();
        loginDAO.adiciona(login);
    }
}
