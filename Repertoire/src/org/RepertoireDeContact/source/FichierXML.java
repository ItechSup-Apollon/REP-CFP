/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.RepertoireDeContact.source;

import java.beans.Expression;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.util.*;
import java.io.*;
//import java.nio.CharBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.RepertoireDeContact.IHM.RepJFrame;
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
   FileInputStream FInS = null;
   FileOutputStream FOutS = null;

    public FichierXML(){
      try {
          FOutS = new FileOutputStream("config.xml",true);
          encoder = new XMLEncoder(new BufferedOutputStream(FOutS));
          FInS =  new FileInputStream("config.xml");
          decoder = new XMLDecoder(FInS);
      } catch (FileNotFoundException ex) {
          Logger.getLogger(FichierXML.class.getName()).log(Level.SEVERE, null, ex);
      }
        
     }
    
 

    public Contact affiche()
    { 
        ContactRep =(Contact) decoder.readObject();
    
        return ContactRep;        
    }

    public void enregistre(Contact ContactRep)
    {    
        encoder.writeExpression(null);
        encoder.writeObject(ContactRep);
        
        encoder.flush();
    }
          
}   