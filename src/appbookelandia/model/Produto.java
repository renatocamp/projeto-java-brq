/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appbookelandia.model;


public class Produto {
    
    private int codigoProduto;
    private CategoriaDoProduto codigoCategoria;
    private String nome;
    private String descricao;
    private double preco;
    
    public Produto(){
        
    }
    
    //Atualizar um produto
    public Produto(int codigo){
        this.codigoProduto=codigo;
    }
    
    //Cadastrar um novo produto
    public Produto(int codigo, String nome){
        this.codigoProduto=codigo;
        this.nome = nome;
    }
    
    //Cadastrar um novo produto
    public Produto(int codigo, String nome, double preco){
        this.codigoProduto=codigo;
        this.nome = nome;
        this.preco = preco;
    }

    /**
     * @return the codigoProduto
     */
    public int getCodigoProduto() {
        return codigoProduto;
    }

    /**
     * @param codigoProduto the codigoProduto to set
     */
    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    /**
     * @return the codigoCategoria
     */
    public CategoriaDoProduto getCodigoCategoria() {
        return codigoCategoria;
    }

    /**
     * @param codigoCategoria the codigoCategoria to set
     */
    public void setCodigoCategoria(CategoriaDoProduto codigoCategoria) {
        this.codigoCategoria = codigoCategoria;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
}
