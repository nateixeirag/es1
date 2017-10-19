/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unioeste.geral.medico.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import unioeste.apoio.bd.Conector;
import unioeste.geral.bo.endereco.Endereco;
import unioeste.geral.bo.medico.EspecialidadeMedica;
import unioeste.geral.bo.medico.Medico;
import unioeste.geral.bo.pessoa.CPF;
import unioeste.geral.bo.pessoa.Sexo;
/**
 *
 * @author cristopher
 */
public class MedicoDAOImpl {


    private Connection conexao;
    private java.sql.PreparedStatement statement;

    public void inserir(Medico objeto) {
        try {
            Conector conexaoDB = new Conector();
            conexao = conexaoDB.getCon();
            conexao.setAutoCommit(false);
            Endereco endereco = objeto.getEndereco();
            endereco.getNumeroEndereco();
            Sexo sexo = new Sexo ();
            sexo = objeto.getSexo();
            EspecialidadeMedica especialidade = new EspecialidadeMedica();
            especialidade = objeto.getEspecialidade();
            
            
 
           String sql = "INSERT Medico VALUES("+objeto.getCRM()+", '"
                    + objeto.getPrimeiroNome()+ ",'"
                    + objeto.getNomeMeio()+ ",'"
                    + objeto.getUltimoNome()+ ",'"
                      + objeto.getNomeAbreviado()+ ",'"
                      + objeto.getDataNascimento()+ ",'"
                      + especialidade.getIdEspecialidade()+ ",'"
                      + sexo.getIdSexo()+ ",'"
                      + objeto.getCPF()+ ",'"
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

    public void atualizar(Medico objeto){
        try {
            Conector conexaoDB = new Conector();
            conexao = conexaoDB.getCon();
            conexao.setAutoCommit(false);
            Endereco novo = objeto.getEndereco();
            novo.getNumeroEndereco();
            Sexo sexo = new Sexo ();
            sexo = objeto.getSexo();
            EspecialidadeMedica especialidade = new EspecialidadeMedica();
            especialidade = objeto.getEspecialidade();
            
            String sql = "UPDATE Medico SET "
                    +" primeiroNome=" + objeto.getPrimeiroNome()
                    +"nomeMeio="+objeto.getNomeMeio()
                    +"ultimoNome="+objeto.getUltimoNome()
                    +"nomeAbreviado="+objeto.getNomeAbreviado()
                    +"dataNascimento="+objeto.getDataNascimento()
                    +"idEspecialidadeMedica="+especialidade.getIdEspecialidade()
                    +"idSexo="+sexo.getIdSexo()
                    +"CPF="+objeto.getCPF()  
                    +"numeroEndereco="+novo.getNumeroEndereco()
                    +"complementoEndereco="+novo.getComplementoEndereco()
                    +"idEndereco="+novo.getIdEndereco()
                    
                    +" where CRM=" + objeto.getCRM();
            
            
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

    public void excluir(int id)throws Exception {
        try {
            Conector conexaoDB = new Conector();
            conexao = conexaoDB.getConnection();
            conexao.setAutoCommit(false);
            String sql = "DELETE FROM Medico WHERE CRM=?";
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

    public Medico consultar(Medico objeto) throws Exception {
        try {
            Conector conexaoDB = new Conector();
            conexao = conexaoDB.getConnection();
            conexao.setAutoCommit(false);
            String sql = "select * from Medico where CRM='" + objeto.getCRM()+ "'";
            
            
            statement = conexao.prepareStatement(sql);
            ResultSet resultado = statement.executeQuery();
            if (resultado.next()) {
                Medico obj = new Medico();
                obj.setCRM(resultado.getString("CRM"));
                obj.setPrimeiroNome(resultado.getString("primeiroNome"));
                obj.setNomeMeio(resultado.getString("nomeMeio"));
                obj.setUltimoNome(resultado.getString("ultimoNome"));
                obj.setDataNascimento(resultado.getDate("dataNascimento"));
                EspecialidadeMedica especialidadeMedica = new EspecialidadeMedica();
                especialidadeMedica.setIdEspecialidade(resultado.getInt("idEspecialidadeMedica"));
                obj.setEspecialidade(especialidadeMedica);
                Sexo sexo = new Sexo();
                sexo.setIdSexo(resultado.getInt("idSexo"));
                obj.setSexo(sexo);
                CPF cpf = new CPF();
                cpf.setNroCPFFormatado(resultado.getString("CPF"));
                obj.setCPF(cpf);
                Endereco endereco = new Endereco();
                endereco.setIdEndereco(resultado.getInt("idEndereco"));
                endereco.setNumeroEndereco(resultado.getInt("numeroEndereco"));
                endereco.setComplementoEndereco(resultado.getString("complementoEndereco"));
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

    public Medico consultar(int id) throws Exception{
        try {
            
            Conector conexaoDB = new Conector();
            conexao = conexaoDB.getConnection();
            conexao.setAutoCommit(false);
            
            String sql = "select * from Medico where CRM="+id+"";
            statement = conexao.prepareStatement(sql);
            ResultSet resultado = statement.executeQuery();
            if (resultado.next()) {
                Medico obj = new Medico();
                obj.setCRM(resultado.getString("CRM"));
                obj.setPrimeiroNome(resultado.getString("primeiroNome"));
                obj.setNomeMeio(resultado.getString("nomeMeio"));
                obj.setUltimoNome(resultado.getString("ultimoNome"));
                obj.setDataNascimento(resultado.getDate("dataNascimento"));
                EspecialidadeMedica especialidadeMedica = new EspecialidadeMedica();
                especialidadeMedica.setIdEspecialidade(resultado.getInt("idEspecialidadeMedica"));
                obj.setEspecialidade(especialidadeMedica);
                Sexo sexo = new Sexo();
                sexo.setIdSexo(resultado.getInt("idSexo"));
                obj.setSexo(sexo);
                CPF cpf = new CPF();
                cpf.setNroCPFFormatado(resultado.getString("CPF"));
                obj.setCPF(cpf);
                Endereco endereco = new Endereco();
                endereco.setIdEndereco(resultado.getInt("idEndereco"));
                endereco.setNumeroEndereco(resultado.getInt("numeroEndereco"));
                endereco.setComplementoEndereco(resultado.getString("complementoEndereco"));
                obj.setEndereco(endereco);
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
 
    public List<Medico> consultarTodos() throws Exception{
        try {
            Conector conexaoDB = new Conector();
            conexao = conexaoDB.getConnection();
            conexao.setAutoCommit(false);
            List<Medico> lista = new ArrayList<Medico>();
            String sql = "select * from tipoLogradouro";
            statement = conexao.prepareStatement(sql);
            ResultSet resultado = statement.executeQuery();
            while (resultado.next()) {
                   Medico obj = new Medico();
                obj.setCRM(resultado.getString("CRM"));
                obj.setPrimeiroNome(resultado.getString("primeiroNome"));
                obj.setNomeMeio(resultado.getString("nomeMeio"));
                obj.setUltimoNome(resultado.getString("ultimoNome"));
                obj.setDataNascimento(resultado.getDate("dataNascimento"));
                EspecialidadeMedica especialidadeMedica = new EspecialidadeMedica();
                especialidadeMedica.setIdEspecialidade(resultado.getInt("idEspecialidadeMedica"));
                obj.setEspecialidade(especialidadeMedica);
                Sexo sexo = new Sexo();
                sexo.setIdSexo(resultado.getInt("idSexo"));
                obj.setSexo(sexo);
                CPF cpf = new CPF();
                cpf.setNroCPFFormatado(resultado.getString("CPF"));
                obj.setCPF(cpf);
                Endereco endereco = new Endereco();
                endereco.setIdEndereco(resultado.getInt("idEndereco"));
                endereco.setNumeroEndereco(resultado.getInt("numeroEndereco"));
                endereco.setComplementoEndereco(resultado.getString("complementoEndereco"));
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

    





