package spacecraft;

/**
 * Representa la interfaz de una nave que transporta
 * @author Luis Ricardo Ortega
 */
public interface ISpacecraftTransport {
    
    /**
     * Metodo para elegir el tipo de carga de la nave lanzadera
     * @return Devuelve la carga que llevara la nave
     */
    public abstract String transport();
}
