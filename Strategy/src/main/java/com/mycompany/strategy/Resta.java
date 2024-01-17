package com.mycompany.strategy;
// Estrategia Concretas
public class Resta implements Operacion{
    public int ejecutar(int a, int b)
    {
        return a - b;
    }
}
