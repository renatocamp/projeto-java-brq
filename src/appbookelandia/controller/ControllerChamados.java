/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appbookelandia.controller;

import appbookelandia.model.Chamados;
import appbookelandia.model.Cliente;
import appbookelandia.model.Pedido;
import appbookelandia.model.Produto;
import appbookelandia.view.FrmChamados;



public class ControllerChamados {
    
    private FrmChamados view;


    public ControllerChamados(FrmChamados view) {
        this.view = view;
    }
    
    public void registrarChamado(){
        
        Cliente cliente = new Cliente();
        Chamados chamados = new Chamados();
        Produto produto = new Produto();
        Pedido pedido = new Pedido();
        
        int ticket = Integer.parseInt(view.getTxtTicket().getText());
        chamados.setTicket(ticket);
        cliente.setCpf(view.getTxtCodCliente().getText());
        int codProduto = Integer.parseInt((view.getTxtCodProduto().getText()));
        produto.setCodigoProduto(codProduto);
        
        int codPedido = Integer.parseInt((view.getTxtPedido().getText()));
        pedido.setNumeroDoPedido(codPedido);
        
        chamados.setDescricao(view.getTxaDescricao().getText());
    }
    
    public void limparChamados(){
        view.getTxtTicket().setText("");
        view.getTxtCodCliente().setText("");
        view.getTxtCodProduto().setText("");
        view.getTxtPedido().setText("");
        view.getTxaDescricao().setText("");
   }
}
