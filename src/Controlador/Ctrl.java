/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Connection.ConnectionBD;
import Ventana.Ventana;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



/**
 *
 * @author @BrunoDev
 */
public class Ctrl implements ActionListener{

    private Ventana ventana;
    private ConnectionBD connectionBD;
    
    public Ctrl(Ventana ventana, ConnectionBD connectionBD){
      this.ventana = ventana;
      this.connectionBD = connectionBD;
      
      ventana.getBtnConectar().addActionListener(this);
      ventana.getBtnDesconectar().addActionListener(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == ventana.getBtnConectar()){
            if(connectionBD.conectar()){
                ventana.getTexNotf().setText("Conexión realizada satisfactoriamente");
                ventana.getEtq().setEnabled(true);
            }else{
                ventana.getTexNotf().setText("Error al realizar conexión");
                ventana.getEtq().setEnabled(false);
            }
        }
        
        if(e.getSource() == ventana.getBtnDesconectar()){
            if(connectionBD.desConectar()){
                ventana.getTexNotf().setText("Conexión desconetada satisfactoriamente");
                ventana.getEtq().setEnabled(false);
            }else{
                ventana.getTexNotf().setText("Error al desconetar conexión");
                ventana.getEtq().setEnabled(false);
            }
        }
        
    }

    public void iniciar(){
        ventana.setVisible(true);
    }
    
}
