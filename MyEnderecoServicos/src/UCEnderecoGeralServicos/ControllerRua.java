/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UCEnderecoGeralServicos;

import java.sql.SQLException;
import java.util.ArrayList;
import unioeste.apoio.bd.DaoRua;
import unioeste.geral.bo.endereco.Rua;

/**
 *
 * @author renan
 */
public class ControllerRua {
    DaoRua dao = new DaoRua();
   public Rua buscarRua(int id) throws SQLException{
        return dao.buscarRuaPorId(id);  
    }  
   
   public ArrayList consultarTodos() throws SQLException{
       return dao.consultarTodos();
   }
   
   public ArrayList buscarRuaPorBairro(int id) throws SQLException{
        return dao.buscarRuaPorBairro(id);
        
    }
    
}
