import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import clases.Jugador;
import interfaces.iJugador;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.util.ArrayList;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * Primera ventana donde se realizara el registro o inicio de sesion para poder acceder al Centro de juegos 
 */
public class Login extends JFrame implements ActionListener {

    Font fuente =new Font("Calibri", 3, 16);
    ArrayList<Jugador> jugadores =new ArrayList<>();
    
    //Declaracion de elementos Graficos
    static JLabel lbl_nickname;
    static JLabel lbl_password;
    static JTextField txt_nickname;
    static JTextField txt_password;
    static JButton btn_Registrar;
    static JButton btn_iniciar;
    static JButton btn_salir;

    /**
     * Metodo donde crea la ventana y todos sus elementos graficos 
     */
    public Login(){

       

        //Construccion de las porpiedades de la ventana
        this.setBounds(0, 0, 600, 600);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setTitle("Login");
        this.setResizable(false);
        this.getContentPane().setBackground(Color.GRAY);
        
        lbl_nickname =new JLabel();
        lbl_nickname.setText("Nombre de Usuario");
        lbl_nickname.setFont(fuente);
        lbl_nickname.setBounds(25, 200, 150, 25);
        this.add(lbl_nickname);

        txt_nickname=new JTextField();
        txt_nickname.setBounds(25, 230, 150, 25);
        this.add(txt_nickname);

        lbl_password=new JLabel();
        lbl_password.setText("Contraseña");
        lbl_password.setFont(fuente);
        lbl_password.setBounds(25, 275, 150, 25);
        this.add(lbl_password);

        txt_password=new JTextField();
        txt_password.setBounds(25, 305, 150, 25);
        this.add(txt_password);

        btn_Registrar=new JButton();
        btn_Registrar.setText("Registrar");
        btn_Registrar.setFont(fuente);
        btn_Registrar.setBackground(Color.white);
        btn_Registrar.setBounds(300, 230, 150, 25);
        this.add(btn_Registrar);
        btn_Registrar.addActionListener(this);

        btn_iniciar=new JButton();
        btn_iniciar.setText("Iniciar sesion");
        btn_iniciar.setFont(fuente);
        btn_iniciar.setBackground(Color.white);
        btn_iniciar.setBounds(300, 305, 150, 25);
        this.add(btn_iniciar);
        btn_iniciar.addActionListener(this);

        btn_salir=new JButton();
        btn_salir.setText("Salir");
        btn_salir.setFont(fuente);
        btn_salir.setBackground(Color.white);
        btn_salir.setBounds(450, 500, 75, 25);
        this.add(btn_salir);
        btn_salir.addActionListener(this);

    }
    final String NOMBRE_ARCHIVO = "personas.txt";
    /**
     * Metodo generado automaticamente por la implementacion de la clase ActionListener
     * En este bloque de codigo se configura todas la funciones de los botones implementados en la ventana 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn_Registrar){
            leerDatos();
            if(jugadores.size()==0){
                jugadores.add(new Jugador(txt_nickname.getText(), txt_password.getText()));
                

                cargarDatos();


                JOptionPane.showMessageDialog(null,"Jugador Registrado");
            }else{
                Boolean encontrado =false;
                for (Jugador Jugador : jugadores) {
                    if(Jugador.getNombre().equals(txt_nickname.getText())){
                        JOptionPane.showMessageDialog(null,"El jugador ya existe");
                        encontrado=true;
                    }
                }
                if(encontrado==false){
                    jugadores.add(new Jugador(txt_nickname.getText(), txt_password.getText()));
                    cargarDatos();
                    JOptionPane.showMessageDialog(null,"Jugador Registrado");
                }
            }
        }
        if(e.getSource()==btn_iniciar){
            leerDatos();
            if(jugadores.size()==0){
                JOptionPane.showMessageDialog(null,"No hay jugadores registrados");
            }else{
                Boolean encontrado =false;
                iJugador player=null;
                ArrayList<iJugador> players=new ArrayList<>();
                for (Jugador Jugador : jugadores) {
                    if(Jugador.getNombre().equals(txt_nickname.getText())){
                        if(Jugador.getPassword().equals(txt_password.getText())){
                            player = Jugador;
                            for (Jugador iJugador : jugadores) {
                                players.add(iJugador);
                            }
                            encontrado=true;
                        } 
                    }
                }
                if(encontrado){
                    JFrame ventanaGameCenter = new GuiGameCenter(player,players);
                    ventanaGameCenter.setVisible(true);
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(null,"Usuario o Contraseña incorrecta");
                }
            }
        }
        if(e.getSource()==btn_salir){
            this.dispose();
        }
        
    }

    public void cargarDatos(){
        // Escritura de objetos:
        try {
            OutputStream os = new FileOutputStream(NOMBRE_ARCHIVO);
            ObjectOutputStream oos = new ObjectOutputStream(os);     
            oos.writeObject(jugadores);
            oos.close();
            System.out.println("La escritura se ha completado.");     
        } catch (IOException ex) {
            System.err.println("Error -> " + ex.getMessage());
        }
    }

    public void leerDatos(){
        // Lectura de objetos:
        try {
            InputStream is = new FileInputStream(NOMBRE_ARCHIVO);
            ObjectInputStream ois = new ObjectInputStream(is);
            
            jugadores=(ArrayList<Jugador>)(ois.readObject());

            ois.close();
    
        } catch (IOException | ClassNotFoundException ex) {
            System.err.println("Error -> " + ex.getMessage());
        }
    }
}
