Generación y Procesamiento de Notas en Java  

Introducción  
Este proyecto compara dos enfoques para procesar un conjunto de notas aleatorias en Java: imperativo y funcional.  

Generación de Datos  
El programa genera una lista de notas aleatorias dentro del rango [1.0, 7.0]. La cantidad de notas es configurable y se generan usando "Random" y "Streams" de Java.  

Procesamiento de Datos  
Se implementan dos métodos para contar las notas en tres rangos específicos:  
 Imperativo: Uso de bucles y condicionales.  
 Funcional: Uso de "Streams" y expresiones lambda.  

Diferencias entre Enfoques

Enfoque Imperativo:
Ventajas:

  -Intuición: Es fácil de seguir y entender, especialmente para quienes tienen experiencia con lenguajes imperativos.
  -Depuración: El código es más fácil de depurar debido a que los flujos de ejecución son explícitos.

Desventajas:

  -Verboso: Requiere más líneas de código para lograr lo mismo.
  -Escalabilidad: El código puede volverse difícil de mantener y modificar conforme crece el proyecto.

Enfoque Funcional:
Ventajas:

  -Compacto y expresivo: Menos código para realizar la misma tarea, con mayor claridad en el propósito.
  -Paralelismo: Uso eficiente de parallelStream() puede mejorar el rendimiento en operaciones grandes.

Desventajas:

  -Curva de aprendizaje: No es tan fácil de entender para programadores nuevos o no familiarizados con la programación funcional.
  -Depuración compleja: Es más difícil rastrear problemas, ya que las operaciones en los Streams no son tan transparentes como los bucles tradicionales.

Conclusiones
  Imperativo: Preferible cuando la claridad y la depuración rápida son más importantes, o cuando el tamaño del proyecto es pequeño o mediano.

  Funcional: Util en proyectos donde la eficiencia y la concisión son cruciales, y cuando el uso de paralelismo puede mejorar el rendimiento.

Requisitos  
  Java 11 o superior.  
  
