/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafica_2d;

/**
 *
 * @author alexfduron
 * 
 */


import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Grafica_2D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame Ventana = new JFrame("Dibujo de paisajes");
        
        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        FigPanel0 Marco0 = new FigPanel0();
        
        FigPanel1 Marco1 = new FigPanel1();
        
        FigPanel2 Marco2 = new FigPanel2();
        
        FigPanel3 Marco3 = new FigPanel3();
        
        
        Ventana.setSize(800,500);
        
        Ventana.setLayout(null);
        
        Ventana.add(Marco0);
        
        Marco0.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED), "", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION));
     
        Marco0.setBounds(0, 0, Ventana.getSize().width, Ventana.getSize().height - 22);
        
        
        
        Marco0.add(Marco1);
        
        Marco0.setLayout(null);
        
        Marco1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED), "", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION));
        
        Marco1.setBounds(40, 20, (Marco0.getSize().width - 40 - 40 - 40 - 40) / 3, Marco0.getSize().height - 20 - 20);
        
        
        
        Marco0.add(Marco2);
        
        Marco0.setLayout(null);
        
        Marco2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED), "", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION));
        
        Marco2.setBounds(40 + (Marco0.getSize().width - 40 - 40 - 40 - 40) / 3 + 40, 20, (Marco0.getSize().width - 40 - 40 - 40 - 40) / 3, Marco0.getSize().height - 20 - 20);
        
        
        Marco0.add(Marco3);
        
        Marco0.setLayout(null);
        
        Marco3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED), "", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION));
        
        Marco3.setBounds(40 + (Marco0.getSize().width - 40 - 40 - 40 - 40) * 2 / 3 + 40 + 40, 20, (Marco0.getSize().width - 40 - 40 - 40 - 40) / 3, Marco0.getSize().height - 20 - 20);
        
        
        
        Ventana.setVisible(true);
        
    }
    
}
