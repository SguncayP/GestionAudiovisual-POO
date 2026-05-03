package uni1a;

/**
 * Clase Actor - Etapa 2: Incorporación de Nuevas Clases
 * Esta clase se relaciona con Película mediante una Asociación.
 */
public class Actor {
    // Atributos privados para cumplir con el encapsulamiento
    private String nombre;
    private String nacionalidad;

    // Constructor para inicializar los datos del actor
    public Actor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    // --- Métodos Getter y Setter ---
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    /**
     * Método para facilitar la impresión de datos del actor
     */
    @Override
    public String toString() {
        return "Actor: " + nombre + " (" + nacionalidad + ")";
    }
}