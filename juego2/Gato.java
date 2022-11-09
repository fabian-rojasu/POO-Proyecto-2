package juego2;

import javax.swing.JFrame;
import interfaces.iJuego;
import interfaces.iJugador;
import java.awt.EventQueue;


public class Gato implements iJuego {

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
		// TODO Auto-generated method stub
		
	}	

	@Override
	public void iniciarPartida(iJugador jugador) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame Gato = new GUI_Gato();
					Gato.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
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
