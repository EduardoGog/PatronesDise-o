package com.mycompany.abstractfac;
// Archivo: ComputadoraEscritorioFactory.java
public class ComputadoraEscritorioFactory implements ComputadoraFactory {
    @Override
    public Procesador crearProcesador() {
        return new ProcesadorEscritorio();
    }

    @Override
    public RAM crearRAM() {
        return new RAMEscritorio();
    }
}

