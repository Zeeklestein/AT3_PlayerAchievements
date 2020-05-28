package at3.playerachievements;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
    
    ServerSocket serverSocket;
    Socket socket;
    ObjectInputStream inStream;
    
    
    public ArrayList<Player> receivePlayers() throws IOException
    {
        ArrayList<Player> playersArray = new ArrayList<Player>();
        serverSocket = new ServerSocket(4445);
        
        while(true)
        {
            socket = serverSocket.accept();
            inStream = new ObjectInputStream(socket.getInputStream());
            Player player = new Player();
            if(player == null)
            {
                break;
            }
            else
            {
                playersArray.add(player);
            }
        }
        serverSocket.close();
        return playersArray;        
    }

    public static void main(String[] args) throws IOException {
       
        ArrayList<Player> players;
        Server server = new Server();
        players = server.receivePlayers();
        for(Player player : players)
        {
            System.out.println("Username: " + player.getUsername() + " Tagname: " + player.getTagname());
        }
        
    }
    
}
