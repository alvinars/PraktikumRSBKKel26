/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snapapp26;

/**
 *
 * @author NOTEBOOK
 */
public class SnapApp26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SnapFrame().setVisible(true);
            }
        });
        
        //SnapApp26 snap = new SnapApp26();
        //snap.setVisible(true);

    }
    
}
