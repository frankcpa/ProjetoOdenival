/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JWindow;
import javax.swing.SwingConstants;

public class Splash {
    private final int larguraImagem = 420;
    private final int alturaImagem = 250;
    private final int tempoDeSplash = 2000;
    private final String caminhoImagem = "/imagens/splash.gif";
        
    public Splash(){
        JWindow janelaSplash = new JWindow();        
        janelaSplash.getContentPane().add(new JLabel("",new ImageIcon(getClass().getResource(caminhoImagem)),SwingConstants.CENTER));        
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        janelaSplash.setBounds((dimension.width - larguraImagem) /2, (dimension.height - alturaImagem) /2, larguraImagem, alturaImagem);
        janelaSplash.setVisible(true);
    }
    
    public void fecharSplash(){
        //this.dis
    }
}
