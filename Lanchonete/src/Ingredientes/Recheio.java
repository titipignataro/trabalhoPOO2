package Ingredientes;

public abstract class Recheio{
    String descricao;
    
    
    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String d){
        this.descricao = d;
    }
    
   public abstract float calcularPreco();
    
}
