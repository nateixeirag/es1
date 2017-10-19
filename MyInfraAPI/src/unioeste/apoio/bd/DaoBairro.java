/*
 * Copyright (C) 2017 cristopher
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package unioeste.apoio.bd;

import MyConnection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import unioeste.geral.bo.endereco.Bairro;

/**Classe de Infra DaoBairro.
 * 
 * Classe de infra responsável pela execução de query's no banco de dados.
 *
 * @author Cristopher
 * @author Natalia
 * 
 */

public class DaoBairro{
   private Connection connection;

    /**Construtor DaoBairro.
     * 
     * Construtor que inicializa uma conexão ao banco de dados.
     *
     */
   
    public DaoBairro(){
        this.connection = new ConnectionFactory().getConnection();
   }
   
    /**Busca por um bairro atraves de seu código.
     * 
     * Executa um sql no banco em busca de um bairro.
     * 
     *
     * @param id um numero representando uma entrada especifica do banco de dados.
     * @return um bairro, com o nome e id setados.
     * @throws SQLException
     */
    
    public Bairro buscarBairroPorId(int id) throws SQLException{
       String sql = " select nome_bairro from endereco.bairro where idbairro = " + id;
        PreparedStatement stmt;
        stmt = connection.prepareStatement(sql);
        Bairro b = new Bairro(); 
        ResultSet rs = (ResultSet) stmt.executeQuery();
        while (rs.next()) {
            
            b.setBairro(rs.getString("nome_bairro"));
            b.setIdbairro(rs.getInt("idbairro"));

        }
        rs.close();
        stmt.close();	
        return b; 
    }
   
    /**Consulta todos os bairros do banco de dados.
     * 
     * Consulta todos os bairros cadastrados no banco de dados.
     *
     * @return um arrayList de todos os bairros presentes no banco
     * @throws SQLException
     * 
     */
    
    public ArrayList consultarTodos() throws SQLException{
     String sql = "select * from endereco.bairro";
        PreparedStatement stmt;
        stmt = connection.prepareStatement(sql);
        ArrayList <Bairro> lista = new ArrayList();
        
        ResultSet rs = (ResultSet) stmt.executeQuery();
        while (rs.next()) {
            Bairro e = new Bairro();
            e.setBairro(rs.getString("nome_bairro"));
            e.setIdbairro(rs.getInt("idbairro"));
            lista.add(e);
        }
        rs.close();
        stmt.close();	
        return lista; 
    }
   
    /**Busca um bairro em uma determinada cidade.
     * 
     * Busca todos os bairros presentes em uma cidade apartir do seu id.
     *
     * @param id 
     * @return uma lista de bairros em uma determinada cidade.
     * @throws SQLException
     * 
     */
    
    public ArrayList buscarBairroPorCidade(int id) throws SQLException{
     String sql = "select * from endereco.bairro where idcidade ="+id;
        PreparedStatement stmt;
        stmt = connection.prepareStatement(sql);
        ArrayList <Bairro> lista = new ArrayList();
        
        ResultSet rs = (ResultSet) stmt.executeQuery();
        while (rs.next()) {
            Bairro e = new Bairro();
            e.setBairro(rs.getString("nome_bairro"));
            e.setIdbairro(rs.getInt("idbairro"));
            lista.add(e);
        }
        rs.close();
        stmt.close();	
        return lista; 
    }
   
   
   
}
