package Chain;

import Chain.ChainENUM.IDBancos;

public abstract class PagamentoChain {
    
    protected PagamentoChain next;          //objeto para próxima posição da Cadeia
    protected IDBancos escolherPagamento;   //identificador de qual banco será escolhido
    
    
    protected abstract void pagamentoFeito();
    
 //CONSTRUTOR    
    public PagamentoChain(IDBancos id){
        next = null;
        escolherPagamento = id;
    }
    
//PERCORRER A CORRENTE ATÉ ENCONTRAR O ELEMENTO ESCOLHIDO 
    public void setNext (PagamentoChain forma){
        
       if(next == null){
           next = forma;        //se o proximo elemento for nulo, ele sera o parametro
       } else {
           next.setNext(forma); //senao, a responsabilidade e passada para o proximo elemento
       }
    }
 
//COMPARA O IDENTIFICADOR PASSADO POR PARAMETRO COM O IDENTIFICADOR DA CHAIN   
    private boolean pagamentoAutorizado(IDBancos id){
        if(escolherPagamento == id){
            return true;
        }
        return false;
    }
 
//VERIFICA SE O PAGAMENTO PODE SER EFETUADO
    public void efetuarPagamento(IDBancos id) throws Exception{
        if(pagamentoAutorizado(id)){
            pagamentoFeito();
        } else {
            if(next == null){
                throw new Exception("Nao autorizado!"); //metodo nao esta na chain
            }
            next.efetuarPagamento(id);                  //verifica se o próximo elemento da chain atende o pagamento
        }
    }
    
}
