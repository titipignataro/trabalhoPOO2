

package Control;

import Ingredientes.Bacon;
import Ingredientes.CreamCheese;
import Ingredientes.Hamburger;
import Ingredientes.Ovo;
import Ingredientes.Peito_frango;
import Ingredientes.Peito_peru;
import Ingredientes.Queijo;
import Ingredientes.Recheio;
import Ingredientes.Salada;
import Model.DAO.PedidoDAO;
import Model.beam.Lanche;
import Model.beam.Produto;
import View.Tela;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PedidoControl {

    private Tela theView;
    private Produto theModel;
    
    public PedidoControl(Tela t, Produto p){
        theView = t;
        theModel = p;
        theView.addSalvaListener(new SalvaListener());
    }
    
    
    public class SalvaListener implements ActionListener{
    
        @Override
        public void actionPerformed(ActionEvent e) {

        try{
            Lanche obj = new Lanche();
            Recheio recheio = null ;
            
            String r = theView.getCbRecheio();
 
            switch (r){
                case "Hamburger":
                    recheio = new Hamburger();
                    obj.setRecheio(recheio);
                            
                    break;
                
                case "Peito de Peru":
                    recheio = new Peito_peru();
                    obj.setRecheio(recheio);
                            
                    break;
                
                case "Peito de Frango":
                    recheio = new Peito_frango();
                    obj.setRecheio(recheio); 
                    break;
            }
            
            if(theView.getChOvo()){
                recheio = new Ovo(recheio);
                obj.setRecheio(recheio); 
            }
            if (theView.getChBacon()){
                recheio = new Bacon(recheio);
                obj.setRecheio(recheio); 
            }
            if (theView.getChCreamcheese()){
                recheio = new CreamCheese(recheio);
                obj.setRecheio(recheio); 
            }
            if(theView.getChSalada()){
                recheio = new Salada(recheio);
                obj.setRecheio(recheio); 
            }
            
            
            String q = theView.getCbQueijo();
            
            switch (q){
                case "Chedar":
                    obj.setQueijo(Queijo.Chedar);
                    break;
                    
                case "Prato":
                    obj.setQueijo(Queijo.Prato);
                    break;
                
                case "Suíço":
                    obj.setQueijo(Queijo.Suico);
                    break;
                    
                case "Sem Queijo":
                    obj.setQueijo(Queijo.Sem);
            }
            
            
            String t = theView.getCbTamanho();
            
            switch (t){
                case "Pequeno":
                obj.setTamanho("Pequeno");
                break;
                case "Medio":
                    obj.setTamanho("Medio");
                    break;
                case "Grande":
                    obj.setTamanho("Grande");
                    break;
            }
            
            
            
            
            System.out.println(theView.getCbRecheio());
            
            PedidoDAO pedidodao = new PedidoDAO();
            pedidodao.cadastrarPedido(obj);
        }  catch(Exception exc){
            System.out.println("Erro AQUI! " + exc);
        } 



        }
    
}
    
    
    
    
    
    
    
    
    
}
