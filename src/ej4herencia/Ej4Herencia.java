/*
 * Se plantea desarrollar un programa que nos permita calcular el área y el perímetro
de formas geométricas, en este caso un circulo y un rectángulo. Ya que este
calculo se va a repetir en las dos formas geométricas, vamos a crear una Interfaz,
llamada calculosFormas que tendrá, los dos métodos para calcular el área, el
perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la
interfaz y se calcule el área y el perímetro de los dos. En el main se crearán las
formas y se mostrará el resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2
 */
package ej4herencia;

import entidades.figuras.Circulo;
import entidades.figuras.Rectangulo;

public class Ej4Herencia {

    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(56,34);
        Circulo circulo = new Circulo(34);
        System.out.println("EL AREA DEL RECTANGULO ES DE :"+ rectangulo.calcularArea());
        System.out.println("EL PERIMETRO DEL RECTANGULO ES DE :" + rectangulo.calcularPerimetro());
        System.out.println("EL AREA DEL CIRCULO ES DE :" + circulo.calcularArea());
        System.out.println("EL PERIMETRO DEL RECTANGULO ES DE: " + circulo.calcularPerimetro());
    }
    
}
