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
import unioeste.geral.bo.endereco.Estado;

/**Classe de Infra DaoEstado.
 * 
 * Classe de infra responsável pela execução de query's no banco de dados.
 *
 * @author Cristopher
 * @author Natalia
 * 
 */

public class DaoEstado {
   private Connection connection;

    /**Construtor DaoEstado.
     *
     * 
     * Construtor que inicializa uma conexão ao banco de dados.
     *
     */
   
    public DaoEstado(){
        this.connection = new ConnectionFactory().getConnection();
   }
   
     /**Busca por um Estado atraves de seu código.
     * 
     * Executa um sql no banco em busca de um estado.
     * 
     *
     * @param id um numero representando uma entrada especifica do banco de dados.
     * @return um pais com nome do pais e id setado
     * @throws SQLException
     * 
     */
    
    public Estado buscarEstadoPorId(int id) throws SQLException{
       String sql = " select idestado,nome_estado, idpais from endereco.estado where idestado = " + id;
        PreparedStatement stmt;
        stmt = connection.prepareStatement(sql);
        Estado e = new Estado();
        ResultSet rs = (ResultSet) stmt.executeQuery();
        while (rs.next()) {
            e.setEstado(rs.getString("nome_estado"));
            e.setIdpais(rs.getInt("idpais"));
            e.setIdestado(rs.getInt("idestado"));

            
        }
        rs.close();
        stmt.close();	
        return e; 
    }
    
    /**Consulta estados por pais.
     * 
     * Consulta todos os estados cadastrados em um determinado pais no banco de dados.
     *
     * @return um arrayList de todos os paises presentes no banco
     * @throws SQLException
     * 
     */
    
    public ArrayList buscarEstadoPorPais(int id) throws SQLException{
     String sql = "select * from endereco.estado where idpais =" + id;
        PreparedStatement stmt;
        stmt = connection.prepareStatement(sql);
        ArrayList <Estado> lista = new ArrayList();
        
        ResultSet rs = (ResultSet) stmt.executeQuery();
        while (rs.next()) {
            Estado e = new Estado();
            e.setEstado(rs.getString("nome_estado"));
            e.setIdestado(rs.getInt("idestado"));
            lista.add(e);
        }
        rs.close();
        stmt.close();	
        return lista; 
    }
   
     /**Consulta todos os estados do banco de dados.
     * 
     * Consulta todos os estados cadastrados no banco de dados.
     *
     * @return um arrayList de todos os estados presentes no banco
     * @throws SQLException
     * 
     */
    public ArrayList consultarTodos() throws SQLException{
     String sql = "select * from endereco.estado";
        PreparedStatement stmt;
        stmt = connection.prepareStatement(sql);
        ArrayList <Estado> lista = new ArrayList();
        
        ResultSet rs = (ResultSet) stmt.executeQuery();
        while (rs.next()) {
            Estado e = new Estado();
            e.setEstado(rs.getString("nome_estado"));
            e.setIdestado(rs.getInt("idestado"));
            lista.add(e);
        }
        rs.close();
        stmt.close();	
        return lista; 
    }
   
   
   
}
    

