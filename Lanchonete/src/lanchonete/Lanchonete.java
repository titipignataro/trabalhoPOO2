package lanchonete;


import Control.PedidoControl;
import Model.beam.Lanche;
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
 
        

        
        Tela t1 = new Tela();
        Tela t2 = new Tela();
        Lanche l = new Lanche();
        
        Garcom g1 = new Garcom(1,t1);
        Garcom g2 = new Garcom(2,t2);
        
        Cozinha c = new Cozinha();
        Telacozinha tc = new Telacozinha(c);
        
        
        c.registerObserver(g1);
        c.registerObserver(g2);
        
        
        PedidoControl control1 = new PedidoControl(t1,l,c);
        PedidoControl control2 = new PedidoControl(t2,l,c);
        
        
        tc.setVisible(true);
        t1.setVisible(true);
        t2.setVisible(true);
        
        
        
        
        

    }
    
}
