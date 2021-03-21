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
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RadialGradientPaint;

import java.awt.geom.Rectangle2D;
import java.awt.geom.Point2D;

import javax.swing.JPanel;

public class FigPanel0 extends JPanel {
    
    @Override
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        
        Graphics2D g2d = (Graphics2D) g;
        
        //dibujar rectangulo fondo
        
        int X1 = 0;
        
        int Y1 = 0;
        
        int TamX = this.getBounds().width;
        
        int TamY = this.getSize().height;
        
        Color[] Colores = {Color.white, Color.BLUE.brighter()};
        
        float[] Distancia = {0.0f, 0.8f};
        
        Point2D Centro = new Point2D.Float(0.5f * TamX, 0.5f * TamY);
        
        g2d.setPaint(new RadialGradientPaint(Centro, 0.5f * TamX, Distancia, Colores));
        
        g2d.fill(new Rectangle2D.Double(X1, Y1, TamX, TamY));
        
        
    }
    
}
