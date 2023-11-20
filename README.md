# Proyecto de Búsqueda de Grafos

Este proyecto implementa una aplicación de búsqueda de caminos en un grafo. La interfaz gráfica permite agregar vértices y aristas, y luego realizar búsquedas de caminos más cortos entre dos vértices específicos. También proporciona la opción de mostrar todos los caminos posibles y resaltar el camino óptimo.

## Archivos del Proyecto

### Ventana.java

Este archivo contiene la clase principal `Ventana`, que representa la interfaz gráfica de la aplicación. Algunas de las funciones clave son:

- Agregar vértices y aristas al hacer clic en la ventana.
- Limpiar el grafo y reiniciar la interfaz.
- Buscar caminos más cortos entre dos vértices.
- Mostrar todos los caminos posibles y resaltar el camino óptimo.

### Grafo.java

Este archivo define la clase `Grafo`, que extiende `JPanel` y se encarga de dibujar el grafo en la interfaz gráfica. Utiliza las clases `Vertice` y `Lineas` para representar y dibujar los nodos y aristas del grafo.

### Vertice.java

La clase `Vertice` representa un vértice en el grafo. Almacena la posición (coordenadas x, y) y un identificador único para cada vértice.

### Lineas.java

La clase `Lineas` representa una arista en el grafo. Almacena los vértices de inicio y fin, así como las coordenadas (x, y) de ambos extremos.

### Aristas.java, AristasCalc.java, CaminosSimplesDatos.java, CaminosSimplesLogica.java, VerticeCalc.java, Vertice.java

Estos archivos adicionales ofrecen funciones de manipulación y gestión de vértices, aristas y caminos en el grafo.

## Funcionamiento

1. Selecciona la opción "Vertice" o "Arista" para agregar nodos o aristas al grafo.
2. Haz clic en la ventana para agregar nodos o definir los extremos de las aristas.
3. Utiliza las opciones de búsqueda para encontrar caminos más cortos entre vértices específicos.
4. La opción "Mostrar todos los caminos" resalta todos los caminos posibles y destaca el camino óptimo.

## Notas Importantes

- Se pueden agregar vértices haciendo clic en la ventana y conectándolos mediante aristas.
- Los vértices y aristas se muestran visualmente en el área de la interfaz gráfica.
- La aplicación utiliza algoritmos de búsqueda para encontrar caminos más cortos.
- La interfaz proporciona retroalimentación sobre la opción seleccionada y la posición del mouse.

## Contribución
Si desea contribuir a este proyecto, siga las siguientes instrucciones:

1. Fork este repositorio.
2. Cree una rama para su contribución (ej. feature/nueva-funcionalidad).
3. Haga sus cambios en la rama creada.
4. Cree un pull request hacia el repositorio original.

## Licencia
Este proyecto está bajo la licencia MIT.