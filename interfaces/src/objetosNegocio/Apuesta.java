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
public class Apuesta {
    private int monto;
    private Jugador jugador;

    public Apuesta() {
    }

    public Apuesta(int monto) {
        this.monto = monto;
    }

    public Apuesta(int monto, Jugador jugador) {
        this.monto = monto;
        this.jugador = jugador;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }
}
