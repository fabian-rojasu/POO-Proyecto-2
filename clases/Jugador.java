package clases;

import java.util.ArrayList;

import interfaces.iJuego;
import interfaces.iRegistro;

public class Jugador implements interfaces.iJugador {
    private String nickname;
    private String password;
    private ArrayList<iRegistro> registros;

    public Jugador(String nickname, String password){
        this.nickname=nickname;
        this.password=password;
        this.registros=new ArrayList<iRegistro>();
    }

    @Override
    public String getNombre() {
        // TODO Auto-generated method stub
        return nickname;
    }
    public String getPassword() {
        return password;
    }
    @Override
    public void registrarPuntaje(int puntuacion, iJuego juego) {
        // TODO Auto-generated method stub
    }
    @Override
    public ArrayList<iRegistro> estadisticas(iJuego tipoJuego) {
        // TODO Auto-generated method stub
        return null;
    }
    public ArrayList<iRegistro> getRegistros() {
        return registros;
    }
    
}
