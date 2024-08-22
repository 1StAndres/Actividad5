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
public class Piramide extends FiguraGeometrica {
    private double base; 
    private double altura;
    private double apotema; 
    /**
    * Constructor de la clase Pirámide
    * @param base Parámetro de define la base de una pirámide
    * @param altura Parámetro de define la altura de una pirámide
    * @param apotema Parámetro de define el apotema de una pirámide
    */
    public Piramide(double base, double altura, double apotema) {
        this.base = base;
        this.altura = altura;
        this.apotema = apotema;
        this.setVolumen(calcularVolumen());
        this.setSuperficie(calcularSuperficie());
    }
    /**
    * Método para calcular el volumen de una pirámide
    * @return El volumen de una pirámide
    */
    public double calcularVolumen() {
        double volumen = (Math.pow(base, 2.0) * altura) / 3.0;
        return volumen;
    }
    /**
    * Método para calcular la superficie de una pirámide
    * @return La superficie de una pirámide
    */
    public double calcularSuperficie() {
        double áreaBase = Math.pow(base, 2.0);
        double áreaLado = 2.0 * base * apotema;
        return áreaBase + áreaLado;
    }
}
