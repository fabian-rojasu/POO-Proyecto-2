package juego1;
import interfaces.iJuego;
import interfaces.iJugador;
import clases.Jugador;
import clases.Registro;
import java.awt.EventQueue;
import java.time.LocalDateTime;

import javax.swing.JFrame;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;



public class MultiMath implements interfaces.iJuego{
    
    public static iJugador jugadorGlobal;
    
    static Registro registroGlobal;

    private String gameName;
    private String gameDescription;

    public  MultiMath(String gameName, String gameDescription){
        this.gameDescription=gameDescription;
        this.gameName=gameName;


    }
    
    public  MultiMath(){

    }

    @Override
    public void iniciarPartida(iJugador jugador) {
        jugadorGlobal =jugador;
        
        EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
                    registroGlobal = new Registro(LocalDateTime.now(), null, 0, false, jugadorGlobal,null);
					JFrame mm = new GUI_MultiMath();
					mm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
        
    }

    public void crearRegistro(int puntaje, iJuego juego){
        registroGlobal.setFinalizacion(LocalDateTime.now());   
        registroGlobal.setPuntaje(puntaje);
        registroGlobal.setEstado(true);
        registroGlobal.setJuego(juego);
    }

    
   
    @Override
    public void terminarPartida() {
        Jugador jugadorFinal = (Jugador)jugadorGlobal;
        jugadorFinal.agregarRegistros(registroGlobal);
        
    }

    @Override
    public String getNombre() {

        return this.gameName;
    }

    @Override
    public String getDescripcion() {

        return this.gameDescription;
    }

    

    
    
}
