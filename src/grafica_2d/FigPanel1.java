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
import java.awt.GradientPaint;
import java.awt.Graphics2D;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Line2D;
import java.awt.geom.GeneralPath;

import javax.swing.JPanel;

public class FigPanel1 extends JPanel {
    
    @Override
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        
        Graphics2D g2d = (Graphics2D) g;
        
        //dibujar rectangulo fondo
        
        int X1 = 0;
        
        int Y1 = 0;
        
        int TamX = this.getBounds().width;
        
        int TamY = this.getBounds().height;
        
        g2d.setPaint(new GradientPaint(X1, Y1 + TamY / 3, new Color(27, 35, 200), X1, Y1 + TamY, new Color(30, 110, 220),false));
        
        g2d.fill(new Rectangle2D.Double(X1, Y1, TamX, TamY));
        
        
        //Dibujar luna
        
        X1 = this.getBounds().width / 2;
        
        Y1 = 100;
        
        TamX = 100;
        
        TamY = 100;
        
        g2d.setPaint(new GradientPaint(X1, Y1, Color.WHITE, X1, Y1 + TamY, Color.WHITE,false));
        
        g2d.fill(new Ellipse2D.Double(X1 - TamX / 2, Y1 - TamY / 2, TamX, TamY));
        
        
        //Dibujar media luna
        
        X1 = this.getBounds().width / 2 + 30;
        
        Y1 = 100 - 30;
        
        TamX = 100;
        
        TamY = 100;
        
        g2d.setPaint(new GradientPaint(X1, Y1, new Color(27, 35, 200), X1, Y1 + TamY, new Color(27, 35, 200),false));
        
        g2d.fill(new Ellipse2D.Double(X1 - TamX / 2, Y1 - TamY / 2, TamX, TamY));
        
        
        //Dibujar montaña izquierda
        
        X1 = 50;
        
        Y1 = 200;
        
        int Ancho = 0;
        
        int Alto = 0;
        
        int Escala = 20;
        
        double[] PtsX = {-5 * Escala + X1 - Ancho, 5 * Escala + X1 + Ancho, 0 * Escala + X1};
        
        double[] PtsY = {8.66 * Escala + Y1 + Alto, 8.66 * Escala + Y1 + Alto, 0 * Escala + Y1};
        
        GeneralPath Montaña1 = new GeneralPath();
        
        Montaña1.moveTo(PtsX[0], PtsY[0]);
        
        for(int Puntos = 1; Puntos < PtsX.length; Puntos++){
            
            Montaña1.lineTo(PtsX[Puntos], PtsY[Puntos]);
            
        }
        
        Montaña1.closePath();
        
        g2d.setPaint(new GradientPaint(X1, Y1, new Color(125, 175, 220), X1, 9 * Escala + Y1 + Alto, new Color(125, 175, 220),false));
        
        g2d.fill(Montaña1);
        
        
        
        
        //Dibujar montaña derecha
        
        X1 = 150;
        
        Y1 = 220;
        
        Ancho = 50;
        
        Alto = 0;
        
        Escala = 20;
        
        double[] PtsX1 = {-5 * Escala + X1 - Ancho, 5 * Escala + X1 + Ancho, 0 * Escala + X1};
        
        double[] PtsY1 = {8.66 * Escala + Y1 + Alto, 8.66 * Escala + Y1 + Alto, 0 * Escala + Y1};
        
        GeneralPath Montaña2 = new GeneralPath();
        
        Montaña2.moveTo(PtsX1[0], PtsY1[0]);
        
        for(int Puntos = 1; Puntos < PtsX1.length; Puntos++){
            
            Montaña2.lineTo(PtsX1[Puntos], PtsY1[Puntos]);
            
        }
        
        Montaña2.closePath();
        
        g2d.setPaint(new GradientPaint(X1, Y1, new Color(195, 195, 195), X1, 9 * Escala + Y1 + Alto, new Color(195, 195, 195),false));
        
        g2d.fill(Montaña2);
        
        
    }
    
}
