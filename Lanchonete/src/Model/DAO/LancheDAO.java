package Model.DAO;

import JDBC.ConnectionFactory;
import Model.beam.Lanche;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LancheDAO {
        private Connection conecta;
    
    
    public void cadastrarPedido(Lanche obj){
        try{
            conecta = ConnectionFactory.getInstance();
            
            String cmdsql = "insert into pedido(descricao,preco) values (?,?);";
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            stmt.setString(1, obj.getDescricao());
            stmt.setString(2, String.valueOf(obj.getPrecoTotal()));
            System.out.println(stmt);
            stmt.execute();
            
        }catch(SQLException  e){
            System.out.println("Erro ao registrar pedido!");
        }
}
}
