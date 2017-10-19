/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myservices;

import unioeste.geral.bo.medico.Medico;
import unioeste.geral.medico.dao.MedicoDAOImpl;

/**
 *
 * @author cristopher
 */
public class MyServices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Medico medico = new Medico();
        MedicoDAOImpl dao = new MedicoDAOImpl();
        dao.inserir(medico);
    }
    
}
