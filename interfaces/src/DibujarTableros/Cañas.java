/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DibujarTableros;

import interfaces.Tablero;
import javax.swing.Icon;

/**
 *
 * @author 52644
 */
public class Cañas {
    public static int suma=0;
    public void generarLado(){
        int caña1 = (int) (Math.random()*2);
        int caña2 = (int) (Math.random()*2);
        int caña3 = (int) (Math.random()*2);
        int caña4 = (int) (Math.random()*2);
        int caña5 = (int) (Math.random()*2);
        
        suma = caña1+caña2+caña3+caña4+caña5;
        
        Icon uno = new javax.swing.ImageIcon(getClass().getResource("../img/cañaVacia.png"));
        Icon dos = new javax.swing.ImageIcon(getClass().getResource("../img/caña1.png"));
        
        if(caña1==0){
            Tablero.cañaUno.setIcon(uno);
        }else{
            Tablero.cañaUno.setIcon(dos);
        }
        if(caña2==0){
            Tablero.cañaDos.setIcon(uno);
        }else{
            Tablero.cañaDos.setIcon(dos);
        }
        if(caña3==0){
            Tablero.cañaTres.setIcon(uno);
        }else{
            Tablero.cañaTres.setIcon(dos);
        }
        if(caña4==0){
            Tablero.cañaCuatro.setIcon(uno);
        }else{
            Tablero.cañaCuatro.setIcon(dos);
        }
        if(caña5==0){
            Tablero.cañaCinco.setIcon(uno);
        }else{
            Tablero.cañaCinco.setIcon(dos);
        }
    }
    
}
