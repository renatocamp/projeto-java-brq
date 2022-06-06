/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appbookelandia.controller;

import appbookelandia.dal.ClienteDAO;
import appbookelandia.model.Cliente;
import appbookelandia.model.Login;
import appbookelandia.view.FrmCadClient;
import java.sql.SQLException;
import java.time.LocalDate;



/**
 *
 * @author RenatoCampos
 */
public class ControllerCadClient {
    
    private FrmCadClient view;

    public ControllerCadClient(FrmCadClient view) {
        this.view = view;
    }
    
    public void cadastroCliente() throws SQLException{
        
        Cliente cliente = new Cliente();
        Login log = new Login();
        ClienteDAO cdao = new ClienteDAO();

        
        cliente.setCpf(view.getTxtCpf().getText());
        cliente.setNome(view.getTxtNome().getText());
        cliente.setEndereco(view.getTxtEndereco().getText());
        cliente.setTelefone(view.getTxtPhone().getText());
        cliente.setDataDeCadastro(LocalDate.now());
        
        cdao.adiciona(cliente);
        
        log.setEmail(view.getTxtEmail().getText());
        log.setSenha(view.getTxtPassword().getPassword().toString());

    }
    
    public void consultaCliente() throws SQLException{
        String cpf = view.getTxtCpf().getText();
        ClienteDAO cdao = new ClienteDAO();
        Cliente cliente = cdao.recupera(cpf);
  
        if(cliente != null){
            view.getTxtCpf().setText(cliente.getCpf());
            view.getTxtNome().setText(cliente.getNome());
            view.getTxtEndereco().setText(cliente.getEndereco());
            view.getTxtPhone().setText(cliente.getTelefone());
        }
        
    }
    
    public void excluiCliente() throws SQLException{
         String cpf = view.getTxtCpf().getText();
        
         ClienteDAO clienteDao = new ClienteDAO();
         Cliente cliente = clienteDao.recupera(cpf);
        
         clienteDao.exclui(cliente);  
        
    }
    
    public void cleanScreen(){
        view.getTxtCpf().setText("");
        view.getTxtNome().setText("");
        view.getTxtEndereco().setText("");
        view.getTxtPhone().setText("");
        view.getTxtPassword().setText("");
        view.getTxtEmail().setText("");
    }
    
}
