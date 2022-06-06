/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appbookelandia.model;


public class Login {
  
    private String email;
    private String senha;
    private NivelDeAcesso nivelAcesso;
    private boolean status;

    public Login(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public Login() {
        
    }

    

    public boolean isStatus() {
        return status;
    }

    
    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        if(senha.length() < 20){
            this.senha = senha;
        }
    }

    /**
     * @return the nivelAcesso
     */
    public NivelDeAcesso getNivelAcesso() {
        return nivelAcesso;
    }

    /**
     * @param nivelAcesso the nivelAcesso to set
     */
    public void setNivelAcesso(NivelDeAcesso nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
    
    
}
