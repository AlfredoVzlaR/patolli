/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosNegocio;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


/**
 *
 * @author Dianey Elisa Velasquez Busani - 00000228270
 */
public class Jugador {
    
    private float dinero;
    private Ficha[] fichas;
    private Tablero tablero; 
    private Caña[] cañas;
    private Apuesta[] apuestas;
    private Color color;
    private boolean jugando=false;
    private int fichaEnTurno = 1;
    
    public Jugador(){
        
    }

    public Jugador(float dinero, Ficha[] fichas) {
        this.dinero = dinero;
        this.fichas = fichas;
    }

    public Jugador(float dinero, Ficha[] fichas, Tablero tablero, Caña[] cañas, Apuesta[] apuestas) {
        this.dinero = dinero;
        this.fichas = fichas;
        this.tablero = tablero;
        this.cañas = cañas;
        this.apuestas = apuestas;
    }

    public float getDinero() {
        return dinero;
    }

    public void setDinero(float dinero) {
        this.dinero = dinero;
    }

    public Ficha[] getFichas() {
        return fichas;
    }

    public void setFichas(Ficha[] fichas) {
        this.fichas = fichas;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    public Caña[] getCañas() {
        return cañas;
    }

    public void setCañas(Caña[] cañas) {
        this.cañas = cañas;
    }

    public Apuesta[] getApuestas() {
        return apuestas;
    }

    public void setApuestas(Apuesta[] apuestas) {
        this.apuestas = apuestas;
    }

    public Color getColor() {
        return color;
    }

    public void setColor() {
        int colorFichas = (int)(Math.random()*4);
        if(colorFichas ==0){
            this.color = Color.BLUE;
        }else if(colorFichas==1){
            this.color = Color.RED;
        }else if(colorFichas ==2){
            this.color = Color.GREEN;
        }else{
            this.color = Color.black;
        }
    }

    public boolean isJugando() {
        return jugando;
    }

    public void setJugando(boolean jugando) {
        this.jugando = jugando;
    }

    public int getFichaEnTurno() {
        return fichaEnTurno;
    }

    public void setFichaEnTurno(int fichaEnTurno) {
        this.fichaEnTurno = fichaEnTurno;
    }
    
}
