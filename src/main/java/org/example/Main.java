package org.example;

public class Main {
    public static void main(String[] args) {
        Calculadora cal=new Calculadora();
        cal.sumar(4,900);
        System.out.println("suma: " + cal.sumar( 4,900));
        System.out.println(cal.sumar(100,600));
    }
}