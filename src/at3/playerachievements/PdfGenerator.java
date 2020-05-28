/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at3.playerachievements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;


public class PdfGenerator {
    
    String pdfFilePath;
    String at3csvFile;
    
    public void saveFilePath(String filePath)
    {
        pdfFilePath = filePath;
    }
    
    public void filePath (String filePath)
    {
        at3csvFile = filePath;
    }
    
    public void generatePdf(int player) 
    {
        try {
            //uses pdfbox-2.0.19.jar
            PDDocument playerAchievementPdf = new PDDocument();
            ReadData readData = new ReadData();
            Achievement newAchievement = new Achievement();
            Player newPlayer = new Player();
            readData.filePath(at3csvFile);
            newPlayer = readData.readFilePlayers(player);
            
            //get user specified achievements  
            ArrayList<Achievement> playerAchievements = new ArrayList<Achievement>();
            ArrayList<Achievement> specificPlayerAchievements = new ArrayList<Achievement>();
            playerAchievements = readData.readFileAchievements();
        
            //gets the specific achievements of the user specified player id
            for(var newAchivement : playerAchievements)
            {
                if (newAchivement.getPlayerId() == player)
                {
                specificPlayerAchievements.add(newAchivement);
                }
            }

            //add 1 page to the pdf
            PDPage newPage = new PDPage();
            playerAchievementPdf.addPage(newPage);
            
            
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
            
            contentStream.showText("Player: ");
            contentStream.newLine();
            contentStream.showText("  Username: " + newPlayer.getUsername());
            contentStream.newLine();
            contentStream.showText("  Tagname: " + newPlayer.getTagname());
            contentStream.newLine();
            
            for(var achievement : specificPlayerAchievements)
            {
                contentStream.newLine();
                contentStream.showText("Achievement:");
                contentStream.newLine();
                contentStream.showText("  Description: " + achievement.getDescription());
                contentStream.newLine();
                contentStream.showText("  Level: " + achievement.getLevel());
                contentStream.newLine();
                contentStream.showText("  Maximum: " + achievement.getMaximum());
                contentStream.newLine();
            }
            
            contentStream.endText();
            contentStream.close();
            
            //Save the document
            playerAchievementPdf.save(pdfFilePath);
            playerAchievementPdf.close();
            
            JOptionPane.showMessageDialog(null , "Success");
            
        } catch (IOException ex) {
            Logger.getLogger(PdfGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
