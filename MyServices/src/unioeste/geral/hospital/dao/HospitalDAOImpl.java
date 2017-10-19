/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unioeste.geral.hospital.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import unioeste.apoio.bd.Conector;
import unioeste.geral.bo.endereco.Endereco;
import unioeste.geral.bo.medico.EspecialidadeMedica;
import unioeste.geral.bo.hospital.Hospital;
import unioeste.geral.bo.pessoa.CPF;
import unioeste.geral.bo.pessoa.Sexo;

/**
 *
 * @author cristopher
 */
public class HospitalDAOImpl {

  
    
   
    private Connection conexao;
    private java.sql.PreparedStatement statement;
 
   
    public void inserir(Hospital objeto) throws Exception {
        try {
            Conector conexaoDB = new Conector();
            conexao = conexaoDB.getCon();
            conexao.setAutoCommit(false);
            Endereco endereco = objeto.getEndereco();
            endereco.getNumeroEndereco();
            
            String sql = "INSERT Hospital VALUES("+objeto.getCNPJ()+", '"
                    + objeto.getNomeFantasia()+ ",'"
                    + endereco.getNumeroEndereco()+ ",'"
                    + endereco.getComplementoEndereco()+ ",'"
                    + endereco.getIdEndereco()+"'" + ")";
           
           
           
                 System.out.println(sql);
           
                statement = conexao.prepareStatement(sql);
                statement.executeUpdate();
        } catch (Exception ex) {
            try {
                conexao.rollback();
            } catch (Exception e) {
                System.out.println("Erro de conexão");
            }
            ex.printStackTrace();
            System.out.println("Erro de inserção");
        } finally {
            try {
                if (conexao != null) {
                    conexao.setAutoCommit(true);
                    statement.close();
                    conexao.close();
                }
            } catch (Exception ex) {
                System.out.println("Erro de consistencia");
            }
        }
    }

    public void atualizar(Hospital objeto) {
        try {
            Conector conexaoDB = new Conector();
            conexao = conexaoDB.getCon();
            conexao.setAutoCommit(false);
             Endereco endereco = objeto.getEndereco();
            endereco.getNumeroEndereco();
          String sql = "UPDATE Hospital SET "
                    +" nomeFantasia=" + objeto.getNomeFantasia()
                    +"numeroEndereco="+endereco.getNumeroEndereco()
                    +"complementoEndereco="+endereco.getComplementoEndereco()
                    +"idEndereco="+endereco.getIdEndereco()
                    +" where CRM=" + objeto.getCNPJ();
            
            statement = conexao.prepareStatement(sql);
          statement.executeUpdate();
        } catch (Exception ex) {
            try {
                conexao.rollback();
            } catch (Exception e) {
                System.out.println("Erro de conexão");
            }
            ex.printStackTrace();
            System.out.println("Erro de update");
        } finally {
            try {
                if (conexao != null) {
                    conexao.setAutoCommit(true);
                    statement.close();
                    conexao.close();
                }
            } catch (Exception ex) {
                System.out.println("Erro de consistencia");
            }
        }
    }

    public void excluir(int id) {
        try {
            Conector conexaoDB = new Conector();
            conexao = conexaoDB.getConnection();
            conexao.setAutoCommit(false);
            String sql = "DELETE FROM Hospital WHERE CNPJ=?";
            statement = conexao.prepareStatement(sql);
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (Exception ex) {
            try {
                conexao.rollback();
            } catch (Exception e) {
                System.out.println("Erro de conexão");
            }
            System.out.println("Erro de exclusão");
        } finally {
            try {
                if (conexao != null) {
                    conexao.setAutoCommit(true);
                    statement.close();
                    conexao.close();
                }
            } catch (Exception ex) {
                System.out.println("Erro de consistencia");
            }
        }
    }
 
    public Hospital consultar(Hospital objeto) throws Exception {
        try {
            Conector conexaoDB = new Conector();
            conexao = conexaoDB.getConnection();
            conexao.setAutoCommit(false);
            String sql = "select * from Hospital where CNPJ='" + objeto.getCNPJ()+ "'";
            
            
            statement = conexao.prepareStatement(sql);
            ResultSet resultado = statement.executeQuery();
            if (resultado.next()) {
                Hospital obj = new Hospital();
                obj.setCNPJ(resultado.getInt("CNPJ"));
                obj.setNomeFantasia(resultado.getString("nomeFantasia"));
                Endereco endereco = new Endereco();
                endereco.setNumeroEndereco(resultado.getInt("numeroEndereco"));
                endereco.setComplementoEndereco(resultado.getString("complementoEndereco"));
                endereco.setIdEndereco(resultado.getInt("idEndereco"));
                obj.setEndereco(endereco);
                
                return obj;
            }
        } catch (Exception ex) {
            try {
                conexao.rollback();
            } catch (Exception e) {
                System.out.println("Erro de conexão");
            }
            System.out.println("Erro de consulta");
            throw new Exception(ex);
        } finally {
            try {
                if (conexao != null) {
                    conexao.setAutoCommit(true);
                    statement.close();
                    conexao.close();
                }
            } catch (Exception ex) {
                System.out.println("Erro de consistencia");
            }
        }
        return null;
    }

    public Hospital consultar(int id) {
        try {
            
            Conector conexaoDB = new Conector();
            conexao = conexaoDB.getConnection();
            conexao.setAutoCommit(false);
            
            String sql = "select * from Medico where CRM="+id+"";
            statement = conexao.prepareStatement(sql);
            ResultSet resultado = statement.executeQuery();
            if (resultado.next()) {
                Hospital obj = new Hospital();
                obj.setCNPJ(resultado.getInt("CNPJ"));
                obj.setNomeFantasia(resultado.getString("nomeFantasia"));
                Endereco endereco = new Endereco();
                endereco.setNumeroEndereco(resultado.getInt("numeroEndereco"));
                endereco.setComplementoEndereco(resultado.getString("complementoEndereco"));
                endereco.setIdEndereco(resultado.getInt("idEndereco"));
                obj.setEndereco(endereco);
                
                return obj;
            }
        } catch (Exception ex) {
            try {
                conexao.rollback();
            } catch (Exception e) {
                System.out.println("Erro de conexão");
            }
            System.out.println("Erro de consulta");
        } finally {
            try {
                if (conexao != null) {
                    conexao.setAutoCommit(true);
                    statement.close();
                    conexao.close();
                }
            } catch (Exception ex) {
                System.out.println("Erro de consistencia");
            }
        }
        return null;
    }
 
    public List<Hospital> consultarTodos() {
        try {
            Conector conexaoDB = new Conector();
            conexao = conexaoDB.getConnection();
            conexao.setAutoCommit(false);
            List<Hospital> lista = new ArrayList<Hospital>();
            String sql = "select * from tipoLogradouro";
            statement = conexao.prepareStatement(sql);
            ResultSet resultado = statement.executeQuery();
            while (resultado.next()) {
                 Hospital obj = new Hospital();
                obj.setCNPJ(resultado.getInt("CNPJ"));
                obj.setNomeFantasia(resultado.getString("nomeFantasia"));
                Endereco endereco = new Endereco();
                endereco.setNumeroEndereco(resultado.getInt("numeroEndereco"));
                endereco.setComplementoEndereco(resultado.getString("complementoEndereco"));
                endereco.setIdEndereco(resultado.getInt("idEndereco"));
                obj.setEndereco(endereco);
                
            
             
                lista.add(obj);
            }
            return lista;
        } catch (Exception ex) {
            try {
                conexao.rollback();
            } catch (Exception e) {
                System.out.println("Erro de conexão");
            }
            System.out.println("Erro de consulta");
        } finally {
            try {
                if (conexao != null) {
                    conexao.setAutoCommit(true);
                    statement.close();
                    conexao.close();
                }
            } catch (Exception ex) {
                System.out.println("Erro de consistencia");
            }
        }
        return null;
    }
    
}
