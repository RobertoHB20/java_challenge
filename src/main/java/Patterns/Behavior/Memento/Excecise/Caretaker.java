package Patterns.Behavior.Memento.Excecise;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {

    private List<Memento> mementos = new ArrayList<>();

    public void setMemeneto(Memento memento){
        mementos.add(memento);
    }

    public Memento getMemento(int index){
        return mementos.get(index);
    }

    public int getMementosSize(){
        return mementos.size();
    }

}
