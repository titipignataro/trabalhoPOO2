package Ingredientes;

public class Hamburger extends Recheio{

        
    
    public Hamburger(){
        descricao = ",Hamburger";
    }
    
    
    @Override
    public float calcularPreco(){
        return (float) 12.50;
    }
    
    
}
