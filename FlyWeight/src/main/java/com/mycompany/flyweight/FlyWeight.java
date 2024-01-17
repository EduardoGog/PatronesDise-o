package com.mycompany.flyweight;
public class FlyWeight {

    public static void main(String[] args) {
        // Crear algunos árboles
        TreeType pineTree = TreeFactory.getTreeType("Pino", "pino.png");
        TreeType oakTree = TreeFactory.getTreeType("Roble", "roble.png");
        

        // Dibujar árboles con diferentes colores
        pineTree.draw("verde");
        oakTree.draw("marrón");

        // Árboles con el mismo tipo comparten la imagen
        TreeType anotherPineTree = TreeFactory.getTreeType("Pino", "pino.png");
        anotherPineTree.draw("azul");
        
    }
}
