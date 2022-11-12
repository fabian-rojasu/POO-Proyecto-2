import java.util.ArrayList;
import juego1.MultiMath;
import juego2.Gato;
import interfaces.iJuego;
import interfaces.iRegistro;
import interfaces.iJugador;


import javax.swing.JButton;

import javax.swing.JLabel;

import clases.Registro;



public class CentroJuego implements interfaces.iCentroJuego
{
    static iJugador globalJugador;

    ArrayList<iJugador> listJugadores;
    public static ArrayList<Registro> registros;

    JButton btn_prueba;
    JLabel lbl_prueba;

    JButton btn_prueba2;
    JLabel lbl_prueba2;
    
    
    

    

    public CentroJuego(iJugador player){

         
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

    
}
