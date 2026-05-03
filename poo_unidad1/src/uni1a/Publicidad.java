package uni1a;

public class Publicidad extends ContenidoAudiovisual {
    private String marca;
    private String producto;

    public Publicidad(String titulo, int duracionEnMinutos, String genero, String marca, String producto) {
        super(titulo, duracionEnMinutos, genero);
        this.marca = marca;
        this.producto = producto;
    }

    // Getters y Setters
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getProducto() { return producto; }
    public void setProducto(String producto) { this.producto = producto; }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del Espacio Publicitario:");
        System.out.println("Título: " + getTitulo());
        System.out.println("Anunciante: " + marca);
        System.out.println("Producto: " + producto);
        System.out.println("Duración: " + getDuracionEnMinutos() + " segundos");
        System.out.println();
    }
}