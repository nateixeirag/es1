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
import unioeste.geral.bo.endereco.Cidade;


/**Classe de Infra DaoCidade.
 * 
 * Classe de infra responsável pela execução de query's no banco de dados.
 *
 * @author Cristopher
 * @author Natalia
 * 
 */ 

public class DaoCidade {
   private Connection connection;

    /**Construtor DaoCidade.
     * 
     * Construtor que inicializa uma conexão ao banco de dados.
     *
     */
   
    public DaoCidade(){
        this.connection = new ConnectionFactory().getConnection();
   }
   
    /**
     *
     * @param id
     * @return
     * @throws SQLException
     */
    public Cidade buscarCidadePorId(int id) throws SQLException{
       String sql = " select nome_cidade, idestado from endereco.cidade where idcidade = " + id;
        PreparedStatement stmt;
        stmt = connection.prepareStatement(sql);
        Cidade c = new Cidade(); 
        ResultSet rs = (ResultSet) stmt.executeQuery();
        while (rs.next()) {
            c.setIdcidade(id);
            c.setCidade(rs.getString("nome_cidade"));
            c.setIdestado(rs.getInt("idestado"));
        }
        rs.close();
        stmt.close();	
        return c; 
    }
   
    /**
     *
     * @return
     * @throws SQLException
     */
    public ArrayList consultarTodos() throws SQLException{
     String sql = "select * from endereco.cidade";
        PreparedStatement stmt;
        stmt = connection.prepareStatement(sql);
        ArrayList <Cidade> lista = new ArrayList();
        
        ResultSet rs = (ResultSet) stmt.executeQuery();
        while (rs.next()) {
            Cidade e = new Cidade();
            e.setCidade(rs.getString("nome_cidade"));
            e.setIdcidade(rs.getInt("idcidade"));
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
    public ArrayList buscarCidadePorEstado(int id) throws SQLException{
       String sql = "select * from endereco.cidade where idestado="+id;
       PreparedStatement stmt;
        stmt = connection.prepareStatement(sql);
        ArrayList <Cidade> lista = new ArrayList();
        
        ResultSet rs = (ResultSet) stmt.executeQuery();
        while (rs.next()) {
            Cidade e = new Cidade();
            e.setCidade(rs.getString("nome_cidade"));
            e.setIdcidade(rs.getInt("idcidade"));
            lista.add(e);
        }
        rs.close();
        stmt.close();	
        return lista; 
   }
}