
package cyprusgui;

import client.ClientController;
import interfaces.PacketListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;
import renderers.JTableHeaderIconRenderer;
import support.Packet;
import support.Vehicle;
import tableModels.PendingVehicleDataModel;
import tableModels.RecentVehicleDataModel;
import tableModels.SearchVehicleDataModel;

/**
 *
 * @author James Sampica
 */
public class MainForm extends javax.swing.JFrame implements PacketListener {

    private PendingVehicleDataModel pendingModel;
    private RecentVehicleDataModel recentModel;
    private SearchVehicleDataModel searchModel;
    
    private TableRowSorter<PendingVehicleDataModel> pendingSorter;
    private TableRowSorter<RecentVehicleDataModel> recentSorter;
    
    /**
     * Creates new form MainForm
     */
    public MainForm() throws Exception {

        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        vehiclesPendingPanel = new javax.swing.JPanel();
        pendingFilterTextInput = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        pendingTable = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        pendingRefreshButton = new javax.swing.JButton();
        recentViolationsPanel = new javax.swing.JPanel();
        recentFilterTextInput = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        recentTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        recentRefreshButton = new javax.swing.JButton();
        searchPanel = new javax.swing.JPanel();
        searchButton = new javax.swing.JButton();
        searchTextInput = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        searchTable = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        exitMenuItem = new javax.swing.JMenuItem();
        settingsMenu = new javax.swing.JMenu();
        serverSettingsMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        helpMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();
        toolsMenu = new javax.swing.JMenu();
        datePassMenuItem = new javax.swing.JMenuItem();
        timePassMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CyPRUS");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTabbedPane2.setBackground(new java.awt.Color(88, 88, 88));
        jTabbedPane2.setFocusable(false);

        jScrollPane4.setBackground(new java.awt.Color(88, 88, 88));

        pendingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        pendingTable.setFocusable(false);
        pendingTable.setRowSelectionAllowed(false);
        pendingTable.getTableHeader().setResizingAllowed(false);
        pendingTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(pendingTable);

        jLabel11.setText("Filter:");

        pendingRefreshButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/refreshIcon.png"))); // NOI18N
        pendingRefreshButton.setToolTipText("Refresh");
        pendingRefreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pendingRefreshButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout vehiclesPendingPanelLayout = new javax.swing.GroupLayout(vehiclesPendingPanel);
        vehiclesPendingPanel.setLayout(vehiclesPendingPanelLayout);
        vehiclesPendingPanelLayout.setHorizontalGroup(
            vehiclesPendingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vehiclesPendingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pendingFilterTextInput, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 235, Short.MAX_VALUE)
                .addComponent(pendingRefreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        vehiclesPendingPanelLayout.setVerticalGroup(
            vehiclesPendingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vehiclesPendingPanelLayout.createSequentialGroup()
                .addGroup(vehiclesPendingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pendingRefreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vehiclesPendingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pendingFilterTextInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Vehicles Pending", vehiclesPendingPanel);

        recentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        recentTable.setFocusable(false);
        jScrollPane5.setViewportView(recentTable);

        jLabel1.setText("Filter:");

        recentRefreshButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/refreshIcon.png"))); // NOI18N
        recentRefreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recentRefreshButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout recentViolationsPanelLayout = new javax.swing.GroupLayout(recentViolationsPanel);
        recentViolationsPanel.setLayout(recentViolationsPanelLayout);
        recentViolationsPanelLayout.setHorizontalGroup(
            recentViolationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recentViolationsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recentFilterTextInput, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(recentRefreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
        );
        recentViolationsPanelLayout.setVerticalGroup(
            recentViolationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recentViolationsPanelLayout.createSequentialGroup()
                .addGroup(recentViolationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(recentRefreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, recentViolationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(recentFilterTextInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Recent Violations", recentViolationsPanel);

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        searchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(searchTable);

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchTextInput, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchButton)
                    .addComponent(searchTextInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        jTabbedPane2.addTab("Search Violations", searchPanel);

        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(88, 88, 88)));

        fileMenu.setText("File");
        fileMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        jMenuBar1.add(fileMenu);

        settingsMenu.setText("Settings");

        serverSettingsMenuItem.setText("Server Settings");
        serverSettingsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serverSettingsMenuItemActionPerformed(evt);
            }
        });
        settingsMenu.add(serverSettingsMenuItem);

        jMenuBar1.add(settingsMenu);

        helpMenu.setText("Help");

        helpMenuItem.setText("Help Contents");
        helpMenu.add(helpMenuItem);

        aboutMenuItem.setText("About");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        jMenuBar1.add(helpMenu);

        toolsMenu.setText("Tools");

        datePassMenuItem.setText("Enter Date Pass");
        datePassMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datePassMenuItemActionPerformed(evt);
            }
        });
        toolsMenu.add(datePassMenuItem);

        timePassMenuItem.setText("Enter Time Pass");
        timePassMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timePassMenuItemActionPerformed(evt);
            }
        });
        toolsMenu.add(timePassMenuItem);

        jMenuBar1.add(toolsMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-488)/2, (screenSize.height-577)/2, 488, 577);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        ClientController.disconnectClient();

        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        AboutForm aboutForm = new AboutForm(this, true);
        aboutForm.setVisible(true);
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void serverSettingsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serverSettingsMenuItemActionPerformed

        SettingsDialog settingsdialog = new SettingsDialog(this, true);
        settingsdialog.setVisible(true);

    }//GEN-LAST:event_serverSettingsMenuItemActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        ClientController.setupFromFileSettings();
        ClientController.registerDataListener(this);

        
        setupModels();
        setupStyling();
        setupPopups();
        setupSorters();

        ClientController.test();
        //ClientController.activeVehiclesRequest();
        //ClientController.recentVehiclesRequest();

    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ClientController.disconnectClient();
    }//GEN-LAST:event_formWindowClosing

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        
        if(!searchTextInput.getText().isEmpty()){
            ((SearchVehicleDataModel)searchTable.getModel()).clearData();
            ClientController.searchRequest(searchTextInput.getText());
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void pendingRefreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pendingRefreshButtonActionPerformed
        ((PendingVehicleDataModel)pendingTable.getModel()).clearData();
        ClientController.activeVehiclesRequest();
    }//GEN-LAST:event_pendingRefreshButtonActionPerformed

    private void recentRefreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recentRefreshButtonActionPerformed
        ((RecentVehicleDataModel)recentTable.getModel()).clearData();
        ClientController.recentVehiclesRequest();
    }//GEN-LAST:event_recentRefreshButtonActionPerformed

    private void datePassMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datePassMenuItemActionPerformed
        DatePassDialog dpd = new DatePassDialog(this, true);
        dpd.setVisible(true);
    }//GEN-LAST:event_datePassMenuItemActionPerformed

    private void timePassMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timePassMenuItemActionPerformed
        TimePassDialog tpd = new TimePassDialog(this, true);
        tpd.setVisible(true);
    }//GEN-LAST:event_timePassMenuItemActionPerformed

    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new MainForm().setVisible(true);
                } catch (Exception ex) {
                    //System.out.println(ex.getMessage());
                    java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, "Couldn''t Open Main Form: {0}", ex.getMessage());
                }
            }
        });
    }
    
    private void setPendingFilter() {
        RowFilter<PendingVehicleDataModel, Object> rf;
        
        //If current expression doesn't parse, don't update.
        try {
            rf = RowFilter.regexFilter(pendingFilterTextInput.getText(), 0, 1);
        } catch (java.util.regex.PatternSyntaxException e) {
            return;
        }
        pendingSorter.setRowFilter(rf);
    }
    
    private void setRecentFilter() {
        RowFilter<RecentVehicleDataModel, Object> rf;
        
        //If current expression doesn't parse, don't update.
        try {
            rf = RowFilter.regexFilter(recentFilterTextInput.getText(), 0, 1);
        } catch (java.util.regex.PatternSyntaxException e) {
            return;
        }
        recentSorter.setRowFilter(rf);
    }

    @Override
    public void onPacketReceived(final Packet packet) {

        //Let swing decide when to add to the table model
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Vehicle packetVehicle = (Vehicle) packet.getData();
                
                if(packetVehicle == null){
                    return;
                }
                
                if(packet.getCommand() == Packet.CapturedVehicleCommand){
                    //If the model doesnt contain it then its a new vehicle
                    if (!pendingModel.contains(packetVehicle)) {
                        pendingModel.addRow(packetVehicle);
                        pendingTable.addRowSelectionInterval(0, 0);
                    }
                    //If it does contain it then remove it from the list without violation
                    else{
                        pendingModel.removeRow(packetVehicle);
                    }
                }
                else if(packet.getCommand() == Packet.ActiveVehiclesCommand){
                    pendingModel.addRow(packetVehicle);
                }
                else if(packet.getCommand() == Packet.SearchCommand){
                    searchModel.addRow(packetVehicle);
                }
                else if(packet.getCommand() == Packet.RecentVehiclesCommand){
                    recentModel.addRow(packetVehicle);
                }
                
            }
        });


    }

    private void setupStyling(){
        
        ImageIcon plateIcon = new ImageIcon("./src/resources/plateIcon.png");
        ImageIcon lotIcon = new ImageIcon("./src/resources/lotIcon.png");
        ImageIcon timeIcon = new ImageIcon("./src/resources/timeIcon.png");
        ImageIcon violationIcon = new ImageIcon("./src/resources/violationIcon.png");
        ImageIcon dateIcon = new ImageIcon("./src/resources/dateIcon.png");
        
        JLabel plateLabel = new JLabel("", JLabel.CENTER);
        plateLabel.setIcon(plateIcon);
        plateLabel.setToolTipText("Plate Number");
        JLabel dateLabel = new JLabel("", JLabel.CENTER);
        dateLabel.setIcon(dateIcon);
        dateLabel.setToolTipText("Date of Entry");
        JLabel lotLabel = new JLabel("", JLabel.CENTER);
        lotLabel.setIcon(lotIcon);
        lotLabel.setToolTipText("Lot Number");
        JLabel timeLabel = new JLabel("", JLabel.CENTER);
        timeLabel.setIcon(timeIcon);
        timeLabel.setToolTipText("Time Remaining");
        JLabel violationLabel = new JLabel("", JLabel.CENTER);
        violationLabel.setIcon(violationIcon);
        violationLabel.setToolTipText("Date of Violation");

        plateLabel.setBorder(BorderFactory.createEtchedBorder());
        dateLabel.setBorder(BorderFactory.createEtchedBorder());
        lotLabel.setBorder(BorderFactory.createEtchedBorder());
        timeLabel.setBorder(BorderFactory.createEtchedBorder());
        violationLabel.setBorder(BorderFactory.createEtchedBorder());
        
        TableCellRenderer renderer = new JTableHeaderIconRenderer();

        TableColumnModel pendingColumnModel = pendingTable.getColumnModel();
        TableColumnModel recentColumnModel = recentTable.getColumnModel();
        TableColumnModel searchColumnModel = searchTable.getColumnModel();

        TableColumn pcolumn0 = pendingColumnModel.getColumn(0);
        TableColumn pcolumn1 = pendingColumnModel.getColumn(1);
        TableColumn pcolumn2 = pendingColumnModel.getColumn(2);
        TableColumn pcolumn3 = pendingColumnModel.getColumn(3);
        
        pcolumn0.setHeaderRenderer(renderer);
        pcolumn0.setHeaderValue(plateLabel);
        pcolumn1.setHeaderRenderer(renderer);
        pcolumn1.setHeaderValue(lotLabel);
        pcolumn2.setHeaderRenderer(renderer);
        pcolumn2.setHeaderValue(timeLabel);
        pcolumn3.setHeaderRenderer(renderer);
        pcolumn3.setHeaderValue(dateLabel);
        
        TableColumn rcolumn0 = recentColumnModel.getColumn(0);
        TableColumn rcolumn1 = recentColumnModel.getColumn(1);
        TableColumn rcolumn2 = recentColumnModel.getColumn(2);
        
        rcolumn0.setHeaderRenderer(renderer);
        rcolumn0.setHeaderValue(plateLabel);
        rcolumn1.setHeaderRenderer(renderer);
        rcolumn1.setHeaderValue(lotLabel);
        rcolumn2.setHeaderRenderer(renderer);
        rcolumn2.setHeaderValue(violationLabel);
        
        TableColumn scolumn0 = searchColumnModel.getColumn(0);
        TableColumn scolumn1 = searchColumnModel.getColumn(1);
        TableColumn scolumn2 = searchColumnModel.getColumn(2);
        
        scolumn0.setHeaderRenderer(renderer);
        scolumn0.setHeaderValue(plateLabel);
        scolumn1.setHeaderRenderer(renderer);
        scolumn1.setHeaderValue(lotLabel);
        scolumn2.setHeaderRenderer(renderer);
        scolumn2.setHeaderValue(violationLabel);
    }
    
    private void setupModels() {
        recentModel = new RecentVehicleDataModel();
        pendingModel = new PendingVehicleDataModel(recentModel);
        searchModel = new SearchVehicleDataModel();

        pendingTable.setModel(pendingModel);
        recentTable.setModel(recentModel);
        searchTable.setModel(searchModel);
        
        pendingTable.setShowVerticalLines(true);
        recentTable.setShowVerticalLines(true);
        searchTable.setShowVerticalLines(true);
    }

    private void setupSorters() {
        pendingSorter = new TableRowSorter(pendingModel);

        pendingTable.setRowSorter(pendingSorter);
        
        pendingFilterTextInput.getDocument().addDocumentListener(
                new DocumentListener() {
                    @Override
                    public void changedUpdate(DocumentEvent e) {
                        setPendingFilter();
                    }

                    @Override
                    public void insertUpdate(DocumentEvent e) {
                        setPendingFilter();
                    }

                    @Override
                    public void removeUpdate(DocumentEvent e) {
                        setPendingFilter();
                    }
                });
        
        recentSorter = new TableRowSorter(recentModel);

        recentTable.setRowSorter(recentSorter);
        
        recentFilterTextInput.getDocument().addDocumentListener(
                new DocumentListener() {
                    @Override
                    public void changedUpdate(DocumentEvent e) {
                        setRecentFilter();
                    }

                    @Override
                    public void insertUpdate(DocumentEvent e) {
                        setRecentFilter();
                    }

                    @Override
                    public void removeUpdate(DocumentEvent e) {
                        setRecentFilter();
                    }
                });
    }

    private void setupPopups() {
        
        searchButton.setMnemonic(KeyEvent.VK_ENTER);
        
        pendingTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                final int selectedRow = pendingTable.rowAtPoint(e.getPoint());

                //If selected row is legal and it's a popup trigger and clicking on table
                if ((selectedRow >= 0 && selectedRow < pendingTable.getRowCount())
                        && (e.isPopupTrigger() && e.getComponent() instanceof JTable)) {

                    //Make new popup
                    JPopupMenu popup = new JPopupMenu();
                    JMenuItem imageViewer = new JMenuItem("View Image");

                    //Add the click listener
                    imageViewer.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            //Open the viewer dialog on click
                            (new ImageViewerDialog(null, true, pendingModel.getRow(selectedRow))).setVisible(true);
                        }
                    });

                    //Add component
                    popup.add(imageViewer);

                    //Show popup
                    popup.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });
        
        recentTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                final int selectedRow = recentTable.rowAtPoint(e.getPoint());

                //If selected row is legal and it's a popup trigger and clicking on table
                if ((selectedRow >= 0 && selectedRow < recentTable.getRowCount())
                        && (e.isPopupTrigger() && e.getComponent() instanceof JTable)) {

                    //Make new popup
                    JPopupMenu popup = new JPopupMenu();
                    JMenuItem imageViewer = new JMenuItem("View Image");

                    //Add the click listener
                    imageViewer.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            //Open the viewer dialog on click
                            (new ImageViewerDialog(null, true, recentModel.getRow(selectedRow))).setVisible(true);
                        }
                    });

                    //Add component
                    popup.add(imageViewer);

                    //Show popup
                    popup.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });
        
        searchTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                final int selectedRow = searchTable.rowAtPoint(e.getPoint());

                //If selected row is legal and it's a popup trigger and clicking on table
                if ((selectedRow >= 0 && selectedRow < searchTable.getRowCount())
                        && (e.isPopupTrigger() && e.getComponent() instanceof JTable)) {

                    //Make new popup
                    JPopupMenu popup = new JPopupMenu();
                    JMenuItem imageViewer = new JMenuItem("View Image");

                    //Add the click listener
                    imageViewer.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            //Open the viewer dialog on click
                            (new ImageViewerDialog(null, true, searchModel.getRow(selectedRow))).setVisible(true);
                        }
                    });

                    //Add component
                    popup.add(imageViewer);

                    //Show popup
                    popup.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem datePassMenuItem;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem helpMenuItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField pendingFilterTextInput;
    private javax.swing.JButton pendingRefreshButton;
    private javax.swing.JTable pendingTable;
    private javax.swing.JTextField recentFilterTextInput;
    private javax.swing.JButton recentRefreshButton;
    private javax.swing.JTable recentTable;
    private javax.swing.JPanel recentViolationsPanel;
    private javax.swing.JButton searchButton;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JTable searchTable;
    private javax.swing.JTextField searchTextInput;
    private javax.swing.JMenuItem serverSettingsMenuItem;
    private javax.swing.JMenu settingsMenu;
    private javax.swing.JMenuItem timePassMenuItem;
    private javax.swing.JMenu toolsMenu;
    private javax.swing.JPanel vehiclesPendingPanel;
    // End of variables declaration//GEN-END:variables

    
}
