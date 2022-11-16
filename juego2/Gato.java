package juego2;
import javax.swing.JFrame;
import interfaces.iJuego;
import interfaces.iJugador;
import java.awt.EventQueue;
import clases.Jugador;
import clases.Registro;
import java.time.LocalDateTime;
import java.io.Serializable;

/* 
* Clase donde se maneja la interfaz del juego Gato
* Implementa la interfaz iJuego y Serializable para poder ser guardado en archivos 
*/
public class Gato implements iJuego, Serializable {
	//Declracion de variables globales 
	public static iJugador jugadorGlobal;
    static Registro registroGlobal;
	private String gameName;
    private String gameDescription;

	//Constructor para poder asignarle los atributos a la instancia 
    public Gato(String gameName,String gameDescription){
		this.gameDescription=gameDescription;
		this.gameName=gameName;
	}

	//Contructor vacio para poder acceder a los metodos de la clase 
	public Gato(){
	
	}
	
	/**
    * Metodo que se llama cuando se finaliza el juego y termina con el registro y se lo asigna a la persona que este jugando
    * metodos requeridos por la implementacion de la interfaz 
    */
	@Override
	public void terminarPartida() {
		Jugador jugadorFinal = (Jugador)jugadorGlobal;
        jugadorFinal.agregarRegistros(registroGlobal);
		
	}	

	/**
	* metodo que si utiliza para poder inicializar el juego desde el gamecenter
	* @param jugador
	*  metodos requeridos por la implementacion de la interfaz 
	*/
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

	/**
     * Metodo que realiza la accion de terminar de asignar los valores necesarios para completar un registro 
     * @param puntaje
     * @param juego
     */
	public void crearRegistro(int puntaje, iJuego juego){
        registroGlobal.setFinalizacion(LocalDateTime.now());   
        registroGlobal.setPuntaje(puntaje);
        registroGlobal.setEstado(true);
        registroGlobal.setJuego(juego);
        
    }

	//metodos requeridos por la implementacion de la interfaz 
	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return this.gameDescription;
	}
	//metodos requeridos por la implementacion de la interfaz 
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return this.gameName;
	}
}
