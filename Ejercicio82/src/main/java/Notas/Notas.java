/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Notas;
/**
 *
 * @author arbel
 */
public class Notas {
    double[] listaNotas;
    /**
    * Constructor de la clase Notas, instancia un array con 5 notas de
    * tipo double
    */
    public Notas() {
        listaNotas = new double[5]; 
    }
    /**
    * Método que calcula el promedio de notas
    * @return El promedio de notas calculado
    */
    double calcularPromedio() {
        double suma = 0;
        for(int i=0; i < listaNotas.length; i++) { 
        suma = suma + listaNotas[i]; 
        }
        return (suma / listaNotas.length);
    }
    /**
    * Método que calcula la desviación estándar del array de notas
    * @return La desviación estándar del array de notas
    */
    double calcularDesviación() {
        double prom = calcularPromedio(); 
        double suma = 0;
        for(int i=0; i < listaNotas.length; i++) {
            suma += Math.pow(listaNotas[i] - prom, 2 ); 
        }
        return Math.sqrt (suma/listaNotas.length );
    }
    /**
    * Método que calcula el valor menor del array de notas
    * @return El valor menor del array de notas
    */
    double calcularMenor() {
    double menor = listaNotas[0];
    for(int i=0; i < listaNotas.length; i++) { 
        if (listaNotas[i] < menor) {
            menor = listaNotas[i];
        }
    }
    return menor;
    }
    /**
    * Método que calcula el valor mayor del array de notas
    * @return El valor mayor del array de notas
    */
    double calcularMayor() {
    double mayor = listaNotas[0];
    for(int i=0; i < listaNotas.length; i++) { // Se recorre el array
        if (listaNotas[i] > mayor) {
            mayor = listaNotas[i];
        }
    }
    return mayor;
    }
}
