/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

import java.awt.Color;
import java.awt.Image;
import objetosNegocio.Casilla;
import objetosNegocio.Ficha;
import objetosNegocio.Jugador;

/**
 *
 * @author Paulina Cortez Alamilla.
 */
public class FichaBuilder implements BuilderFicha {
    
    private int numFicha;
    private Jugador jugador; 
    private Image img;
    
    @Override
    public void setNumFicha(int numFicha) {
        this.numFicha = numFicha;
    }

    @Override
    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    @Override
    public void setImg(Image img) {
        this.img = img;
    }
    
    public Ficha resultado(){
        return new Ficha(numFicha, img);
    }
}
