package com.mycompany.strategy;
// Estrategia Concretas
public class Suma implements Operacion{
    public int ejecutar(int a, int b)
    {
        return a + b;
    }
}
