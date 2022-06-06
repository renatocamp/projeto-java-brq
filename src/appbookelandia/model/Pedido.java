/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appbookelandia.model;

import java.time.LocalDate;
import java.util.ArrayList;


public class Pedido {
    
    private int numeroDoPedido;
    private Cliente cliente;
    private FormaDePagamento forma;
    private boolean status;
    private LocalDate data;
    private String cupom;
    private double valorTotal;
    private ArrayList<ProdutoPedido> produtos;

   
    public Pedido(){
        this.produtos = new ArrayList<>();
    }
   
    public Pedido(int pedido){
        this.numeroDoPedido = pedido;
        this.produtos = new ArrayList<>();
    }
    
    public void adicionaProduto(Produto produto, int quantidade){
        ProdutoPedido produtoPedido = new ProdutoPedido(produto, quantidade);
        this.produtos.add(produtoPedido);
    }
    
    public double calculaValorTotal(){
        double valorTotal = 0.0;
        for(ProdutoPedido pedido : this.produtos){
            Produto produto = pedido.getProduto();
            int quantidade = pedido.getQuantidade();
            valorTotal = valorTotal +(produto.getPreco()* quantidade);
        }
        return valorTotal;
    }
    
    public int getNumeroDoPedido() {
        return numeroDoPedido;
    }

    /**
     * @param numeroDoPedido the numeroDoPedido to set
     */
    public void setNumeroDoPedido(int numeroDoPedido) {
        this.numeroDoPedido = numeroDoPedido;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the forma
     */
    public FormaDePagamento getForma() {
        return forma;
    }

    /**
     * @param forma the forma to set
     */
    public void setForma(FormaDePagamento forma) {
        this.forma = forma;
    }

    /**
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * @return the data
     */
    public LocalDate getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(LocalDate data) {
        this.data = data;
    }

    /**
     * @return the cupom
     */
    public String getCupom() {
        return cupom;
    }

    /**
     * @param cupom the cupom to set
     */
    public void setCupom(String cupom) {
        this.cupom = cupom;
    }

}
