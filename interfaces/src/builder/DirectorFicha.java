/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

import java.awt.Image;
import objetosNegocio.Jugador;

/**
 *
 * @author Paulina Cortez Alamilla.
 */
public class DirectorFicha {

    public void construirFichaAzul(BuilderFicha builder, int numeroFicha, Image img) {
        builder.setNumFicha(numeroFicha);
        builder.setJugador(new Jugador());
        builder.setImg(img);
    }

    public void construirFichaVerde(BuilderFicha builder, int numeroFicha, Image img) {
        builder.setNumFicha(numeroFicha);
        builder.setJugador(new Jugador());
        builder.setImg(img);
    }

    public void construirFichaMorada(BuilderFicha builder, int numeroFicha,Image img) {
        builder.setNumFicha(numeroFicha);
        builder.setJugador(new Jugador());
        builder.setImg(img);
    }

    public void construirFichaNaranja(BuilderFicha builder, int numeroFicha, Image img) {
        builder.setNumFicha(numeroFicha);
        builder.setJugador(new Jugador());
        builder.setImg(img);
    }
}
