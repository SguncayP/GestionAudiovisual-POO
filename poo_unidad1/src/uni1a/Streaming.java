package uni1a;

public class Streaming extends ContenidoAudiovisual {
    private String plataforma;
    private double precioSuscripcion;

    public Streaming(String titulo, int duracionEnMinutos, String genero, String plataforma, double precioSuscripcion) {
        super(titulo, duracionEnMinutos, genero);
        this.plataforma = plataforma;
        this.precioSuscripcion = precioSuscripcion;
    }

    // Getters y Setters para el encapsulamiento
    public String getPlataforma() { return plataforma; }
    public void setPlataforma(String plataforma) { this.plataforma = plataforma; }

    public double getPrecioSuscripcion() { return precioSuscripcion; }
    public void setPrecioSuscripcion(double precioSuscripcion) { this.precioSuscripcion = precioSuscripcion; }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de Contenido Streaming:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Costo Mensual: $" + precioSuscripcion);
        System.out.println();
    }
}