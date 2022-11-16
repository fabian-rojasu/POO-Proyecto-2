package juego1;
import interfaces.iJuego;
import interfaces.iJugador;
import clases.Jugador;
import clases.Registro;
import java.awt.EventQueue;
import java.time.LocalDateTime;
import javax.swing.JFrame;
import java.io.Serializable;


/**
 * Clase donde se maneja la interfaz del juego MultiMath
 * Implementa la interfaz iJuego y Serializable para poder ser guardado en archivos 
 */
public class MultiMath implements interfaces.iJuego, Serializable{

    //Declracion de variables globales 
    public static iJugador jugadorGlobal;
    static Registro registroGlobal;
    private String gameName;
    private String gameDescription;

    //Constructor para poder asignarle los atributos a la instancia 
    public  MultiMath(String gameName, String gameDescription){
        this.gameDescription=gameDescription;
        this.gameName=gameName;
    }
    
    //Contructor vacio para poder acceder a los metodos de la clase 
    public  MultiMath(){

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
					JFrame mm = new GUI_MultiMath();
					mm.setVisible(true);
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

    
   /**
    * Metodo que se llama cuando se finaliza el juego y termina con el registro y se lo asigna a la persona que este jugando
    * metodos requeridos por la implementacion de la interfaz 
    */
    @Override
    public void terminarPartida() {
        Jugador jugadorFinal = (Jugador)jugadorGlobal;
        jugadorFinal.agregarRegistros(registroGlobal);
        
    }

    //metodos requeridos por la implementacion de la interfaz 
    @Override
    public String getNombre() {

        return this.gameName;
    }

    //metodos requeridos por la implementacion de la interfaz 
    @Override
    public String getDescripcion() {

        return this.gameDescription;
    }
}
