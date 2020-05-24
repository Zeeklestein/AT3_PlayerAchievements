/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at3.playerachievements;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.pdfbox.pdmodel.PDDocument;


public class PdfGenerator {
    
    public void generatePdf() 
    {
        try {
            PDDocument doc = new PDDocument();
            doc.save("C:/Users/Ben/Desktop/GitGub Projects/Java-AT3-NetbeansVer/testPdf");
            doc.close();
        } catch (IOException ex) {
            Logger.getLogger(PdfGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
