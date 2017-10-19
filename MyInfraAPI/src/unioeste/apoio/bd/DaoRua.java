/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unioeste.apoio.bd;

import MyConnection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import unioeste.geral.bo.endereco.Rua;

/**
 *
 * @author renan
 */
public class DaoRua {
    private Connection connection;

    /**
     *
     */
    public DaoRua(){
        this.connection = new ConnectionFactory().getConnection();
   }
   
    /**
     *
     * @param id
     * @return
     * @throws SQLException
     */
    public Rua buscarRuaPorId(int id) throws SQLException{
       String sql = " select nome_rua from rua where idrua = " + id;
        PreparedStatement stmt;
        stmt = connection.prepareStatement(sql);
        Rua r = new Rua(); 
        ResultSet rs = (ResultSet) stmt.executeQuery();
        while (rs.next()) {
            r.setRua(rs.getString("nome_rua"));
        }
        rs.close();
        stmt.close();	
        return r; 
    }
   
    /**
     *
     * @return
     * @throws SQLException
     */
    public ArrayList consultarTodos() throws SQLException{
     String sql = "select * from rua";
        PreparedStatement stmt;
        stmt = connection.prepareStatement(sql);
        ArrayList <Rua> lista = new ArrayList();
        
        ResultSet rs = (ResultSet) stmt.executeQuery();
        while (rs.next()) {
            Rua e = new Rua();
            e.setRua(rs.getString("nome_rua"));
            e.setIdrua(rs.getInt("idrua"));
            lista.add(e);
        }
        rs.close();
        stmt.close();	
        return lista; 
    }
   
    /**
     *
     * @param id
     * @return
     * @throws SQLException
     */
    public ArrayList buscarRuaPorBairro(int id) throws SQLException{
     String sql = "select * from rua where idbairro =" +id;
        PreparedStatement stmt;
        stmt = connection.prepareStatement(sql);
        ArrayList <Rua> lista = new ArrayList();
        
        ResultSet rs = (ResultSet) stmt.executeQuery();
        while (rs.next()) {
            Rua e = new Rua();
            e.setRua(rs.getString("nome_rua"));
            e.setIdrua(rs.getInt("idrua"));
            lista.add(e);
        }
        rs.close();
        stmt.close();	
        return lista; 
    }
}
