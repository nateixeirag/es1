/*
 * Copyright (C) 2017 cristopher
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package unioeste.geral.bo.endereco;

import java.io.Serializable;

/**Classe de negócio Endereco.
 * 
 * Classe de negócio da entidade serializada cidade, contem os getters e setters 
 * necessários para operações utilizando objetos instanciados desta classe.
 * Quaisquer modificações nesta classe exigem a alteração do serialVersionUID.
 *
 * @author Cristopher
 * @author Natalia
 */
public class Endereco implements Serializable {

    private static final long serialVersionUID = 7562339058924490713L;
    private int numero;
    private String cep;
    private String complemento;
    private int idrua;
    private int idbairro;
    private int idendereco;
    private int idcidade;

    /**Construtor da classe Endereco.
     * 
     * Construtor utilizando todos os parametos modificaveis da classe Endereco.
     *
     * @param idcidade
     * @param cep
     * @param complemento
     * @param idrua
     * @param idbairro
     * @param idendereco
     * @param idcidade
     * 
     */
    
    public Endereco(int numero, String cep, String complemento, int idrua, int idbairro, int idendereco, int idcidade) {
        this.numero = numero;
        this.cep = cep;
        this.complemento = complemento;
        this.idrua = idrua;
        this.idbairro = idbairro;
        this.idendereco = idendereco;
        this.idcidade = idcidade;
    }
    
     /**Construtor da classe Endereco.
     * 
     * Construtor vazio.  *
     * 
     */
    public Endereco() {
    }
    
    
    /**Getter do parâmetro numero.
     * 
     * @return o numero
     * 
     */
    public int getNumero() {
        return numero;
    }

    /**Setter do parâmetro numero.
     * 
     * @param numero o numero a ser armazenado
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**Getter do parâmetro cep.
     * 
     * @return o cep armazenado
     * 
     */
    
    public String getCep() {
        return cep;
    }

    /**Setter do paramêtro cep.
     * 
     * @param cep o cep a ser armazenado.
     * 
     */
    
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**Getter do paramêtro cep.
     * 
     * @return o complemento de um endereco.
     * 
     */
    
    public String getComplemento() {
        return complemento;
    }

    /**Setter do paramêtro complemento.
     * 
     * @param complemento o complemento a ser armazenado.
     * 
     */
    
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    /**Getter do paramêtro idRua.
     * 
     * @return o idrua armazenado.
     * 
     */
    
    public int getIdrua() {
        return idrua;
    }

    /**Setter do parâmetro idrua
     * 
     * @param idrua o idRua a ser armazenado
     * 
     */
    
    public void setIdrua(int idrua) {
        this.idrua = idrua;
    }

    /**Getter do parâmetro idbairro.
     * 
     * @return o idbairro
     * 
     */
    
    public int getIdbairro() {
        return idbairro;
    }

    /**Setter do parâmetro idbairro
     * 
     * @param idbairro o id do bairro a ser armazenado
     * 
     */
    
    public void setIdbairro(int idbairro) {
        this.idbairro = idbairro;
    }

    /**Getter do parâmetro idendereco
     * 
     * @return o id do endereco.
     */
    
    public int getIdendereco() {
        return idendereco;
    }

    /**Setter do parâmetro idendereco.
     * 
     * @param idendereco o endereco a ser armazenado.
     * 
     */
    
    public void setIdendereco(int idendereco) {
        this.idendereco = idendereco;
    }

    /**Getter do parâmetro idcidade
     * 
     * @return the idcidade
     * 
     */
    
    public int getIdcidade() {
        return idcidade;
    }

    /**Setter do parâmetro idcidade.
     * 
     * @param idcidade a cidade a ser armazenada.
     * 
     */
    
    public void setIdcidade(int idcidade) {
        this.idcidade = idcidade;
    }
        
    
    
}
