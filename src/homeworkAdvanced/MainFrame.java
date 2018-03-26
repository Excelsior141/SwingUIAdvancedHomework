package homeworkAdvanced;

import java.io.*;
import java.util.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class MainFrame extends javax.swing.JFrame 
{
    public MainFrame() 
    {
        initComponents();
        
        openHumanFiles = new Vector<HumanFile>();
        
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Zmoniu sarasas (.hdb)", humanFileExtension);
        fileChooser.setFileFilter(filter);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        scroll = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnCreate = new javax.swing.JButton();
        btnOpen = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        openHumanFilesView = new javax.swing.JComboBox<>();
        btnGenerate = new javax.swing.JButton();
        tfRandomCount = new javax.swing.JTextField();
        btnAddRow = new javax.swing.JButton();
        btnRemoveRow = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First name", "Last name", "Birth date", "Money", "Gender"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Double.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table.setEnabled(false);
        table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        scroll.setViewportView(table);

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
                updateView(evt);
            }
        });

        btnOpen.setText("Open");
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
                updateView(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
                updateView(evt);
            }
        });

        btnClose.setText("Close");
        btnClose.setEnabled(false);
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
                updateView(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.setEnabled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
                updateView(evt);
            }
        });

        openHumanFilesView.setEnabled(false);
        openHumanFilesView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateView(evt);
            }
        });

        btnGenerate.setText("Generate");
        btnGenerate.setEnabled(false);
        btnGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateActionPerformed(evt);
                updateView(evt);
            }
        });

        tfRandomCount.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfRandomCount.setEnabled(false);

        btnAddRow.setText("Add Row");
        btnAddRow.setEnabled(false);
        btnAddRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRowActionPerformed(evt);
            }
        });

        btnRemoveRow.setText("Remove Row");
        btnRemoveRow.setEnabled(false);
        btnRemoveRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveRowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCreate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnOpen)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnClose)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDelete))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAddRow)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRemoveRow)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGenerate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfRandomCount))
                            .addComponent(openHumanFilesView, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnOpen)
                    .addComponent(btnSave)
                    .addComponent(btnClose)
                    .addComponent(btnDelete)
                    .addComponent(openHumanFilesView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenerate)
                    .addComponent(tfRandomCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddRow)
                    .addComponent(btnRemoveRow))
                .addGap(26, 26, 26)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        int result = fileChooser.showDialog(this, "Create");
        
        if (result == JFileChooser.APPROVE_OPTION)
        {
            File selectedFile = fileChooser.getSelectedFile();
            
            try
            {
                if (!selectedFile.getName().contains("." + humanFileExtension))
                    selectedFile = new File(selectedFile.getAbsolutePath() + "." + humanFileExtension);
                
                boolean success = selectedFile.createNewFile();
                
                if (!success)
                {
                    int overwrite = JOptionPane.showConfirmDialog(this, selectedFile, "File already exists. Overwrite?", JOptionPane.YES_NO_OPTION);
                    
                    if (overwrite == JOptionPane.OK_OPTION)
                    {
                        try
                        {
                            System.gc();
                            selectedFile.delete();
                            selectedFile.createNewFile();
                            System.gc();
                            success = true;
                        }
                        catch (SecurityException e)
                        {
                            throw new IOException("Nepavyko perrasyti seno failo");                            
                        }
                    }
                }
                
                if (success)
                    openHumanFiles.add(new HumanFile(selectedFile));
            }
            catch (IOException e)
            {
                System.out.println("Ivyko klaida:" + e);
            }
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
        int result = fileChooser.showOpenDialog(this);
        
        if (result == JFileChooser.APPROVE_OPTION)
        {
            File selectedFile = fileChooser.getSelectedFile();
            openHumanFiles.add(new HumanFile(selectedFile));
        }
    }//GEN-LAST:event_btnOpenActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        int selectedIndex = openHumanFilesView.getSelectedIndex();

        if (openHumanFiles.size() > 0 && selectedIndex != -1)
        {
            HumanFile selectedFile = openHumanFiles.get(selectedIndex);
            selectedFile.clear();
            
            DefaultTableModel dm = (DefaultTableModel)table.getModel();
            
            for (int i = 0; i < dm.getRowCount(); ++i)
            {
                Object[] args = new Object[Human.Variables.values().length];
                
                for (int y = 0; y < Human.Variables.values().length; ++y)
                    args[y] = dm.getValueAt(i, y);
                
                String serializedObject = Human.getSerializedStringWithArgs(args);
                
                if (serializedObject != null)
                    selectedFile.addHuman(new Human(serializedObject));
            }
            
            openHumanFiles.get(selectedIndex).Save();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        openHumanFiles.removeElementAt(openHumanFilesView.getSelectedIndex());
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int selectedIndex = openHumanFilesView.getSelectedIndex();
        
        if (selectedIndex > 0)
        {
            try
            {
                openHumanFiles.get(selectedIndex).getFile().delete();
                openHumanFiles.removeElementAt(openHumanFilesView.getSelectedIndex());
                System.gc();
            }
            catch (SecurityException e)
            {
                System.out.println("Nepavyko istrinti failo:" + e);
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void updateView(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateView
        boolean filesAvailable = openHumanFiles.size() > 0;
        
        int selectedIndex = openHumanFilesView.getSelectedIndex();
        
        openHumanFilesView.removeAllItems();
        for (int i = 0; i < openHumanFiles.size(); ++i)
            openHumanFilesView.addItem(openHumanFiles.get(i).getFile().getName());
        
        if (selectedIndex == -1 && filesAvailable)
        {
            selectedIndex = 0;
            openHumanFilesView.setSelectedIndex(selectedIndex);
        }
        
        DefaultTableModel dm = (DefaultTableModel)table.getModel();
        while(dm.getRowCount() > 0)
            dm.removeRow(0);

        if (filesAvailable && selectedIndex >= 0)
        {
            Vector<Human> humans = openHumanFiles.get(selectedIndex).getHumans();
            
            if (humans.size() > 0)
            {
                for (int i = 0; i < humans.size(); ++i)
                {
                    Human human = humans.get(i);
                    Object[] args = new Object[Human.Variables.values().length];

                    args[Human.Variables.FirstName.ordinal()] = human.getFirstName();
                    args[Human.Variables.LastName.ordinal()] = human.getLastName();
                    args[Human.Variables.BirthDate.ordinal()] = human.getBirthDate();
                    args[Human.Variables.Money.ordinal()] = human.getMoney();
                    args[Human.Variables.Gender.ordinal()] = human.getGender();

                    dm.addRow(args);
                }
            }
        }
        
        btnClose.setEnabled(filesAvailable);
        btnDelete.setEnabled(filesAvailable);
        btnSave.setEnabled(filesAvailable);
        btnGenerate.setEnabled(filesAvailable);
        btnAddRow.setEnabled(filesAvailable);
        tfRandomCount.setEnabled(filesAvailable);
        openHumanFilesView.setEnabled(filesAvailable);
        table.setEnabled(filesAvailable);

        System.gc();
    }//GEN-LAST:event_updateView

    private void btnGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateActionPerformed
        int selectedIndex = openHumanFilesView.getSelectedIndex();
        
        if (selectedIndex >= 0)
        {
            try
            {
                int randomCount = Integer.parseInt(tfRandomCount.getText());
                
                for (int i = 0; i < randomCount; ++i)
                    openHumanFiles.get(selectedIndex).addHuman(HumanGenerator.Generate());
            }
            catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(this, e, "Nepavyko nuskaityti numerio", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnGenerateActionPerformed

    private void btnAddRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRowActionPerformed
        DefaultTableModel dm = (DefaultTableModel)table.getModel();
        dm.addRow((Object[])null);
    }//GEN-LAST:event_btnAddRowActionPerformed

    private void btnRemoveRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveRowActionPerformed
        DefaultTableModel dm = (DefaultTableModel)table.getModel();
        dm.removeRow(table.getSelectedRow());
        
        btnRemoveRow.setEnabled(table.getSelectedRow() >= 0);
    }//GEN-LAST:event_btnRemoveRowActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        btnRemoveRow.setEnabled(table.getSelectedRow() >= 0);
    }//GEN-LAST:event_tableMouseClicked

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(() -> { new MainFrame().setVisible(true); });
    }
    
    private static final String humanFileExtension = "hdb";
    private Vector<HumanFile> openHumanFiles;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddRow;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnGenerate;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnRemoveRow;
    private javax.swing.JButton btnSave;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JComboBox<String> openHumanFilesView;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTable table;
    private javax.swing.JTextField tfRandomCount;
    // End of variables declaration//GEN-END:variables
}
