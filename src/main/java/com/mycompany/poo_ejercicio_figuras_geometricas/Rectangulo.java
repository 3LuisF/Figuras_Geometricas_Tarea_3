/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_ejercicio_figuras_geometricas;

/**
 *
 * @author Luis F Montoya
 */
public class Rectangulo {
    //Atributos 
    double base,altura;
    //parametros que definen al rectangulo
    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    //metodos que me calculan 
    public double calcularArea(){
        return base*altura;
    }
    public double calcularPerimetro(){
        return (2*base)+(2*altura);        
    }}
