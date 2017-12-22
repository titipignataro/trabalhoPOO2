package Chain;

import Chain.ChainENUM.IDBancos;

public class CartaoDebito extends PagamentoChain{
    
    public CartaoDebito(){
        super(IDBancos.cartaoDebito); 
    }

    @Override
    protected void pagamentoFeito() {
        System.out.println("Pagamento efetuado no Cartao de Debito");
    }
    
    
}