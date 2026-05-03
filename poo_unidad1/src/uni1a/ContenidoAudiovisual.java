package uni1a;

/**
 * Clase base ContenidoAudiovisual - Unidad 2
 */
public abstract class ContenidoAudiovisual {
    private static int contadorId = 0;
    private int id;
    private String titulo;
    private int duracionEnMinutos;
    private String genero;

    public ContenidoAudiovisual(String titulo, int duracionEnMinutos, String genero) {
        this.id = ++contadorId; // Autoincremento de ID para el sistema funcional
        this.titulo = titulo;
        this.duracionEnMinutos = duracionEnMinutos;
        this.genero = genero;
    }

    // --- Getters y Setters ---
    public int getId() { return id; }
    
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public int getDuracionEnMinutos() { return duracionEnMinutos; }
    public void setDuracionEnMinutos(int duracionEnMinutos) { this.duracionEnMinutos = duracionEnMinutos; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    /**
     * Método abstracto que será sobrescrito por todas las subclases
     * (Pelicula, SerieDeTV, Documental, Streaming, Publicidad)
     */
    public abstract void mostrarDetalles(); 
}