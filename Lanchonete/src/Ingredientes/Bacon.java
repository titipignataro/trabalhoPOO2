package Ingredientes;

public class Bacon extends AdicionaisLanche{
    Recheio recheio_base;
    
    
    public Bacon(Recheio l){
        this.recheio_base = l;
    }


    
    @Override
    public String getDescricao(){
        return this.recheio_base.getDescricao() + ",Bacon";
    }
    
    @Override
    public float calcularPreco(){
        return recheio_base.calcularPreco() + (float) 1.00;
    }


      
}
