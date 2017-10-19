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

package MyConnection;


import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**Classe de conexão ao banco de dados. 
 * 
 * Classe utilizada para estabelecer uma conexão ao pool de conexões fornecidas
 * pelo servidor de aplicação.
 *
 * @author cristopher
 * 
 */

public class ConnectionFactory {
        	
    private static ConnectionFactory instance = null;
	
    /**Construtor classe ConnectionFactory.
     * 
     * Construtor vazio.
     *
     */
    
    public ConnectionFactory(){
    }
	
    /**Estabelece e retorna uma conexão ativa com o banco de dados.
     * 
     * 
     *
     * @return a conexão 
     */
    
    public static ConnectionFactory getInstance(){
            
            if(instance == null) 
                instance = new ConnectionFactory();
            
            return instance;
            
	}
    
    /**Busca por uma conexão no pool de conexões.
     * 
     * A partir de um arquivo de configuração, estabelece uma conexão ao pool de
     * conexões. Caso o pool esteja cheio, retorna o valor null, caso o pool 
     * esteja livre retorna uma conexão.
     * O servidor de aplicação deve estar pré-configurado para aceitar conexões
     * deste método.
     *
     * @return conexão ativa com o banco de dados
     * @see glassfish-resources.xml
     * 
     */
    
    public Connection getConnection() {
        try {
            InitialContext initialContext = new InitialContext();
            DataSource dataSource = (DataSource) initialContext.lookup("jdbc/endereco");
            return dataSource.getConnection();
        } 
        catch (NamingException | SQLException ex) {
                      
        }
        return null;
    }
}