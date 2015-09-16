

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.RepertoireDeContact.source;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.util.*;
import java.io.*;
//import java.nio.CharBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.RepertoireDeContact.IHM.RepJFrame;
import org.jdom2.*;
//import org.jdom2.output.*;
//import org.jdom2.output.Format;

/**
 *
 * @author cfricaud
 */
public class FichierXML {
 
  Contact ContactRep;
  XMLEncoder encoder = null;
  XMLDecoder decoder = null;
  

    public FichierXML(){
     
     }
    
 

public Contact affiche()
{
      try {
          decoder = new XMLDecoder(new FileInputStream("config.xml"));
          ContactRep =(Contact) decoder.readObject();
          return ContactRep;
      } catch (FileNotFoundException ex) {
          Logger.getLogger(FichierXML.class.getName()).log(Level.SEVERE, null, ex);
      }
      return null;
         
}

public void enregistre(Contact ContactRep)
{
   
       
      try {
          encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("config.xml",true)));
          encoder.writeObject(ContactRep);
          encoder.flush();
          
          encoder.close();
      } catch (FileNotFoundException ex) {
          Logger.getLogger(FichierXML.class.getName()).log(Level.SEVERE, null, ex);
      }
}
}   