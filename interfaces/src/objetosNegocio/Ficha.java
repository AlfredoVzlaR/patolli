/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosNegocio;

import java.awt.Color;
import java.awt.Image;

/**
 *
 * @author Dianey Elisa Velasquez Busani - 00000228270
 */
public class Ficha {
    private int numFicha;
    private Jugador jugador;
    private Image img;

    public Ficha() {
        
    }
    public Ficha(int numFicha,Image img) {
        this.numFicha = numFicha;
        this.img = img;
    }

    public int getNumFicha() {
        return numFicha;
    }

    public void setNumFicha(int numFicha) {
        this.numFicha = numFicha;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Image getImg() {
        return img;
    }

    public void setImg(Image img) {
        this.img = img;
    }
}
