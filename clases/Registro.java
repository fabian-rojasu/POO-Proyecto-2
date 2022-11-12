package clases;
import java.time.LocalDateTime;

import interfaces.iJuego;
import interfaces.iJugador;
import java.io.Serializable;

public class Registro implements interfaces.iRegistro, Serializable{
    
    private LocalDateTime horaInicio;
    private LocalDateTime horaFinal;
    private int puntaje;
    private boolean estado;
    private iJugador jugador;
    public iJuego juego;

    

    public Registro(int puntaje){
        this.puntaje=puntaje;
    }

    public Registro(LocalDateTime horaInicio, LocalDateTime Horafinal, int puntaje, boolean estado, iJugador jugador, iJuego juego){
        this.horaInicio=horaInicio;
        this.horaFinal=Horafinal;
        this.puntaje=puntaje;
        this.estado=estado;
        this.jugador=jugador;
        this.juego=juego;
    }

    @Override
    public LocalDateTime getInicio() {
        return this.horaInicio;
    }
    @Override
    public LocalDateTime getFinalizacion() {
        return this.horaFinal;
    }
    @Override
    public void setInicio(LocalDateTime fechaHora) {
        this.horaInicio=fechaHora;
    }
    @Override
    public void setFinalizacion(LocalDateTime fechaHora) {
        this.horaFinal=fechaHora;    
    }

    @Override
    public int getPuntaje() {
        return this.puntaje;
    }
    @Override
    public int getSegundosTotalesPartida() {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public boolean getEstadoFinalizado() {
        return this.estado;
    }
    @Override
    public iJugador getJugador() {
        return this.jugador;
    }
    public iJuego getJuego() {
        return juego;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    public void setJuego(iJuego juego) {
        this.juego = juego;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    
}
