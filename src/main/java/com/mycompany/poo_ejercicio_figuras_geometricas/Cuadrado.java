/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_ejercicio_figuras_geometricas;

/**
 *
 * @author Luis F Montoya
 */
public class Cuadrado {
    //Atributos
    double lado;
    //Parametros que definen las caracteristicas
    public Cuadrado(){}
    public Cuadrado(double lado){
        this.lado = lado;
    }
    
    //Metodos que retornan sus caracteristicas
   public  double calcularArea(){
        return lado*lado;
    }
    public double calcularPerimetro(){
        return 4*lado;
    }
}
