package com.mycompany.strategy;
//Uso del patrón strategy
public class Strategy {

    public static void main(String[] args) {
        // Crear instancias de las estrategias concretas
        Operacion operacionSuma = new Suma();
        Operacion operacionResta = new Resta();
        Operacion operacionMultiplicacion = new Multiplicacion();

        // Crear una instancia de la Calculadora con una estrategia inicial (Suma)
        Calculadora calculadora = new Calculadora(operacionSuma);

        // Ejecutar operación de suma
        int resultadoSuma = calculadora.ejecutarOperacion(5, 3);
        System.out.println("Resultado de la suma: " + resultadoSuma);

        // Cambiar dinámicamente la estrategia a resta
        calculadora.setOperacion(operacionResta);
        // Ejecutar operación de resta
        int resultadoResta = calculadora.ejecutarOperacion(5, 3);
        System.out.println("Resultado de la resta: " + resultadoResta);

        // Cambiar dinámicamente la estrategia a multiplicación
        calculadora.setOperacion(operacionMultiplicacion);
        // Ejecutar operación de multiplicación
        int resultadoMultiplicacion = calculadora.ejecutarOperacion(5, 3);
        System.out.println("Resultado de la multiplicación: " + resultadoMultiplicacion);
    }
}

