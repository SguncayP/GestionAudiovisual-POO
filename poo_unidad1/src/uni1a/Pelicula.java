/**
 * Class Pelicula
 */
package uni1a;

public class Pelicula extends ContenidoAudiovisual {
    private String estudio;
    private Actor actor; // Relación de Asociación

    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio, Actor actor) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
        this.actor = actor;
    }

    // TUS GETTERS Y SETTERS ORIGINALES
    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    // NUEVOS GETTERS Y SETTERS PARA EL ACTOR (Encapsulamiento)
    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la película:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Estudio: " + estudio);
        
        // Mostramos la información del actor si existe
        if (actor != null) {
            System.out.println("Actor: " + actor.getNombre());
        }
        System.out.println();
    }
}