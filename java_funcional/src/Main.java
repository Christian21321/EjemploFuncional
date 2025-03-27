package java_funcional.src;

import java_funcional.src.NotasProcessor;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int cantidadNotas = 20; // Se puede modificar según necesidad
        List<Double> notas = NotasProcessor.generarNotas(cantidadNotas);

        System.out.println("Notas generadas: " + notas);

        // Procesamiento Funcional
        Map<String, Long> resultadoFuncional = NotasProcessor.procesarNotas(notas);
        System.out.println("[Funcional] Notas > 4.0: " + resultadoFuncional.get("mayoresCuatro"));
        System.out.println("[Funcional] Notas < 3.6: " + resultadoFuncional.get("menoresTresSeis"));
        System.out.println("[Funcional] Notas en [3.6, 4.0): " + resultadoFuncional.get("rangoTresSeisCuatro"));
    }
}


