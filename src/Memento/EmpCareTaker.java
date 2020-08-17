package Memento;

import java.util.ArrayDeque;
import java.util.Deque;

public class EmpCareTaker {

    private final Deque<EmpMemento> mementos = new ArrayDeque<>();

    public void addMemento(EmpMemento empMemento){
        mementos.push(empMemento);
    }

    public EmpMemento getMemento(){
        return mementos.pop();
    }
}
