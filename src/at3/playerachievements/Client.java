package at3.playerachievements;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client {

    Socket socket;
    ObjectOutputStream outputStream;
    
    public void sendPlayer(Player player) throws IOException
    {
        //Sends the player to the outputStream.
        socket = new Socket("localhost", 4445);
        outputStream = new ObjectOutputStream(socket.getOutputStream());
        outputStream.writeObject(player);
        outputStream.flush();
        outputStream.close();
    }
    
    public static void main(String[] args) throws IOException {
        
        ReadData readData = new ReadData();
        readData.filePath("../AT3_PlayerAchievements/AT3CSV.csv");
        Player newPlayer = new Player();
        Client client = new Client();
        
        //sends the players to the server.
        newPlayer = readData.readFilePlayers(1);
        client.sendPlayer(newPlayer);
        
        newPlayer = readData.readFilePlayers(2);
        client.sendPlayer(newPlayer);
        
        newPlayer = readData.readFilePlayers(3);
        client.sendPlayer(newPlayer);
        
        newPlayer = null;
        client.sendPlayer(newPlayer);
    }   
}
