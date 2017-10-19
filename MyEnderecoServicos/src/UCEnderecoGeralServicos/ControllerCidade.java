/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UCEnderecoGeralServicos;

import java.sql.SQLException;
import java.util.ArrayList;
import unioeste.apoio.bd.DaoCidade;
import unioeste.geral.bo.endereco.Cidade;

/**
 *
 * @author renan
 */
public class ControllerCidade {
    DaoCidade dao = new DaoCidade();
    public Cidade buscar(int id) throws SQLException{
        
       return dao.buscarCidadePorId(id);
    }  
    
    public ArrayList consultarTodos()throws SQLException{
       return dao.consultarTodos();
    }
    public ArrayList buscarCidadePorEstado(int id)throws SQLException{
       return dao.buscarCidadePorEstado(id);
    }
}
