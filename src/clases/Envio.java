package clases;
/**
 *
 * @author Alexa rodriguez
 * 
 */
public class Envio {
    private final String nombreEquipo;
    private final int numProblema;
    private final String respuesta;

    public Envio(String nombreEquipo, int numProblema, String respuesta) {
        this.nombreEquipo = nombreEquipo;
        this.numProblema = numProblema;
        this.respuesta = respuesta;
    }    
    
  
    public String getNombreEquipo() { return nombreEquipo; }
    public int getNumProblema() { return numProblema; }
    public String getRespuesta() { return respuesta; }
}