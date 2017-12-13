package Model.beam;

import Ingredientes.Queijo;
import Ingredientes.Recheio;

public class Lanche extends Produto{

    String tamanho;
    Queijo queijo;
    Recheio recheio;
    
    
    public Lanche(){
        this.tipo = "lanche";
    }

    
    public String getTamanho() {
        return tamanho;
    }
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    
    
    public void setRecheio(Recheio r){
        recheio = r;
    }
    
    public Recheio getRecheio() {
        return recheio;
    }


    public Queijo getQueijo() {
        return queijo;
    }

    public void setQueijo(Queijo queijo) {
        this.queijo = queijo;
    }

    @Override
    public String getDescricao(){
        descricao = "Lanche "+tamanho+  "," + "Queijo " + queijo.toString();
        descricao = descricao + "," + recheio.getDescricao() ;    
        System.out.println("DESCRICAO : " + descricao);
       return descricao;
    }
    
    
    @Override
    public float getPreco(){
       float preco_total =this.recheio.calcularPreco();
        if(tamanho.equals("Grande")){
            preco_total += (float) 6.00;
        }
        else if(tamanho.equals("Medio")){
            preco_total += (float) 3.50;
        }
        else{
            preco_total += (float) 2.00;
        }
        return preco_total;
    }
    
    
    
    
    
    public void setDescricao(String d){
        descricao = d;
    }
    public void setPreco(float p){
        preco = p;
    }
    
}
