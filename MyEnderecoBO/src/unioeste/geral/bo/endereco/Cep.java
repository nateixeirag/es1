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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**Classe de negócio Cep.
 * 
 * Classe de negócio da entidade serializada Cep, contem os getters e setters 
 * necessários para operações utilizando objetos instanciados desta classe.
 * Quaisquer modificações nesta classe exigem a alteração do serialVersionUID.
 *
 * @author Cristopher
 * @author Natalia
 */

public class Cep implements Serializable {
 
    
    
    private static final long serialVersionUID = 2839396732353382018L;
    private String cep;
    
    /**Construtor da classe Cep.
     * 
     * Construtor utilizando todos os parametos modificaveis da classe bairro.
     *
     * @param cep
     */
        
    public Cep(String cep) {
        this.cep = cep;
    }

    /**Construtor da classe Cep.
     * 
     * Construtorda classe cep sem o uso dos parametros da classe.
     *
     */
    
    public Cep() {
    }
     
    /**Getter do parametro cep.
     * 
     * @return o cep
     */
    
    public String getCep() {
        return cep;
    }

    /**Setter do parametro cep.
     * 
     * @param cep o cep a ser armazenado
     */
    public void setCep(String cep) {
        this.cep = cep;
    }
    
    /**Validador dos campos do cep.
     *
     * Função para validar os campos do cep.
     * 
     * @param cep
     * @return
     */
    
    public boolean validarCep(String cep){
        String padrao = "\\d{5}[-]\\d{3}";
        Pattern p = Pattern.compile(padrao);
        Matcher m2 = p.matcher(cep);
        if (m2.find()){
            System.out.println(" formado de cep válido");
            return true;
        }else {
            System.out.println("formato de cep inválido");
            return false;
        }
    }
    
}
