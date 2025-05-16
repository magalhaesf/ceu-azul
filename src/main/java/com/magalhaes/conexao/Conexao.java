package com.magalhaes.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    //Atributos do protocolo de conexão com o banco de dados
    private String url = "jdbc:mysql://localhost:3306/";
    private String user = "root";
    private String password = "";

    private Connection conexao;

    //Método para criar a conexão com o banco de dados
    public Connection getConexao() {
       try {
        conexao = DriverManager.getConnection(url, user, password);
        System.out.println("Conexão bem sucedida!");
        return conexao;

       } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        System.out.println("Erro de conexão");
       
       }

       return null;
    }

}
