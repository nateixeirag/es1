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
import unioeste.geral.bo.endereco.Pais;

/**Classe de Infra DaoPais.
 * 
 * Classe de infra responsável pela execução de query's no banco de dados.
 *
 * @author Cristopher
 * @author Natalia
 * 
 */

public class DaoPais{
   private Connection connection;
    
    /**Construtor DaoPais.
     *
     * 
     * Construtor que inicializa uma conexão ao banco de dados.
     *
     */
   
    public DaoPais(){
        this.connection = new ConnectionFactory().getConnection();
   }
   
   /**Busca por um pais atraves de seu código.
     * 
     * Executa um sql no banco em busca de um pais.
     * 
     *
     * @param id um numero representando uma entrada especifica do banco de dados.
     * @return um pais com nome do pais e id setado
     * @throws SQLException
     * 
     */
    
    public Pais buscarPaisPorId(int id) throws SQLException{
       String sql = " select idpais, nome_pais from endereco.pais where idpais = " + id;
        PreparedStatement stmt;
        stmt = connection.prepareStatement(sql);
        Pais p = new Pais();
        ResultSet rs = (ResultSet) stmt.executeQuery();
        while (rs.next()) {
            p.setIdpais(rs.getInt("idpais"));
            p.setPais(rs.getString("nome_pais"));
          
        }
        rs.close();
        stmt.close();	
        return p; 
    }
   
    /**Consulta todos os paises do banco de dados.
     * 
     * Consulta todos os paises cadastrados no banco de dados.
     *
     * @return um arrayList de todos os paises presentes no banco
     * @throws SQLException
     * 
     */
    
    public ArrayList consultarTodos() throws SQLException{
     String sql = "select * from endereco.pais";
        PreparedStatement stmt;
        stmt = connection.prepareStatement(sql);
        ArrayList <Pais> lista = new ArrayList(); 
        ResultSet rs = (ResultSet) stmt.executeQuery();
        while (rs.next()) {
            Pais p = new Pais();
            p.setPais(rs.getString("nome_pais"));
            p.setIdpais(rs.getInt("idpais"));
            lista.add(p);
        }
        rs.close();
        stmt.close();	
        return lista; 
 }
    
}
   
