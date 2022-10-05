/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import DibujarTableros.Cañas;
import DibujarTableros.DibujarTablero5;
import DibujarTableros.DibujarTablero7;
import DibujarTableros.IDibujarTableros;
import Juego.Movimientos;
import builder.DirectorFicha;
import builder.FichaBuilder;
import java.awt.Graphics;
import javax.swing.ImageIcon;
/**
 *
 * @author 52644
 */
public class Tablero extends javax.swing.JFrame {
    
    DirectorFicha director = new DirectorFicha();
    FichaBuilder builder = new FichaBuilder();
    /**
     * Creates new form Tablero
     */
    public Tablero() {
        initComponents();
        
        ImageIcon f1 = new ImageIcon(getClass().getResource("/img/ficha1.png"));
        director.construirFichaAzul(builder, 1, f1.getImage());
        director.construirFichaAzul(builder, 2, f1.getImage()); 
    }
    public void pintar(){
        if(configuracion.txtCasillas.getText().equals("14")){
            IDibujarTableros dibujar = new DibujarTablero7();
            dibujar.dibujarTablero(tablero.getGraphics());
        }else if(configuracion.txtCasillas.getText().equals("10")){
            IDibujarTableros dibujar = new DibujarTablero5();
            dibujar.dibujarTablero(tablero.getGraphics());
        }
        mostrarInfoJugador(infoJugador1.getGraphics());
    }
    public void ingresarFicha(){
        Movimientos ingresarFicha = new Movimientos();
        ingresarFicha.ingresaFicha(tablero.getGraphics());
    }
    public void mostrarInfoJugador(Graphics g){
        ImageIcon f1 = new ImageIcon(getClass().getResource("/img/ficha1.png"));
        ImageIcon f2 = new ImageIcon(getClass().getResource("/img/ficha1.png"));
        ficha1.setIcon(f1);
        ficha2.setIcon(f2);
    }
    public void moverFicha(){
        Movimientos mov = new Movimientos();
        mov.moverFicha(tablero.getGraphics());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tablero = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        cañas = new javax.swing.JPanel();
        cañaUno = new javax.swing.JLabel();
        cañaDos = new javax.swing.JLabel();
        cañaTres = new javax.swing.JLabel();
        cañaCuatro = new javax.swing.JLabel();
        cañaCinco = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tirarCañas = new javax.swing.JButton();
        infoJugador1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ficha1 = new javax.swing.JLabel();
        ficha2 = new javax.swing.JLabel();
        ficha3 = new javax.swing.JLabel();
        ficha4 = new javax.swing.JLabel();
        ficha5 = new javax.swing.JLabel();
        ficha6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablero.setBackground(new java.awt.Color(255, 255, 255));
        tablero.setPreferredSize(new java.awt.Dimension(720, 1080));

        javax.swing.GroupLayout tableroLayout = new javax.swing.GroupLayout(tablero);
        tablero.setLayout(tableroLayout);
        tableroLayout.setHorizontalGroup(
            tableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        tableroLayout.setVerticalGroup(
            tableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        jButton1.setText("Llenar tablero");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cañaUno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cañaVacia.png"))); // NOI18N

        cañaDos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cañaVacia.png"))); // NOI18N

        cañaTres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cañaVacia.png"))); // NOI18N
        cañaTres.setText("jLabel3");

        cañaCuatro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cañaVacia.png"))); // NOI18N
        cañaCuatro.setText("jLabel4");

        cañaCinco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cañaVacia.png"))); // NOI18N
        cañaCinco.setText("jLabel5");

        javax.swing.GroupLayout cañasLayout = new javax.swing.GroupLayout(cañas);
        cañas.setLayout(cañasLayout);
        cañasLayout.setHorizontalGroup(
            cañasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cañasLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(cañasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cañaUno)
                    .addComponent(cañaTres, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(cañasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cañaDos)
                    .addComponent(cañaCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addGap(24, 24, 24))
            .addGroup(cañasLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(cañaCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cañasLayout.setVerticalGroup(
            cañasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cañasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cañasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cañaDos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cañaUno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cañasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cañaTres)
                    .addComponent(cañaCuatro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cañaCinco)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Century", 0, 24)); // NOI18N
        jLabel1.setText("Cañas");

        tirarCañas.setText("Tirar cañas");
        tirarCañas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tirarCañasActionPerformed(evt);
            }
        });

        jLabel4.setText("Dinero:");

        jLabel5.setText("Fichas:");

        ficha1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoBlanco.png"))); // NOI18N

        ficha2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoBlanco.png"))); // NOI18N

        ficha4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoBlanco.png"))); // NOI18N

        javax.swing.GroupLayout infoJugador1Layout = new javax.swing.GroupLayout(infoJugador1);
        infoJugador1.setLayout(infoJugador1Layout);
        infoJugador1Layout.setHorizontalGroup(
            infoJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoJugador1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infoJugador1Layout.createSequentialGroup()
                        .addGroup(infoJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(infoJugador1Layout.createSequentialGroup()
                        .addComponent(ficha1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ficha2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ficha4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(infoJugador1Layout.createSequentialGroup()
                        .addComponent(ficha3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ficha5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ficha6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        infoJugador1Layout.setVerticalGroup(
            infoJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoJugador1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ficha1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ficha2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ficha4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(infoJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ficha3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ficha5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ficha6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        jLabel2.setText("Jugador 1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tablero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tirarCañas))
                            .addComponent(cañas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(infoJugador1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(300, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tablero, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(cañas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tirarCañas))
                        .addGap(11, 11, 11)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(infoJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(149, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        pintar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tirarCañasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tirarCañasActionPerformed
        Cañas cañas = new Cañas();
        cañas.generarLado();
        ingresarFicha();
        moverFicha();
    }//GEN-LAST:event_tirarCañasActionPerformed

    /**
     * @param args the command line arguments
     */
//     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel cañaCinco;
    public static javax.swing.JLabel cañaCuatro;
    public static javax.swing.JLabel cañaDos;
    public static javax.swing.JLabel cañaTres;
    public static javax.swing.JLabel cañaUno;
    private javax.swing.JPanel cañas;
    public static javax.swing.JLabel ficha1;
    public static javax.swing.JLabel ficha2;
    public static javax.swing.JLabel ficha3;
    public static javax.swing.JLabel ficha4;
    public static javax.swing.JLabel ficha5;
    public static javax.swing.JLabel ficha6;
    private javax.swing.JPanel infoJugador1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private static javax.swing.JPanel tablero;
    private javax.swing.JButton tirarCañas;
    // End of variables declaration//GEN-END:variables
}
