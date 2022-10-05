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
public class Casilla {
    private Tablero tablero;
    private Ficha[] ListaFicha;

    public Casilla() {
    }

    public Casilla(Tablero tablero, Ficha[] ListaFicha) {
        this.tablero = tablero;
        this.ListaFicha = ListaFicha;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    public Ficha[] getListaFicha() {
        return ListaFicha;
    }

    public void setListaFicha(Ficha[] ListaFicha) {
        this.ListaFicha = ListaFicha;
    }
    
    
}
