/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras_geometricas;

/**
 *
 * @author Andres
 */
public class Triangulo extends Figura {

    private double base;
    private double altura;

    // Constructores
    public Triangulo() {
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double area() {
        return (base * altura) / 2;
    }

    // Triangulo rectangulo
    public double perimetro() {
        double lado_f = 0;
        lado_f = Math.sqrt(Math.pow(altura, 2) + Math.pow(base, 2));

        return altura + base + lado_f;
    }

}
