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
import org.apache.pdfbox.pdmodel.font.PDType1Font;


public class PdfGenerator {
    
    String at3csvFile;
    
    public void filePath(String filePath)
    {
        at3csvFile = filePath;
    }
    
    public void generatePdf() 
    {
        try {
            PDDocument playerAchievementPdf = new PDDocument();
            ReadData readData = new ReadData();
            Achievement newAchievement = new Achievement();
            Player newPlayer = new Player();
            readData.filePath(at3csvFile);
            newPlayer = readData.readFilePlayers(1);
            
            //for loop to add 3 pages
            for (int i = 0; i<3; i++)
            {
                PDPage newPage = new PDPage();
                playerAchievementPdf.addPage(newPage);
            }
            
            //add player 1 to first page
            PDPage page1 = playerAchievementPdf.getPage(0);
            PDPageContentStream contentStream = new PDPageContentStream(playerAchievementPdf, page1);
            
            
            contentStream.beginText();
            //Setting the font to the Content stream
             contentStream.setFont( PDType1Font.TIMES_ROMAN, 16 );
       
            //Setting the leading
            contentStream.setLeading(14.5f);

            //Setting the position for the line
            contentStream.newLineAtOffset(25, 725);
            
            
            contentStream.showText(newPlayer.getUsername() + "" + newPlayer.getTagname());
            
            
            
            contentStream.endText();
            contentStream.close();
            
            
            //Save the document
            playerAchievementPdf.save("C:/Users/Ben/Desktop/GitGub Projects/AT3_PlayerAchievements/testpdf.pdf");
            playerAchievementPdf.close();
        } catch (IOException ex) {
            Logger.getLogger(PdfGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
