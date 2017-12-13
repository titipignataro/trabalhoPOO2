

package Control;

import Ingredientes.Hamburger;
import Ingredientes.Recheio;
import Model.beam.Lanche;
import View.Tela;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LancheControl {

    private Tela theView;
    private Lanche theModel;
    
    public LancheControl(Tela t, Lanche l){
        theView = t;
        theModel = l;
        theView.addSalvaListener(new SalvaListener());
    }
    
    
    public class SalvaListener implements ActionListener{
    

        @Override
        public void actionPerformed(ActionEvent e) {
        try{
            Lanche obj;
            Recheio r;
            if(theView.getTxtRecheio().equals("Hamburger")){
                r = new Hamburger();
                obj = new Lanche(r);
            }
            
            
            System.out.println(theView.getTxtRecheio());
            
            
            
        }  catch(Exception exc){
            System.out.println("Erro!");
        } 


        }
    
}
    
    
    
    
    
    
    
    
    
}
