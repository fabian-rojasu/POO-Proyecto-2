package juego2;

import javax.swing.JFrame;
import interfaces.iJuego;
import interfaces.iJugador;
import java.awt.EventQueue;
import clases.Jugador;
import clases.Registro;
import java.time.LocalDateTime;
import java.io.Serializable;


public class Gato implements iJuego, Serializable {
	public static iJugador jugadorGlobal;
    
    static Registro registroGlobal;

	private String gameName;
    private String gameDescription;

    public Gato(String gameName,String gameDescription){
		this.gameDescription=gameDescription;
		this.gameName=gameName;
	}

	public Gato(){
	
	}
	
	@Override
	public void terminarPartida() {
		Jugador jugadorFinal = (Jugador)jugadorGlobal;
        jugadorFinal.agregarRegistros(registroGlobal);
		
	}	

	@Override
	public void iniciarPartida(iJugador jugador) {
		jugadorGlobal =jugador;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registroGlobal = new Registro(LocalDateTime.now(), null, 0, false, jugadorGlobal,null);
					JFrame Gato = new GUI_Gato();
					Gato.setVisible(true);
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
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return this.gameDescription;
	}
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return this.gameName;
	}
}
