
package Control;

import Ingredientes.Bacon;
import Ingredientes.CreamCheese;
import Ingredientes.Hamburger;
import Ingredientes.Ovo;
import Ingredientes.PeitoFrango;
import Ingredientes.PeitoPeru;
import Ingredientes.Queijo;
import Ingredientes.Recheio;
import Ingredientes.Salada;
import Memento.LancheCareTaker;
import Model.DAO.PedidoDAO;
import Model.beam.Lanche;
import Model.beam.Produto;
import View.Tela;
import View.TelaPagamento;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import View.TelaHistorico;
import lanchonete.Cozinha;

public class PedidoControl {

        public static int numeroPedido = 1;
    
	private Tela theView;
	private Produto theModel;
        private Cozinha cozinha;
        private LancheCareTaker lct;

        
	public PedidoControl(Tela t, Produto p,Cozinha cozinha) {
		theView = t;
		theModel = p;
                this.cozinha = cozinha;
		theView.addSalvaListener(new SalvaListener());
                theView.addHistoricoListener(new HistoricoListener());
                lct = new LancheCareTaker();
	}

	public class SalvaListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				Lanche obj = new Lanche();
				Recheio recheio = null;

                                String r = theView.getCbRecheio();
				switch (r) {
				case "Hamburger":
					recheio = new Hamburger();
					obj.setRecheio(recheio);
					break;
				case "Peito de Peru":
					recheio = new PeitoPeru();
					obj.setRecheio(recheio);
					break;
				case "Peito de Frango":
					recheio = new PeitoFrango();
					obj.setRecheio(recheio);
					break;
				}
				if (theView.getChOvo()) {
					recheio = new Ovo(recheio);
					obj.setRecheio(recheio);
				}
				if (theView.getChBacon()) {
					recheio = new Bacon(recheio);
					obj.setRecheio(recheio);
				}
				if (theView.getChCreamcheese()) {
					recheio = new CreamCheese(recheio);
					obj.setRecheio(recheio);
				}
				if (theView.getChSalada()) {
					recheio = new Salada(recheio);
					obj.setRecheio(recheio);
				}

				String q = theView.getCbQueijo();
				switch (q) {
				case "Chedar":
					obj.setQueijo(Queijo.CHEDDAR);
					break;
				case "Prato":
					obj.setQueijo(Queijo.PRATO);
					break;
				case "Suíço":
					obj.setQueijo(Queijo.SUICO);
					break;
				case "Sem Queijo":
					obj.setQueijo(Queijo.SEM);
				}
				String t = theView.getCbTamanho();
				switch (t) {
				case "Pequeno":
					obj.setTamanho("Pequeno");
					break;
				case "Medio":
					obj.setTamanho("Medio");
					break;
				case "Grande":
					obj.setTamanho("Grande");
					break;
				}
				obj.setPreco();
                                obj.setDescricao();
                                
                                
                                cozinha.prepararPedido(obj.getTamanho(),
                                        obj.getQueijo().toString(), 
                                        obj.getRecheio().toString());
                                
                                TelaPagamento tp = new TelaPagamento(obj.getPreco());
                                tp.setVisible(true);
                                
                                
                                
                                lct.addMemento(obj.gerarMemento());
                               
                                PedidoDAO pedidodao = new PedidoDAO();
                                pedidodao.cadastrarPedido(obj);
                                theView.setTxtStatus("Pedido Nº" + numeroPedido +
                                        " encaminhado á cozinha");
                                numeroPedido += 1;
                                
                                
			} catch (Exception exc) {
				System.out.println("Erro AQUI! " + exc);
			}

		}

	}
        
        public class HistoricoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
        TelaHistorico th = new TelaHistorico();
        
        th.setJlist(lct.getMementos());
        th.setVisible(true);
        
        
        
        }
        
        
        
        
        }

}
