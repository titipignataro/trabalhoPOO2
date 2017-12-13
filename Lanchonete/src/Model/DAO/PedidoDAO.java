package Model.DAO;

import JDBC.ConnectionFactory;
import Model.beam.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PedidoDAO {
        private Connection conecta;
    
    
    public void cadastrarPedido(Produto obj){
        try{
            conecta = ConnectionFactory.getInstance();
            
            if (obj != null){
                System.out.println("OLA");
                System.out.println(obj.getPreco());
                System.out.println(obj.getDescricao());
            }
            
            String cmdsql = "INSERT INTO pedido(descricao,preco) values (?,?);";
            
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            stmt.setString(1, obj.getDescricao());
            stmt.setDouble(2, obj.getPreco());
            System.out.println(stmt);
            stmt.execute();
            
        }catch(SQLException  e){
            System.out.println("Erro ao registrar pedido! " + e);
        }
}
}
