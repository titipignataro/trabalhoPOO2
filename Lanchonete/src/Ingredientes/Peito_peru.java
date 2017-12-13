package Ingredientes;



public class Peito_peru extends Recheio{
    
    
    public Peito_peru(){
        descricao = "Peito de Peru";
    }
    
    
    @Override
    public float calcularPreco(){
        return (float) 14.50;
    }
    
    
}
