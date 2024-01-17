package com.mycompany.abstractfac;
public class AbstractFac {

    public static void main(String[] args) {
        ComputadoraFactory factoryEscritorio = new ComputadoraEscritorioFactory();
        Procesador procesadorEscritorio = factoryEscritorio.crearProcesador();
        RAM ramEscritorio = factoryEscritorio.crearRAM();

        System.out.println("Configuración de computadora de escritorio:");
        System.out.println(procesadorEscritorio.getDescripcion());
        System.out.println(ramEscritorio.getDescripcion());

        ComputadoraFactory factoryLaptop = new ComputadoraLaptopFactory();
        Procesador procesadorLaptop = factoryLaptop.crearProcesador();
        RAM ramLaptop = factoryLaptop.crearRAM();

        System.out.println("\nConfiguración de laptop:");
        System.out.println(procesadorLaptop.getDescripcion());
        System.out.println(ramLaptop.getDescripcion());
    }
}
