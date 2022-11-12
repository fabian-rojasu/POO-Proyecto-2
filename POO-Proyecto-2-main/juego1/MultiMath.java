package juego1;
import interfaces.iJugador;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.EventQueue;
import javax.swing.JFrame;


public class MultiMath implements interfaces.iJuego{
    static int puntaje = 0;
    static String resultado;
    static String respuesta;
    static JButton btnResponder;
    static JButton btnSalir;
    public static iJugador jugadorGlobal;
    static String[] operadores = {"+","-","*","/"};
    static JTextField operacion;
    static JTextField res;
    static JLabel score;

    private String gameName;
    private String gameDescription;

    public  MultiMath(String gameName, String gameDescription){
        this.gameDescription=gameDescription;
        this.gameName=gameName;

    }
    

    @Override
    public void iniciarPartida(iJugador jugador) {
        EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame mm = new GUI_MultiMath();
					mm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
        
    }


    @Override
    public void terminarPartida() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String getNombre() {
        // TODO Auto-generated method stub
        return this.gameName;
    }

    @Override
    public String getDescripcion() {
        // TODO Auto-generated method stub
        return this.gameDescription;
    }

    
    
}
