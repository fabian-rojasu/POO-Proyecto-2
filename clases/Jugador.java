package clases;

import java.io.Serializable;
import java.util.ArrayList;

import interfaces.iJuego;
import interfaces.iRegistro;

public class Jugador implements interfaces.iJugador, Serializable {
    private String nickname;
    private String password;
    private ArrayList<Registro> registros;
   

    public Jugador(String nickname, String password){
        this.nickname=nickname;
        this.password=password;
        this.registros=new ArrayList<Registro>();

    }

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

    public ArrayList<Registro> getEstadisticas(iJuego tipoJuego) {
        ArrayList<Registro> RegistrosJuego= new ArrayList<>();
        for (Registro registro : registros) {
            if(registro.getJuego().getNombre().equals(tipoJuego.getNombre()));{
                RegistrosJuego.add(registro);
            }
        }
        return RegistrosJuego;
    }
  
    public void agregarRegistros(Registro registro){
        registros.add(registro);
    }
}
