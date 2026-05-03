package poo;

import uni1a.*;

public class PruebaAudioVisual {
    public static void main(String[] args) {
        // 1. Crear las instancias de apoyo (Objetos para las relaciones)
        Actor actorPrincipal = new Actor("Zoe Saldaña", "Estadounidense");
        Investigador investigadorDoc = new Investigador("Neil deGrasse Tyson", "Astrofísica");

        // 2. Ajustar el arreglo para 5 contenidos (Las 3 originales + las 2 nuevas de la Etapa 4)
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[5];

        // Película con Asociación (Actor)
        contenidos[0] = new Pelicula("Avatar", 162, "Acción", "20th Century Studios", actorPrincipal);

        // Serie de TV con Composición (Temporadas)
        SerieDeTV serieGOT = new SerieDeTV("Game of Thrones", 60, "Fantasía");
        serieGOT.agregarTemporada(new Temporada(1, 10)); // Se añaden objetos Temporada
        serieGOT.agregarTemporada(new Temporada(2, 10));
        contenidos[1] = serieGOT;

        // Documental con Agregación (Investigador)
        contenidos[2] = new Documental("Cosmos", 45, "Ciencia", "Astronomía", investigadorDoc);

        // --- ETAPA 4: Subclases de iniciativa propia ---
        // Streaming
        contenidos[3] = new Streaming("The Mandalorian", 40, "Sci-Fi", "Disney+", 7.99);

        // Publicidad
        contenidos[4] = new Publicidad("Anuncio Super Bowl", 30, "Comercial", "Pepsi", "Bebida");

        // 3. Mostrar los detalles (Esto funciona por Polimorfismo)
        System.out.println("=== REPORTE DE CONTENIDOS AUDIOVISUALES ===\n");
        for (ContenidoAudiovisual contenido : contenidos) {
            if (contenido != null) {
                contenido.mostrarDetalles();
            }
        }
    }
}