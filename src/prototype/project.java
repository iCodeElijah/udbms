
package prototype;

import java.awt.print.PrinterException;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class project extends javax.swing.JFrame {

    Connection conn = null;

    PreparedStatement pst = null;

    ResultSet rs = null;

    Statement st;

    DefaultTableModel model = new DefaultTableModel ( new String[]{ "id" , "Asset" , "Manufacturer" , "Model" , "Serial No." , "Location" , "Maintenance Responsibility" , "Service Date" , "Next Service Date" , "Status Flag" } , 0 );

    public project () {

        initComponents ();

        this.setExtendedState ( MAXIMIZED_BOTH );

        conn = project.ConnectDb ();
        updateTable ();

    }

    private void updateTable () {

        try {

            String sql = "SELECT * FROM project";
            pst = conn.prepareStatement ( sql );
            rs = pst.executeQuery ();

            while ( rs.next () ) {

                String d = rs.getString ( "id" );
                String e = rs.getString ( "asset" );
                String f = rs.getString ( "manufacturer" );
                String g = rs.getString ( "model" );
                String h = rs.getString ( "serial" );
                String i = rs.getString ( "equipmentlocaion" );
                String j = rs.getString ( "maintenanceresponsibility" );
                String k = rs.getString ( "service" );
                String l = rs.getString ( "nextservice" );
                String m = rs.getString ( "statusflag" );
                model.addRow ( new Object[]{ d , e , f , g , h , i , j , k , l , m } );

            }

            jTabInfo.setModel ( model );

        }
        catch ( Exception e ) {

            JOptionPane.showMessageDialog ( null , e );

        }

    }

    @SuppressWarnings ( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonExit = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jButtonLogout = new javax.swing.JButton();
        jButtonInsert3 = new javax.swing.JButton();
        jButtonPrint = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaData = new javax.swing.JTextArea();
        jButtonSummary = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTabInfo = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabelOther_notes = new javax.swing.JLabel();
        jLabelEquipmentUsers = new javax.swing.JLabel();
        jTextFieldInstallationDate = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaoOther_notes = new javax.swing.JTextArea();
        jLabelNextMaintenance = new javax.swing.JLabel();
        jLabelAsof = new javax.swing.JLabel();
        jLabelWarrantyExpirationDate = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaoOther_notes1 = new javax.swing.JTextArea();
        jTextFieldService = new javax.swing.JTextField();
        jTextFieldNextService = new javax.swing.JTextField();
        jLabelStatusFlag = new javax.swing.JLabel();
        jTextFieldAsOf = new javax.swing.JTextField();
        jLabelMaintenance = new javax.swing.JLabel();
        jComboBoxEquipUsers = new javax.swing.JComboBox<>();
        jTextFieldAssetExpirationDate = new javax.swing.JTextField();
        jLabelAssetInstallationDate = new javax.swing.JLabel();
        jTextFieldWarrantyExpirationDate = new javax.swing.JTextField();
        jComboBoxStatusFlag = new javax.swing.JComboBox<>();
        jLabelInstallationDate = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabelSerialNo = new javax.swing.JLabel();
        jLabelAcquiredBy = new javax.swing.JLabel();
        jLabelEquipLocation = new javax.swing.JLabel();
        jTextFieldAsset = new javax.swing.JTextField();
        jTextFieldEquipLocation = new javax.swing.JTextField();
        jComboBoxPowerRecquirement = new javax.swing.JComboBox<>();
        jLabelPowerRecquirement = new javax.swing.JLabel();
        jComboBoxCountryOfOrigin = new javax.swing.JComboBox<>();
        jTextFieldAssetDescription = new javax.swing.JTextField();
        jTextFieldModelNu = new javax.swing.JTextField();
        jLabelMaintenanceResponsbility = new javax.swing.JLabel();
        jTextFieldMaintenanceResponsibility = new javax.swing.JTextField();
        jLabelModel = new javax.swing.JLabel();
        jTextFieldSerial = new javax.swing.JTextField();
        jLabelVender = new javax.swing.JLabel();
        jLabelEquipCountryofOrigin = new javax.swing.JLabel();
        jTextFieldVendor = new javax.swing.JTextField();
        jTextFieldYearOfManufacture = new javax.swing.JTextField();
        jLabelAsset = new javax.swing.JLabel();
        jLabelAssetDescription = new javax.swing.JLabel();
        jTextFieldManufacturer = new javax.swing.JTextField();
        jComboBoxAcquiredBy = new javax.swing.JComboBox<>();
        jLabelYearofManufacture = new javax.swing.JLabel();
        jTextFieldPurchase = new javax.swing.JTextField();
        jLabelPurchasePrice = new javax.swing.JLabel();
        jLabelManufacturer = new javax.swing.JLabel();
        jLabelSparePartsAvailable = new javax.swing.JLabel();
        jComboBoxSparePartsAvailable = new javax.swing.JComboBox<>();
        jLabelIfYEs = new javax.swing.JLabel();
        jTextFieldYeah = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(null);
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.setAutoscrolls(true);
        jPanel1.setInheritsPopupMenu(true);

        jButtonExit.setBackground(new java.awt.Color(250, 246, 245));
        jButtonExit.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jButtonExit.setForeground(new java.awt.Color(7, 13, 49));
        jButtonExit.setText("EXIT");
        jButtonExit.setAutoscrolls(true);
        jButtonExit.setInheritsPopupMenu(true);
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jButtonReset.setBackground(new java.awt.Color(27, 55, 118));
        jButtonReset.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jButtonReset.setForeground(new java.awt.Color(211, 200, 216));
        jButtonReset.setText("RESET");
        jButtonReset.setAutoscrolls(true);
        jButtonReset.setInheritsPopupMenu(true);
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        jButtonLogout.setBackground(new java.awt.Color(250, 246, 245));
        jButtonLogout.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jButtonLogout.setForeground(new java.awt.Color(7, 13, 49));
        jButtonLogout.setText("LOGOUT");
        jButtonLogout.setAutoscrolls(true);
        jButtonLogout.setInheritsPopupMenu(true);
        jButtonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogoutActionPerformed(evt);
            }
        });

        jButtonInsert3.setBackground(new java.awt.Color(7, 13, 47));
        jButtonInsert3.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jButtonInsert3.setForeground(new java.awt.Color(250, 248, 249));
        jButtonInsert3.setText("INSERT");
        jButtonInsert3.setAutoscrolls(true);
        jButtonInsert3.setInheritsPopupMenu(true);
        jButtonInsert3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsert3ActionPerformed(evt);
            }
        });

        jButtonPrint.setBackground(new java.awt.Color(196, 165, 209));
        jButtonPrint.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jButtonPrint.setText("PRINT");
        jButtonPrint.setAutoscrolls(true);
        jButtonPrint.setInheritsPopupMenu(true);
        jButtonPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrintActionPerformed(evt);
            }
        });

        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setInheritsPopupMenu(true);

        jTextAreaData.setEditable(false);
        jTextAreaData.setBackground(new java.awt.Color(255, 255, 255));
        jTextAreaData.setColumns(20);
        jTextAreaData.setFont(new java.awt.Font("Lora", 0, 16)); // NOI18N
        jTextAreaData.setForeground(new java.awt.Color(51, 51, 51));
        jTextAreaData.setLineWrap(true);
        jTextAreaData.setRows(5);
        jTextAreaData.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "REPORT", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Source Sans Pro", 1, 14), new java.awt.Color(51, 51, 51)))); // NOI18N
        jTextAreaData.setDoubleBuffered(true);
        jTextAreaData.setInheritsPopupMenu(true);
        jTextAreaData.setOpaque(true);
        jScrollPane1.setViewportView(jTextAreaData);

        jButtonSummary.setBackground(new java.awt.Color(196, 165, 209));
        jButtonSummary.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jButtonSummary.setText("SUMMARY");
        jButtonSummary.setAutoscrolls(true);
        jButtonSummary.setInheritsPopupMenu(true);
        jButtonSummary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSummaryActionPerformed(evt);
            }
        });

        jButtonUpdate.setBackground(new java.awt.Color(7, 13, 47));
        jButtonUpdate.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jButtonUpdate.setForeground(new java.awt.Color(250, 248, 249));
        jButtonUpdate.setText("UPDATE");
        jButtonUpdate.setAutoscrolls(true);
        jButtonUpdate.setInheritsPopupMenu(true);
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonDelete1.setBackground(new java.awt.Color(7, 13, 47));
        jButtonDelete1.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jButtonDelete1.setForeground(new java.awt.Color(250, 248, 249));
        jButtonDelete1.setText("DELETE");
        jButtonDelete1.setAutoscrolls(true);
        jButtonDelete1.setInheritsPopupMenu(true);
        jButtonDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDelete1ActionPerformed(evt);
            }
        });

        jScrollPane3.setAutoscrolls(true);
        jScrollPane3.setInheritsPopupMenu(true);

        jTabInfo.setBorder(null);
        jTabInfo.setFont(new java.awt.Font("Lora", 0, 16)); // NOI18N
        jTabInfo.setForeground(new java.awt.Color(51, 51, 51));
        jTabInfo.setModel(model);
        jTabInfo.setDoubleBuffered(true);
        jTabInfo.setInheritsPopupMenu(true);
        jTabInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabInfoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTabInfo);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.setAutoscrolls(true);
        jPanel2.setInheritsPopupMenu(true);

        jLabelOther_notes.setBackground(new java.awt.Color(255, 255, 255));
        jLabelOther_notes.setFont(new java.awt.Font("Lora", 0, 14)); // NOI18N
        jLabelOther_notes.setForeground(new java.awt.Color(51, 51, 51));
        jLabelOther_notes.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelOther_notes.setText("Other notes:");
        jLabelOther_notes.setAutoscrolls(true);
        jLabelOther_notes.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jLabelOther_notes.setDoubleBuffered(true);

        jLabelEquipmentUsers.setBackground(new java.awt.Color(255, 255, 255));
        jLabelEquipmentUsers.setFont(new java.awt.Font("Lora", 0, 14)); // NOI18N
        jLabelEquipmentUsers.setForeground(new java.awt.Color(51, 51, 51));
        jLabelEquipmentUsers.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelEquipmentUsers.setText("Equipment Users:");
        jLabelEquipmentUsers.setAutoscrolls(true);
        jLabelEquipmentUsers.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jLabelEquipmentUsers.setDoubleBuffered(true);

        jTextFieldInstallationDate.setFont(new java.awt.Font("Lora", 0, 14)); // NOI18N
        jTextFieldInstallationDate.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldInstallationDate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(108, 145, 198), 1, true));
        jTextFieldInstallationDate.setCaretColor(new java.awt.Color(254, 254, 254));
        jTextFieldInstallationDate.setDoubleBuffered(true);
        jTextFieldInstallationDate.setInheritsPopupMenu(true);
        jTextFieldInstallationDate.setOpaque(true);

        jScrollPane2.setBackground(java.awt.Color.darkGray);
        jScrollPane2.setForeground(java.awt.SystemColor.text);
        jScrollPane2.setAutoscrolls(true);
        jScrollPane2.setInheritsPopupMenu(true);

        jTextAreaoOther_notes.setBackground(new java.awt.Color(255, 255, 255));
        jTextAreaoOther_notes.setColumns(20);
        jTextAreaoOther_notes.setFont(new java.awt.Font("Lora", 0, 14)); // NOI18N
        jTextAreaoOther_notes.setForeground(new java.awt.Color(102, 102, 102));
        jTextAreaoOther_notes.setLineWrap(true);
        jTextAreaoOther_notes.setRows(5);
        jTextAreaoOther_notes.setWrapStyleWord(true);
        jTextAreaoOther_notes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 254, 254), 1, true));
        jTextAreaoOther_notes.setDoubleBuffered(true);
        jTextAreaoOther_notes.setInheritsPopupMenu(true);
        jTextAreaoOther_notes.setOpaque(true);
        jScrollPane2.setViewportView(jTextAreaoOther_notes);

        jLabelNextMaintenance.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNextMaintenance.setFont(new java.awt.Font("Lora", 0, 14)); // NOI18N
        jLabelNextMaintenance.setForeground(new java.awt.Color(51, 51, 51));
        jLabelNextMaintenance.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelNextMaintenance.setText("Next Maintenance/Service");
        jLabelNextMaintenance.setToolTipText("Date warranty expires; usually indicated on purchase order");
        jLabelNextMaintenance.setAutoscrolls(true);
        jLabelNextMaintenance.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jLabelNextMaintenance.setDoubleBuffered(true);

        jLabelAsof.setBackground(new java.awt.Color(255, 255, 255));
        jLabelAsof.setFont(new java.awt.Font("Lora", 0, 14)); // NOI18N
        jLabelAsof.setForeground(new java.awt.Color(51, 51, 51));
        jLabelAsof.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelAsof.setText("As of:");
        jLabelAsof.setToolTipText("Date of Status flag");
        jLabelAsof.setAutoscrolls(true);
        jLabelAsof.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jLabelAsof.setDoubleBuffered(true);

        jLabelWarrantyExpirationDate.setBackground(new java.awt.Color(255, 255, 255));
        jLabelWarrantyExpirationDate.setFont(new java.awt.Font("Lora", 0, 14)); // NOI18N
        jLabelWarrantyExpirationDate.setForeground(new java.awt.Color(51, 51, 51));
        jLabelWarrantyExpirationDate.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelWarrantyExpirationDate.setText("Warranty Expiration Data:");
        jLabelWarrantyExpirationDate.setToolTipText("Date warranty expires; usually indicated on purchase order");
        jLabelWarrantyExpirationDate.setAutoscrolls(true);
        jLabelWarrantyExpirationDate.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jLabelWarrantyExpirationDate.setDoubleBuffered(true);

        jScrollPane4.setBackground(java.awt.Color.darkGray);
        jScrollPane4.setForeground(java.awt.SystemColor.text);
        jScrollPane4.setAutoscrolls(true);
        jScrollPane4.setInheritsPopupMenu(true);

        jTextAreaoOther_notes1.setBackground(new java.awt.Color(255, 255, 255));
        jTextAreaoOther_notes1.setColumns(20);
        jTextAreaoOther_notes1.setFont(new java.awt.Font("Lora", 0, 14)); // NOI18N
        jTextAreaoOther_notes1.setForeground(new java.awt.Color(102, 102, 102));
        jTextAreaoOther_notes1.setLineWrap(true);
        jTextAreaoOther_notes1.setRows(5);
        jTextAreaoOther_notes1.setWrapStyleWord(true);
        jTextAreaoOther_notes1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 254, 254), 1, true));
        jTextAreaoOther_notes1.setDoubleBuffered(true);
        jTextAreaoOther_notes1.setInheritsPopupMenu(true);
        jTextAreaoOther_notes1.setOpaque(true);
        jScrollPane4.setViewportView(jTextAreaoOther_notes1);

        jTextFieldService.setFont(new java.awt.Font("Lora", 0, 14)); // NOI18N
        jTextFieldService.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldService.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(108, 145, 198), 1, true));
        jTextFieldService.setCaretColor(new java.awt.Color(254, 254, 254));
        jTextFieldService.setDoubleBuffered(true);
        jTextFieldService.setInheritsPopupMenu(true);
        jTextFieldService.setOpaque(true);

        jTextFieldNextService.setFont(new java.awt.Font("Lora", 0, 14)); // NOI18N
        jTextFieldNextService.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldNextService.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(108, 145, 198), 1, true));
        jTextFieldNextService.setCaretColor(new java.awt.Color(254, 254, 254));
        jTextFieldNextService.setDoubleBuffered(true);
        jTextFieldNextService.setInheritsPopupMenu(true);
        jTextFieldNextService.setOpaque(true);

        jLabelStatusFlag.setBackground(new java.awt.Color(255, 255, 255));
        jLabelStatusFlag.setFont(new java.awt.Font("Lora", 0, 14)); // NOI18N
        jLabelStatusFlag.setForeground(new java.awt.Color(51, 51, 51));
        jLabelStatusFlag.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelStatusFlag.setText("Status Flag:");
        jLabelStatusFlag.setToolTipText("Indicates current status of the equipment (e.g. operational, out of order, awaiting spares, due for replacement)");
        jLabelStatusFlag.setAutoscrolls(true);
        jLabelStatusFlag.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jLabelStatusFlag.setDoubleBuffered(true);

        jTextFieldAsOf.setFont(new java.awt.Font("Lora", 0, 14)); // NOI18N
        jTextFieldAsOf.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldAsOf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(108, 145, 198), 1, true));
        jTextFieldAsOf.setCaretColor(new java.awt.Color(254, 254, 254));
        jTextFieldAsOf.setDoubleBuffered(true);
        jTextFieldAsOf.setInheritsPopupMenu(true);
        jTextFieldAsOf.setOpaque(true);

        jLabelMaintenance.setBackground(new java.awt.Color(255, 255, 255));
        jLabelMaintenance.setFont(new java.awt.Font("Lora", 0, 14)); // NOI18N
        jLabelMaintenance.setForeground(new java.awt.Color(51, 51, 51));
        jLabelMaintenance.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelMaintenance.setText("Maintenained/Serviced On:");
        jLabelMaintenance.setToolTipText("Date when equipment was offi cially accepted and put into operation");
        jLabelMaintenance.setAutoscrolls(true);
        jLabelMaintenance.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jLabelMaintenance.setDoubleBuffered(true);

        jComboBoxEquipUsers.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxEquipUsers.setFont(new java.awt.Font("Lora", 0, 14)); // NOI18N
        jComboBoxEquipUsers.setForeground(new java.awt.Color(102, 102, 102));
        jComboBoxEquipUsers.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Students", "Lecturers", "Administration", "Guests" }));
        jComboBoxEquipUsers.setSelectedItem(null);
        jComboBoxEquipUsers.setAutoscrolls(true);
        jComboBoxEquipUsers.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(108, 145, 198), 1, true));
        jComboBoxEquipUsers.setDoubleBuffered(true);
        jComboBoxEquipUsers.setInheritsPopupMenu(true);
        jComboBoxEquipUsers.setOpaque(true);
        jComboBoxEquipUsers.setPreferredSize(new java.awt.Dimension(210, 28));

        jTextFieldAssetExpirationDate.setFont(new java.awt.Font("Lora", 0, 14)); // NOI18N
        jTextFieldAssetExpirationDate.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldAssetExpirationDate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(108, 145, 198), 1, true));
        jTextFieldAssetExpirationDate.setCaretColor(new java.awt.Color(254, 254, 254));
        jTextFieldAssetExpirationDate.setDoubleBuffered(true);
        jTextFieldAssetExpirationDate.setInheritsPopupMenu(true);
        jTextFieldAssetExpirationDate.setOpaque(true);

        jLabelAssetInstallationDate.setBackground(new java.awt.Color(255, 255, 255));
        jLabelAssetInstallationDate.setFont(new java.awt.Font("Lora", 0, 14)); // NOI18N
        jLabelAssetInstallationDate.setForeground(new java.awt.Color(51, 51, 51));
        jLabelAssetInstallationDate.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelAssetInstallationDate.setText("Asset Expiration Date:");
        jLabelAssetInstallationDate.setToolTipText("Date when equipment was offi cially accepted and put into operation");
        jLabelAssetInstallationDate.setAutoscrolls(true);
        jLabelAssetInstallationDate.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jLabelAssetInstallationDate.setDoubleBuffered(true);

        jTextFieldWarrantyExpirationDate.setFont(new java.awt.Font("Lora", 0, 14)); // NOI18N
        jTextFieldWarrantyExpirationDate.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldWarrantyExpirationDate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(108, 145, 198), 1, true));
        jTextFieldWarrantyExpirationDate.setCaretColor(new java.awt.Color(254, 254, 254));
        jTextFieldWarrantyExpirationDate.setDoubleBuffered(true);
        jTextFieldWarrantyExpirationDate.setInheritsPopupMenu(true);
        jTextFieldWarrantyExpirationDate.setOpaque(true);

        jComboBoxStatusFlag.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxStatusFlag.setFont(new java.awt.Font("Lora", 0, 14)); // NOI18N
        jComboBoxStatusFlag.setForeground(new java.awt.Color(102, 102, 102));
        jComboBoxStatusFlag.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Operational", "Out of Order", "Awaiting Spares", "Due for Replacement " }));
        jComboBoxStatusFlag.setSelectedItem(null);
        jComboBoxStatusFlag.setAutoscrolls(true);
        jComboBoxStatusFlag.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(108, 145, 198), 1, true));
        jComboBoxStatusFlag.setDoubleBuffered(true);
        jComboBoxStatusFlag.setInheritsPopupMenu(true);
        jComboBoxStatusFlag.setOpaque(true);
        jComboBoxStatusFlag.setPreferredSize(new java.awt.Dimension(210, 28));

        jLabelInstallationDate.setBackground(new java.awt.Color(255, 255, 255));
        jLabelInstallationDate.setFont(new java.awt.Font("Lora", 0, 14)); // NOI18N
        jLabelInstallationDate.setForeground(new java.awt.Color(51, 51, 51));
        jLabelInstallationDate.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelInstallationDate.setText("Installation Date:");
        jLabelInstallationDate.setToolTipText("Date when equipment was offi cially accepted and put into operation");
        jLabelInstallationDate.setAutoscrolls(true);
        jLabelInstallationDate.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jLabelInstallationDate.setDoubleBuffered(true);

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jLabelInstallationDate, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 190, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(10, 10, 10)
                        .add(jTextFieldInstallationDate, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 210, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jLabelWarrantyExpirationDate, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 190, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(10, 10, 10)
                        .add(jTextFieldWarrantyExpirationDate, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 210, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabelMaintenance, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 190, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabelAssetInstallationDate, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 190, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(10, 10, 10)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jTextFieldAssetExpirationDate, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 210, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextFieldService, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 210, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jLabelNextMaintenance, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 190, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(10, 10, 10)
                        .add(jTextFieldNextService, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 210, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabelStatusFlag, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 190, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabelAsof, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 190, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(10, 10, 10)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jComboBoxStatusFlag, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextFieldAsOf, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 210, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jLabelEquipmentUsers, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .add(jLabelOther_notes, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .add(10, 10, 10)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jComboBoxEquipUsers, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabelInstallationDate)
                    .add(jTextFieldInstallationDate, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jTextFieldWarrantyExpirationDate, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabelWarrantyExpirationDate))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabelAssetInstallationDate)
                    .add(jTextFieldAssetExpirationDate, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jTextFieldService, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabelMaintenance))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabelNextMaintenance)
                    .add(jTextFieldNextService, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabelStatusFlag)
                    .add(jComboBoxStatusFlag, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabelAsof)
                    .add(jTextFieldAsOf, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabelEquipmentUsers)
                    .add(jComboBoxEquipUsers, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabelOther_notes, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 146, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(new java.awt.Component[] {jComboBoxEquipUsers, jComboBoxStatusFlag, jLabelAsof, jLabelAssetInstallationDate, jLabelEquipmentUsers, jLabelInstallationDate, jLabelMaintenance, jLabelNextMaintenance, jLabelStatusFlag, jLabelWarrantyExpirationDate, jTextFieldAsOf, jTextFieldAssetExpirationDate, jTextFieldInstallationDate, jTextFieldNextService, jTextFieldService, jTextFieldWarrantyExpirationDate}, org.jdesktop.layout.GroupLayout.VERTICAL);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(51, 51, 51));
        jPanel3.setAutoscrolls(true);
        jPanel3.setInheritsPopupMenu(true);

        jLabelSerialNo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelSerialNo.setFont(new java.awt.Font("Lora", 0, 14)); // NOI18N
        jLabelSerialNo.setForeground(new java.awt.Color(51, 51, 51));
        jLabelSerialNo.setText("Serial No:");
        jLabelSerialNo.setAutoscrolls(true);
        jLabelSerialNo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jLabelSerialNo.setDoubleBuffered(true);

        jLabelAcquiredBy.setBackground(new java.awt.Color(255, 255, 255));
        jLabelAcquiredBy.setFont(new java.awt.Font("Lora", 0, 14)); // NOI18N
        jLabelAcquiredBy.setForeground(new java.awt.Color(51, 51, 51));
        jLabelAcquiredBy.setText("Acquired By:");
        jLabelAcquiredBy.setAutoscrolls(true);
        jLabelAcquiredBy.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jLabelAcquiredBy.setDoubleBuffered(true);

        jLabelEquipLocation.setBackground(new java.awt.Color(255, 255, 255));
        jLabelEquipLocation.setFont(new java.awt.Font("Lora", 0, 14)); // NOI18N
        jLabelEquipLocation.setForeground(new java.awt.Color(51, 51, 51));
        jLabelEquipLocation.setText("Equipment Location:");
        jLabelEquipLocation.setToolTipText("Building, department or room where equipment is installed\n");
        jLabelEquipLocation.setAutoscrolls(true);
        jLabelEquipLocation.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jLabelEquipLocation.setDoubleBuffered(true);

        jTextFieldAsset.setFont(new java.awt.Font("Lora", 0, 14)); // NOI18N
        jTextFieldAsset.setForeground(new java.awt.Color(51, 51, 51));
        jTextFieldAsset.setToolTipText("Name of the equipment");
        jTextFieldAsset.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(108, 145, 198), 1, true));
        jTextFieldAsset.setCaretColor(new java.awt.Color(254, 254, 254));
        jTextFieldAsset.setDoubleBuffered(true);
        jTextFieldAsset.setInheritsPopupMenu(true);
        jTextFieldAsset.setOpaque(true);
        jTextFieldAsset.setPreferredSize(new java.awt.Dimension(0, 28));

        jTextFieldEquipLocation.setFont(new java.awt.Font("Lora", 0, 14)); // NOI18N
        jTextFieldEquipLocation.setForeground(new java.awt.Color(51, 51, 51));
        jTextFieldEquipLocation.setToolTipText("Building, department or room where equipment is installed\n");
        jTextFieldEquipLocation.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(108, 145, 198), 1, true));
        jTextFieldEquipLocation.setCaretColor(new java.awt.Color(254, 254, 254));
        jTextFieldEquipLocation.setDoubleBuffered(true);
        jTextFieldEquipLocation.setInheritsPopupMenu(true);
        jTextFieldEquipLocation.setOpaque(true);
        jTextFieldEquipLocation.setPreferredSize(new java.awt.Dimension(0, 28));

        jComboBoxPowerRecquirement.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxPowerRecquirement.setFont(new java.awt.Font("Lora", 0, 14)); // NOI18N
        jComboBoxPowerRecquirement.setForeground(new java.awt.Color(51, 51, 51));
        jComboBoxPowerRecquirement.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "220", "210" }));
        jComboBoxPowerRecquirement.setSelectedItem(null);
        jComboBoxPowerRecquirement.setAutoscrolls(true);
        jComboBoxPowerRecquirement.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(108, 145, 198), 1, true));
        jComboBoxPowerRecquirement.setDoubleBuffered(true);
        jComboBoxPowerRecquirement.setInheritsPopupMenu(true);
        jComboBoxPowerRecquirement.setOpaque(true);
        jComboBoxPowerRecquirement.setPreferredSize(new java.awt.Dimension(210, 28));

        jLabelPowerRecquirement.setBackground(new java.awt.Color(255, 255, 255));
        jLabelPowerRecquirement.setFont(new java.awt.Font("Lora", 0, 14)); // NOI18N
        jLabelPowerRecquirement.setForeground(new java.awt.Color(51, 51, 51));
        jLabelPowerRecquirement.setText("Power Recquirement(V):");
        jLabelPowerRecquirement.setAutoscrolls(true);
        jLabelPowerRecquirement.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jLabelPowerRecquirement.setDoubleBuffered(true);

        jComboBoxCountryOfOrigin.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxCountryOfOrigin.setFont(new java.awt.Font("Lora", 0, 14)); // NOI18N
        jComboBoxCountryOfOrigin.setForeground(new java.awt.Color(51, 51, 51));
        jComboBoxCountryOfOrigin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Abkhazia", "Afghanistan", "Åland Islands", "Albania", "Algeria", "American Samoa", "Andorra", "Angola", "Anguilla", "Antigua and Barbuda", "Argentina", "Armenia", "Aruba", "Ascension", "Australia", "Australian Antarctic Territory", "Australian External Territories", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Barbuda", "Belarus", "Belgium", "Belize", "Benin", "Bermuda", "Bhutan", "Bolivia", "Bonaire", "Bosnia and Herzegovina", "Botswana", "Brazil", "British Indian Ocean Territory", "British Virgin Islands", "Brunei Darussalam", "Bulgaria", "Burkina Faso", "Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Caribbean Netherlands", "Cayman Islands", "Central African Republic", "Chad", "Chatham Island, New Zealand", "Chile", "China", "Christmas Island", "Cocos (Keeling) Islands", "Colombia", "Comoros", "Congo", "Congo, Democratic Republic of the (Zaire)", "Cook Islands", "Costa Rica", "Ivory Coast", "Croatia", "Cuba", "Guantanamo Bay, Cuba", "Curaçao", "Cyprus", "Czech Republic", "Denmark", "Diego Garcia", "Djibouti", "Dominica", "Dominican Republic", "East Timor", "Easter Island", "Ecuador", "Egypt", "El Salvador", "Ellipso (Mobile Satellite service)", "EMSAT (Mobile Satellite service)", "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Falkland Islands", "Faroe Islands", "Fiji", "Finland", "France", "French Antilles", "French Guiana", "French Polynesia", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Gibraltar", "Global Mobile Satellite System (GMSS)", "Globalstar (Mobile Satellite Service)", "Greece", "Greenland", "Grenada", "Guadeloupe", "Guam", "Guatemala", "Guernsey", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Honduras", "Hong Kong", "Hungary", "Iceland", "ICO Global (Mobile Satellite Service)", "India", "Indonesia", "Inmarsat SNAC", "International Freephone Service (UIFN)", "International Networks", "International Premium Rate Service’", "International Shared Cost Service (ISCS)", "Iran", "Iraq", "Ireland", "Iridium (Mobile Satellite service)", "Isle of Man", "Israel", "Italy", "Jamaica", "Jan Mayen", "Japan", "Jersey", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Korea, North", "Korea, South", "Kosovo", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Macau", "Macedonia", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Martinique", "Mauritania", "Mauritius", "Mayotte", "Mexico", "Micronesia, Federated States of", "Midway Island, USA", "Moldova", "Monaco", "Mongolia", "Montenegro", "Montserrat", "Morocco", "Mozambique", "Myanmar", "Nagorno-Karabakh", "Namibia", "Nauru", "Nepal", "Netherlands", "Nevis", "New Caledonia", "New Zealand", "Nicaragua", "Niger", "Nigeria", "Niue", "Norfolk Island", "Northern Cyprus", "Northern Ireland", "Northern Mariana Islands", "Norway", "Oman", "Pakistan", "Palau", "Palestine, State of", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Pitcairn Islands", "Poland", "Portugal", "Puerto Rico", "Qatar", "Réunion", "Romania", "Russia", "Rwanda", "Saba", "Saint Barthélemy", "Saint Helena", "Saint Kitts and Nevis", "Saint Lucia", "Saint Martin (France)", "Saint Pierre and Miquelon", "Saint Vincent and the Grenadines", "Samoa", "San Marino", "São Tomé and Príncipe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Sint Eustatius", "Sint Maarten (Netherlands)", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Georgia and the South Sandwich Islands", "South Ossetia", "South Sudan", "Spain", "Sri Lanka", "Sudan", "Suriname", "Svalbard", "Swaziland", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania", "Telecommunications for Disaster Relief by OCHA", "Thailand", "Thuraya (Mobile Satellite service)", "Togo", "Tokelau", "Tonga", "Transnistria", "Trinidad and Tobago", "Tristan da Cunha", "Tunisia", "Turkey", "Turkmenistan", "Turks and Caicos Islands", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "Universal Personal Telecommunications (UPT)", "Uruguay", "US Virgin Islands", "Uzbekistan", "Vanuatu", "Venezuela", "Vatican City State (Holy See)", "Vietnam", "Wake Island, USA", "Wallis and Futuna", "Yemen", "Zambia", "Zanzibar", "Zimbabwe" }));
        jComboBoxCountryOfOrigin.setSelectedItem(null);
        jComboBoxCountryOfOrigin.setAutoscrolls(true);
        jComboBoxCountryOfOrigin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(108, 145, 198), 1, true));
        jComboBoxCountryOfOrigin.setDoubleBuffered(true);
        jComboBoxCountryOfOrigin.setInheritsPopupMenu(true);
        jComboBoxCountryOfOrigin.setOpaque(true);
        jComboBoxCountryOfOrigin.setPreferredSize(new java.awt.Dimension(210, 28));

        jTextFieldAssetDescription.setFont(new java.awt.Font("Lora", 0, 14)); // NOI18N
        jTextFieldAssetDescription.setForeground(new java.awt.Color(51, 51, 51));
        jTextFieldAssetDescription.setToolTipText("Brief desciption of the machin or equipment like what it does");
        jTextFieldAssetDescription.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(108, 145, 198), 1, true));
        jTextFieldAssetDescription.setCaretColor(new java.awt.Color(254, 254, 254));
        jTextFieldAssetDescription.setDoubleBuffered(true);
        jTextFieldAssetDescription.setInheritsPopupMenu(true);
        jTextFieldAssetDescription.setOpaque(true);
        jTextFieldAssetDescription.setPreferredSize(new java.awt.Dimension(0, 28));

        jTextFieldModelNu.setFont(new java.awt.Font("Lora", 0, 14)); // NOI18N
        jTextFieldModelNu.setForeground(new java.awt.Color(51, 51, 51));
        jTextFieldModelNu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(108, 145, 198), 1, true));
        jTextFieldModelNu.setCaretColor(new java.awt.Color(254, 254, 254));
        jTextFieldModelNu.setDoubleBuffered(true);
        jTextFieldModelNu.setInheritsPopupMenu(true);
        jTextFieldModelNu.setOpaque(true);
        jTextFieldModelNu.setPreferredSize(new java.awt.Dimension(0, 28));

        jLabelMaintenanceResponsbility.setBackground(new java.awt.Color(255, 255, 255));
        jLabelMaintenanceResponsbility.setFont(new java.awt.Font("Lora", 0, 14)); // NOI18N
        jLabelMaintenanceResponsbility.setForeground(new java.awt.Color(51, 51, 51));
        jLabelMaintenanceResponsbility.setText("Maintenance Responsibility:");
        jLabelMaintenanceResponsbility.setToolTipText("Name and code of institution or department, whether an external, central or peripheral workshop or organization responsible for maintenance of equipment");
        jLabelMaintenanceResponsbility.setAutoscrolls(true);
        jLabelMaintenanceResponsbility.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jLabelMaintenanceResponsbility.setDoubleBuffered(true);

        jTextFieldMaintenanceResponsibility.setFont(new java.awt.Font("Lora", 0, 14)); // NOI18N
        jTextFieldMaintenanceResponsibility.setForeground(new java.awt.Color(51, 51, 51));
        jTextFieldMaintenanceResponsibility.setToolTipText("Name and code of institution or department, whether an external, central or peripheral workshop or organization responsible for maintenance of equipment");
        jTextFieldMaintenanceResponsibility.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(108, 145, 198), 1, true));
        jTextFieldMaintenanceResponsibility.setCaretColor(new java.awt.Color(254, 254, 254));
        jTextFieldMaintenanceResponsibility.setDoubleBuffered(true);
        jTextFieldMaintenanceResponsibility.setInheritsPopupMenu(true);
        jTextFieldMaintenanceResponsibility.setOpaque(true);
        jTextFieldMaintenanceResponsibility.setPreferredSize(new java.awt.Dimension(0, 28));

        jLabelModel.setBackground(new java.awt.Color(255, 255, 255));
        jLabelModel.setFont(new java.awt.Font("Lora", 0, 14)); // NOI18N
        jLabelModel.setForeground(new java.awt.Color(51, 51, 51));
        jLabelModel.setText("Model:");
        jLabelModel.setAutoscrolls(true);
        jLabelModel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jLabelModel.setDoubleBuffered(true);

        jTextFieldSerial.setFont(new java.awt.Font("Lora", 0, 14)); // NOI18N
        jTextFieldSerial.setForeground(new java.awt.Color(51, 51, 51));
        jTextFieldSerial.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(108, 145, 198), 1, true));
        jTextFieldSerial.setCaretColor(new java.awt.Color(254, 254, 254));
        jTextFieldSerial.setDoubleBuffered(true);
        jTextFieldSerial.setInheritsPopupMenu(true);
        jTextFieldSerial.setOpaque(true);
        jTextFieldSerial.setPreferredSize(new java.awt.Dimension(0, 28));

        jLabelVender.setBackground(new java.awt.Color(255, 255, 255));
        jLabelVender.setFont(new java.awt.Font("Lora", 0, 14)); // NOI18N
        jLabelVender.setForeground(new java.awt.Color(51, 51, 51));
        jLabelVender.setText("Vender:");
        jLabelVender.setAutoscrolls(true);
        jLabelVender.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jLabelVender.setDoubleBuffered(true);

        jLabelEquipCountryofOrigin.setFont(new java.awt.Font("Lora", 0, 14)); // NOI18N
        jLabelEquipCountryofOrigin.setForeground(new java.awt.Color(51, 51, 51));
        jLabelEquipCountryofOrigin.setText("Equip Country of Origin:");
        jLabelEquipCountryofOrigin.setAutoscrolls(true);
        jLabelEquipCountryofOrigin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jLabelEquipCountryofOrigin.setDoubleBuffered(true);

        jTextFieldVendor.setFont(new java.awt.Font("Lora", 0, 14)); // NOI18N
        jTextFieldVendor.setForeground(new java.awt.Color(51, 51, 51));
        jTextFieldVendor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(108, 145, 198), 1, true));
        jTextFieldVendor.setCaretColor(new java.awt.Color(254, 254, 254));
        jTextFieldVendor.setDoubleBuffered(true);
        jTextFieldVendor.setInheritsPopupMenu(true);
        jTextFieldVendor.setOpaque(true);
        jTextFieldVendor.setPreferredSize(new java.awt.Dimension(0, 28));

        jTextFieldYearOfManufacture.setFont(new java.awt.Font("Lora", 0, 14)); // NOI18N
        jTextFieldYearOfManufacture.setForeground(new java.awt.Color(51, 51, 51));
        jTextFieldYearOfManufacture.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(108, 145, 198), 1, true));
        jTextFieldYearOfManufacture.setDoubleBuffered(true);
        jTextFieldYearOfManufacture.setInheritsPopupMenu(true);
        jTextFieldYearOfManufacture.setOpaque(true);

        jLabelAsset.setBackground(new java.awt.Color(255, 255, 255));
        jLabelAsset.setFont(new java.awt.Font("Lora", 0, 14)); // NOI18N
        jLabelAsset.setForeground(new java.awt.Color(51, 51, 51));
        jLabelAsset.setText("Asset:");
        jLabelAsset.setToolTipText("Unique number assigned by the facility to identify individual pieces of equipment");
        jLabelAsset.setAutoscrolls(true);
        jLabelAsset.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jLabelAsset.setDoubleBuffered(true);

        jLabelAssetDescription.setBackground(new java.awt.Color(255, 255, 255));
        jLabelAssetDescription.setFont(new java.awt.Font("Lora", 0, 14)); // NOI18N
        jLabelAssetDescription.setForeground(new java.awt.Color(51, 51, 51));
        jLabelAssetDescription.setText("Asset Description:");
        jLabelAssetDescription.setAutoscrolls(true);
        jLabelAssetDescription.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jLabelAssetDescription.setDoubleBuffered(true);

        jTextFieldManufacturer.setFont(new java.awt.Font("Lora", 0, 14)); // NOI18N
        jTextFieldManufacturer.setForeground(new java.awt.Color(51, 51, 51));
        jTextFieldManufacturer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(108, 145, 198), 1, true));
        jTextFieldManufacturer.setCaretColor(new java.awt.Color(254, 254, 254));
        jTextFieldManufacturer.setDoubleBuffered(true);
        jTextFieldManufacturer.setInheritsPopupMenu(true);
        jTextFieldManufacturer.setOpaque(true);
        jTextFieldManufacturer.setPreferredSize(new java.awt.Dimension(0, 28));

        jComboBoxAcquiredBy.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxAcquiredBy.setFont(new java.awt.Font("Lora", 0, 14)); // NOI18N
        jComboBoxAcquiredBy.setForeground(new java.awt.Color(51, 51, 51));
        jComboBoxAcquiredBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Purchase", "Donation" }));
        jComboBoxAcquiredBy.setSelectedItem(null);
        jComboBoxAcquiredBy.setAutoscrolls(true);
        jComboBoxAcquiredBy.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(108, 145, 198), 1, true));
        jComboBoxAcquiredBy.setDoubleBuffered(true);
        jComboBoxAcquiredBy.setInheritsPopupMenu(true);
        jComboBoxAcquiredBy.setOpaque(true);
        jComboBoxAcquiredBy.setPreferredSize(new java.awt.Dimension(210, 28));

        jLabelYearofManufacture.setBackground(new java.awt.Color(255, 255, 255));
        jLabelYearofManufacture.setFont(new java.awt.Font("Lora", 0, 14)); // NOI18N
        jLabelYearofManufacture.setForeground(new java.awt.Color(51, 51, 51));
        jLabelYearofManufacture.setText("Year of Manufacture:");
        jLabelYearofManufacture.setAutoscrolls(true);
        jLabelYearofManufacture.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jLabelYearofManufacture.setDoubleBuffered(true);

        jTextFieldPurchase.setFont(new java.awt.Font("Lora", 0, 14)); // NOI18N
        jTextFieldPurchase.setForeground(new java.awt.Color(51, 51, 51));
        jTextFieldPurchase.setToolTipText("Exact amount of money paid for equipment and currency used for payment");
        jTextFieldPurchase.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(108, 145, 198), 1, true));
        jTextFieldPurchase.setCaretColor(new java.awt.Color(254, 254, 254));
        jTextFieldPurchase.setDoubleBuffered(true);
        jTextFieldPurchase.setInheritsPopupMenu(true);
        jTextFieldPurchase.setOpaque(true);
        jTextFieldPurchase.setPreferredSize(new java.awt.Dimension(0, 28));

        jLabelPurchasePrice.setBackground(new java.awt.Color(255, 255, 255));
        jLabelPurchasePrice.setFont(new java.awt.Font("Lora", 0, 14)); // NOI18N
        jLabelPurchasePrice.setForeground(new java.awt.Color(51, 51, 51));
        jLabelPurchasePrice.setText("Purchase Price:");
        jLabelPurchasePrice.setToolTipText("Exact amount of money paid for equipment and currency used for payment");
        jLabelPurchasePrice.setAutoscrolls(true);
        jLabelPurchasePrice.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jLabelPurchasePrice.setDoubleBuffered(true);

        jLabelManufacturer.setFont(new java.awt.Font("Lora", 0, 14)); // NOI18N
        jLabelManufacturer.setForeground(new java.awt.Color(51, 51, 51));
        jLabelManufacturer.setText("Manufacturer:");
        jLabelManufacturer.setAutoscrolls(true);
        jLabelManufacturer.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jLabelManufacturer.setDoubleBuffered(true);

        jLabelSparePartsAvailable.setFont(new java.awt.Font("Lora", 0, 14)); // NOI18N
        jLabelSparePartsAvailable.setForeground(new java.awt.Color(51, 51, 51));
        jLabelSparePartsAvailable.setText("Spare Parts Available?");
        jLabelSparePartsAvailable.setAutoscrolls(true);
        jLabelSparePartsAvailable.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jLabelSparePartsAvailable.setDoubleBuffered(true);

        jComboBoxSparePartsAvailable.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxSparePartsAvailable.setFont(new java.awt.Font("Lora", 0, 14)); // NOI18N
        jComboBoxSparePartsAvailable.setForeground(new java.awt.Color(51, 51, 51));
        jComboBoxSparePartsAvailable.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "YES", "NO" }));
        jComboBoxSparePartsAvailable.setSelectedItem(null);
        jComboBoxSparePartsAvailable.setAutoscrolls(true);
        jComboBoxSparePartsAvailable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(108, 145, 198), 1, true));
        jComboBoxSparePartsAvailable.setDoubleBuffered(true);
        jComboBoxSparePartsAvailable.setInheritsPopupMenu(true);
        jComboBoxSparePartsAvailable.setOpaque(true);
        jComboBoxSparePartsAvailable.setPreferredSize(new java.awt.Dimension(210, 28));

        jLabelIfYEs.setBackground(new java.awt.Color(255, 255, 255));
        jLabelIfYEs.setFont(new java.awt.Font("Lora", 0, 14)); // NOI18N
        jLabelIfYEs.setForeground(new java.awt.Color(51, 51, 51));
        jLabelIfYEs.setText("If yes, what, how many, and where are they Located?");
        jLabelIfYEs.setAutoscrolls(true);
        jLabelIfYEs.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jLabelIfYEs.setDoubleBuffered(true);

        jTextFieldYeah.setFont(new java.awt.Font("Lora", 0, 14)); // NOI18N
        jTextFieldYeah.setForeground(new java.awt.Color(51, 51, 51));
        jTextFieldYeah.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(108, 145, 198), 1, true));
        jTextFieldYeah.setCaretColor(new java.awt.Color(254, 254, 254));
        jTextFieldYeah.setDoubleBuffered(true);
        jTextFieldYeah.setInheritsPopupMenu(true);
        jTextFieldYeah.setOpaque(true);
        jTextFieldYeah.setPreferredSize(new java.awt.Dimension(0, 28));

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel3Layout.createSequentialGroup()
                            .add(jLabelMaintenanceResponsbility, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(10, 10, 10)
                            .add(jTextFieldMaintenanceResponsibility, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 210, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel3Layout.createSequentialGroup()
                            .add(jLabelPowerRecquirement, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(10, 10, 10)
                            .add(jComboBoxPowerRecquirement, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel3Layout.createSequentialGroup()
                            .add(jLabelEquipCountryofOrigin, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(10, 10, 10)
                            .add(jComboBoxCountryOfOrigin, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel3Layout.createSequentialGroup()
                            .add(jLabelYearofManufacture, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(10, 10, 10)
                            .add(jTextFieldYearOfManufacture, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 210, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(jPanel3Layout.createSequentialGroup()
                            .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(jPanel3Layout.createSequentialGroup()
                                    .add(jLabelAcquiredBy, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(10, 10, 10))
                                .add(jPanel3Layout.createSequentialGroup()
                                    .add(jLabelPurchasePrice, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(jComboBoxAcquiredBy, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(jTextFieldPurchase, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 210, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(jLabelAsset, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(10, 10, 10)
                        .add(jTextFieldAsset, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 210, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(jLabelAssetDescription, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(10, 10, 10)
                        .add(jTextFieldAssetDescription, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 210, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(jLabelVender, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(10, 10, 10)
                        .add(jTextFieldVendor, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 210, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabelManufacturer, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabelModel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabelSerialNo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabelEquipLocation, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(10, 10, 10)
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jTextFieldManufacturer, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 210, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextFieldModelNu, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 210, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextFieldSerial, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 210, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextFieldEquipLocation, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 210, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel3Layout.createSequentialGroup()
                            .add(jLabelSparePartsAvailable, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(10, 10, 10)
                            .add(jComboBoxSparePartsAvailable, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(org.jdesktop.layout.GroupLayout.LEADING, jLabelIfYEs, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, jTextFieldYeah, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 420, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabelAsset, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextFieldAsset, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabelAssetDescription)
                    .add(jTextFieldAssetDescription, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabelVender)
                    .add(jTextFieldVendor, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabelManufacturer)
                    .add(jTextFieldManufacturer, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabelModel)
                    .add(jTextFieldModelNu, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabelSerialNo)
                    .add(jTextFieldSerial, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabelEquipLocation)
                    .add(jTextFieldEquipLocation, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabelEquipCountryofOrigin)
                    .add(jComboBoxCountryOfOrigin, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jTextFieldYearOfManufacture, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabelYearofManufacture))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jComboBoxPowerRecquirement, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabelPowerRecquirement))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabelMaintenanceResponsbility)
                    .add(jTextFieldMaintenanceResponsibility, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabelAcquiredBy)
                    .add(jComboBoxAcquiredBy, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jTextFieldPurchase, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabelPurchasePrice))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jComboBoxSparePartsAvailable, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabelSparePartsAvailable))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabelIfYEs)
                .add(8, 8, 8)
                .add(jTextFieldYeah, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(6, 6, 6)
                .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jScrollPane3)
            .add(jPanel1Layout.createSequentialGroup()
                .add(396, 396, 396)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jButtonSummary, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 130, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButtonDelete1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 130, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(9, 9, 9)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jButtonInsert3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 130, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jButtonUpdate, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 130, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(150, 150, 150)
                        .add(jButtonLogout, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 130, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jButtonPrint, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 130, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(10, 10, 10)
                        .add(jButtonReset, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 130, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(10, 10, 10)
                        .add(jButtonExit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 130, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 552, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jScrollPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 130, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(10, 10, 10)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jButtonDelete1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButtonUpdate, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButtonInsert3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButtonLogout, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(10, 10, 10)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jButtonSummary, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButtonPrint, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButtonReset, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButtonExit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static Connection ConnectDb () {

        try {

            Class.forName ( "org.sqlite.JDBC" );
            Connection conn = DriverManager.getConnection ( "jdbc:sqlite:prototypemain.db" );

            return conn;

        }
        catch ( Exception e ) {

            JOptionPane.showMessageDialog ( null , e );

            return null;

        }

    }

    private JFrame frame;

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed

        frame = new JFrame ( "Exit" );

        if ( JOptionPane.YES_NO_OPTION == JOptionPane.showConfirmDialog ( frame , "Comfirm Exit" , "Database Management System" , JOptionPane.YES_NO_OPTION ) ) {

            System.exit ( 0 );

        }

    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed

        jTextFieldAsset.setText ( null );
        jTextFieldAssetDescription.setText ( null );
        jTextFieldVendor.setText ( null );
        jTextFieldManufacturer.setText ( null );
        jTextFieldModelNu.setText ( null );
        jTextFieldSerial.setText ( null );
        jTextFieldEquipLocation.setText ( null );
        jComboBoxAcquiredBy.setSelectedItem ( null );
        jTextFieldPurchase.setText ( null );
        jTextFieldYearOfManufacture.setText ( null );
        jTextFieldAssetExpirationDate.setText ( null );
        jComboBoxCountryOfOrigin.setSelectedItem ( null );
        jComboBoxPowerRecquirement.setSelectedItem ( null );
        jTextFieldMaintenanceResponsibility.setText ( null );
        jComboBoxSparePartsAvailable.setSelectedItem ( null );
        jTextFieldYeah.setText ( null );
        jTextFieldInstallationDate.setText ( null );
        jTextFieldWarrantyExpirationDate.setText ( null );
        jTextFieldService.setText ( null );
        jTextFieldNextService.setText ( null );
        jComboBoxStatusFlag.setSelectedItem ( null );
        jTextFieldAsOf.setText ( null );
        jComboBoxEquipUsers.setSelectedItem ( null );
        jTextAreaoOther_notes.setText ( null );

    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jButtonPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrintActionPerformed

        try {

            jTextAreaData.print ();

        }
        catch ( PrinterException ex ) {

            this.setTitle ( "Something is wrong" );

        }
    }//GEN-LAST:event_jButtonPrintActionPerformed

    private void jButtonSummaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSummaryActionPerformed

        String All2 = ( jTextFieldAsset.getText () );
        String All3 = ( jTextFieldAssetDescription.getText () );
        String All4 = ( jTextFieldVendor.getText () );
        String All5 = ( jTextFieldManufacturer.getText () );
        String All6 = ( jTextFieldModelNu.getText () );
        String All7 = ( jTextFieldSerial.getText () );
        String All8 = ( jTextFieldEquipLocation.getText () );
        String All9 = ( jComboBoxAcquiredBy.getSelectedItem ().toString () );
        String All10 = ( jTextFieldPurchase.getText () );
        String All11 = ( jComboBoxCountryOfOrigin.getSelectedItem ().toString () );
        String All12 = ( jTextFieldYearOfManufacture.getText () );
        String All13 = ( jComboBoxPowerRecquirement.getSelectedItem ().toString () );
        String All14 = ( jTextFieldMaintenanceResponsibility.getText () );
        String All15 = ( jComboBoxSparePartsAvailable.getSelectedItem ().toString () );
        String All16 = ( jTextFieldInstallationDate.getText () );
        String All17 = ( jTextFieldWarrantyExpirationDate.getText () );
        String All18 = ( jTextFieldAssetExpirationDate.getText () );
        String All19 = ( jComboBoxStatusFlag.getSelectedItem ().toString () );
        String All20 = ( jTextFieldAsOf.getText () );
        String All21 = ( jComboBoxEquipUsers.getSelectedItem ().toString () );
        String All22 = ( jTextFieldService.getText () );
        String All23 = ( jTextFieldNextService.getText () );
        String All24 = ( jTextAreaoOther_notes.getText () );
        String All25 = "";

        jTextAreaData.setText ( "" );
        jTextAreaData.append (
                "\n\t Database Management System\n"
                + "\nAsset Name:\t\t\t" + All2
                + "\nAsset Description:\t\t" + All3
                + "\nVendor:\t\t\t" + All4
                + "\nAsset Manufacturer:\t\t" + All5
                + "\nAsset Model:\t\t\t" + All6
                + "\nAsset Serial Number:\t\t" + All7
                + "\nAsset Location:\t\t" + All8
                + "\nAsset Acquired By?\t\t" + All9
                + "\nAsset Price:\t\t\t" + All10
                + "\nContry of Origin:\t\t" + All11
                + "\nManufacture Date:\t\t" + All12
                + "\nAsset Power Recquirement:\t" + All13
                + "\nMaintenance Responsibility:\t" + All14
                + "\nSpare Parts Available?\t\t" + All15
                + "\nAsset Installation Date:\t\t" + All16
                + "\nWarranty Expiration Date:\t\t" + All17
                + "\nAsset Expiration Date:\t\t" + All18
                + "\nAsset Status Flag:\t\t" + All19
                + "\nAs of?\t\t\t" + All20
                + "\nAsset Users:\t\t\t" + All21
                + "\nService Date\t\t\t" + All22
                + "\nNext Service:\t\t\t" + All23
                + "\nOther Notes:\t\t\t" + All24
        );
    }//GEN-LAST:event_jButtonSummaryActionPerformed

    private void jButtonInsert3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsert3ActionPerformed

        String sql = "INSERT INTO project(asset, assetdescription, vendor, manufacturer, model, serial, equipmentlocaion, acquiredby, purchaceprice, equipcountryoforigin, yearofmanufacture, powerrecquirement, maintenanceresponsibility, sparepartsavailable, yeah, installationdate, warrantyexpirationdate, assetexpirationdate,  service, nextservice, statusflag, asof, equipmentusers, othernotes)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {

            pst = conn.prepareStatement ( sql );

            pst.setString ( 1 , jTextFieldAsset.getText () );
            pst.setString ( 2 , jTextFieldAssetDescription.getText () );
            pst.setString ( 3 , jTextFieldVendor.getText () );
            pst.setString ( 4 , jTextFieldManufacturer.getText () );
            pst.setString ( 5 , jTextFieldModelNu.getText () );
            pst.setString ( 6 , jTextFieldSerial.getText () );
            pst.setString ( 7 , jTextFieldEquipLocation.getText () );
            pst.setString ( 8 , jComboBoxAcquiredBy.getSelectedItem ().toString () );
            pst.setString ( 9 , jTextFieldPurchase.getText () );
            pst.setString ( 10 , jComboBoxCountryOfOrigin.getSelectedItem ().toString () );
            pst.setString ( 11 , jTextFieldYearOfManufacture.getText () );
            pst.setString ( 12 , jComboBoxPowerRecquirement.getSelectedItem ().toString () );
            pst.setString ( 13 , jTextFieldMaintenanceResponsibility.getText () );
            pst.setString ( 14 , jComboBoxSparePartsAvailable.getSelectedItem ().toString () );
            pst.setString ( 15 , jTextFieldYeah.getText () );
            pst.setString ( 16 , jTextFieldInstallationDate.getText () );
            pst.setString ( 17 , jTextFieldWarrantyExpirationDate.getText () );
            pst.setString ( 18 , jTextFieldAssetExpirationDate.getText () );
            pst.setString ( 19 , jTextFieldService.getText () );
            pst.setString ( 20 , jTextFieldNextService.getText () );
            pst.setString ( 21 , jComboBoxStatusFlag.getSelectedItem ().toString () );
            pst.setString ( 22 , jTextFieldAsOf.getText () );
            pst.setString ( 23 , jComboBoxEquipUsers.getSelectedItem ().toString () );
            pst.setString ( 24 , jTextAreaoOther_notes.getText () );

            pst.executeUpdate ();
            JOptionPane.showMessageDialog ( null , "Successful" );
            updateTable ();

            rs.close ();
            pst.close ();

        }
        catch ( Exception e ) {

            this.setTitle ( "Something is wrong" );

        }
    }//GEN-LAST:event_jButtonInsert3ActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed

        String sql = "update project set "
                     + " asset = '" + jTextFieldAsset.getText () + "',"
                     + " assetdescription = '" + jTextFieldAssetDescription.getText () + "',"
                     + " vendor = '" + jTextFieldVendor.getText () + "',"
                     + " manufacturer = '" + jTextFieldManufacturer.getText () + "',"
                     + " model = '" + jTextFieldModelNu.getText () + "',"
                     + " serial = '" + jTextFieldSerial.getText () + "',"
                     + " equipmentlocaion = '" + jTextFieldEquipLocation.getText () + "',"
                     + " acquiredby = '" + jComboBoxAcquiredBy.getSelectedItem ().toString () + "',"
                     + " purchaceprice = '" + jTextFieldPurchase.getText () + "',"
                     + " yearofmanufacture = '" + jTextFieldYearOfManufacture.getText () + "',"
                     + " assetexpirationdate = '" + jTextFieldAssetExpirationDate.getText () + "',"
                     + " equipcountryoforigin = '" + jComboBoxCountryOfOrigin.getSelectedItem ().toString () + "',"
                     + " powerrecquirement = '" + jComboBoxPowerRecquirement.getSelectedItem ().toString () + "',"
                     + " maintenanceresponsibility = '" + jTextFieldMaintenanceResponsibility.getText () + "',"
                     + " sparepartsavailable = '" + jComboBoxSparePartsAvailable.getSelectedItem ().toString () + "',"
                     + " yeah = '" + jTextFieldYeah.getText () + "',"
                     + " installationdate = '" + jTextFieldInstallationDate.getText () + "',"
                     + " warrantyexpirationdate = '" + jTextFieldWarrantyExpirationDate.getText () + "',"
                     + " service = '" + jTextFieldService.getText () + "',"
                     + " nextservice = '" + jTextFieldNextService.getText () + "',"
                     + " statusflag = '" + jComboBoxStatusFlag.getSelectedItem ().toString () + "',"
                     + " asof = '" + jTextFieldAsOf.getText () + "',"
                     + " equipmentusers = '" + jComboBoxEquipUsers.getSelectedItem ().toString () + "',"
                     + " othernotes = '" + jTextAreaoOther_notes.getText ();

        try {

            pst = conn.prepareStatement ( sql );
            pst.executeUpdate ();
            JOptionPane.showMessageDialog ( null , "Successfully Updated" );
            updateTable ();

            rs.close ();
            pst.close ();

        }
        catch ( Exception e ) {

            this.setTitle ( "Something is wrong" );

        }

    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogoutActionPerformed

        Login lo = new Login ();
        lo.setVisible ( true );
        dispose ();

    }//GEN-LAST:event_jButtonLogoutActionPerformed

    private void jButtonDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDelete1ActionPerformed

        try {

            int row = jTabInfo.getSelectedRow ();
            String cell = jTabInfo.getModel ().getValueAt ( row , 0 ).toString ();
            String sql = "DELETE FROM project WHERE id = " + cell;

            pst = conn.prepareStatement ( sql );
            pst.executeUpdate ();
            JOptionPane.showMessageDialog ( null , "Record Deleted Successfully" );
            updateTable ();

            rs.close ();
            pst.close ();

        }
        catch ( Exception e ) {

            this.setTitle ( "Something is wrong" );

        }
    }//GEN-LAST:event_jButtonDelete1ActionPerformed

    private void jTabInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabInfoMouseClicked

        int row = jTabInfo.getSelectedRow ();
        String selection = jTabInfo.getModel ().getValueAt ( row , 0 ).toString ();
        String sql = "select * from project where id = " + selection;

        try {

            pst = conn.prepareStatement ( sql );
            rs = pst.executeQuery ();

            if ( rs.next () ) {

                jTextFieldAsset.setText ( rs.getString ( "asset" ) );
                jTextFieldAssetDescription.setText ( rs.getString ( "assetdescription" ) );
                jTextFieldManufacturer.setText ( rs.getString ( "manufacturer" ) );
                jTextFieldModelNu.setText ( rs.getString ( "model" ) );
                jTextFieldSerial.setText ( rs.getString ( "serial" ) );
                jTextFieldEquipLocation.setText ( rs.getString ( "equipmentlocaion" ) );
                jTextFieldPurchase.setText ( rs.getString ( "purchaceprice" ) );
                jTextFieldMaintenanceResponsibility.setText ( rs.getString ( "maintenanceresponsibility" ) );
                jTextFieldInstallationDate.setText ( rs.getString ( "installationdate" ) );
                jTextFieldService.setText ( rs.getString ( "service" ) );
                jTextFieldNextService.setText ( rs.getString ( "nextservice" ) );
                jComboBoxStatusFlag.setSelectedItem ( rs.getString ( "statusflag" ) );

            }

            rs.close ();
            pst.close ();

        }
        catch ( Exception e ) {

            this.setTitle ( "Something is wrong" );

        }
    }//GEN-LAST:event_jTabInfoMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDelete1;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonInsert3;
    private javax.swing.JButton jButtonLogout;
    private javax.swing.JButton jButtonPrint;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonSummary;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JComboBox<String> jComboBoxAcquiredBy;
    private javax.swing.JComboBox<String> jComboBoxCountryOfOrigin;
    private javax.swing.JComboBox<String> jComboBoxEquipUsers;
    private javax.swing.JComboBox<String> jComboBoxPowerRecquirement;
    private javax.swing.JComboBox<String> jComboBoxSparePartsAvailable;
    private javax.swing.JComboBox<String> jComboBoxStatusFlag;
    private javax.swing.JLabel jLabelAcquiredBy;
    private javax.swing.JLabel jLabelAsof;
    private javax.swing.JLabel jLabelAsset;
    private javax.swing.JLabel jLabelAssetDescription;
    private javax.swing.JLabel jLabelAssetInstallationDate;
    private javax.swing.JLabel jLabelEquipCountryofOrigin;
    private javax.swing.JLabel jLabelEquipLocation;
    private javax.swing.JLabel jLabelEquipmentUsers;
    private javax.swing.JLabel jLabelIfYEs;
    private javax.swing.JLabel jLabelInstallationDate;
    private javax.swing.JLabel jLabelMaintenance;
    private javax.swing.JLabel jLabelMaintenanceResponsbility;
    private javax.swing.JLabel jLabelManufacturer;
    private javax.swing.JLabel jLabelModel;
    private javax.swing.JLabel jLabelNextMaintenance;
    private javax.swing.JLabel jLabelOther_notes;
    private javax.swing.JLabel jLabelPowerRecquirement;
    private javax.swing.JLabel jLabelPurchasePrice;
    private javax.swing.JLabel jLabelSerialNo;
    private javax.swing.JLabel jLabelSparePartsAvailable;
    private javax.swing.JLabel jLabelStatusFlag;
    private javax.swing.JLabel jLabelVender;
    private javax.swing.JLabel jLabelWarrantyExpirationDate;
    private javax.swing.JLabel jLabelYearofManufacture;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTabInfo;
    private javax.swing.JTextArea jTextAreaData;
    private javax.swing.JTextArea jTextAreaoOther_notes;
    private javax.swing.JTextArea jTextAreaoOther_notes1;
    private javax.swing.JTextField jTextFieldAsOf;
    private javax.swing.JTextField jTextFieldAsset;
    private javax.swing.JTextField jTextFieldAssetDescription;
    private javax.swing.JTextField jTextFieldAssetExpirationDate;
    private javax.swing.JTextField jTextFieldEquipLocation;
    private javax.swing.JTextField jTextFieldInstallationDate;
    private javax.swing.JTextField jTextFieldMaintenanceResponsibility;
    private javax.swing.JTextField jTextFieldManufacturer;
    private javax.swing.JTextField jTextFieldModelNu;
    private javax.swing.JTextField jTextFieldNextService;
    private javax.swing.JTextField jTextFieldPurchase;
    private javax.swing.JTextField jTextFieldSerial;
    private javax.swing.JTextField jTextFieldService;
    private javax.swing.JTextField jTextFieldVendor;
    private javax.swing.JTextField jTextFieldWarrantyExpirationDate;
    private javax.swing.JTextField jTextFieldYeah;
    private javax.swing.JTextField jTextFieldYearOfManufacture;
    // End of variables declaration//GEN-END:variables

}
