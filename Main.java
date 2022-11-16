import javax.swing.JFrame;

/**
 * @author Fabian Rojas, Jeison Blanco, Geancarlo Oviedo 
 * Centro de Juegos 
 * 
 * Clase principal 
 * Crea/llama la ventana de Login
 */
public class Main {
    static JFrame ventanaLogin;
    public static void main(String[] args) 
    {
        ventanaLogin = new Login();
        ventanaLogin.setVisible(true);
    }
    
}
