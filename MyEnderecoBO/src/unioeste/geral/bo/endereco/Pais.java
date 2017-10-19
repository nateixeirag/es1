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

/**Classe de negócio Pais.
 * 
 * Classe de negócio da entidade serializada pais, contem os getters e setters 
 * necessários para operações utilizando objetos instanciados desta classe.
 * Quaisquer modificações nesta classe exigem a alteração do serialVersionUID.
 *
 * @author Cristopher
 * @author Natalia
 * 
 */
public class Pais implements Serializable{

    private static final long serialVersionUID = -4210861299348759552L;
    private int idpais;
    private String pais;

    /**Construtor da classe Pais.
     * 
     * Construtor utilizando todos os parametos modificaveis da classe Pais.
     *
     * @param idpais 
     * @param pais 
     * 
     */
    public Pais(int idpais, String pais) {
        this.idpais = idpais;
        this.pais = pais;
    }

    /**Construtor da classe pais.
     * 
     * Construtorda classe pais sem o uso dos parametros da classe.
     *
     */
    
    public Pais() {
    }
    
    /**Getter do parametro idpais.
     * 
     * @return o id do pais
     * 
     */
    
    public int getIdpais() {
        return idpais;
    }

    /**Setter do parametro pais.
     * 
     * @return o pais armazenado
     * 
     */
    
    public String getPais() {
        return pais;
    }

    /**Setter do parãmetro pais
     * 
     * @param pais o pais a ser armazenado.
     * 
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

     /**Setter do parâmetro idpais
     * 
     * @param idpais
     * 
     */
    
    public void setIdpais(int idpais) {
        this.idpais = idpais;
    }

   
}
