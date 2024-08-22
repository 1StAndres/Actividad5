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
public class FiguraGeometrica {
    private double volumen;
    private double superficie;
    /**
    * Método para establecer el volumen de una figura geométrica
    * @param volumen Parámetro que define el volumen de una figura
    * geométrica
    */
    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }
    /**
    * Método para establecer la superficie de una figura geométrica
    * @param superficie Parámetro que define la superficie de una
    * figura geométrica
    */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }
    /**
    * Método para obtener el volumen de una figura geométrica
    * @return El volumen de una figura geométrica
    */
    public double getVolumen() {
        return this.volumen;
    }
    /**
    * Método para obtener la superficie de una figura geométrica
    * @return La superficie de una figura geométrica
    */
    public double getSuperficie() {
        return this.superficie;
    }
}
