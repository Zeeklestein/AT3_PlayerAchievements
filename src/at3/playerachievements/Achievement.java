package at3.playerachievements;

import java.io.Serializable;

public class Achievement implements Serializable {

    private String description;
    private int level;
    private int maximum;
    private int playerId;
    private static final long serialVersionUID = 22L;

    public Achievement(String Description, int Level, int Maximum, int PlayerId)
    {
        this.description = Description;
        this.level = Level;
        this.maximum = Maximum;
        this.playerId = PlayerId;
    }
    
    public Achievement()
    {
        
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String Description) {
        this.description = Description;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int Level) {
        this.level = Level;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int Maximum) {
        this.maximum = Maximum;
    }

    public int getPlayerId(){
        return playerId;
    }

    public void setPlayerAcheivementId(int PlayerId) {
        this.playerId = PlayerId;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}
