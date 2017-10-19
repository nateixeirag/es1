
package unioeste.apoio.bd;

import MyConnection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import unioeste.geral.bo.endereco.Endereco;

/**
 *
 * @author renan
 */
public class DaoEndereco {
   private Connection connection;

    /**
     *
     */
    public DaoEndereco(){
        this.connection = new ConnectionFactory().getConnection();
   }
   
    /**
     *
     * @param end
     * @throws SQLException
     */
    public void cadastrarEndereco(Endereco end) throws SQLException{
       System.out.println("dao");
       String sql = " INSERT INTO endereco.endereco (cep, idcidade, idbairro, idrua) VALUES(?,?,?,?)";
       PreparedStatement stmt = connection.prepareStatement(sql);
      
       
       stmt.setString(1, end.getCep());
       stmt.setInt(2, end.getIdcidade());
       stmt.setInt(3,end.getIdbairro());
       stmt.setInt(4, end.getIdrua());
       stmt.execute();
       stmt.close();
   }
   
    /**
     *
     * @param id
     * @return
     * @throws SQLException
     */
    public Endereco buscarEnderecoPorId(int id) throws SQLException{
       String sql = "SELECT * FROM endereco.endereco where idendereco = " + id;
       PreparedStatement stmt = connection.prepareStatement(sql);
       ResultSet rs = (ResultSet) stmt.executeQuery();
       Endereco end = new Endereco();
       while(rs.next()){
           end.setIdendereco((rs.getInt("idendereco")));
           end.setIdrua(rs.getInt("idrua"));
           end.setIdbairro(rs.getInt("idbairro"));
           end.setIdcidade(rs.getInt("idcidade"));
           end.setCep(rs.getString("cep"));
         }
       rs.close();
       stmt.close();
       return end; 
       
    }
   
    /**
     *
     * @param cep
     * @return
     * @throws SQLException
     */
    public ArrayList buscarEnderecoPorCEP(String cep) throws SQLException{
     
       String sql = "SELECT * FROM endereco.endereco where cep = '" + cep +"';";
       PreparedStatement stmt = connection.prepareStatement(sql);
       ResultSet rs = (ResultSet) stmt.executeQuery();
       ArrayList <Endereco> lista = new ArrayList();
       while(rs.next()){
     
           Endereco end = new Endereco();
           end.setIdendereco((rs.getInt("idendereco")));
           end.setIdrua(rs.getInt("idrua"));
           end.setIdbairro(rs.getInt("idbairro"));
           end.setIdcidade(rs.getInt("idcidade"));
           end.setCep(rs.getString("cep"));
           lista.add(end);
           
         }
       
       rs.close();
       stmt.close();
       return lista; 
    }

    /**
     *
     * @param id
     * @throws SQLException
     */
    public void excluir(int id) throws SQLException{
       String sql = "DELETE FROM endereco.endereco where idendereco =" + id;
       PreparedStatement stmt = connection.prepareStatement(sql);
       stmt.execute();
       stmt.close();  
   }
   
    /**
     *
     * @param end
     * @throws SQLException
     */
    public void alterarEndereco(Endereco end) throws SQLException{
       String sql="UPDATE endereco.endereco set cep=?, idcidade=?, idbairro=?, idrua =? where idendereco ="+end.getIdendereco();
       PreparedStatement stmt = connection.prepareStatement(sql);
       
     
       stmt.setString(1, end.getCep());
       stmt.setInt(2, end.getIdcidade());
       stmt.setInt(3,end.getIdbairro());
       stmt.setInt(4, end.getIdrua());
       stmt.execute();
       stmt.close();
       
   }
   
   /*public int retornarIdEndereco(Endereco end) throws SQLException{
       String sql =" select idendereco from endereco where  numero = ? and complemento =? and cep =? and idcidade = ? and idbairro=? and idrua=?";
       PreparedStatement stmt = connection.prepareStatement(sql);
       stmt.setInt(1, end.getNumero());
       stmt.setString(2,end.getComplemento());
       stmt.setString(3, end.getCep());
       stmt.setInt(4, end.getIdcidade());
       stmt.setInt(5,end.getIdbairro());
       stmt.setInt(6, end.getIdrua());
       
       ResultSet rs = (ResultSet) stmt.executeQuery();
       Endereco endereco = new Endereco(); 
       while(rs.next()){
          
           endereco.setIdendereco((rs.getInt("idendereco")));
           
       }
       return endereco.getIdendereco();
       
    }*/
}