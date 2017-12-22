package Chain;

import Chain.ChainENUM.IDBancos;

public class CartaoCredito extends PagamentoChain{
    
    public CartaoCredito(){
        super(IDBancos.cartaoCredito); 
    }

    @Override
    protected void pagamentoFeito() {
        System.out.println("Pagamento efetuado no Cartao de Credito");
    }
    
    
}
