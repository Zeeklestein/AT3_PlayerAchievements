package at3.playerachievements;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class AchievementTableModel extends AbstractTableModel{
       
    ArrayList<Achievement> arrayAchievements = new ArrayList<Achievement>();
    
    private String[] columnNames = {"Description", "Level", "Out of Possible"};
    
    private Class[] columnClasses = new Class[]{String.class, String.class, String.class};
    
    public AchievementTableModel(ArrayList<Achievement> achiList)
    {
        this.arrayAchievements = achiList;
    }
    
    public int getColumnCount()
    {
        return columnNames.length;
    }
    
    public int getRowCount()
    {
        return arrayAchievements.size();
    }
    
    public Object getValueAt(int row, int col)
    {
        Achievement newAchievement = (Achievement) arrayAchievements.get(row);
        switch(col)
        {
            case 0:
                return newAchievement.getDescription();
            case 1:
                return newAchievement.getLevel();
            case 2:
                return newAchievement.getMaximum();
            default:
                return null;
        }
    }
    
    public String getColumnName(int col)
    {
        return columnNames[col];
    }
    
    public Class getColumnClasses(int col)
    {
        return columnClasses[col];
    }
}
