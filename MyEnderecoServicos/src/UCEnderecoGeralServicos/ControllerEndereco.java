/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UCEnderecoGeralServicos;

import java.sql.SQLException;
import java.util.ArrayList;
import unioeste.apoio.bd.DaoEndereco;
import unioeste.geral.bo.endereco.Cep;
import unioeste.geral.bo.endereco.Endereco;

/**
 *
 * @author renan
 */
public class ControllerEndereco {
    DaoEndereco dao = new DaoEndereco();
    public void cadastrar(Endereco end) throws SQLException{
        System.out.println("controller");
        dao.cadastrarEndereco(end);
    }
    
    public ArrayList consultarPorCep(String cep) throws SQLException{
        
        System.out.println(cep);
        return dao.buscarEnderecoPorCEP(cep);
    }
    /*public Endereco consultarPorID(int id) throws SQLException{
        //System.out.println("UCEnderecoGeralServicos.ControllerEndereco.consultarPorCep()");
        System.out.println(id);
        return dao.buscarEnderecoPorId (id);
    }*/
    
    
    public void alterarEndereco(Endereco end) throws SQLException{
        dao.alterarEndereco(end);
    }
    
    public void excluir(int id) throws SQLException{
        dao.excluir(id);
    }

    
    /*public int retornarIdEndereco(Endereco end) throws SQLException{
        return dao.retornarIdEndereco(end); 
    }*/
 
 }
       
