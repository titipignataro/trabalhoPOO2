package Ingredientes;

public class Ovo extends AdicionaisLanche{
    Recheio recheio_base;
    
    
    public Ovo(Recheio l){
        this.recheio_base = l;
    }


    
    @Override
    public String getDescricao(){
        return this.recheio_base.getDescricao() + " com Ovo";
    }
    
    @Override
    public float calcularPreco(){
        return recheio_base.calcularPreco() + (float) 1.00;
    }


  

}
