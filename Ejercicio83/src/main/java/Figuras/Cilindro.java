/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;
/**
 *
 * @author arbel
 */
public class Cilindro extends FiguraGeometrica{
    private double radio; 
    private double altura; 
    public Cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
        this.setVolumen(calcularVolumen()); 
        this.setSuperficie(calcularSuperficie()); 
    }
    /**
    * Método para calcular el volumen de un cilindro
    * @return El volumen de un cilindro
    */
    public double calcularVolumen() {
        double volumen = Math.PI * altura * Math.pow(radio, 2.0);
        return volumen;
    }
    /**
    * Método para calcular la superficie de un cilindro
    * @return La superficie de un cilindro
    */
        public double calcularSuperficie() {
        double áreaLadoA = 2.0 * Math.PI * radio * altura;
        double áreaLadoB = 2.0 * Math.PI * Math.pow(radio, 2.0);
        return áreaLadoA + áreaLadoB;
    }
}
