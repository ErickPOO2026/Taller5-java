package taller5;

/**
 * Clase Estudiante
 *
 * El autograde invoca por reflexión:
 *   constructor Estudiante(String nombre, int edad, double nota1, double nota2, double nota3)
 *   metodo getPromedio()
 *
 * Requisitos:
 *  - atributos private
 *  - constructor
 *  - getters y setters (métodos de seguridad)
 */
public class Estudiante {

    private String nombre;
    private int edad;
    private double nota1;
    private double nota2;
    private double nota3;

    public Estudiante(String nombre, int edad, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getPromedio() {
        return (nota1 + nota2 + nota3) / 3.0;
    }
}