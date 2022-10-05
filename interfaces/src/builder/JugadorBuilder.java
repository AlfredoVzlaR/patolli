/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import java.awt.Color;
import objetosNegocio.*;

/**
 *
 * @author Dianey Elisa Velasquez Busani - 00000228270
 */
public class JugadorBuilder implements BuilderJugador{
    private float dinero;
    private Ficha[] fichas;
    private Tablero tablero; 
    private Caña[] cañas;
    private Apuesta[] apuestas;
    private Color color;
    private boolean jugando=false;
    private int fichaEnTurno = 1;

    @Override
    public void setDinero(float dinero) {
        this.dinero=dinero;
    }

    @Override
    public void setFichas(Ficha[] fichas) {
        this.fichas=fichas;
    }

    @Override
    public void setTablero(Tablero tablero) {
        this.tablero=tablero;
    }

    @Override
    public void setCaña(Caña[] cañas) {
        this.cañas=cañas;
    }

    @Override
    public void setApuesta(Apuesta[] apuesta) {
        this.apuestas=apuestas;
    }
    
    public Jugador getResultado(){
        return new Jugador(dinero, fichas, tablero, cañas, apuestas);
    }
}
