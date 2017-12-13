package Ingredientes;

public class CreamCheese extends AdicionaisLanche{
        Recheio recheio_base;
    
    
    public CreamCheese(Recheio l){
        this.recheio_base = l;
    }


    
    @Override
    public String getDescricao(){
        return this.recheio_base.getDescricao() + ",Cream Cheese";
    }
    
        @Override
    public float calcularPreco(){
        return recheio_base.calcularPreco() + (float) 1.00;
    }


  
}
