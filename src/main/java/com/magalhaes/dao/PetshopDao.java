package com.magalhaes.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.magalhaes.conexao.Conexao;
import com.magalhaes.pojo.petShopPojo;

public class PetshopDao {

    public void cadastrarPetshop(petShopPojo petshopPojo){

        //Cria a conexão com o banco de dados
        //a variável conexão recebe um novo objeto do tipo Conexao
        Conexao conexao = new Conexao();

        //Criado variável do tipo String "texto", recebe um texto de insert
        //os símbolos de interrogação são os parâmetros que vem de fora do sistema 
        String sqlInsert = "insert into petshop(nome, email, telefone, cnpj) value (?, ?, ?, ?);";

        //Cria a váriavel do tipo PreparedStatement
        //Responsavel por preparar a sql (insert)
        PreparedStatement ps = null;

       
        try {

            //Pegar uma conexao e preparar a sql
            ps = conexao.getConexao().prepareStatement(sqlInsert);

            //setar a informação no ps. Pego a informação do Pojo
            ps.setString(1, petshopPojo.getNome());
            ps.setString(2, petshopPojo.getEmail());
            ps.setString(3, petshopPojo.getTelefone());
            ps.setString(4, petshopPojo.getCnpj());

            ps.execute();
            ps.close();

            System.out.println("Gravou o Petshop!!");

        } catch (SQLException e) {
            //lança um erro (imprimir)
            e.printStackTrace();
            System.out.println("Não gravou");
        }
    }

}
