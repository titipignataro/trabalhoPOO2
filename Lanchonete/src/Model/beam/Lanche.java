package Model.beam;

import Ingredientes.Queijo;
import Ingredientes.Recheio;

public class Lanche extends Produto{

    String tamanho;
    Queijo queijo;
    Recheio recheio;
    String descricao;
    
    public Lanche(Recheio r){
        recheio = r;
        this.tipo = "lanche";
    }
    
    
    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public Recheio getRecheio() {
        return recheio;
    }

    public void setRecheio(Recheio recheio) {
        this.recheio = recheio;
    }

    public Queijo getQueijo() {
        return queijo;
    }

    public void setQueijo(Queijo queijo) {
        this.queijo = queijo;
    }

    public String getDescricao(){
        float preco_total = recheio.calcularPreco();
        if(tamanho.equals("Grande")){
            preco_total += (float) 5.00;
        }
        else if(tamanho.equals("Medio")){
            preco_total += (float) 2.50;
        }
        else{
            preco_total += (float) 1.00;
        }

        descricao = "Lanche "+tamanho+ "," + "Queijo " + queijo.toString();
        descricao = descricao + recheio.getDescricao() ;        
       return descricao;
    }
    
    
    public float getPrecoTotal(){
        return this.recheio.calcularPreco();
    }
    
}
