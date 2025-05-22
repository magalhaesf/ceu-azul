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

            ps.setString(1, petshopPojo.getNome());

        } catch (SQLException e) {
            //lança um erro (imprimir)
            e.printStackTrace();
        }
    }

}
