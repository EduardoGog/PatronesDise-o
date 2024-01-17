package com.mycompany.interpreter;
/**
 * Clase principal que demuestra el uso del patrón Interpreter para interpretar y ejecutar comandos para un robot.
 */
public class Interpreter {
    /**
     * Método principal que ejecuta el programa.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en este ejemplo).
     */
    public static void main(String[] args) {
        // Crear un contexto para el robot
        ContextoRobot Contextorobot = new ContextoRobot();

        // Crear expresiones para comandos individuales
        ComandoExpresion ComandoMovimiento = new MoveCommand();
        ComandoExpresion ComIzquierda = new LeftCommand();
        ComandoExpresion ComDerecha = new RightCommand();

        // Crear una secuencia de comandos que repite el comando izquierdo dos veces
        ComandoExpresion SecuenciaComando = new RepetirComando(new LeftCommand(), 2);

        // Interpretar y ejecutar la secuencia de comandos en el contexto del robot
        SecuenciaComando.interpret(Contextorobot);
    }
}
