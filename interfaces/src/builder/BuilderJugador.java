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
public interface BuilderJugador {
    void setDinero(float dinero);
    void setFichas(Ficha[] fichas);
    void setTablero(Tablero tablero);
    void setCaña(Caña[] cañas);
    void setApuesta(Apuesta[] apuesta);
}
