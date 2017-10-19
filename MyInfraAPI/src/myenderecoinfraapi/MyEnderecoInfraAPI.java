/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myenderecoinfraapi;

import MyConnection.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import unioeste.apoio.bd.DaoBairro;
import unioeste.apoio.bd.DaoPais;
import unioeste.apoio.bd.DaoRua;
import unioeste.geral.bo.endereco.Pais;

/**
 *
 * @author cristopher
 */
public class MyEnderecoInfraAPI {

    /**
     *
     * @param args
     * @throws SQLException
     */
    public static void main(String[] args) throws SQLException {
       
          Connection connection = new ConnectionFactory().getConnection();
          System.out.println(connection);
          DaoPais pais = new DaoPais();
          Pais buscarPaisPorId = pais.buscarPaisPorId(1);
          ArrayList consultarTodos = pais.consultarTodos();
        
        
        
    }
}
