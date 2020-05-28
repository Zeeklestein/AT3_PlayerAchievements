package at3.playerachievements;

import java.awt.Component;
import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class PlayerAchievements extends javax.swing.JFrame {

    public PlayerAchievements() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAchievementData = new javax.swing.JTable();
        lblPlayerInfo = new javax.swing.JLabel();
        btnDisplay = new javax.swing.JButton();
        lblPlayerId = new javax.swing.JLabel();
        spinnerPlayerId = new javax.swing.JSpinner();
        txtFilePath = new javax.swing.JTextField();
        lblFilePath = new javax.swing.JLabel();
        btnOrderDescription = new javax.swing.JButton();
        btnOrderLevel = new javax.swing.JButton();
        lblOrderBy = new javax.swing.JLabel();
        btnSavePlayerPdf = new javax.swing.JButton();
        btnPathBrowse = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jTableAchievementData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Description", "Level", "Out of Possible"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableAchievementData);
        if (jTableAchievementData.getColumnModel().getColumnCount() > 0) {
            jTableAchievementData.getColumnModel().getColumn(0).setResizable(false);
            jTableAchievementData.getColumnModel().getColumn(1).setResizable(false);
            jTableAchievementData.getColumnModel().getColumn(2).setResizable(false);
        }

        btnDisplay.setText("Display");
        btnDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayActionPerformed(evt);
            }
        });

        lblPlayerId.setText("Enter Player ID:");

        lblFilePath.setText("CVS File Path:");

        btnOrderDescription.setText("Description");
        btnOrderDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderDescriptionActionPerformed(evt);
            }
        });

        btnOrderLevel.setText("Level");
        btnOrderLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderLevelActionPerformed(evt);
            }
        });

        lblOrderBy.setText("Order By:");

        btnSavePlayerPdf.setText("Save Player to PDF");
        btnSavePlayerPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSavePlayerPdfActionPerformed(evt);
            }
        });

        btnPathBrowse.setText("Browse");
        btnPathBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPathBrowseActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel1.setText("Search for Achievement: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPlayerInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnSavePlayerPdf)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblFilePath)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnPathBrowse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnSearch))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblPlayerId)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(spinnerPlayerId, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(95, 95, 95)
                                    .addComponent(lblOrderBy)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnOrderDescription)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnOrderLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 30, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFilePath)
                    .addComponent(btnPathBrowse))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlayerId)
                    .addComponent(spinnerPlayerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOrderDescription)
                    .addComponent(btnOrderLevel)
                    .addComponent(lblOrderBy))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPlayerInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnDisplay)
                    .addComponent(btnSavePlayerPdf))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        
    
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        //exits the program
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    
    
    private void btnDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayActionPerformed

        //creates a new readDAta object
        ReadData readData = new ReadData();
            
        //gets the csv file path from the text box
        //TODO add select file path dialog
        readData.filePath(txtFilePath.getText());
        
        //gets the value from the spinner
        int playerId = (Integer) spinnerPlayerId.getValue();
            
        //read player data and display player info in a label with current time and date
        Player player = new Player();
        player = readData.readFilePlayers(playerId);
        
        //create a datetimeformatter object
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/YY HH:mm:ss");  
        LocalDateTime currentDateTime = LocalDateTime.now();  
        
        //displays player associated with achivements and the current datetime
        lblPlayerInfo.setText("Achivements of " + player.getUsername() + " at " + dtf.format(currentDateTime));
        
        //setPlayerTable(playerId);
        
        //creates a new achievement object
        Achievement newAchievement = new Achievement();        
        ArrayList<Achievement> playerAchievements = new ArrayList<Achievement>();
        ArrayList<Achievement> specificPlayerAchievements = new ArrayList<Achievement>();
        playerAchievements = readData.readFileAchievements();
        
        //gets the specific achievements of the user specified player id from the spinner
        for(var newAchivement : playerAchievements)
        {
            if (newAchivement.getPlayerId() == playerId)
            {
            specificPlayerAchievements.add(newAchivement);
            }
        }
        
        //display specified player's achievements in jtable
        AchievementTableModel achievementModel = new AchievementTableModel(specificPlayerAchievements);
        jTableAchievementData.setModel(achievementModel);       
    }//GEN-LAST:event_btnDisplayActionPerformed

    private void btnOrderDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderDescriptionActionPerformed
        //order rows by column index
        orderBy(0);
    }//GEN-LAST:event_btnOrderDescriptionActionPerformed
 
    private void btnOrderLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderLevelActionPerformed
        //order rows by column index
        orderBy(1);
    }//GEN-LAST:event_btnOrderLevelActionPerformed

    private void btnSavePlayerPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavePlayerPdfActionPerformed
        int playerId = (Integer) spinnerPlayerId.getValue();
        
        PdfGenerator pdfGenerator = new PdfGenerator();
        pdfGenerator.filePath(txtFilePath.getText());

        JFileChooser chooser=new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.APPROVE_OPTION);
        chooser.showSaveDialog(null);

        String path = chooser.getSelectedFile().getAbsolutePath();
        //String filename = chooser.getSelectedFile().getName();

        pdfGenerator.saveFilePath(path + ".pdf");
        pdfGenerator.generatePdf(playerId);
 
    }//GEN-LAST:event_btnSavePlayerPdfActionPerformed

    private void btnPathBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPathBrowseActionPerformed
        JFileChooser chooser=new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        chooser.showOpenDialog(null);

        txtFilePath.setText(chooser.getSelectedFile().getAbsolutePath());
    }//GEN-LAST:event_btnPathBrowseActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        
        String userSearch = txtSearch.getText();
        int playerId = (Integer) spinnerPlayerId.getValue();
        
        ReadData readData = new ReadData();
        readData.filePath(txtFilePath.getText());
        ArrayList<Achievement> achievementsArray = readData.readFileAchievements();
        ArrayList<Achievement> foundAch = new ArrayList<>();
        for(Achievement ach : achievementsArray)
        {
            if(ach.getPlayerId() == playerId && ach.getDescription().equals(userSearch))
            {
                foundAch.add(ach);
            } 
        }
        AchievementTableModel achievementModel = new AchievementTableModel(foundAch);
        jTableAchievementData.setModel(achievementModel);
           
    }//GEN-LAST:event_btnSearchActionPerformed

    
    //orders a row by specified column index
    public void orderBy(int rowIndex)
    {
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(jTableAchievementData.getModel());
        jTableAchievementData.setRowSorter(sorter);
        List<RowSorter.SortKey> sortKeys = new ArrayList<>();
 
        int columnIndexToSort = rowIndex;
        sortKeys.add(new RowSorter.SortKey(columnIndexToSort, SortOrder.ASCENDING));
 
        sorter.setSortKeys(sortKeys);
        sorter.sort();
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PlayerAchievements.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayerAchievements.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayerAchievements.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayerAchievements.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayerAchievements().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDisplay;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnOrderDescription;
    private javax.swing.JButton btnOrderLevel;
    private javax.swing.JButton btnPathBrowse;
    private javax.swing.JButton btnSavePlayerPdf;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAchievementData;
    private javax.swing.JLabel lblFilePath;
    private javax.swing.JLabel lblOrderBy;
    private javax.swing.JLabel lblPlayerId;
    private javax.swing.JLabel lblPlayerInfo;
    private javax.swing.JSpinner spinnerPlayerId;
    private javax.swing.JTextField txtFilePath;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
