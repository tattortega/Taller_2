package spacecraft;

/**
 * Representa la interfaz de una nave espacial que orbita
 * @author Luis Ricardo Ortega
 */
public interface ISpacecraftOrbit {
    
    /**
     * Metodo para elegir la orbita donde estara la nave espacial
     * @return Devuelve la distancia de orbita a la Tierra
     */
    public abstract String orbit();
}
