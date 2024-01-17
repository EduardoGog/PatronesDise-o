package com.mycompany.abstractfac;
// Archivo: ComputadoraLaptopFactory.java
public class ComputadoraLaptopFactory implements ComputadoraFactory {
    @Override
    public Procesador crearProcesador() {
        return new ProcesadorLaptop();
    }

    @Override
    public RAM crearRAM() {
        return new RAMLaptop();
    }
}

