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
import java.awt.geom.GeneralPath;

import javax.swing.JPanel;

public class FigPanel3 extends JPanel {
    
    @Override
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        
        Graphics2D g2d = (Graphics2D) g;
        
        
        
        
        //dibujar rectangulo (fondo del paisaje)
        
        int X1 = 0;
        
        int Y1 = 0;
        
        int TamX = this.getBounds().width;
        
        int TamY = this.getBounds().height;
        
        g2d.setPaint(new GradientPaint(X1, Y1 + TamY / 3, new Color(160, 41, 142), X1, Y1 + TamY, new Color(255, 255, 255),false));
        
        g2d.fill(new Rectangle2D.Double(X1, Y1, TamX, TamY));
        
        
        
        
        
        //Dibujar luna
        
        X1 = this.getBounds().width / 2;
        Y1 = 100;
        TamX = 50;
        TamY = 50;
        int R1 = 255;
        int R2 = 255;
        int G1 = 255;
        int G2 = 255;
        int B1 = 255;
        int B2 = 255;
        
        Circulo(g2d, X1, Y1, TamX, TamY, R1, G1, B1, R2, G2, B2);
 
        
 
        
        
        //Dibujar montaña izquierda
        
        X1 = 60;
        Y1 = 190;
        
        int Ancho = 80;
        int Alto = 0;
        int Escala = 20;
        R1 = 96;
        R2 = 197;
        G1 = 50;
        G2 = 197;
        B1 = 129;
        B2 = 230;
        
        Triangulo(g2d, X1, Y1, Ancho, Alto, Escala, R1, G1, B1, R2, G2, B2);
        
        
        
        
        //Dibujar montaña derecha
        
        X1 = 150;
        Y1 = 200;
        Ancho = 130;
        Alto = 0;
        Escala = 20;
        R1 = 38;
        R2 = 138;
        G1 = 38;
        G2 = 138;
        B1 = 38;
        B2 = 138;
        
        Triangulo(g2d, X1, Y1, Ancho, Alto, Escala, R1, G1, B1, R2, G2, B2);
        
        
        
        //Dibujar Campo superior y pinos
        //Campo
        X1 = 0;
        Y1 = 250;
        TamX = this.getBounds().width + 100;
        TamY = 100;
        int Angulo = 5;
        R1 = 9;
        R2 = 9;
        G1 = 19;
        G2 = 19;
        B1 = 12;
        B2 = 12;
        
        Rectangulo(g2d, X1, Y1, TamX, TamY, Angulo, R1, G1, B1, R2, G2, B2);
        

        //pino1
        X1 = 20;
        Y1 = 280;
        Ancho = -4;
        Alto = 2;
        Escala = 2;
        R1 = 10;
        R2 = 10;
        G1 = 21;
        G2 = 21;
        B1 = 12;
        B2 = 12;
        
        Triangulo(g2d, X1, Y1, Ancho, Alto, Escala, R1, G1, B1, R2, G2, B2);
        
        //pino2
        X1 = 40;
        Y1 = 250;
        Ancho = -4;
        Alto = 2;
        Escala = 2;
        
        Triangulo(g2d, X1, Y1, Ancho, Alto, Escala, R1, G1, B1, R2, G2, B2);
        
        //pino3
        X1 = 90;
        Y1 = 270;
        Ancho = -4;
        Alto = 2;
        Escala = 2;
        
        Triangulo(g2d, X1, Y1, Ancho, Alto, Escala, R1, G1, B1, R2, G2, B2);
        
        //pino4
        X1 = 140;
        Y1 = 270;
        Ancho = -4;
        Alto = 2;
        Escala = 2;
        
        Triangulo(g2d, X1, Y1, Ancho, Alto, Escala, R1, G1, B1, R2, G2, B2);
        
        
        //Dibujar Campo medio y pinos
        //Campo
        X1 = -10;
        Y1 = 320;
        TamX = this.getBounds().width + 100;
        TamY = 100;
        Angulo = -5;
        R1 = 20;
        R2 = 20;
        G1 = 49;
        G2 = 49;
        B1 = 23;
        B2 = 23;
        
        Rectangulo(g2d, X1, Y1, TamX, TamY, Angulo, R1, G1, B1, R2, G2, B2);
        

        //pino1
        X1 = 120;
        Y1 = 310;
        Ancho = -8;
        Alto = 10;
        Escala = 3;
        R1 = 46;
        R2 = 46;
        G1 = 108;
        G2 = 108;
        B1 = 24;
        B2 = 24;
        
        Triangulo(g2d, X1, Y1, Ancho, Alto, Escala, R1, G1, B1, R2, G2, B2);
        
        
         //pino2
        X1 = 170;
        Y1 = 310;
        Ancho = -8;
        Alto = 10;
        Escala = 3;
     
        
        Triangulo(g2d, X1, Y1, Ancho, Alto, Escala, R1, G1, B1, R2, G2, B2);
        
        
        //Dibujar Campo bajos y pinos
        //Campo
        X1 = -10;
        Y1 = 350;
        TamX = this.getBounds().width + 100;
        TamY = 100;
        Angulo = 5;
        R1 = 55;
        R2 = 55;
        G1 = 130;
        G2 = 130;
        B1 = 55;
        B2 = 55;
        
        Rectangulo(g2d, X1, Y1, TamX, TamY, Angulo, R1, G1, B1, R2, G2, B2);
        

        //pino1
        X1 = 20;
        Y1 = 360;
        Ancho = -12;
        Alto = 10;
        Escala = 5;
        R1 = 45;
        R2 = 45;
        G1 = 110;
        G2 = 110;
        B1 = 20;
        B2 = 20;
        
        Triangulo(g2d, X1, Y1, Ancho, Alto, Escala, R1, G1, B1, R2, G2, B2);
        
        
         //pino2
        X1 = 100;
        Y1 = 360;
        Ancho = -6;
        Alto = 5;
        Escala = 3;
     
        
        Triangulo(g2d, X1, Y1, Ancho, Alto, Escala, R1, G1, B1, R2, G2, B2);
        
        //pino3
        X1 = 170;
        Y1 = 400;
        Ancho = -12;
        Alto = 10;
        Escala = 5;
     
        
        Triangulo(g2d, X1, Y1, Ancho, Alto, Escala, R1, G1, B1, R2, G2, B2);
        
        
        
        
        //Dibujar estrella
        X1 = 30;
        Y1 = 10;
        Escala = 1;
        R1 = 220;
        R2 = 220;
        G1 = 158;
        G2 = 158;
        B1 = 205;
        B2 = 205;
        
        Estrella(g2d, X1, Y1, Escala, R1, G1, B1, R2, G2, B2);
        
        X1 = 20;
        Y1 = 45;
        Estrella(g2d, X1, Y1, Escala, R1, G1, B1, R2, G2, B2);
        
        X1 = 80;
        Y1 = 20;
        Estrella(g2d, X1, Y1, Escala, R1, G1, B1, R2, G2, B2);
        
        X1 = 110;
        Y1 = 60;
        Estrella(g2d, X1, Y1, Escala, R1, G1, B1, R2, G2, B2);
        
        X1 = 140;
        Y1 = 30;
        Estrella(g2d, X1, Y1, Escala, R1, G1, B1, R2, G2, B2);
        
        X1 = 180;
        Y1 = 60;
        Estrella(g2d, X1, Y1, Escala, R1, G1, B1, R2, G2, B2);
        
        X1 = 190;
        Y1 = 20;
        Estrella(g2d, X1, Y1, Escala, R1, G1, B1, R2, G2, B2);
        
        
        
        
        
        
        
    }
    
    public void Triangulo(Graphics2D g2d, int X1, int Y1, int Ancho, int Alto, int Escala, int R1, int G1, int B1, int R2, int G2, int B2){
        
        double[] PtsX = {-5 * Escala - Ancho, 5 * Escala + Ancho, 0 * Escala};
        
        double[] PtsY = {8.66 * Escala + Alto, 8.66 * Escala + Alto, 0 * Escala};
        
        GeneralPath Figura1 = new GeneralPath();
        
        Figura1.moveTo(PtsX[0], PtsY[0]);
        
        for(int Puntos = 1; Puntos < PtsX.length; Puntos++){
            
            Figura1.lineTo(PtsX[Puntos], PtsY[Puntos]);
            
        }
        
        Figura1.closePath();
        
        g2d.translate(X1, Y1);
        
        g2d.setPaint(new GradientPaint(0, 0, new Color(R1, G1, B1), 0, 9 * Escala + Alto, new Color(R2, G2, B2),false));
        
        g2d.fill(Figura1);
        
        g2d.translate(-X1, -Y1);
        
    }
    
    public void Circulo(Graphics2D g2d, int X1, int Y1, int TamX, int TamY, int R1, int G1, int B1, int R2, int G2, int B2){
        
        g2d.translate(X1, Y1);
        
        g2d.setPaint(new GradientPaint(0, 0, new Color(R1, G1, B1), 0, TamY, new Color(R2, G2, B2),false));
        
        g2d.fill(new Ellipse2D.Double(0 - TamX / 2, 0 - TamY / 2, TamX, TamY));
        
        g2d.translate(-X1, -Y1);
        
    }
    
    public void Rectangulo(Graphics2D g2d, int X1, int Y1, int TamX, int TamY, int Angulo, int R1, int G1, int B1, int R2, int G2, int B2){
        
        g2d.translate(X1, Y1);
        
        g2d.rotate(Math.PI * Angulo / 180);
        
        g2d.setPaint(new GradientPaint(0, TamY / 3, new Color(R1, G1, B1), 0, TamY, new Color(R2, G2, B2),false));
        
        g2d.fill(new Rectangle2D.Double(0, 0, TamX, TamY));
        
        g2d.rotate(Math.PI * (0 - Angulo) / 180);
        
        g2d.translate(-X1, -Y1);
        
    }
    
    public void Estrella(Graphics2D g2d, int X1, int Y1, int Escala, int R1, int G1, int B1, int R2, int G2, int B2){
        
        double[] PtsX = {5.5 * Escala, 6.7 * Escala, 10.9 * Escala, 7.3 * Escala, 8.3 * Escala, 5.5 * Escala, 2.7 * Escala, 3.7 * Escala, 0.1 * Escala, 4.3 * Escala};
        
        double[] PtsY = {0.0 * Escala, 3.6 * Escala, 03.6 * Escala, 5.4 * Escala, 9.6 * Escala, 7.2 * Escala, 9.6 * Escala, 5.4 * Escala, 3.6 * Escala, 3.6 * Escala};
        
        GeneralPath Figura1 = new GeneralPath();
        
        Figura1.moveTo(PtsX[0], PtsY[0]);
        
        for(int Puntos = 1; Puntos < PtsX.length; Puntos++){
            
            Figura1.lineTo(PtsX[Puntos], PtsY[Puntos]);
            
        }
        
        Figura1.closePath();
        
        g2d.translate(X1, Y1);
        
        g2d.setPaint(new GradientPaint(0, 0, new Color(R1, G1, B1), 0, 10 * Escala, new Color(R2, G2, B2),false));
        
        g2d.fill(Figura1);
        
        g2d.translate(-X1, -Y1);
        
    }
    
}
