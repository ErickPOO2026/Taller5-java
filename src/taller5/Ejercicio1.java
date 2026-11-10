package taller5;

import javax.swing.JOptionPane;

/**
 * Ejercicio 1 - Calculadora de propina (JOptionPane)
 *
 * El autograde invoca por reflexión:
 *   calcularPropina(double monto, double porcentaje)
 *   calcularTotal(double monto, double porcentaje)
 *
 * El main debe usar JOptionPane para interactuar con el usuario.
 */
public class Ejercicio1 {

    public static double calcularPropina(double monto, double porcentaje) {
        return monto * porcentaje / 100;
    }

    public static double calcularTotal(double monto, double porcentaje) {
        return monto + calcularPropina(monto, porcentaje);
    }

    public static void main(String[] args) {
        String textoMonto = JOptionPane.showInputDialog("Ingrese el monto de la cuenta:");
        String textoPorcentaje = JOptionPane.showInputDialog("Ingrese el porcentaje de propina:");

        double monto = Double.parseDouble(textoMonto);
        double porcentaje = Double.parseDouble(textoPorcentaje);

        double propina = calcularPropina(monto, porcentaje);
        double total = calcularTotal(monto, porcentaje);

        String resultado = String.format("Propina: $%.2f\nTotal: $%.2f", propina, total);
        JOptionPane.showMessageDialog(null, resultado);
    }
}