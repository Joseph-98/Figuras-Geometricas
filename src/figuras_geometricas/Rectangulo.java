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
public class Rectangulo extends Figura {

    private double ancho;
    private double alto;

//Constructores
    public Rectangulo() {
    }

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public double area() {
        return ancho * alto;
    }

    public double perimetro() {
        return (2 * alto) + (2 * ancho);
    }

}
