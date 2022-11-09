import java.util.ArrayList;
import juego1.MultiMath;
import juego2.Gato;
import interfaces.iJuego;
import interfaces.iRegistro;
import interfaces.iJugador;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;


public class CentroJuego extends JFrame implements interfaces.iCentroJuego,ActionListener
{
    static iJugador globalJugador;

    ArrayList<iJugador> listJugadores;
    ArrayList<iRegistro> listPuntajesJuego1, listPuntajesJuego2 , listPuntajesJuego3;

    JButton btn_prueba;
    JLabel lbl_prueba;

    JButton btn_prueba2;
    JLabel lbl_prueba2;
    
    
    

    

    public CentroJuego(iJugador player){

        globalJugador = player;
        //Construccion de las porpiedades de la ventana
        this.setBounds(0, 0, 600, 600);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setTitle("Game Center");
        this.setResizable(false);
        this.getContentPane().setBackground(Color.GRAY);
        ArrayList<iJuego> juegosDisponibles = getJuegosDisponibles();

        btn_prueba =new JButton();
        btn_prueba.setBounds(200, 200, 100, 25);
        btn_prueba.setText(juegosDisponibles.get(0).getNombre());
        this.add(btn_prueba);
        btn_prueba.addActionListener(this);

        lbl_prueba =new JLabel();
        lbl_prueba.setText(juegosDisponibles.get(0).getNombre());
        lbl_prueba.setBounds(50, 50, 100, 25);
        this.add(lbl_prueba);

        btn_prueba2 =new JButton();
        btn_prueba2.setBounds(200, 250, 100, 25);
        btn_prueba2.setText(juegosDisponibles.get(1).getNombre());
        this.add(btn_prueba2);
        btn_prueba2.addActionListener(this);

        lbl_prueba2 =new JLabel();
        lbl_prueba2.setText(juegosDisponibles.get(1).getNombre());
        lbl_prueba2.setBounds(50, 100, 100, 25);
        this.add(lbl_prueba2);


        
        
    }

    @Override
    public ArrayList<iRegistro> getRegistros(iJuego tipoJuego) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ArrayList<iJuego> getJuegosDisponibles() {
        ArrayList<iJuego> juegosDisponibles= new ArrayList<>();
        MultiMath juego1 = new MultiMath("MultiMath","Juego matematico que se basa en responder la mayor cantidad de operaciones posibles");
        Gato juego2 =new Gato("Gato", "Tradicional juego donde en un 3x3 se tiene que conseguir acertar tu simbolo en una linea de 3");
        juegosDisponibles.add(juego1);
        juegosDisponibles.add(juego2);
        return juegosDisponibles;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn_prueba){
            iJuego MM = getJuegosDisponibles().get(0);
            MM.iniciarPartida(globalJugador);

        }
        if(e.getSource()==btn_prueba2){
            iJuego gato = getJuegosDisponibles().get(1);
            gato.iniciarPartida(globalJugador);
        }
        
    }
    
}
