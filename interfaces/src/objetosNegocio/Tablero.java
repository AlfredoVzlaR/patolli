/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosNegocio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dianey Elisa Velasquez Busani
 */
public class Tablero {
    private List<Casilla> casillas = new ArrayList<>();
    private Jugador jugador; 
    private Caña [] cañas;
    
    public Tablero(){
        
    }

    public Tablero(Jugador jugador, Caña[] cañas) {
        this.jugador = jugador;
        this.cañas = cañas;
    }
    
    public List<Casilla> getCasillas() {
        return casillas;
    }

    public void setCasillas(List<Casilla> casillas) {
        this.casillas = casillas;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Caña[] getCañas() {
        return cañas;
    }

    public void setCañas(Caña[] cañas) {
        this.cañas = cañas;
    }
}
