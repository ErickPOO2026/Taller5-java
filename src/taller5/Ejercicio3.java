package taller5;

import javax.swing.JOptionPane;

/**
 * Ejercicio 3 - Área y perímetro de un rectángulo (JOptionPane)
 *
 * El autograde invoca por reflexión:
 *   calcularArea(double base, double altura)
 *   calcularPerimetro(double base, double altura)
 */
public class Ejercicio3 {

    public static double calcularArea(double base, double altura) {
        return base * altura;
    }

    public static double calcularPerimetro(double base, double altura) {
        return 2 * (base + altura);
    }

    public static void main(String[] args) {
        String textoBase = JOptionPane.showInputDialog("Ingrese la base del rectángulo:");
        String textoAltura = JOptionPane.showInputDialog("Ingrese la altura del rectángulo:");

        double base = Double.parseDouble(textoBase);
        double altura = Double.parseDouble(textoAltura);

        double area = calcularArea(base, altura);
        double perimetro = calcularPerimetro(base, altura);

        String resultado = String.format("Área: %.2f\nPerímetro: %.2f", area, perimetro);
        JOptionPane.showMessageDialog(null, resultado);
    }
}