package clases;
import interfaces.iJuego;
import java.time.LocalDateTime;

import interfaces.iJugador;

public class Registro implements interfaces.iRegistro{
    
    iJuego juego;
    

    public Registro(){
        
    }
    @Override
    public LocalDateTime getInicio() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public LocalDateTime getFinalizacion() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public void setInicio(LocalDateTime fechaHora) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void setFinalizacion(LocalDateTime fechaHora) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public int getPuntaje() {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public int getSegundosTotalesPartida() {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public boolean getEstadoFinalizado() {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public iJugador getJugador() {
        // TODO Auto-generated method stub
        return null;
    }
    public iJuego getJuego() {
        return juego;
    }
}
