package uni1a;

/**
 * Clase Investigador - Etapa 2
 * Relacionada con Documental mediante Agregación.
 */
public class Investigador {
    private String nombre;
    private String especialidad;

    public Investigador(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    // Getters y Setters para cumplir con el encapsulamiento
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }

    @Override
    public String toString() {
        return nombre + " (Especialista en " + especialidad + ")";
    }
}