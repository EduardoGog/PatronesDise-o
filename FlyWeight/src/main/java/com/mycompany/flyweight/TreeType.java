package com.mycompany.flyweight;
class TreeType implements Tree{
    private String name;
    private String image;

    public TreeType(String name, String image) {
        this.name = name;
        this.image = image;
    }

    @Override
    public void draw(String color) {
        System.out.println("Dibujando " + name + " de color " + color + " con imagen: " + image);
    }
}
