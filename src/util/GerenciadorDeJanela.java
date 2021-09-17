/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class GerenciadorDeJanela {
    private static JDesktopPane deskPane;
    
    public GerenciadorDeJanela(JDesktopPane deskPane){
        GerenciadorDeJanela.deskPane = deskPane;
    }
    
    public void abrirJanelas(JInternalFrame frameInterno){
        if(frameInterno.isVisible()){
            frameInterno.toFront();
            frameInterno.requestFocus();
        }else{
            deskPane.add(frameInterno);
            frameInterno.show();
        }
    }
    
    public void fecharJanela(JInternalFrame frameInterno){
        if(frameInterno.isVisible()){
            frameInterno.toBack();
        }else{
            deskPane.remove(frameInterno);
        }
    }
    
    public void abrirJanelas2(JFrame frameInterno){
        if(frameInterno.isVisible()){
            frameInterno.toFront();
            frameInterno.requestFocus();
        }else{
            deskPane.add(frameInterno);
            frameInterno.show();
        }
    }
}
