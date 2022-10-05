/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juego;

import DibujarTableros.Cañas;
import interfaces.Tablero;
import interfaces.configuracion;
import java.awt.Graphics;
import javax.swing.ImageIcon;



/**
 *
 * @author 52644
 */
public class Movimientos {
    public void ingresaFicha(Graphics g){
        int suma = Cañas.suma;
        String tablero = configuracion.txtCasillas.getText();
        if(suma>0){
            if(tablero.equals("14")){
                ImageIcon fichaAIngresar = new ImageIcon(getClass().getResource("/img/ficha1.png"));
                ImageIcon fondoBlanco = new ImageIcon(getClass().getResource("/img/fondoBlanco.png"));
                g.drawImage(fichaAIngresar.getImage(),410,200,null);
                Tablero.ficha1.setIcon(fondoBlanco);
                g.drawImage(fichaAIngresar.getImage(), 410, 200, null);
            }else if(tablero.equals("10")){
                ImageIcon fichaAIngresar = new ImageIcon(getClass().getResource("/img/ficha1.png"));
                ImageIcon fondoBlanco = new ImageIcon(getClass().getResource("/img/fondoBlanco.png"));
                Tablero.ficha1.setIcon(fondoBlanco);
                g.drawImage(fichaAIngresar.getImage(), 410, 195, null);
            }
        }
    }
}
