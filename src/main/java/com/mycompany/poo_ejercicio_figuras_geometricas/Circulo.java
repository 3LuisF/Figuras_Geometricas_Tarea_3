/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_ejercicio_figuras_geometricas;

/**
 *
 * @author Luis F Montoya
 */
public class Circulo {
        double radio;
    
    //metodo constructor!!!
    public Circulo(double radio){
        //Atributo
        this.radio = radio;
    }
    //Metodos
    public double calcularArea(){
        return Math.PI*Math.pow(radio, 2);
    }
    public double calcularPerimetro(){
        return 2*Math.PI*radio;
    }
}
