package DibujarTableros;



import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Equipo2
 */
public class DibujarTablero7{
    public void dibujarTablero(Graphics g){
        
        //Hélice vertical a
        g.drawLine(350,10,350,230);
        g.drawLine(400,10,400,230);
        g.drawLine(450,10,450,230);
        g.drawLine(350, 50, 450, 50);
        g.drawLine(350, 80, 450, 80);
        g.drawLine(350, 110, 450, 110);
        g.drawLine(350, 140, 450, 140);
        g.drawLine(350, 170, 450, 170);
        g.drawLine(350, 200, 450, 200);
        
        //Hélice vertical b
        g.drawLine(350,330,350,540);
        g.drawLine(400,330,400,540);
        g.drawLine(450,330,450,540);
        g.drawLine(350, 510, 450, 510);
        g.drawLine(350, 360, 450, 360);
        g.drawLine(350, 390, 450, 390);
        g.drawLine(350, 420, 450, 420);
        g.drawLine(350, 450, 450, 450);
        g.drawLine(350, 480, 450, 480);
        
        //Helice horizontal a
        g.drawLine(140, 230, 350, 230);
        g.drawLine(140, 280, 350, 280);
        g.drawLine(140, 330, 350, 330);
        g.drawLine(170, 230, 170, 330);
        g.drawLine(200, 230, 200, 330);
        g.drawLine(230, 230, 230, 330);
        g.drawLine(260, 230, 260, 330);
        g.drawLine(290, 230, 290, 330);
        g.drawLine(320, 230, 320, 330);
        
        //Helice horizontal b
        g.drawLine(450 ,330 ,660 ,330);
        g.drawLine(450 ,280 ,660 ,280);
        g.drawLine(450 ,230 ,660 ,230);
        g.drawLine(480, 230, 480, 330);
        g.drawLine(510, 230, 510, 330);
        g.drawLine(540, 230, 540, 330);
        g.drawLine(570, 230, 570, 330);
        g.drawLine(600, 230, 600, 330);
        g.drawLine(630, 230, 630, 330);
        
        //casillas centrales
        g.drawLine(350, 230, 350, 330);
        g.drawLine(450, 230, 450, 330);
        g.drawLine(350, 230, 450, 230);
        g.drawLine(350, 330, 450, 330);
        g.drawLine(400, 230, 400, 330);
        g.drawLine(350, 280, 450, 280);
        
        //casillas circulares
        g.drawArc(350, 0, 50, 30, 0, 180);
        g.drawArc(400, 0, 50, 30, 0, 180);
        g.drawArc(350, 525, 50, 30, 0,-180);
        g.drawArc(400, 525, 50, 30, 0,-180);
        g.drawArc(125, 230, 30, 50, 90, 180);
        g.drawArc(125, 280, 30, 50, 90, 180);
        g.drawArc(645, 230, 30, 50, 90, -180); 
        g.drawArc(645, 280, 30, 50, 90, -180);
        
        //casillas amarillas
        g.setColor(Color.yellow);
        g.fillRect(400,200,50,30);
        g.fillRect(320,230,30,50);
        g.fillRect(350,330,50,30);
        g.fillRect(450,280,30,50);
        
        //triangulos
        //Arriba
        int[] puntosX={350,400,350};
        int[] puntosY={70,80,90};
        g.setColor(Color.red);
        g.drawPolygon(puntosX, puntosY,3);
        g.fillPolygon(puntosX, puntosY,3);
        int[] puntosX2={450,400,450};
        int[] puntosY2={70,80,90};
        g.setColor(Color.red);
        g.drawPolygon(puntosX2, puntosY2,3);
        g.fillPolygon(puntosX2, puntosY2,3);
        //Abajo
        int[] puntosX3={450,400,450};
        int[] puntosY3={470,480,490};
        g.setColor(Color.red);
        g.fillPolygon(puntosX3, puntosY3,3);
        int[] puntosX4={350,400,350};
        int[] puntosY4={470,480,490};
        g.setColor(Color.red);
        g.fillPolygon(puntosX4, puntosY4,3);
        //Izquierda
        int[] puntosX5={190,200,210};
        int[] puntosY5={230,280,230};
        g.setColor(Color.red);
        g.fillPolygon(puntosX5, puntosY5,3);
        int[] puntosX6={190,200,210};
        int[] puntosY6={330,280,330};
        g.setColor(Color.red);
        g.fillPolygon(puntosX6, puntosY6,3);
        //Derecha
        int[] puntosX7={590,600,610};
        int[] puntosY7={230,280,230};
        g.setColor(Color.red);
        g.fillPolygon(puntosX7, puntosY7,3);
        int[] puntosX8={590,600,610};
        int[] puntosY8={330,280,330};
        g.setColor(Color.red);
        g.fillPolygon(puntosX8, puntosY8,3);
    }
}
