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
     * Metodo donde crea la ventana y todos sus elementos graficos que estan divididos por elemento
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
        
        //Elemento 1
        lbl_nickname =new JLabel();
        lbl_nickname.setText("Nombre de Usuario");
        lbl_nickname.setFont(fuente);
        lbl_nickname.setBounds(25, 200, 150, 25);
        this.add(lbl_nickname);

        //Elemento 2
        txt_nickname=new JTextField();
        txt_nickname.setBounds(25, 230, 150, 25);
        this.add(txt_nickname);

        //Elemento 3
        lbl_password=new JLabel();
        lbl_password.setText("Contraseña");
        lbl_password.setFont(fuente);
        lbl_password.setBounds(25, 275, 150, 25);
        this.add(lbl_password);

        //Elemento 4
        txt_password=new JTextField();
        txt_password.setBounds(25, 305, 150, 25);
        this.add(txt_password);

        //Elemento 5
        btn_Registrar=new JButton();
        btn_Registrar.setText("Registrar");
        btn_Registrar.setFont(fuente);
        btn_Registrar.setBackground(Color.white);
        btn_Registrar.setBounds(300, 230, 150, 25);
        this.add(btn_Registrar);
        btn_Registrar.addActionListener(this);

        //Elemento 6
        btn_iniciar=new JButton();
        btn_iniciar.setText("Iniciar sesion");
        btn_iniciar.setFont(fuente);
        btn_iniciar.setBackground(Color.white);
        btn_iniciar.setBounds(300, 305, 150, 25);
        this.add(btn_iniciar);
        btn_iniciar.addActionListener(this);

        //Elemento 7
        btn_salir=new JButton();
        btn_salir.setText("Salir");
        btn_salir.setFont(fuente);
        btn_salir.setBackground(Color.white);
        btn_salir.setBounds(450, 500, 75, 25);
        this.add(btn_salir);
        btn_salir.addActionListener(this);

    }
    final String NOMBRE_ARCHIVO = "personas.txt";//Linea donde se declara la variable que continen el nombre donde se guardaran los objetos persona
    /**
     * Metodo generado automaticamente por la implementacion de la clase ActionListener
     * En este bloque de codigo se configura todas la funciones de los botones implementados en la ventana 
     * @param e es la variable que registra el balor del boton oprimido 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        //Este primer bloque de if es el que determina la funcion que se va a ejecutar si se oprime el boton de registrar
        if(e.getSource()==btn_Registrar){
            leerDatos();//Llama al metodo que se encarga de restablecer los datos que ya se habian guardado 
            if(jugadores.size()==0){
                jugadores.add(new Jugador(txt_nickname.getText(), txt_password.getText()));
                cargarDatos();//Llama al metodo que se encarga de guardar el cambio que se acaba de realizar en archivos 
                JOptionPane.showMessageDialog(null,"Jugador Registrado");
            }else{
                Boolean encontrado =false;//Variable que determina si un jugador ya se ecuentra registrado
                for (Jugador Jugador : jugadores) {
                    if(Jugador.getNombre().equals(txt_nickname.getText())){
                        JOptionPane.showMessageDialog(null,"El jugador ya existe");
                        encontrado=true;
                    }
                }
                if(encontrado==false){
                    jugadores.add(new Jugador(txt_nickname.getText(), txt_password.getText()));
                    cargarDatos();//Llama al metodo que se encarga de guardar el cambio que se acaba de realizar en archivos 
                    JOptionPane.showMessageDialog(null,"Jugador Registrado");
                }
            }
        }
        //Este Segundo bloque de if es el que determina la funcion que se va a ejecutar si se oprime el boton de Iniciar
        if(e.getSource()==btn_iniciar){
            leerDatos();
            if(jugadores.size()==0){
                JOptionPane.showMessageDialog(null,"No hay jugadores registrados");
            }else{
                Boolean encontrado =false;//Variable que determina si un jugador ya se ecuentra registrado
                iJugador player=null;//Variable tipo ijugador para cambiarlo de Jugador 
                ArrayList<iJugador> players=new ArrayList<>();//ArrayList tipo ijugador para cambiarlo de Jugador 
                for (Jugador Jugador : jugadores) {//Recorre el ArrayList de jugadores para ver si se ecuentra para iniciar sesion 
                    if(Jugador.getNombre().equals(txt_nickname.getText())){
                        if(Jugador.getPassword().equals(txt_password.getText())){
                            player = Jugador;//Se hace el cambio de Jugador a iJugador 
                            for (Jugador iJugador : jugadores) {
                                players.add(iJugador);
                            }
                            encontrado=true;//Se pone la variable en true para permitir el inicio de sesion 
                        } 
                    }
                }
                if(encontrado){
                    //Crea y hace visible la ventana donde ya se podran visualizar los juegos disponibles, el gameCenter
                    JFrame ventanaGameCenter = new GuiGameCenter(player,players);
                    ventanaGameCenter.setVisible(true);
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(null,"Usuario o Contraseña incorrecta");
                }
            }
        }
        //Este Tercer bloque de if es el que determina la funcion que se va a ejecutar si se oprime el boton de Salir
        if(e.getSource()==btn_salir){
            this.dispose();
        }
        
    }

    /**
     * Metodo donde se realiza el guardado de los objetos persona en archivos 
     */
    public void cargarDatos(){
        // Escritura de objetos:
        try {
            OutputStream os = new FileOutputStream(NOMBRE_ARCHIVO);//Crea el archivo con el nombre del String declarado en la linea 95
            ObjectOutputStream oos = new ObjectOutputStream(os);     
            oos.writeObject(jugadores);//Guarda/ escribe en los archivos 
            oos.close();
            System.out.println("La escritura se ha completado.");     
        } catch (IOException ex) {
            System.err.println("Error -> " + ex.getMessage());
        }
    }

    /**
     * Metodo que se utiliza para poder cargar o traer de vuelta de los archivos los objetos tipo persona anteriormente registrados 
     */
    public void leerDatos(){
        // Lectura de objetos:
        try {
            InputStream is = new FileInputStream(NOMBRE_ARCHIVO);//Crea el archivo con el nombre del String declarado en la linea 95
            ObjectInputStream ois = new ObjectInputStream(is);
            
            jugadores=(ArrayList<Jugador>)(ois.readObject());//Lo lee y le hace la convercion a Arraylist<Jugador>

            ois.close();
    
        } catch (IOException | ClassNotFoundException ex) {
            System.err.println("Error -> " + ex.getMessage());
        }
    }
}
