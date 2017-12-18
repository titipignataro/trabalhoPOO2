package lanchonete;


import Control.PedidoControl;
import Ingredientes.Hamburger;
import Model.beam.Lanche;
import Ingredientes.Recheio;
import Ingredientes.Queijo;
import Ingredientes.Salada;
import Model.beam.Garcom;
import View.Tela;
import View.Telacozinha;

public class Lanchonete {
    
    
    public static void main(String[] args) {
    
        /*
        Recheio r1 = new Hamburger();
        r1 = new Salada(r1);
        
        Lanche l1 = new Lanche();
        l1.setRecheio(r1);
        l1.setQueijo(Queijo.SUICO);
        l1.setTamanho("Medio");
        System.out.println(l1.getDescricao());
        */
 
        

        
        Tela t = new Tela();
        Lanche l = new Lanche();
        
        Garcom g1 = new Garcom(1,t);
        Garcom g2 = new Garcom(2,t);
        Garcom g3 = new Garcom(3,t);
        
        Cozinha c = new Cozinha();
        Telacozinha tc = new Telacozinha(c);
        
        
        c.registerObserver(g1);
        c.registerObserver(g2);
        c.registerObserver(g3);
        
        
        PedidoControl control = new PedidoControl(t,l,c);
        
        
        tc.setVisible(true);
        t.setVisible(true);
        
        
        
        
        

    }
    
}
