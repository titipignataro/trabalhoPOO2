package Ingredientes;


public class Salada extends AdicionaisLanche{
        Recheio recheio_base;
    
    
    public Salada(Recheio l){
        this.recheio_base = l;
    }


    
    @Override
    public String getDescricao(){
        return this.recheio_base.getDescricao() + ",Alface, Tomate e Rúcula";
    }
    
    @Override
    public float calcularPreco(){
        return recheio_base.calcularPreco();
    }


  
}
