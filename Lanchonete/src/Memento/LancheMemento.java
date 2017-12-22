

package Memento;

import Ingredientes.Queijo;
import Ingredientes.Recheio;


public class LancheMemento {

    double preco;
    String tipo;
    String descricao;
    String tamanho;
    Queijo queijo;
    Recheio recheio;

    public LancheMemento(double p, String t,String d, String tam,Queijo q,Recheio r){
     preco = p;
     tipo = t;
     descricao = d;
     tamanho = tam;
     queijo = q;
     recheio = r;
    }
    
    
    
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public Queijo getQueijo() {
        return queijo;
    }

    public void setQueijo(Queijo queijo) {
        this.queijo = queijo;
    }

    public Recheio getRecheio() {
        return recheio;
    }

    public void setRecheio(Recheio recheio) {
        this.recheio = recheio;
    }

    
    
    
    
    
}
