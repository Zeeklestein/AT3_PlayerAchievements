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
        //gets the file path to save the PDF.
        pdfFilePath = filePath;
    }
    
    public void filePath (String filePath)
    {
        //gets the file path of the .CSV file.
        at3csvFile = filePath;
    }
    
    public void generatePdf(int player) 
    {
        try {
            //uses pdfbox-2.0.19.jar and commons-logging-1.2.jar.
            //pdfbox documentation: https://pdfbox.apache.org/2.0/getting-started.html
            //commons-logging documentation: http://commons.apache.org/proper/commons-logging/guide.html
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
            
            //setting contentStream font. Uses fontbox-2.0.19.jar.
            //fontbox documentation: refer to pdfbox documention.
             contentStream.setFont( PDType1Font.TIMES_ROMAN, 16 );
       
            //Set leading
            contentStream.setLeading(15f);

            //set line position.
            contentStream.newLineAtOffset(25, 725);
            
            //Writes each player and formatting.
            contentStream.showText("Player: ");
            contentStream.newLine();
            contentStream.showText("  Username: " + newPlayer.getUsername());
            contentStream.newLine();
            contentStream.showText("  Tagname: " + newPlayer.getTagname());
            contentStream.newLine();
            
            //Writes each achievement for each player.
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
            
            //Show a dialog box when done.
            JOptionPane.showMessageDialog(null , "Success");
            
        } catch (IOException ex) {
            Logger.getLogger(PdfGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
