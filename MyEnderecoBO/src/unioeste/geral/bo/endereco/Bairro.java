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

/**Classe de negócio Bairro.
 * 
 * Classe de negócio da entidade serializada Bairro, contem os getters e setters 
 * necessários para operações utilizando objetos instanciados desta classe.
 * Quaisquer modificações nesta classe exigem a alteração do serialVersionUID.
 *
 * @author Cristopher
 * @author Natalia
 */

public class Bairro implements Serializable{
    
    private static final long serialVersionUID = -3715081124992841907L;
    private int idbairro;
    private String bairro;
    
    
    /**Construtor da classe Bairro.
     * 
     * Construtor utilizando todos os parametos modificaveis da classe bairro.
     *
     * @param idbairro
     * @param bairro
     */
    
    public Bairro(int idbairro, String bairro) {
        
        this.idbairro = idbairro;
        this.bairro = bairro;
        
    }
 
    /**Construtor da classe Bairro.
     * 
     * Construtorda classe bairro sem o uso dos parametros da classe.
     *
     */

    public Bairro() {
    }
    
  
    /**Getter do parametro idBairro
    *
    * @return o id do bairro
    */
    
    public int getIdbairro() {
        return idbairro;
    }

    /**Setter do parametro idBairro.
     * 
     * @param idbairro  o id do bairro a ser preenchido.
     */
    
    public void setIdbairro(int idbairro) {
        this.idbairro = idbairro;
    }

    /**Getter do parametro Bairro.
     * 
     * @return the bairro
     */
    
    public String getBairro() {
        return bairro;
    }

    /**Setter do parametro bairro.
     * 
     * @param bairro a string representando o nome de um bairro.
     */
    
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
}
