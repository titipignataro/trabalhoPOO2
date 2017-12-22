package Chain;

import Chain.ChainENUM.IDBancos;

public class AVista extends PagamentoChain{
    
    public AVista(){
        super(IDBancos.aVista); 
    }

    @Override
    protected void pagamentoFeito() {
        System.out.println("Pagamento efetuado a vista");
    }
    
    
}