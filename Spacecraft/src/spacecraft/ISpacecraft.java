package spacecraft;

/**
 * Representa la interfaz de una nave espacial
 * @author Luis Ricardo Ortega
 */
public interface ISpacecraft {
    
    /**
     * Metodo para encender motores
     */
    public abstract void startEngine();
    
    /**
     * Metodo para apagar motores
     */
    public abstract void shutdownEngine();
    
    /**
     * Meotodo para despegar la nave
     */
    public abstract boolean takeOff();
    
    /**
     * Metodo para aterrizar la nave
     */
    public abstract void land();
}
