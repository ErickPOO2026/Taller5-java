package taller5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 * Ejercicio 5 - Clase Estudiante + JOptionPane + BufferedReader
 *
 * El main usa la clase Estudiante (Ejercicio5 combina ambas formas de E/S):
 *  - nombre y edad con JOptionPane
 *  - notas con BufferedReader
 */
public class Ejercicio5 {

    public static void main(String[] args) throws IOException {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante:"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese la nota 1:");
        double nota1 = Double.parseDouble(br.readLine());
        System.out.println("Ingrese la nota 2:");
        double nota2 = Double.parseDouble(br.readLine());
        System.out.println("Ingrese la nota 3:");
        double nota3 = Double.parseDouble(br.readLine());

        Estudiante estudiante = new Estudiante(nombre, edad, nota1, nota2, nota3);

        String resumen = String.format("Nombre: %s\nEdad: %d\nPromedio: %.2f",
                estudiante.getNombre(), estudiante.getEdad(), estudiante.getPromedio());
        JOptionPane.showMessageDialog(null, resumen);
    }
}