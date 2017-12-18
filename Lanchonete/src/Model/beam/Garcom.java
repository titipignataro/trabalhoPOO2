package Model.beam;

import View.Tela;
import lanchonete.Observer;

public class Garcom implements Observer{
    
    private int id;
    private Tela t;
    
    
    public Garcom(int id, Tela t){
        this.id = id;
        this.t = t;
    }
    
    
    @Override
    public void update(boolean pronto, int numero) {
    t.setTxtStatus("Pedido " + 10 + "Pronto!");
    
    
    }
    
    
    
    
    


}
