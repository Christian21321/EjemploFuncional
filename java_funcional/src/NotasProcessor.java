package java_funcional.src;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class NotasProcessor {

    // Método para generar un arreglo de notas aleatorias
    public static List<Double> generarNotas(int cantidad) {
        Random rand = new Random();
        return DoubleStream.generate(() -> Math.round((1.0 + rand.nextDouble() * (5.0 - 1.0)) * 10) / 10.0)
                .limit(cantidad)
                .boxed()
                .collect(Collectors.toList());
    }

    // Procesamiento Funcional
    public static Map<String, Long> procesarNotas(List<Double> notas) {
        return Map.of(
                "mayoresCuatro", notas.stream().parallel().filter(n -> n > 4.0).count(),
                "menoresTresSeis", notas.stream().parallel().filter(n -> n < 3.6).count(),
                "rangoTresSeisCuatro", notas.stream().parallel().filter(n -> n >= 3.6 && n < 4.0).count()
        );
    }
}


