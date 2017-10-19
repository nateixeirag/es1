/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UCEnderecoGeralServicos;

import java.sql.SQLException;
import java.util.ArrayList;
import unioeste.apoio.bd.DaoBairro;
import unioeste.geral.bo.endereco.Bairro;

/**
 *
 * @author renan
 */
public class ControllerBairro {
    DaoBairro dao = new DaoBairro();
    public Bairro buscarBairro(int id) throws SQLException{
        
        return dao.buscarBairroPorId(id);  
    } 
    
    public ArrayList consultarTodos() throws SQLException{
        return dao.consultarTodos();
        
    }
    
    public ArrayList buscarBairroPorCidade(int id) throws SQLException{
        return dao.buscarBairroPorCidade(id);
        
    }
    
}
