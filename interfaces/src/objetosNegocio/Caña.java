/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosNegocio;

/**
 *
 * @author Dianey Elisa Velasquez Busani - 00000228270
 */
public class Caña {
    private int numCaña;
    private boolean lado;
    private Tablero tablero;
    private Jugador jugador;

    public Caña() {
    }

    public Caña(int numCaña, boolean lado) {
        this.numCaña = numCaña;
        this.lado = lado;
    }

    public Caña(int numCaña, boolean lado, Tablero tablero, Jugador jugador) {
        this.numCaña = numCaña;
        this.lado = lado;
        this.tablero = tablero;
        this.jugador = jugador;
    }
    
    public int getNumCaña() {
        return numCaña;
    }

    public void setNumCaña(int numCaña) {
        this.numCaña = numCaña;
    }

    public boolean isLado() {
        return lado;
    }

    public void setLado(boolean lado) {
        this.lado = lado;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }
}
