/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UCEnderecoGeralServicos;

import java.sql.SQLException;
import unioeste.apoio.bd.DaoEstado;
import unioeste.geral.bo.endereco.Estado;
import java.util.ArrayList;

/**
 *
 * @author renan
 */
public class ControllerEstado {
    DaoEstado dao = new DaoEstado();
    public Estado buscar(int id) throws SQLException{  
       return dao.buscarEstadoPorId(id);
    }  
    
    public ArrayList buscarEstadoPorPais(int id)throws SQLException{
       return dao.buscarEstadoPorPais(id);
    }
    
    public ArrayList consultarTodos()throws SQLException{
       return dao.consultarTodos();
    }
    
}
