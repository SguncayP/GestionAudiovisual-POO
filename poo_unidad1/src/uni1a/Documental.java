/**
 * Class Documental
 */
package uni1a;

// Subclase Documental que extiende de ContenidoAudiovisual
public class Documental extends ContenidoAudiovisual {
    private String tema;
    private Investigador investigador; // RELACIÓN DE AGREGACIÓN

    public Documental(String titulo, int duracionEnMinutos, String genero, String tema, Investigador investigador) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
        this.investigador = investigador;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    // Getter y Setter para la relación
    public Investigador getInvestigador() {
        return investigador;
    }

    public void setInvestigador(Investigador investigador) {
        this.investigador = investigador;
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del Documental:"); // Corregido de "película" a "Documental"
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Tema: " + this.tema);
        
        // Mostramos la información del investigador asociado
        if (investigador != null) {
            System.out.println("Investigador a cargo: " + investigador.toString());
        }
        System.out.println();
    }
}