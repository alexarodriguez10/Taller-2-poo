package main;
/**
 *
 * @author Alexa rodriguez
 * 
 */

import clases.Concurso;
import java.util.HashSet;
import java.util.LinkedList;

public class App {

    public static void main(String[] args) {
        Concurso concurso1 = new Concurso("Sesion 1", 2);
   
        Concurso concurso2 = new Concurso("Sesion 2", 3);
        
        Concurso concurso3 = new Concurso("Sesion 3", 3);
        
      
        LinkedList<Concurso> lista = new LinkedList<>();
        lista.add(concurso1);
        lista.add(concurso2);
        lista.add(concurso3);
        
        for (Concurso cs : lista) {
          
            System.out.println("Nombre del Concurso: " + cs.getNombre());
            cs.añadirEquipos("Equipo 1", "Equipo 2", "Equipo 3");
            HashSet<String> equipos = cs.getEquipos();
            for (String str : equipos) {
                for (int i = 1; i <= cs.getNumProblemas(); i++) {
                    cs.registrarEnvio(str, i, "(1, 2)");
                }
            }
        }
    }
}
