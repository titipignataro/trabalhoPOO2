package lanchonete;


import Ingredientes.Hamburger;
import Model.beam.Lanche;
import Ingredientes.Recheio;
import Ingredientes.Queijo;
import Ingredientes.Salada;

public class Lanchonete {

    public static void main(String[] args) {
    
        
        Recheio r1 = new Hamburger();
        r1 = new Salada(r1);
        
        Lanche l1 = new Lanche(r1);
        l1.setQueijo(Queijo.Suico);
        l1.setTamanho("Medio");
        
        System.out.println(l1.getDescricao());
    
    
    }
    
}
