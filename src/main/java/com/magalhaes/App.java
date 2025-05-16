package com.magalhaes;

import com.magalhaes.conexao.Conexao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Conexao conexao = new Conexao();

       conexao.getConexao();
    }
}
