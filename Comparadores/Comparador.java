package Comparadores;

import java.time.LocalDateTime;

/*
 *Clase implementada de Comparable, para comparar 2 puntajes
 */
public class Comparador implements Comparable<Comparador> {
    private int puntaje;
    private LocalDateTime fecha;

    public Comparador(int p , LocalDateTime f){
        this.puntaje = p;
        this.fecha = f;
    }

// metodo para comparar los 2 puntajes, retorna numeros negativos si es menor, 0 si son iguales o numeros naturales si es mayor
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
