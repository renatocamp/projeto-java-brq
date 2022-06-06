/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package appbookelandia.model;


public enum FormaDePagamento {
    
    Boleto("boleto"),
    Pix("pix"),
    CartaoDeCredito("Cartão de Crédito");
    
    private final String descricao;
    
    FormaDePagamento(String descricao){
        this.descricao = descricao;
    }
    
    public String descricao(){
        return descricao;
    }
}
