/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Geancarlo Oviedo, Jeison Blanco, Fabian Rojas 
 */
import java.util.ArrayList;
import java.util.Collections;
import Comparadores.ComparadorRegistros;
import Comparadores.Comparador;
import clases.Jugador;
import clases.Registro;
import interfaces.iJuego;
import interfaces.iJugador;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * Clase donde se realizara la implementacion de la interfaz grafica del centro de juegos 
 */
public class GuiGameCenter extends javax.swing.JFrame {
    int cont = 0;
    String[] personal = {"fuap", "Item 2", "Item 3", "Item 4" };
    static iJugador jugador;
    static iJuego MM;
    static ArrayList<iJugador> jugadores;
    CentroJuego center;
    
    /**
     * Creates new form GuiGameCenter
     */
    public GuiGameCenter(iJugador j,ArrayList<iJugador> js) {
        jugador = j;
        jugadores = js;
        center = new CentroJuego(jugador);
        initComponents();
    }

    /**
     * Este metodo es el que se encarga de crear y asignar todas las variables graficas y agregarlas en el JFrame 
     */
    private void initComponents() {
        Guardar();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(28, 28, 28));

        jPanel2.setBackground(new java.awt.Color(80, 32, 108));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(80, 32, 108)));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel2MouseExited(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logotipoTicTacToe.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(89, 89, 89))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel4)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(229, 229, 229));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(229, 229, 229)));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel3MouseExited(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logotipoJuego3.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel7)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel7)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(255, 51, 51)));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel4MouseExited(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logomultimath.png"))); // NOI18N
        jLabel1.setText("\n");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel1)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(20, 18, 18));

        jPanel6.setBackground(new java.awt.Color(255, 51, 51));
        jPanel6.setVisible(false);
        jPanel6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 51, 0)));
        jPanel6.setRequestFocusEnabled(false);
        jPanel6.setVerifyInputWhenFocusTarget(false);
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PLAY");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel2)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jLabel3.setVisible(false);
        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Juego de operaciones matematicas que acaba hasta que falles.  ");

        jLabel5.setVisible(false);
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Personal");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(personal));
        jComboBox2.setVisible(false);
        jComboBox2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jComboBox2.setEditor(null);
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        
        
        

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setVisible(false);
        jLabel6.setText("Global");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        jComboBox1.setVisible(false);
        jComboBox1.setEditor(null);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jComboBox2, 0, 130, Short.MAX_VALUE)
                .addGap(68, 68, 68)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(443, 443, 443))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(jLabel5)
                .addGap(173, 173, 173)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(33, 33, 33))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lblJugador.png"))); // NOI18N

        lblNombre.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText(jugador.getNombre());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNombre))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lblNombre)))
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseEntered
        if (cont == 0) {
            jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(42, 120, 128)));  
            jLabel3.setText("Juego de operaciones matematicas que acaba hasta que falles");
            jLabel3.setVisible(true);
        }

    }//GEN-LAST:event_jPanel4MouseEntered


    private void jPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseExited
        if (cont == 0) {
            jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(255,51,51)));
            jLabel3.setVisible(false);
        }
    }//GEN-LAST:event_jPanel4MouseExited

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
        if (cont == 0) {
            jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(42, 120, 128)));
            
            jLabel3.setText("TicTacToe contra PC");
            jLabel3.setVisible(true);

        }
    }//GEN-LAST:event_jPanel2MouseEntered

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
        if (cont == 0) {
            jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(42, 120, 128)));
            jLabel3.setText("Juego 3");
            jLabel3.setVisible(true);
            
        }
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jPanel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseExited
        if (cont == 0) {
            jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(80,32,108)));
            
            jLabel3.setVisible(false);
        }
    }//GEN-LAST:event_jPanel2MouseExited

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
       if (cont == 0) {
            jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(229,229,229)));
             jLabel3.setVisible(false);
        }
        
    }//GEN-LAST:event_jPanel3MouseExited

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
       if (cont == 1) {
          
            MM = center.getJuegosDisponibles().get(0);
            MM.iniciarPartida(jugador);  

       }
       if (cont == 2) {

            MM = center.getJuegosDisponibles().get(1);
            MM.iniciarPartida(jugador);
        }
        
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        cont=1;
        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.setVisible(true);
        jLabel3.setVisible(false);
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(42, 120, 128)));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(229,229,229)));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(80,32,108)));
        jLabel3.setText("Juego de operaciones matematicas que acaba hasta que falles");
        jLabel3.setVisible(true);
        jLabel6.setVisible(true);
        jComboBox1.setVisible(true);
        jLabel5.setVisible(true);
        jComboBox2.setVisible(true);
        MM = center.getJuegosDisponibles().get(0);
        PuntajePersonal();
        PuntajeGolbal();
        
        
        
        
        
        
        
    }//GEN-LAST:event_jPanel4MouseClicked

    //Metodo que obtienen los puntajes personales para asi insertarlos en la parte grafica 
    private void PuntajePersonal(){
        ArrayList<Comparador> listaComparador = new ArrayList<>();
        Jugador ju = (Jugador) jugador;
        if(ju.getEstadisticas(MM).size() == 0){
            jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(personal));
        }else{
            int contador=0;
            while(contador <ju.getEstadisticas(MM).size()){
                if(MM.getNombre().equals(ju.getEstadisticas(MM).get(contador).getJuego().getNombre()) ){
                    Comparador comparar = new Comparador(ju.getEstadisticas(MM).get(contador).getPuntaje(), ju.getEstadisticas(MM).get(contador).getFinalizacion());
                    listaComparador.add(comparar);
                }
                contador++; 
            }
            Collections.sort(listaComparador);
            String[] personal = new String[10];

            if(listaComparador.size() < 10){
                for (int i = 0; i < listaComparador.size(); i++) {
                    personal[i] = listaComparador.get(i).getPuntaje()+": "+
                    listaComparador.get(i).getFecha().getDayOfMonth()+"-"+listaComparador.get(i).getFecha().getMonthValue()+"-"+
                    listaComparador.get(i).getFecha().getYear();
                } 
            }else{
                for (int i = 0; i < 10; i++) {
                    personal[i] = listaComparador.get(i).getPuntaje()+": "+
                    listaComparador.get(i).getFecha().getDayOfMonth()+"-"+listaComparador.get(i).getFecha().getMonthValue()+"-"+
                    listaComparador.get(i).getFecha().getYear();
                }  
            }
            jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(personal));
        }
    }
    
    //Metodo que obtienen los puntajes Globales de un juego en especifico para asi insertarlos en la parte grafica 
    private void PuntajeGolbal(){
        ArrayList<Jugador> listaJugadores = new ArrayList<>();
        ArrayList<Registro> listaRegistros = new ArrayList<>();
        Jugador cambioJugador;
        String[] globalStrings = new String[10];
        for(iJugador juga : jugadores){
            cambioJugador = (Jugador) juga;
            listaJugadores.add(cambioJugador);
        }
           for (int i = 0; i < listaJugadores.size(); i++) {
                for (int j = 0; j < listaJugadores.get(i).getEstadisticas(MM).size(); j++) {
                    if(MM.getNombre().equals(listaJugadores.get(i).getEstadisticas(MM).get(j).getJuego().getNombre()) ){

                        listaRegistros.add(listaJugadores.get(i).getEstadisticas(MM).get(j));
                    }
                }
                
            } 
            Collections.sort(listaRegistros, new ComparadorRegistros());
            
            if(listaRegistros.size() == 0){
                jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(globalStrings));
            }else{
                if(listaRegistros.size() < 10){
                    for (int i = 0; i < listaRegistros.size(); i++) {
                        globalStrings[i] = listaRegistros.get(i).getJugador().getNombre()+": "+listaRegistros.get(i).getPuntaje()+": "+
                        listaRegistros.get(i).getFinalizacion().getDayOfMonth()+"-"+listaRegistros.get(i).getFinalizacion().getMonthValue()+"-"+
                        listaRegistros.get(i).getFinalizacion().getYear();
                    }
                }else{
                    for (int i = 0; i < 10; i++) {
                        globalStrings[i] = listaRegistros.get(i).getJugador().getNombre()+": "+listaRegistros.get(i).getPuntaje()+": "+
                        listaRegistros.get(i).getFinalizacion().getDayOfMonth()+"-"+listaRegistros.get(i).getFinalizacion().getMonthValue()+"-"+
                        listaRegistros.get(i).getFinalizacion().getYear();
                    }  
                }
            }
            
            jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(globalStrings));
        }
    

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        cont=2;
        MM = center.getJuegosDisponibles().get(1);
        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.setVisible(true);
        jLabel3.setVisible(false);
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(42, 120, 128)));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(153,255,204)));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(255,51,51)));
        jLabel3.setText("TicTacToe");
        jLabel3.setVisible(true);
        jLabel6.setVisible(true);
        jComboBox1.setVisible(true);
        jLabel5.setVisible(true);
        jComboBox2.setVisible(true);
        PuntajePersonal();
        PuntajeGolbal();
        
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        cont=3;
        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.setVisible(true);
        jLabel3.setVisible(false);
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(42, 120, 128)));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(80,32,108)));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(255,51,51)));
        jLabel3.setText("Juego 3");
        jLabel3.setVisible(true);
        jLabel6.setVisible(true);
        jComboBox1.setVisible(true);
        jLabel5.setVisible(true);
        jComboBox2.setVisible(true);
        //jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(persona));
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void Guardar(){
        try {
            addWindowListener(new java.awt.event.WindowAdapter (){ 
                public void windowClosing(java.awt.event.WindowEvent event){
                    cargarDatos();
                }
            
            });
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    /**
     * Metodo donde se realiza el guardado de los objetos persona en archivos 
     */
    public void cargarDatos(){
        // Escritura de objetos:
        try {
            OutputStream os = new FileOutputStream("personas.txt");
            ObjectOutputStream oos = new ObjectOutputStream(os);     
            oos.writeObject(jugadores);//Guarda/ escribe en los archivos 
            oos.close();
            System.out.println("La escritura se ha completado.");     
        } catch (IOException ex) {
            System.err.println("Error -> " + ex.getMessage());
        }
    }

    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuiGameCenter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiGameCenter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiGameCenter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiGameCenter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiGameCenter(jugador,jugadores).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblNombre;
    // End of variables declaration//GEN-END:variables
}
