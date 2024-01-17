package com.mycompany.strategy;
//Contexto
public class Calculadora {
    private Operacion operacion;

    public Calculadora(Operacion operacion) {
        this.operacion = operacion;
    }

    public void setOperacion(Operacion operacion) {
        this.operacion = operacion;
    }

    public int ejecutarOperacion(int a, int b) {
        return this.operacion.ejecutar(a, b);
    }
}
