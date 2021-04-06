package main;

public class Calculadora {

    int res;

    public int sumar(int a, int b) {
        res = a + b;
        return res;
    }

    public int restar(int a, int b) {
        res = a - b;
        return res;
    }

    public int mult(int a, int b) {
        res = a * b;
        return res;
    }

    public int div(int a, int b) {
        res = a / b;
        return res;
    }

}
