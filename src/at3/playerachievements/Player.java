package at3.playerachievements;

public class Player {

    private String username;
    private String tagname;
    private int playerId;

    public Player(String Username, String Tagname, int PlayerId)
    {
        this.username = Username;
        this.tagname = Tagname;
        this.playerId = PlayerId;
    }

    public Player(){

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String Username) {
        this.username = Username;
    }

    public String getTagname(){
        return tagname;
    }

    public void setTagname(String Tagname){
        this.tagname = Tagname;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int PlayerId) {
        this.playerId = PlayerId;
    }
}
