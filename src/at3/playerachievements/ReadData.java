package at3.playerachievements;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ReadData {
    
    private String at3csvFile;
    
    //get file path
    public void filePath(String filePath)
    {
        at3csvFile = filePath;
    }

    //reads only the player lines from the .csv file
    public Player readFilePlayers(int playerId)
    {
        BufferedReader bufferedReader = null;
        String line = "";
        String csvSplitBy = ",";

        int playerIdCounter = 1;
        Player player = new Player();

        try {
            //read the csv file
            bufferedReader = new BufferedReader(new FileReader(at3csvFile));
            while ((line = bufferedReader.readLine()) != null) {
                String[] achievements = line.split(csvSplitBy);

                //output  players
                if (achievements[0].equals("Player")) {
                    //saves the player lines as a player object
                    Player newPlayer = new Player(achievements[1], achievements[2], playerIdCounter);
                    playerIdCounter++;
                    if(newPlayer.getPlayerId() == playerId)
                    {
                        player = newPlayer;
                    }
                }
            }
        }
        //catch exceptions
        catch (FileNotFoundException e) {
            //displays message dialog box with error
            JOptionPane.showMessageDialog(null ,"File Path not specified.");
        } catch (IOException e) {
            System.out.println(e);
        }
        //close bufferedReader
        finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }
        return player;
    }

    public ArrayList<Achievement> readFileAchievements()
    {
        BufferedReader bufferedReader = null;
        String line = "";
        String csvSplitBy = ",";

        int achievementCounter = 1;
        int playerIdAchievementCounter = 1;
        ArrayList<Achievement> achievementArrayList = new ArrayList<Achievement>();
        try {
            //read the csv file
            bufferedReader = new BufferedReader(new FileReader(at3csvFile));
            while ((line = bufferedReader.readLine()) != null) {
                String[] achievements = line.split(csvSplitBy);
                
                //output achievements
                if (achievements[0].equals("Achievement")) {
                    //save the achievement lines as an achievement object and adds them to an array list                  
                    achievementArrayList.add(new Achievement(achievements[1], Integer.parseInt(achievements[2]), Integer.parseInt(achievements[3]), playerIdAchievementCounter));

                    //Using counters to pair the player id with their achievements. This only works because each player
                    //has exactly 5 achievements in the csv file.
                    if (achievementCounter == 5) {
                        achievementCounter = 1;
                        playerIdAchievementCounter++;                       
                    }
                    else
                    {
                        achievementCounter++;
                    }
                }
            }
        }
        //catch exceptions
        catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
        //close bufferedReader
        finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }
        return achievementArrayList;
    }   
}
