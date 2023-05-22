package org.example;

public class Calculadora {
        private int numero1;
        private int numero2;
        private void Calculadora(int x, int y){
            this.numero1=x;
            this.numero2=y;
        }
        public int sumar(int x,int y){
            return x+y;
        }
        public int restar(int x, int y){
            return x-y;
        }
        public int multiplicar(int x, int y){
            return x*y;
        }
        public int dividir(int x, int y){
            return x/y;
        }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
}

