/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_ejercicio_figuras_geometricas;

/**
 *
 * @author Luis F Montoya
 */
public class Triangulo {
    

    double altura;
    double base;

    // Constructor de la clase
    public Triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    // Método para calcular la hipotenusa
    public double calcularHipotenusa() {
        return Math.sqrt(Math.pow(altura, 2) + Math.pow(base, 2));
    }

    // Método para calcular el área del triángulo
    public double calcularArea() {
        return (altura * base) / 2;
    }

    // Método para calcular el perímetro del triángulo
    public double calcularPerimetro() {
        return base + altura + calcularHipotenusa();
    }
    
    
    // Método para determinar el tipo de triángulo
    public String determinarTipoTriangulo() {
        if (altura == base) {
            if (altura == calcularHipotenusa()) {
                return "Triángulo equilátero";
            } else {
                return "Triángulo isósceles";
            }
        } else {
            if (altura != calcularHipotenusa() && base != calcularHipotenusa()) {
                return "Triángulo escaleno";
            } else {
                return "Triángulo isósceles";
            }
        }
    }
}

