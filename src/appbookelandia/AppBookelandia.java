/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appbookelandia;

import appbookelandia.dal.ClienteDAO;
import appbookelandia.model.Cliente;
import appbookelandia.view.FrmLogin;
import appbookelandia.view.FrmPrincipal;
import java.sql.SQLException;



/**
 *
 * @author RenatoCampos
 */
public class AppBookelandia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //INSTANCIAR A CLASSE CLIENTE
        //FrmPrincipal frame = new FrmPrincipal();
       // frame.setVisible(true);
        FrmLogin login = new FrmLogin();
        login.setVisible(true);
       
        
    }
    
}
