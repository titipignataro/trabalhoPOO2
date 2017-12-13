package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {
private static Connection conexao;
    
    
    
    private ConnectionFactory(){
    }
    
    
    public static Connection getInstance(){
                if(conexao == null){
            synchronized (ConnectionFactory.class){
                if(conexao == null){
                    try{
                        conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","pass");
                        System.out.println("Conexao estabelecida");
                    }catch(SQLException e){
                        System.out.println("Erro na conexao");
                        throw new RuntimeException(e);
                    }                    
                }
            }
        }
        return conexao;
        }
    }
    
    
    
    

