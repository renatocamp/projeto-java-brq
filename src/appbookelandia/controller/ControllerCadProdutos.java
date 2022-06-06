/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appbookelandia.controller;

import appbookelandia.model.CategoriaDoProduto;
import appbookelandia.model.Produto;
import appbookelandia.view.FrmCadProdutos;


public class ControllerCadProdutos {
    
    private FrmCadProdutos cadProdutos;

    public ControllerCadProdutos(FrmCadProdutos cadProdutos) {
        this.cadProdutos = cadProdutos;
    }
    
    public void cadastraProdutos(){
        
        Produto produto = new Produto();
        
        int codigo = Integer.parseInt(cadProdutos.getTxtCodProduto().getText());
        double preco = Double.parseDouble(cadProdutos.getTxtPreco().getText());
        
        produto.setCodigoProduto(codigo);
        produto.setNome(cadProdutos.getTxtNomeProduto().getText());
        produto.setDescricao(cadProdutos.getTxtDescricao().getText());
        produto.setPreco(preco);
        
        CategoriaDoProduto categoria = new CategoriaDoProduto();
        int codCategoria = Integer.parseInt(cadProdutos.getTxtCodCategoria().getText());
        categoria.setCodigo(codCategoria);
    }
    
    public void limpaCadastroProduto(){
        cadProdutos.getTxtCodProduto().setText("");
        cadProdutos.getTxtCodCategoria().setText("");
        cadProdutos.getTxtNomeProduto().setText("");
        cadProdutos.getTxtDescricao().setText("");
        cadProdutos.getTxtPreco().setText("");
    }
}
