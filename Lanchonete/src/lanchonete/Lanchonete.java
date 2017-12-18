package lanchonete;


import Control.PedidoControl;
import Ingredientes.Hamburger;
import Model.beam.Lanche;
import Ingredientes.Recheio;
import Ingredientes.Queijo;
import Ingredientes.Salada;
import View.Tela;

public class Lanchonete {

    public static void main(String[] args) {
    

        Recheio r1 = new Hamburger();
        r1 = new Salada(r1);
        
        Lanche l1 = new Lanche();
        l1.setRecheio(r1);
        l1.setQueijo(Queijo.SUICO);
        l1.setTamanho("Medio");
        
        System.out.println(l1.getDescricao());
 
        
        Tela t = new Tela();
        Lanche l = new Lanche();
        PedidoControl c = new PedidoControl(t,l);
        
        t.setVisible(true);
        
        
        
        Cozinha cozinha = new Cozinha();
        cozinha.registerObserver(t);
        cozinha.prepararPedido("Medio", Queijo.SUICO.toString(), r1.toString());
        cozinha.notifyObservers();
    
    }
    
}
