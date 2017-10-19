/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unioeste.geral.bo.hospital;


import java.io.Serializable;
import unioeste.geral.bo.endereco.Bairro;
import unioeste.geral.bo.endereco.Cidade;
import unioeste.geral.bo.pessoa.Email;
import unioeste.geral.bo.pessoa.Telefone;
import unioeste.geral.bo.endereco.Endereco;
import unioeste.geral.bo.endereco.Estado;
import unioeste.geral.bo.endereco.Pais;
import unioeste.geral.bo.endereco.Rua;
import unioeste.geral.bo.pessoajuridica.PessoaJuridica;


/**
 *
 * @author cristopher
 */
public class Hospital extends PessoaJuridica implements Serializable{
   
    int CNPJ;
    String nomeFantasia;
    Email[] email;
    Telefone[] telefone;  
    Endereco endereco;
    Bairro bairro;
    Rua rua;
    Estado unidadeFederativa;
    Cidade Cidade;
    Pais pais;

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public Rua getRua() {
        return rua;
    }

    public void setRua(Rua rua) {
        this.rua = rua;
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
       

    public int getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(int CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
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
    
    
}
