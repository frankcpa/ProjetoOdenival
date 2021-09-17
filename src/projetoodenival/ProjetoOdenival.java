/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoodenival;

import java.awt.EventQueue;
import util.Splash;
import view.Principal;

/**
 *
 * @author Frank
 */
public class ProjetoOdenival {

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    //Login login = new Login();
                    Principal principal = new Principal();
                    principal.setVisible(true);
                   
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
   }
    
}
