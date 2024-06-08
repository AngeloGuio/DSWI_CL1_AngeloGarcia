package pe.edu.cibertec.DSWI_CL1_AngeloGarcia.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
@Service
public class PracticaService {
    public double calculateAverage(int[] grades) {
        if (grades == null || grades.length < 4) {
            throw new IllegalArgumentException("Debe proporcionar al menos cuatro notas.");
        }

        // Ordenar las notas
        Arrays.sort(grades);

        // Eliminar la nota más baja y calcular el promedio de las tres más altas
        return (grades[1] + grades[2] + grades[3]) / 3.0;
    }

    public int getLowestGrade(int[] grades) {
        if (grades == null || grades.length < 4) {
            throw new IllegalArgumentException("Debe proporcionar al menos cuatro notas.");
        }

        // Ordenar las notas
        Arrays.sort(grades);

        // Devolver la nota más baja
        return grades[0];
    }
}
