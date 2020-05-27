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
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;


public class PdfGenerator {
    
    public void generatePdf() 
    {
        try {
            PDDocument playerAchievementPdf = new PDDocument();
            
            //for loop to add 3 pages
            for (int i = 0; i<3; i++)
            {
                PDPage newPage = new PDPage();
                playerAchievementPdf.addPage(newPage);
            }
            String testWords = "Hi. This is test sentence.";
            //add player 1 to first page
            PDPage page1 = playerAchievementPdf.getPage(1);
            PDPageContentStream contentStream = new PDPageContentStream(playerAchievementPdf, page1);
            contentStream.beginText();
            contentStream.showText(testWords);
            contentStream.endText();
            
            //Save the document
            playerAchievementPdf.save("C:/Users/Ben/Desktop/GitGub Projects/AT3_PlayerAchievements/testpdf.pdf");
            playerAchievementPdf.close();
        } catch (IOException ex) {
            Logger.getLogger(PdfGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
