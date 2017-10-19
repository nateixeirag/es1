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

/**Classe de negócio Estado.
 * 
 * Classe de negócio da entidade serializada estado, contem os getters e setters 
 * necessários para operações utilizando objetos instanciados desta classe.
 * Quaisquer modificações nesta classe exigem a alteração do serialVersionUID.
 *
 * @author Cristopher
 * @author Natalia
 * 
 */
public class Estado implements Serializable {

    private static final long serialVersionUID = -5113809963022565596L;
    private int idestado;
    private String estado;
    private int idpais;
  
    /**Construtor da classe Estado.
     * 
     * Construtor utilizando todos os parametos modificaveis da classe Estado.
     *
     * @param idestado
     * @param estado 
     * @param idpais 
     * 
     */

    public Estado(int idestado, String estado, int idpais) {
        this.idestado = idestado;
        this.estado = estado;
        this.idpais = idpais;
    }
    
    /**Construtor da classe estado.
     * 
     * Construtorda classe cidade sem o uso dos parametros da classe.
     *
     */

    public Estado() {

    }
    
     /**Getter do parametro idestado.
     * 
     * @return o id do estado
     * 
     */
    public int getIdestado() {
        return idestado;
    }

    /**Setter do parametro idestado.
     * 
     * @param idestado o id do estado a ser armazenado
     * 
     */
    public void setIdestado(int idestado) {
        this.idestado = idestado;
    }

    /**Getter do parâmetro estado
     * 
     * @return o estado
     * 
     */
    public String getEstado() {
        return estado;
    }

    /**Setter do parâmetro estado.
     * 
     * @param estado o estado a ser armazenado.
     * 
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**Getter do parametro idpais.
     * 
     * @return o id do pais
     * 
     */
    public int getIdpais() {
        return idpais;
    }

    /**Setter do parametro idpais.
     * 
     * @param idpais
     * 
     */
    
    public void setIdpais(int idpais) {
        this.idpais = idpais;
    }
}
