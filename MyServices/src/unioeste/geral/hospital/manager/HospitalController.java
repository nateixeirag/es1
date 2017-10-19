/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unioeste.geral.hospital.manager;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import unioeste.geral.bo.hospital.Hospital;
import unioeste.geral.hospital.dao.HospitalDAOImpl;
import unioeste.geral.hospital.exception.HospitalException;

/**
 *
 * @author cristopher
 */
public class HospitalController {

    public HospitalController() {
    }
    
    
    public void cadastrarHospital(Hospital hospital) throws HospitalException {
      try{
           
           HospitalDAOImpl hospitalService = new HospitalDAOImpl();
           hospitalService.inserir(hospital);
           
    
        }catch(HospitalException ex){
         
            ex.getMessage();
        } catch (Exception ex) {
            Logger.getLogger(HospitalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public void alterarHospital(Hospital hospital)throws HospitalException {
        
        try {
            HospitalDAOImpl hospitalService = new HospitalDAOImpl();
            hospitalService.atualizar(hospital);

        }catch(Exception ex){

                   
        }
    }    
    public void removerHospital(Hospital hospital)throws HospitalException {
        
       try {
            HospitalDAOImpl hospitalService = new HospitalDAOImpl();
            hospitalService.atualizar(hospital);

        }catch(Exception ex){

                   
        }
    }    
           
            
    
    public void consultarHospital(Hospital hospital)throws HospitalException {
        
       try {
            HospitalDAOImpl hospitalService = new HospitalDAOImpl();
            hospitalService.consultar(hospital);

        }catch(Exception ex){

                   
        }
    }    
    
    public void consultarHospitalPorId(Hospital hospital)throws HospitalException{
           try {
            HospitalDAOImpl hospitalService = new HospitalDAOImpl();
            hospitalService.consultar(hospital.getCNPJ());

                   
        }catch(Exception ex){
        
        }
    }    
    
    public List<Hospital> consultarTodos()throws HospitalException{
        
        HospitalDAOImpl hospitalService = new HospitalDAOImpl();
        hospitalService.consultarTodos();
        return hospitalService.consultarTodos() ;
    }
    
}
    
    
    
    
    
