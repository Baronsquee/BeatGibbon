/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beatgibbon;

import java.awt.BorderLayout;
import java.awt.*;
import javax.swing.*;


/**
 *
 * @author Stuart.Thomas
 */
public class BeatGibbon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BGIntro BGIntro1 = new BGIntro ();
        BGIntro1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BGIntro1.getContentPane().setBackground(Color.yellow);
        BGIntro1.pack();
        BGIntro1.add(new JButton ("Button"), BorderLayout.CENTER);
        BGIntro1.setVisible(true);
        BGIntro1.validate();
        BGIntro1.repaint();
    }
    
}
