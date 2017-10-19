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

/**Classe de negócio Rua.
 * 
 * Classe de negócio da entidade serializada rua, contem os getters e setters 
 * necessários para operações utilizando objetos instanciados desta classe.
 * Quaisquer modificações nesta classe exigem a alteração do serialVersionUID.
 *
 * @author Cristopher
 * @author Natalia
 * 
 */

public class Rua implements Serializable {

    private static final long serialVersionUID = -345338501227573761L;
    
    private int idrua;
    private String rua;

    
    /**Construtor da classe Rua.
     * 
     * Construtor utilizando todos os parametos modificaveis da classe Rua.
     * 
     * 
     * @param idrua
     * @param rua
     * 
     */
    
    public Rua(int idrua, String rua) {
        this.idrua = idrua;
        this.rua = rua;
    }
    
    /**Construtor da classe Rua.
     * 
     * Construtor vazio.
     * 
     */
   
    public Rua() {
    }
    
    
    /**Getter do parâmetro idrua.
     * 
     * @return the idrua
     * 
     */
    public int getIdrua() {
        return idrua;
    }

    /**Setter do parâmetro idrua
     * 
     * @param idrua o id da rua a ser armazenado.
     * 
     */
    
    public void setIdrua(int idrua) {
        this.idrua = idrua;
    }

    /**Getter do parâmetro rua.
     * 
     * @return a rua armazenada
     * 
     */
    
    public String getRua() {
        return rua;
    }

    /**Setter do parâmetro rua.
     * 
     * @param rua a rua a ser armazenada.
     * 
     */
    
    public void setRua(String rua) {
        this.rua = rua;
    }
    
}
