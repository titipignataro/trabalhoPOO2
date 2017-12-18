package Model.beam;

public abstract class Produto {

    double preco;
    String tipo;
    String descricao;
    
    public abstract String getDescricao();
    public abstract double getPreco();
}
