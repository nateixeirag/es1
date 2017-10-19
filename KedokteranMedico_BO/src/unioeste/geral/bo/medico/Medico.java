/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unioeste.geral.bo.medico;

import java.util.Date;
import unioeste.geral.bo.endereco.Bairro;
import unioeste.geral.bo.endereco.Cidade;
import unioeste.geral.bo.endereco.Endereco;
import unioeste.geral.bo.endereco.Estado;
import unioeste.geral.bo.endereco.Pais;
import unioeste.geral.bo.endereco.Rua;
import unioeste.geral.bo.pessoa.CPF;
import unioeste.geral.bo.pessoa.Email;
import unioeste.geral.bo.pessoa.Sexo;
import unioeste.geral.bo.pessoa.Telefone;

/**
 *
 * @author cristopher
 */
public class Medico {
    String CRM;
    String primeiroNome;
    String ultimoNome;
    String nomeMeio;
    String nomeAbreviado;
    CPF CPF;
    Email[] email;
    Telefone[] telefone;
    Endereco endereco;
    Bairro bairro;
    Rua logradouro;
    Estado unidadeFederativa;
    Cidade Cidade;
    Pais pais;
     
    Date dataNascimento;
    Sexo sexo;
    EspecialidadeMedica especialidade;

    public CPF getCPF() {
        return CPF;
    }

    public void setCPF(CPF CPF) {
        this.CPF = CPF;
    }

    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public String getNomeMeio() {
        return nomeMeio;
    }

    public void setNomeMeio(String nomeMeio) {
        this.nomeMeio = nomeMeio;
    }

    public String getNomeAbreviado() {
        return nomeAbreviado;
    }

    public void setNomeAbreviado(String nomeAbreviado) {
        this.nomeAbreviado = nomeAbreviado;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public EspecialidadeMedica getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(EspecialidadeMedica especialidade) {
        this.especialidade = especialidade;
    }

    public Email[] getEmail() {
        return email;
    }

    public void setEmail(Email[] email) {
        this.email = email;
    }

    public Telefone[] getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone[] telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public Rua getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(Rua logradouro) {
        this.logradouro = logradouro;
    }

    public Estado getUnidadeFederativa() {
        return unidadeFederativa;
    }

    public void setUnidadeFederativa(Estado unidadeFederativa) {
        this.unidadeFederativa = unidadeFederativa;
    }

  

    public Cidade getCidade() {
        return Cidade;
    }

    public void setCidade(Cidade Cidade) {
        this.Cidade = Cidade;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
   
    
}
