package clases;
import java.io.Serializable;
import java.util.ArrayList;
import interfaces.iJuego;
import interfaces.iRegistro;

/**
 * Clase donde se trabaja el objeto Jugador, contara con distintos metodos y atributos
 * Implementa la clase Serializable para poder asi ser guardado en archivos 
 * Atributos: nickname, password y un historico de registros(ArrayList)
 */
public class Jugador implements interfaces.iJugador, Serializable {
    //Atributos
    private String nickname;
    private String password;
    private ArrayList<Registro> registros;
   
    //Constructor 
    public Jugador(String nickname, String password){
        this.nickname=nickname;
        this.password=password;
        this.registros=new ArrayList<Registro>();

    }

    //metodos requeridos por la implmentacion 
    @Override
    public String getNombre() {
        return nickname;
    }
    public String getPassword() {
        return password;
    }
    @Override
    public void registrarPuntaje(int puntuacion, iJuego juego) {
    }
    @Override
    public ArrayList<iRegistro> estadisticas(iJuego tipoJuego) {
        ArrayList<iRegistro> iRegistrosJuego= new ArrayList<>();
        for (Registro registro : registros) {
            if(registro.getJuego().getNombre().equals(tipoJuego.getNombre()));{
                iRegistrosJuego.add(registro);
            }
        }
        return iRegistrosJuego;
    }

    //Metodos Propios 

    /**
     * Metodo que recorre la lista de registros de la persona y agregandolos en una nueva lista los registros relacionados con un juego en especifico 
     * @param tipoJuego
     * @return RegistrosJuego
     */
    public ArrayList<Registro> getEstadisticas(iJuego tipoJuego) {
        ArrayList<Registro> RegistrosJuego= new ArrayList<>();
        for (Registro registro : registros) {
            if(registro.getJuego().getNombre().equals(tipoJuego.getNombre()));{
                RegistrosJuego.add(registro);
            }
        }
        return RegistrosJuego;
    }
  
    /**
     * Agrega el registro recibido en la lista de registros personales 
     * @param registro
     */
    public void agregarRegistros(Registro registro){
        registros.add(registro);
    }
}
