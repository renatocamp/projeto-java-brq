/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appbookelandia.model;

import java.time.LocalDate;


public class Cliente {

    
    
    private String cpf;
    private String nome;
    private String telefone;
    private String endereco;
    public LocalDate dataDeCadastro;
    private Login login;
    private Login email;

    //CONSTRUTOR
    public Cliente(String cpf){
        this.cpf = cpf;
    }

    public Cliente() {
        
    }
    
    public String getCpf() {
        return cpf;
    }

    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

 
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

   
    public String getTelefone() {
        return telefone;
    }

    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    
    public String getEndereco() {
        return endereco;
    }

    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

   
    public LocalDate getDataDeCadastro() {
        return dataDeCadastro;
    }

    
    public void setDataDeCadastro(LocalDate dataDeCadastro) {
        this.dataDeCadastro = dataDeCadastro;
    }

    /**
     * @return the login
     */
    public Login getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(Login login) {
        this.login = login;
    }

    /**
     * @return the email
     */
    public Login getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(Login email) {
        this.email = email;
    }
    
    

}
