/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appbookelandia.dal;

import appbookelandia.model.Cliente;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO implements ICrud<Cliente>{
    
    private Conexao conexao;
    
    public ClienteDAO(){
        this.conexao = new Conexao();
    }

    @Override
    public Cliente recupera(String id) throws SQLException{
        
        //Cria a Query SQL para consulta
        String sql = "select cpf, nome, endereco, telefone, dataCadastro from clientes where cpf=?;";
        //Cria a declaração SQL
        PreparedStatement ps = conexao.getConnection().prepareStatement(sql);
        ps.setString(1, id);
        ps.execute();
        
        //Recupera os dados da Query
        ResultSet resultado = ps.getResultSet();
        resultado.next();

        //Instacia o objeto cliente para ser preenchido os campos do B.D
        Cliente cliente = new Cliente();
        
        cliente.setCpf(resultado.getString("cpf"));
        cliente.setNome(resultado.getString("nome"));
        cliente.setEndereco(resultado.getString("endereco"));        
        cliente.setTelefone(resultado.getString("telefone"));
        cliente.setDataDeCadastro(resultado.getDate("dataCadastro").toLocalDate());
        
        conexao.closeConnection();
        
        return cliente;
         
    }

    @Override
    public void altera(Cliente t) throws SQLException{
        
        String sql = "UPTADE clientes SET endereco = ?, telefone = ? WHERE cpf = ?";
        PreparedStatement statement = conexao.getConnection().prepareStatement(sql);
        statement.setString(1, t.getEndereco());
        statement.setString(2, t.getTelefone());
        statement.setString(3, t.getCpf());
        
        statement.execute();
        conexao.closeConnection();
        
    }
    
    

    @Override
    public void exclui(Cliente t)throws SQLException{
        String sql = "DELETE FROM clientes WHERE cpf = ?";
        PreparedStatement ps = conexao.getConnection().prepareStatement(sql);
        ps.setString(1, t.getCpf());
        ps.execute();
        conexao.closeConnection();
       
    }

    @Override
    public void adiciona(Cliente t) throws SQLException{

        String sql = "insert into clientes (cpf, nome, endereco, telefone, "
                     + "dataCadastro) values (? ,?, ?, ?, ?);";
        
        PreparedStatement ps = conexao.getConnection().prepareStatement(sql);
        ps.setString(1, t.getCpf());
        ps.setString(2, t.getNome());
        ps.setString(3, t.getEndereco());
        ps.setString(4, t.getTelefone());
        ps.setDate(5, Date.valueOf(t.getDataDeCadastro()));
        
        ps.execute();
        conexao.closeConnection();

    }
    
    public List<Cliente> listaCliente()throws SQLException{
        
        List<Cliente> listaCliente = new ArrayList<>();
        
        String sql = "select cpf, nome, endereco, telefone, dataCadastro from clientes ;";
        PreparedStatement statement = conexao.getConnection().prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();
        
        while(resultSet.next()){
            Cliente cliente = new Cliente();
            
            cliente.setCpf(resultSet.getString("cpf"));
            cliente.setNome(resultSet.getString("nome"));
            cliente.setEndereco(resultSet.getString("endereco"));
            cliente.setTelefone(resultSet.getString("telefone"));
            cliente.setDataDeCadastro(resultSet.getDate("dataCadastro").toLocalDate());
            
            
            listaCliente.add(cliente);
            
        }
        conexao.closeConnection();
        return listaCliente;
     
    }

}
