package com.magalhaes;

import com.magalhaes.conexao.Conexao;
import com.magalhaes.modelo.Petshop;
import com.magalhaes.pojo.petShopPojo;
import com.magalhaes.dao.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      // Conexao conexao = new Conexao();

      //  conexao.getConexao();

      Petshop petshop = new Petshop("Petshop", "email@gmail.com", "45996452668", "9876541230456");

      petShopPojo petshopPojo = new petShopPojo(petshop.getNome(), petshop.getEmail(), petshop.getTelefone(), petshop.getCnpj );

      com.magalhaes.dao.PetshopDao PetshopDao = new PetshopDao();

      PetshopDao.cadastrarPetshop(petshopPojo);

     }
 }
