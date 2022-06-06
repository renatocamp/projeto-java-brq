/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appbookelandia.model;

import java.time.LocalDate;


public abstract class Funcionario {
    
    protected int matricula;
    protected String nome;
    protected LocalDate dataAdmissao;
    protected String cargo;
    protected double salario;

    protected Funcionario(int matricula, String nome, LocalDate dataAdmissao, 
                       String cargo, double salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.dataAdmissao = dataAdmissao;
        this.cargo = cargo;
        this.salario = salario;
    }
    
    protected Funcionario(){}
    
    protected Funcionario(String cargo){
        this.cargo = cargo;
    }
    
    public String getCargo() {
        return cargo;
    }  
    
}
