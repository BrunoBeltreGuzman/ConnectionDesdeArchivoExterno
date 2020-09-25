/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Connection.ConnectionBD;
import Controlador.Ctrl;
import Ventana.Ventana;

/**
 *
 * @author @BrunoDev
 */
public class App {
    
    private static void iniciar(){
        ConnectionBD connectionBD = new ConnectionBD();
        Ventana ventana = new Ventana();
        Ctrl ctrl = new Ctrl(ventana, connectionBD);
        
        ctrl.iniciar();
    }

    public static void main(String[] args){
        iniciar();
    }
        
}
