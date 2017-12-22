package Memento;

import java.util.ArrayList;


public class LancheCareTaker {

    private ArrayList<LancheMemento> lm;
    
    public LancheCareTaker(){
        this.lm = new ArrayList<LancheMemento>();
    }
    
    
    public void addMemento(LancheMemento memento){
        lm.add(memento);
    }

    
    
    public ArrayList<LancheMemento> getMementos(){
        System.out.println("AQUI " + lm.get(0).getDescricao());
        return lm;
    }
    
    
    
    
}
