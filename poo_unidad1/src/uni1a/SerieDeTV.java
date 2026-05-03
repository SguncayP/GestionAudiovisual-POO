/**
 * Class SerieDeTV
 */
package uni1a;
import java.util.ArrayList;
import java.util.List;

// Subclase SerieDeTV que extiende de ContenidoAudiovisual
public class SerieDeTV extends ContenidoAudiovisual {
    // RELACIÓN DE COMPOSICIÓN: Ahora usamos una lista de objetos Temporada
    private List<Temporada> listaTemporadas;

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero) {
        super(titulo, duracionEnMinutos, genero);
        this.listaTemporadas = new ArrayList<>(); // Inicializamos la lista de objetos
    }

    /**
     * Método para añadir temporadas individualmente.
     * Esto hace que el sistema sea funcional según la Etapa 5.
     */
    public void agregarTemporada(Temporada temporada) {
        this.listaTemporadas.add(temporada);
    }

    // Getter y Setter para la lista
    public List<Temporada> getListaTemporadas() {
        return listaTemporadas;
    }

    public void setListaTemporadas(List<Temporada> listaTemporadas) {
        this.listaTemporadas = listaTemporadas;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la Serie de TV:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración total estimada: " + getDuracionEnMinutos() + " min");
        System.out.println("Género: " + getGenero());
        System.out.println("Cantidad de Temporadas: " + listaTemporadas.size());
        
        // Recorremos la lista de objetos Temporada para mostrar su info
        if (!listaTemporadas.isEmpty()) {
            System.out.println("Listado de Temporadas:");
            for (Temporada t : listaTemporadas) {
                System.out.println("  - " + t.toString());
            }
        }
        System.out.println();
    }
}