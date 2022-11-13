package Comparadores;

import java.time.LocalDateTime;


public class Comparador implements Comparable<Comparador> {
    private int puntaje;
    private LocalDateTime fecha;

    public Comparador(int p , LocalDateTime f){
        this.puntaje = p;
        this.fecha = f;
    }


    @Override
    public int compareTo(Comparador o) {
        // TODO Auto-generated method stub
        return o.getPuntaje()-this.puntaje;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }
    public int getPuntaje() {
        return puntaje;
    }
}
