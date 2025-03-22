package com.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Bienvenido");
        Calculadora calc = new Calculadora();
        int resultado = calc.sumar(5, 3);
        System.out.println("El resultado es : " + resultado);
    }

}
