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

public class FigPanel2 extends JPanel {
    
    @Override
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        
        Graphics2D g2d = (Graphics2D) g;
        
        
        
        
        //dibujar rectangulo (fondo del paisaje)
        
        int X1 = 0;
        
        int Y1 = 0;
        
        int TamX = this.getBounds().width;
        
        int TamY = this.getBounds().height;
        
        g2d.setPaint(new GradientPaint(X1, Y1 + TamY / 3, new Color(100, 248, 251), X1, Y1 + TamY, new Color(255, 255, 255),false));
        
        g2d.fill(new Rectangle2D.Double(X1, Y1, TamX, TamY));
        
        
        
        
        //Dibujar Aro1 sol
        
        X1 = this.getBounds().width / 2;
        Y1 = 100;
        TamX = 160;
        TamY = 160;
        int R1 = 170;
        int R2 = 170;
        int G1 = 240;
        int G2 = 240;
        int B1 = 180;
        int B2 = 180;
        
        Circulo(g2d, X1, Y1, TamX, TamY, R1, G1, B1, R2, G2, B2);
        
        
        
        //Dibujar Aro2 sol
        
        X1 = this.getBounds().width / 2;
        Y1 = 100;
        TamX = 120;
        TamY = 120;
        R1 = 220;
        R2 = 220;
        G1 = 240;
        G2 = 240;
        B1 = 110;
        B2 = 110;
        
        Circulo(g2d, X1, Y1, TamX, TamY, R1, G1, B1, R2, G2, B2);
        
        
        
        //Dibujar sol
        
        X1 = this.getBounds().width / 2;
        Y1 = 100;
        TamX = 80;
        TamY = 80;
        R1 = 245;
        R2 = 245;
        G1 = 249;
        G2 = 249;
        B1 = 40;
        B2 = 40;
        
        Circulo(g2d, X1, Y1, TamX, TamY, R1, G1, B1, R2, G2, B2);
 
        
        
      
        
        //Dibujar monta??a izquierda
        
        X1 = 60;
        Y1 = 190;
        
        int Ancho = 80;
        int Alto = 0;
        int Escala = 20;
        R1 = 175;
        R2 = 175;
        G1 = 215;
        G2 = 215;
        B1 = 208;
        B2 = 208;
        
        Triangulo(g2d, X1, Y1, Ancho, Alto, Escala, R1, G1, B1, R2, G2, B2);
        
        
        
        
        //Dibujar monta??a derecha
        
        X1 = 150;
        Y1 = 200;
        Ancho = 130;
        Alto = 0;
        Escala = 20;
        R1 = 196;
        R2 = 196;
        G1 = 194;
        G2 = 194;
        B1 = 190;
        B2 = 190;
        
        Triangulo(g2d, X1, Y1, Ancho, Alto, Escala, R1, G1, B1, R2, G2, B2);
        
        
        
        //Dibujar Campo superior y pinos
        //Campo
        X1 = 0;
        Y1 = 250;
        TamX = this.getBounds().width + 100;
        TamY = 100;
        int Angulo = 5;
        R1 = 44;
        R2 = 44;
        G1 = 42;
        G2 = 42;
        B1 = 10;
        B2 = 10;
        
        Rectangulo(g2d, X1, Y1, TamX, TamY, Angulo, R1, G1, B1, R2, G2, B2);
        

        //pino1
        X1 = 20;
        Y1 = 280;
        Ancho = -4;
        Alto = 2;
        Escala = 2;
        R1 = 20;
        R2 = 20;
        G1 = 22;
        G2 = 22;
        B1 = 1;
        B2 = 1;
        
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
        R1 = 55;
        R2 = 55;
        G1 = 89;
        G2 = 89;
        B1 = 11;
        B2 = 11;
        
        Rectangulo(g2d, X1, Y1, TamX, TamY, Angulo, R1, G1, B1, R2, G2, B2);
        

        //pino1
        X1 = 120;
        Y1 = 310;
        Ancho = -8;
        Alto = 10;
        Escala = 3;
        R1 = 23;
        R2 = 23;
        G1 = 55;
        G2 = 55;
        B1 = 5;
        B2 = 5;
        
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
        R1 = 180;
        R2 = 180;
        G1 = 238;
        G2 = 238;
        B1 = 44;
        B2 = 44;
        
        Rectangulo(g2d, X1, Y1, TamX, TamY, Angulo, R1, G1, B1, R2, G2, B2);
        

        //pino1
        X1 = 20;
        Y1 = 360;
        Ancho = -12;
        Alto = 10;
        Escala = 5;
        R1 = 46;
        R2 = 46;
        G1 = 109;
        G2 = 109;
        B1 = 22;
        B2 = 22;
        
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
        
        
        
        /*
        //Dibujar estrella
        X1 = 30;
        Y1 = 10;
        Escala = 1;
        R1 = 255;
        R2 = 255;
        G1 = 255;
        G2 = 255;
        B1 = 255;
        B2 = 255;
        
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
        
        */
        
       
        
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
