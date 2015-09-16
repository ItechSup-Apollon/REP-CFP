/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.RepertoireDeContact.source;

import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author cfricaud
 */
public class Contact {
    //attributs
        private String SNom;
        private String SPrenom;
	private String SNum;
	private String SMail;
        private FichierXML Fxml;
            
	//---------------------
       
   public Contact(){
         
   }
        

        
 public void EnregistrerContact(String SEnrNom, String SEnrPrenom, String SEnrNum, String SEnrMail){
   
    
    setSNom(SEnrNom);
    setSPrenom(SEnrPrenom);
    setSNum(SEnrNum);
    setSMail(SEnrMail);
  
    } 
    public String getSNom() {
        return SNom;
    }

    public void setSNom(String SNom) {
        this.SNom = SNom;
    }

    public String getSPrenom() {
        return SPrenom;
    }

    public void setSPrenom(String SPrenom) {
        this.SPrenom = SPrenom;
    }

    public String getSNum() {
        return SNum;
    }

    public void setSNum(String SNum) {
        this.SNum = SNum;
    }

    public String getSMail() {
        return SMail;
    }

    public void setSMail(String SMail) {
        this.SMail = SMail;
    }
        
        

	
	

    
}
