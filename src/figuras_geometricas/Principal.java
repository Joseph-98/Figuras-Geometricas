/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras_geometricas;

import javax.swing.JOptionPane;

/**
 *
 * @author Andres
 */
public class Principal {

    public static void main(String[] args) {

        String menu = "Calcular Área y Perímetro de las siguientes Figuras"
                + "\nSeleccione una opción:"
                + "\n1  Rectángulo"
                + "\n2  Círculo"
                + "\n3  Triángulo"
                + "\n4  Salir";
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, menu,
                    "Figuras Geométricas", JOptionPane.INFORMATION_MESSAGE));
            switch (opcion) {
                case 1:
                    double base = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la base", "Rectángulo", JOptionPane.INFORMATION_MESSAGE));
                    double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la altura", "Rectángulo", JOptionPane.INFORMATION_MESSAGE));
                    Rectangulo rec = new Rectangulo(base, altura);
                    JOptionPane.showMessageDialog(null, "Área: " + rec.area() + "\nPerímetro: " + rec.perimetro(), "Rectángulo", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    double radio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el radio del círculo", "Círculo", JOptionPane.INFORMATION_MESSAGE));
                    Circulo cir = new Circulo(radio);
                    JOptionPane.showMessageDialog(null, "Área: " + cir.area() + "\nPerímetro: " + cir.perimetro(), "Círculo", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 3:
                    double base2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la base", "Triángulo", JOptionPane.INFORMATION_MESSAGE));
                    double altura2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la altura", "Triángulo", JOptionPane.INFORMATION_MESSAGE));
                    Triangulo tri = new Triangulo(base2, altura2);
                    JOptionPane.showMessageDialog(null, "Área: " + tri.area() + "\nPerímetro: " + tri.perimetro(), "Triángulo", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 4:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ingrese una opción válida", "Error", JOptionPane.PLAIN_MESSAGE);
            }

        } while (opcion != 4);

    }
}
