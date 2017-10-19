/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UCEnderecoGeralServicos;

import java.sql.SQLException;
import unioeste.apoio.bd.DaoPais;
import unioeste.geral.bo.endereco.Pais;
import java.util.ArrayList;

/**
 *
 * @author renan
 */
public class ControllerPais {
    DaoPais dao = new DaoPais();
    public Pais buscarPais(int id) throws SQLException{
        
        return dao.buscarPaisPorId(id);  
    } 
    
    public ArrayList consultarTodos()throws SQLException{
        return dao.consultarTodos();
    }
}
