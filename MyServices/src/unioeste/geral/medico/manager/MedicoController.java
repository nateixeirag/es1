/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unioeste.geral.medico.manager;

import java.util.List;
import unioeste.geral.bo.medico.Medico;
import unioeste.geral.hospital.dao.HospitalDAOImpl;
import unioeste.geral.medico.dao.MedicoDAOImpl;

/**
 *
 * @author cristopher
 */
public class MedicoController {
     
    
    public void cadastrarMedico(Medico medico){
      try{
           MedicoDAOImpl medicoService = new MedicoDAOImpl();
           medicoService.inserir(medico);
    
        }catch(Exception ex){
            System.out.println("Erro em cadastrar o medico!");
        }
    
    }
    
    public void alterarHospital(Medico medico){
        
        try {
            MedicoDAOImpl medicoService = new MedicoDAOImpl();
            medicoService.atualizar(medico);

        }catch(Exception ex){

                   
        }
    }    
    public void removerMedico(Medico medico){
        
       try {
            MedicoDAOImpl medicoService = new MedicoDAOImpl();
            medicoService.atualizar(medico);

        }catch(Exception ex){

                   
        }
    }    
           
            
    
    public void consultarMedico(Medico medico){
        
       try {
            MedicoDAOImpl medicoService = new MedicoDAOImpl();
            medicoService.consultar(medico);

        }catch(Exception ex){

                   
        }
    }    
    
    
    
    public List<Medico> consultarTodos() throws Exception{
        
        MedicoDAOImpl medicoService = new MedicoDAOImpl();
        
        return medicoService.consultarTodos();
    }
    
}
