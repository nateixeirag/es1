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

/**Classe de negócio Cidade.
 * 
 * Classe de negócio da entidade serializada cidade, contem os getters e setters 
 * necessários para operações utilizando objetos instanciados desta classe.
 * Quaisquer modificações nesta classe exigem a alteração do serialVersionUID.
 *
 * @author Cristopher
 * @author Natalia
 */
public class Cidade implements Serializable{

    private static final long serialVersionUID = 2593793060489092338L;
    private int idcidade;
    private String cidade;
    private int idestado;

    
    /**Construtor da classe Cidade.
     * 
     * Construtor utilizando todos os parametos modificaveis da classe Cidade.
     *
     * @param idcidade
     * @param cidade
     * @param idestado
     * 
     */
    
    public Cidade(int idcidade, String cidade, int idestado) {
        this.idcidade = idcidade;
        this.cidade = cidade;
        this.idestado = idestado;
    }
    
    /**Construtor da classe cidade.
     * 
     * Construtorda classe cidade sem o uso dos parametros da classe.
     *
     */

    public Cidade() {
    }
    
    /**Getter do parametro idcidade.
     * 
     * @return o id da cidade
     * 
     */
    public int getIdcidade() {
        return idcidade;
    }

    /**Setter do parametro idcidade.
     * 
     * @param idcidade o idcidade a ser armazenado
     * 
     */
    
    public void setIdcidade(int idcidade) {
        this.idcidade = idcidade;
    }

    /**Setter do parametro cidade
     * 
     * @return Uma string representando uma cidade
     * 
     */
    public String getCidade() {
        return cidade;
    }

    /**Setter do parametro cidade.
     * 
     * @param cidade uma cidade representada por meio de uma string a ser armazenada
     * 
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**Getter do parametro idestado.
     * 
     * @return o id de um estado
     */
    public int getIdestado() {
        return idestado;
    }

    /**Setter do parametro idestado
     * 
     * @param idestado o id de um estado a ser armazenado
     */
    public void setIdestado(int idestado) {
        this.idestado = idestado;
    }
    
}
