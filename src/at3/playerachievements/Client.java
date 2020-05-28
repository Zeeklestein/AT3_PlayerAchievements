/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at3.playerachievements;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 * @author Ben
 */
public class Client {

    Socket socket;
    ObjectOutputStream outputStream;
    
    public void sendPlayer(Player player) throws IOException
    {
        socket = new Socket("local", 4445);
        outputStream = new ObjectOutputStream(socket.getOutputStream());
        outputStream.writeObject(player);
        outputStream.flush();
        outputStream.close();
    }
    
    public void main(String[] args) throws IOException {
        
        ReadData readData = new ReadData();
        readData.filePath("/Users/Ben/Desktop/GitGub Projects/AT3_PlayerAchievements/AT3CSV");
        Player newPlayer = new Player();
        
        newPlayer = readData.readFilePlayers(1);
        sendPlayer(newPlayer);
        newPlayer = readData.readFilePlayers(2);
        sendPlayer(newPlayer);
        newPlayer = readData.readFilePlayers(3);
        sendPlayer(newPlayer);
        
        sendPlayer(null);
    }
    
}
