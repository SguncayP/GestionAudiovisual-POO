package uni1a;

/**
 * Clase Temporada - Etapa 2
 * Esta clase es una parte dependiente de SerieDeTV (Composición).
 */
public class Temporada {
    private int numero;
    private int episodios;

    public Temporada(int numero, int episodios) {
        this.numero = numero;
        this.episodios = episodios;
    }

    // Getters y Setters para el encapsulamiento
    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public int getEpisodios() { return episodios; }
    public void setEpisodios(int episodios) { this.episodios = episodios; }

    @Override
    public String toString() {
        return "Temporada " + numero + " (" + episodios + " episodios)";
    }
}