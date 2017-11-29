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
public class Circulo extends Figura {

    public final double PI = 3.1416;

    private double radio;

    // Construtores
    public Circulo(double radio) {
        this.radio = radio;
    }

    public double area() {
        return (radio * radio) * PI;
    }

    public double perimetro() {
        return (2 * PI) * radio;
    }
}
