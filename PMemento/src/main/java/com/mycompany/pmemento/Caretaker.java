package com.mycompany.pmemento;
import java.util.ArrayList;
public class Caretaker {
    private ArrayList<Memento> mementos = new ArrayList<>();
    
    /*Recibe como parámetro objeto memento guardado desde
    originator, este objeto es almacenado en una lista de mementos*/
    public void addMemento(Memento m)
    {
        mementos.add(m);
    }
    
    /*Método para recuperar el punto a restaurar según el
    índice al objeto juego*/
    public Memento getMemento(int index)
    {
        return mementos.get(index);
    }
}
