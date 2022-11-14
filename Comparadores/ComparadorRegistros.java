package Comparadores;
import java.util.Comparator;

import clases.Registro;

public class ComparadorRegistros  implements Comparator<Registro>{
  @Override
  public int compare(Registro o1, Registro o2) {
      if(o1.getPuntaje() < o2.getPuntaje()){
        return 1;
      }
      if(o1.getPuntaje() > o2.getPuntaje()){
        return -1;
      }
      else{
        return 0;
      }
      
  }  
}
