📖 1. Descripción del Proyecto
Esta aplicación de consola en Java permite la administración organizada de un catálogo multimedia (Películas, Series, Documentales, Streaming y Publicidad). El sistema utiliza una arquitectura basada en herencia y polimorfismo para gestionar diferentes tipos de medios bajo una estructura común.

Problema que resuelve
El sistema organiza la información técnica de producciones multimedia, resolviendo la dispersión de datos mediante:

Jerarquía de Clases: Centraliza atributos comunes en una clase abstracta ContenidoAudiovisual.

Gestión de Dependencias: Implementa la relación de Composición para que las temporadas dependan de su serie matriz y la Agregación para vincular investigadores de forma independiente.

Escalabilidad: Facilita la adición de nuevos tipos de contenido sin alterar la base del código.

✨ 2. Características Principales
Clase Padre Abstracta: Define la base técnica y el método mostrarDetalles() para todos los contenidos.

Polimorfismo Dinámico: Cada subclase sobrescribe el comportamiento para mostrar sus atributos únicos (ej. estudio en Películas, marca en Publicidad).

Relaciones UML: Modelado preciso de relaciones de herencia (triángulo blanco), agregación (diamante blanco) y dependencia.

🚀 3. Instrucciones de Instalación y Uso
Guía de Instalación en Eclipse
Clonar el repositorio: En Eclipse, ve a File > Import > Git > Projects from Git.

Seleccionar Fuente: Elige Clone URI.

Configurar URI: Pega el siguiente enlace en el campo URI: https://github.com/CS-Programacion-Orientada-Objetos/poo_unidad1)) 

Finalizar: Sigue el asistente para importar el proyecto poo_unidad1.

Guía de Uso
Navega en el proyecto hasta src/poo/PruebaAudioVisual.java.

Haz clic derecho y selecciona Run As > Java Application.

Ejemplo de Salida: La consola mostrará los objetos creados con sus detalles específicos:

Película: El Padrino | Género: Drama | Estudio: Paramount | Actor: Marlon Brando
Serie: Breaking Bad | Temporadas: 5 | Episodios: 62

