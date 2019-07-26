package prototype;

import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

public class project extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    DefaultTableModel model = new DefaultTableModel();

    public project() {

        initComponents();
        conn = project.ConnectDb();
        updateTable();
        updateCombo();

    }

    private void updateCombo() {

        String sql = "select* from project";

        try {

            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {

                jComboBox1.addItem(rs.getString("id"));

            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }
    }

    private void updateTable() {

        String sql = "select * from project";

        try {

            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelAsset = new javax.swing.JLabel();
        jLabelAssetDescription = new javax.swing.JLabel();
        jLabelVender = new javax.swing.JLabel();
        jLabelManufacturer = new javax.swing.JLabel();
        jLabelModel = new javax.swing.JLabel();
        jLabelSerialNo = new javax.swing.JLabel();
        jLabelEquipLocation = new javax.swing.JLabel();
        jLabelAcquiredBy = new javax.swing.JLabel();
        jLabelPurchasePrice = new javax.swing.JLabel();
        jLabelEquipCountryofOrigin = new javax.swing.JLabel();
        jLabelYearofManufacture = new javax.swing.JLabel();
        jLabelPowerRecquirement = new javax.swing.JLabel();
        jLabelMaintenanceResponsbility = new javax.swing.JLabel();
        jLabelSparePartsAvailable = new javax.swing.JLabel();
        jTextFieldMaintenanceResponsibility = new javax.swing.JTextField();
        jTextFieldPurchase = new javax.swing.JTextField();
        jTextFieldEquipLocation = new javax.swing.JTextField();
        jTextFieldSerial = new javax.swing.JTextField();
        jTextFieldModelNu = new javax.swing.JTextField();
        jTextFieldManufacturer = new javax.swing.JTextField();
        jTextFieldVendor = new javax.swing.JTextField();
        jTextFieldAsset = new javax.swing.JTextField();
        jTextFieldAssetDescription = new javax.swing.JTextField();
        jLabelIfYEs = new javax.swing.JLabel();
        jTextFieldYeah = new javax.swing.JTextField();
        jLabelInstallationDate = new javax.swing.JLabel();
        jLabelWarrantyExpirationDate = new javax.swing.JLabel();
        jLabelAssetInstallationDate = new javax.swing.JLabel();
        jLabelStatusFlag = new javax.swing.JLabel();
        jLabelAsof = new javax.swing.JLabel();
        jLabelEquipmentUsers = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaoOther_notes = new javax.swing.JTextArea();
        jLabelOther_notes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaData = new javax.swing.JTextArea();
        jSeparator4 = new javax.swing.JSeparator();
        jButtonDelete1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jButtonInsert3 = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonLogout = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jButtonPrint = new javax.swing.JButton();
        jButtonSummary = new javax.swing.JButton();
        jLabelMaintenance = new javax.swing.JLabel();
        jLabelNextMaintenance = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jComboBoxPowerRecquirement = new javax.swing.JComboBox<>();
        jComboBoxStatusFlag = new javax.swing.JComboBox<>();
        jComboBoxEquipUsers = new javax.swing.JComboBox<>();
        jComboBoxSparePartsAvailable = new javax.swing.JComboBox<>();
        jComboBoxCountryOfOrigin = new javax.swing.JComboBox<>();
        jComboBoxAcquiredBy = new javax.swing.JComboBox<>();
        jTextFieldYearOfManufacture = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextFieldWarrantyExpirationDate = new javax.swing.JTextField();
        jTextFieldInstallationDate = new javax.swing.JTextField();
        jTextFieldAssetExpirationDate = new javax.swing.JTextField();
        jTextFieldService = new javax.swing.JTextField();
        jTextFieldNextService = new javax.swing.JTextField();
        jTextFieldAsOf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelAsset.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabelAsset.setForeground(new java.awt.Color(254, 254, 254));
        jLabelAsset.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelAsset.setText("Asset:");
        jLabelAsset.setToolTipText("Unique number assigned by the facility to identify individual pieces of equipment");
        jLabelAsset.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jLabelAsset, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 25));

        jLabelAssetDescription.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabelAssetDescription.setForeground(new java.awt.Color(254, 254, 254));
        jLabelAssetDescription.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelAssetDescription.setText("Asset Description:");
        jLabelAssetDescription.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jLabelAssetDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 200, -1));

        jLabelVender.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabelVender.setForeground(new java.awt.Color(254, 254, 254));
        jLabelVender.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelVender.setText("Vender:");
        jLabelVender.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jLabelVender, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 200, -1));

        jLabelManufacturer.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabelManufacturer.setForeground(new java.awt.Color(254, 254, 254));
        jLabelManufacturer.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelManufacturer.setText("Manufacturer:");
        jLabelManufacturer.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jLabelManufacturer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 200, -1));

        jLabelModel.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabelModel.setForeground(new java.awt.Color(254, 254, 254));
        jLabelModel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelModel.setText("Model:");
        jLabelModel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jLabelModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 200, -1));

        jLabelSerialNo.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabelSerialNo.setForeground(new java.awt.Color(254, 254, 254));
        jLabelSerialNo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelSerialNo.setText("Serial No:");
        jLabelSerialNo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jLabelSerialNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 200, -1));

        jLabelEquipLocation.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabelEquipLocation.setForeground(new java.awt.Color(254, 254, 254));
        jLabelEquipLocation.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelEquipLocation.setText("Equipment Location:");
        jLabelEquipLocation.setToolTipText("Building, department or room where equipment is installed\n");
        jLabelEquipLocation.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jLabelEquipLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 200, -1));

        jLabelAcquiredBy.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabelAcquiredBy.setForeground(new java.awt.Color(254, 254, 254));
        jLabelAcquiredBy.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelAcquiredBy.setText("Acquired By:");
        jLabelAcquiredBy.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jLabelAcquiredBy, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 200, -1));

        jLabelPurchasePrice.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabelPurchasePrice.setForeground(new java.awt.Color(254, 254, 254));
        jLabelPurchasePrice.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelPurchasePrice.setText("Purchase Price:");
        jLabelPurchasePrice.setToolTipText("Exact amount of money paid for equipment and currency used for payment");
        jLabelPurchasePrice.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jLabelPurchasePrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 200, -1));

        jLabelEquipCountryofOrigin.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabelEquipCountryofOrigin.setForeground(new java.awt.Color(254, 254, 254));
        jLabelEquipCountryofOrigin.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelEquipCountryofOrigin.setText("Equip Country of Origin:");
        jLabelEquipCountryofOrigin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jLabelEquipCountryofOrigin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 200, -1));

        jLabelYearofManufacture.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabelYearofManufacture.setForeground(new java.awt.Color(254, 254, 254));
        jLabelYearofManufacture.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelYearofManufacture.setText("Year of Manufacture:");
        jLabelYearofManufacture.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jLabelYearofManufacture, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 200, -1));

        jLabelPowerRecquirement.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabelPowerRecquirement.setForeground(new java.awt.Color(254, 254, 254));
        jLabelPowerRecquirement.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelPowerRecquirement.setText("Power Recquirement(V):");
        jLabelPowerRecquirement.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jLabelPowerRecquirement, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 200, -1));

        jLabelMaintenanceResponsbility.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabelMaintenanceResponsbility.setForeground(new java.awt.Color(254, 254, 254));
        jLabelMaintenanceResponsbility.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelMaintenanceResponsbility.setText("Maintenance Responsibility:");
        jLabelMaintenanceResponsbility.setToolTipText("Name and code of institution or department, whether an external, central or peripheral workshop or organization responsible for maintenance of equipment");
        jLabelMaintenanceResponsbility.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jLabelMaintenanceResponsbility, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 200, -1));

        jLabelSparePartsAvailable.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabelSparePartsAvailable.setForeground(new java.awt.Color(254, 254, 254));
        jLabelSparePartsAvailable.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelSparePartsAvailable.setText("Spare Parts Available?");
        jLabelSparePartsAvailable.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jLabelSparePartsAvailable, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 200, -1));

        jTextFieldMaintenanceResponsibility.setBackground(new java.awt.Color(7, 13, 49));
        jTextFieldMaintenanceResponsibility.setFont(new java.awt.Font("DejaVu Serif", 0, 14)); // NOI18N
        jTextFieldMaintenanceResponsibility.setForeground(new java.awt.Color(254, 254, 254));
        jTextFieldMaintenanceResponsibility.setToolTipText("Name and code of institution or department, whether an external, central or peripheral workshop or organization responsible for maintenance of equipment");
        jTextFieldMaintenanceResponsibility.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(108, 145, 198), 1, true));
        jTextFieldMaintenanceResponsibility.setCaretColor(new java.awt.Color(254, 254, 254));
        jTextFieldMaintenanceResponsibility.setPreferredSize(new java.awt.Dimension(0, 28));
        getContentPane().add(jTextFieldMaintenanceResponsibility, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 210, -1));

        jTextFieldPurchase.setBackground(new java.awt.Color(7, 13, 49));
        jTextFieldPurchase.setFont(new java.awt.Font("DejaVu Serif", 0, 14)); // NOI18N
        jTextFieldPurchase.setForeground(new java.awt.Color(254, 254, 254));
        jTextFieldPurchase.setToolTipText("Exact amount of money paid for equipment and currency used for payment");
        jTextFieldPurchase.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(108, 145, 198), 1, true));
        jTextFieldPurchase.setCaretColor(new java.awt.Color(254, 254, 254));
        jTextFieldPurchase.setPreferredSize(new java.awt.Dimension(0, 28));
        getContentPane().add(jTextFieldPurchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 210, -1));

        jTextFieldEquipLocation.setBackground(new java.awt.Color(7, 13, 49));
        jTextFieldEquipLocation.setFont(new java.awt.Font("DejaVu Serif", 0, 14)); // NOI18N
        jTextFieldEquipLocation.setForeground(new java.awt.Color(254, 254, 254));
        jTextFieldEquipLocation.setToolTipText("Building, department or room where equipment is installed\n");
        jTextFieldEquipLocation.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(108, 145, 198), 1, true));
        jTextFieldEquipLocation.setCaretColor(new java.awt.Color(254, 254, 254));
        jTextFieldEquipLocation.setPreferredSize(new java.awt.Dimension(0, 28));
        getContentPane().add(jTextFieldEquipLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 210, -1));

        jTextFieldSerial.setBackground(new java.awt.Color(7, 13, 49));
        jTextFieldSerial.setFont(new java.awt.Font("DejaVu Serif", 0, 14)); // NOI18N
        jTextFieldSerial.setForeground(new java.awt.Color(254, 254, 254));
        jTextFieldSerial.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(108, 145, 198), 1, true));
        jTextFieldSerial.setCaretColor(new java.awt.Color(254, 254, 254));
        jTextFieldSerial.setPreferredSize(new java.awt.Dimension(0, 28));
        getContentPane().add(jTextFieldSerial, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 210, -1));

        jTextFieldModelNu.setBackground(new java.awt.Color(7, 13, 49));
        jTextFieldModelNu.setFont(new java.awt.Font("DejaVu Serif", 0, 14)); // NOI18N
        jTextFieldModelNu.setForeground(new java.awt.Color(254, 254, 254));
        jTextFieldModelNu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(108, 145, 198), 1, true));
        jTextFieldModelNu.setCaretColor(new java.awt.Color(254, 254, 254));
        jTextFieldModelNu.setPreferredSize(new java.awt.Dimension(0, 28));
        getContentPane().add(jTextFieldModelNu, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 210, -1));

        jTextFieldManufacturer.setBackground(new java.awt.Color(7, 13, 49));
        jTextFieldManufacturer.setFont(new java.awt.Font("DejaVu Serif", 0, 14)); // NOI18N
        jTextFieldManufacturer.setForeground(new java.awt.Color(254, 254, 254));
        jTextFieldManufacturer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(108, 145, 198), 1, true));
        jTextFieldManufacturer.setCaretColor(new java.awt.Color(254, 254, 254));
        jTextFieldManufacturer.setPreferredSize(new java.awt.Dimension(0, 28));
        getContentPane().add(jTextFieldManufacturer, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 210, -1));

        jTextFieldVendor.setBackground(new java.awt.Color(7, 13, 49));
        jTextFieldVendor.setFont(new java.awt.Font("DejaVu Serif", 0, 14)); // NOI18N
        jTextFieldVendor.setForeground(new java.awt.Color(254, 254, 254));
        jTextFieldVendor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(108, 145, 198), 1, true));
        jTextFieldVendor.setCaretColor(new java.awt.Color(254, 254, 254));
        jTextFieldVendor.setPreferredSize(new java.awt.Dimension(0, 28));
        getContentPane().add(jTextFieldVendor, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 210, -1));

        jTextFieldAsset.setBackground(new java.awt.Color(7, 13, 49));
        jTextFieldAsset.setFont(new java.awt.Font("DejaVu Serif", 0, 14)); // NOI18N
        jTextFieldAsset.setForeground(new java.awt.Color(254, 254, 254));
        jTextFieldAsset.setToolTipText("Name of the equipment");
        jTextFieldAsset.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(108, 145, 198), 1, true));
        jTextFieldAsset.setCaretColor(new java.awt.Color(254, 254, 254));
        jTextFieldAsset.setPreferredSize(new java.awt.Dimension(0, 28));
        getContentPane().add(jTextFieldAsset, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 210, -1));

        jTextFieldAssetDescription.setBackground(new java.awt.Color(7, 13, 49));
        jTextFieldAssetDescription.setFont(new java.awt.Font("DejaVu Serif", 0, 14)); // NOI18N
        jTextFieldAssetDescription.setForeground(new java.awt.Color(254, 254, 254));
        jTextFieldAssetDescription.setToolTipText("Brief desciption of the machin or equipment like what it does");
        jTextFieldAssetDescription.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(108, 145, 198), 1, true));
        jTextFieldAssetDescription.setCaretColor(new java.awt.Color(254, 254, 254));
        jTextFieldAssetDescription.setPreferredSize(new java.awt.Dimension(0, 28));
        getContentPane().add(jTextFieldAssetDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 210, -1));

        jLabelIfYEs.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabelIfYEs.setForeground(new java.awt.Color(254, 254, 254));
        jLabelIfYEs.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelIfYEs.setText("If yes, what, how many, and where are they Located?");
        jLabelIfYEs.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jLabelIfYEs, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 380, -1));

        jTextFieldYeah.setBackground(new java.awt.Color(7, 13, 49));
        jTextFieldYeah.setFont(new java.awt.Font("DejaVu Serif", 0, 14)); // NOI18N
        jTextFieldYeah.setForeground(new java.awt.Color(254, 254, 254));
        jTextFieldYeah.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(108, 145, 198), 1, true));
        jTextFieldYeah.setCaretColor(new java.awt.Color(254, 254, 254));
        jTextFieldYeah.setPreferredSize(new java.awt.Dimension(0, 28));
        getContentPane().add(jTextFieldYeah, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 410, -1));

        jLabelInstallationDate.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabelInstallationDate.setForeground(new java.awt.Color(254, 254, 254));
        jLabelInstallationDate.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelInstallationDate.setText("Installation Date:");
        jLabelInstallationDate.setToolTipText("Date when equipment was offi cially accepted and put into operation");
        jLabelInstallationDate.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jLabelInstallationDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 190, -1));

        jLabelWarrantyExpirationDate.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabelWarrantyExpirationDate.setForeground(new java.awt.Color(254, 254, 254));
        jLabelWarrantyExpirationDate.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelWarrantyExpirationDate.setText("Warranty Expiration Data:");
        jLabelWarrantyExpirationDate.setToolTipText("Date warranty expires; usually indicated on purchase order");
        jLabelWarrantyExpirationDate.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jLabelWarrantyExpirationDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 190, -1));

        jLabelAssetInstallationDate.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabelAssetInstallationDate.setForeground(new java.awt.Color(254, 254, 254));
        jLabelAssetInstallationDate.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelAssetInstallationDate.setText("Asset Expiration Date:");
        jLabelAssetInstallationDate.setToolTipText("Date when equipment was offi cially accepted and put into operation");
        jLabelAssetInstallationDate.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jLabelAssetInstallationDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 190, -1));

        jLabelStatusFlag.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabelStatusFlag.setForeground(new java.awt.Color(8, 14, 50));
        jLabelStatusFlag.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelStatusFlag.setText("Status Flag:");
        jLabelStatusFlag.setToolTipText("Indicates current status of the equipment (e.g. operational, out of order, awaiting spares, due for replacement)");
        jLabelStatusFlag.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jLabelStatusFlag, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 190, -1));

        jLabelAsof.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabelAsof.setForeground(new java.awt.Color(8, 14, 50));
        jLabelAsof.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelAsof.setText("As of:");
        jLabelAsof.setToolTipText("Date of Status flag");
        jLabelAsof.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jLabelAsof, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 190, -1));

        jLabelEquipmentUsers.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabelEquipmentUsers.setForeground(new java.awt.Color(8, 14, 50));
        jLabelEquipmentUsers.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelEquipmentUsers.setText("Equipment Users:");
        jLabelEquipmentUsers.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jLabelEquipmentUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 190, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Asset", "Description", "Vendor", "Manufacturer", "Model", "Serial No.", "Location", "Acquired by", "Purchuase Price", "Equip Origin", "Year of Manufacture", "Power Recquirement", "Maintenance Responsibility", "Spare Parts Available?", "Yeah", "Insatallation Date", "Warranty Expiration Date", "Asset Expiration Date", "Service Date", "Next Service Date", "Status Flag", "As of", "Equip Users", "Other notes"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable1);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 1440, 130));

        jScrollPane2.setBackground(java.awt.Color.darkGray);
        jScrollPane2.setForeground(java.awt.SystemColor.text);

        jTextAreaoOther_notes.setBackground(new java.awt.Color(7, 13, 49));
        jTextAreaoOther_notes.setColumns(20);
        jTextAreaoOther_notes.setFont(new java.awt.Font("DejaVu Serif", 0, 14)); // NOI18N
        jTextAreaoOther_notes.setForeground(new java.awt.Color(254, 254, 254));
        jTextAreaoOther_notes.setLineWrap(true);
        jTextAreaoOther_notes.setRows(5);
        jTextAreaoOther_notes.setWrapStyleWord(true);
        jTextAreaoOther_notes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 254, 254), 1, true));
        jScrollPane2.setViewportView(jTextAreaoOther_notes);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, 240, 120));

        jLabelOther_notes.setBackground(new java.awt.Color(0, 4, 36));
        jLabelOther_notes.setFont(new java.awt.Font("Bitstream Charter", 1, 14)); // NOI18N
        jLabelOther_notes.setForeground(new java.awt.Color(8, 14, 50));
        jLabelOther_notes.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelOther_notes.setText("Other notes:");
        jLabelOther_notes.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jLabelOther_notes, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 140, 20));

        jTextAreaData.setEditable(false);
        jTextAreaData.setBackground(new java.awt.Color(7, 13, 49));
        jTextAreaData.setColumns(20);
        jTextAreaData.setFont(new java.awt.Font("Ubuntu Light", 1, 14)); // NOI18N
        jTextAreaData.setForeground(new java.awt.Color(254, 254, 254));
        jTextAreaData.setLineWrap(true);
        jTextAreaData.setRows(5);
        jTextAreaData.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(31, 64, 131), 2, true), javax.swing.BorderFactory.createTitledBorder(null, "SUMMARY", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("URW Chancery L", 1, 14), new java.awt.Color(158, 167, 189)))); // NOI18N
        jScrollPane1.setViewportView(jTextAreaData);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, 570, 530));

        jSeparator4.setBackground(new java.awt.Color(1, 1, 1));
        jSeparator4.setForeground(new java.awt.Color(1, 1, 1));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 212, 255), 2, true));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, -1, 540));

        jButtonDelete1.setBackground(new java.awt.Color(7, 13, 47));
        jButtonDelete1.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jButtonDelete1.setForeground(new java.awt.Color(250, 248, 249));
        jButtonDelete1.setText("DELETE");
        jButtonDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDelete1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDelete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 450, 130, 40));

        jSeparator2.setBackground(new java.awt.Color(1, 1, 1));
        jSeparator2.setForeground(new java.awt.Color(1, 1, 1));
        jSeparator2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 212, 255), 2, true));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, 570, -1));

        jSeparator3.setBackground(new java.awt.Color(1, 1, 1));
        jSeparator3.setForeground(new java.awt.Color(1, 1, 1));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 212, 255), 2, true));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, -1, 110));

        jButtonInsert3.setBackground(new java.awt.Color(7, 13, 47));
        jButtonInsert3.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jButtonInsert3.setForeground(new java.awt.Color(250, 248, 249));
        jButtonInsert3.setText("INSERT");
        jButtonInsert3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsert3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonInsert3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, 130, 40));

        jButtonUpdate.setBackground(new java.awt.Color(7, 13, 47));
        jButtonUpdate.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jButtonUpdate.setForeground(new java.awt.Color(250, 248, 249));
        jButtonUpdate.setText("UPDATE");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, 130, 40));

        jButtonLogout.setBackground(new java.awt.Color(250, 246, 245));
        jButtonLogout.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jButtonLogout.setForeground(new java.awt.Color(7, 13, 49));
        jButtonLogout.setText("LOGOUT");
        jButtonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 450, 130, 40));

        jButtonExit.setBackground(new java.awt.Color(250, 246, 245));
        jButtonExit.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jButtonExit.setForeground(new java.awt.Color(7, 13, 49));
        jButtonExit.setText("EXIT");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 500, 130, 40));

        jButtonReset.setBackground(new java.awt.Color(27, 55, 118));
        jButtonReset.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jButtonReset.setForeground(new java.awt.Color(211, 200, 216));
        jButtonReset.setText("RESET");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 500, 130, 40));

        jButtonPrint.setBackground(new java.awt.Color(196, 165, 209));
        jButtonPrint.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jButtonPrint.setText("PRINT");
        jButtonPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrintActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 500, 130, 40));

        jButtonSummary.setBackground(new java.awt.Color(196, 165, 209));
        jButtonSummary.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jButtonSummary.setText("SUMMARY");
        jButtonSummary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSummaryActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSummary, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 500, 130, 40));

        jLabelMaintenance.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabelMaintenance.setForeground(new java.awt.Color(254, 254, 254));
        jLabelMaintenance.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelMaintenance.setText("Maintenained/Serviced On:");
        jLabelMaintenance.setToolTipText("Date when equipment was offi cially accepted and put into operation");
        jLabelMaintenance.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jLabelMaintenance, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 190, -1));

        jLabelNextMaintenance.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabelNextMaintenance.setForeground(new java.awt.Color(254, 254, 254));
        jLabelNextMaintenance.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelNextMaintenance.setText("Next Maintenance/Service");
        jLabelNextMaintenance.setToolTipText("Date warranty expires; usually indicated on purchase order");
        jLabelNextMaintenance.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jLabelNextMaintenance, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 190, -1));

        jSeparator1.setBackground(new java.awt.Color(1, 1, 1));
        jSeparator1.setForeground(new java.awt.Color(1, 1, 1));
        jSeparator1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 212, 255), 2, true));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 1440, -1));

        jSeparator5.setBackground(new java.awt.Color(1, 1, 1));
        jSeparator5.setForeground(new java.awt.Color(1, 1, 1));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 212, 255), 2, true));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 440, -1, 110));

        jComboBoxPowerRecquirement.setBackground(new java.awt.Color(7, 13, 49));
        jComboBoxPowerRecquirement.setFont(new java.awt.Font("DejaVu Serif", 0, 14)); // NOI18N
        jComboBoxPowerRecquirement.setForeground(new java.awt.Color(252, 248, 245));
        jComboBoxPowerRecquirement.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "220", "210" }));
        jComboBoxPowerRecquirement.setSelectedItem(null);
        jComboBoxPowerRecquirement.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(108, 145, 198), 1, true));
        jComboBoxPowerRecquirement.setPreferredSize(new java.awt.Dimension(210, 28));
        getContentPane().add(jComboBoxPowerRecquirement, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, -1, -1));

        jComboBoxStatusFlag.setBackground(new java.awt.Color(7, 13, 49));
        jComboBoxStatusFlag.setFont(new java.awt.Font("DejaVu Serif", 0, 14)); // NOI18N
        jComboBoxStatusFlag.setForeground(new java.awt.Color(252, 248, 245));
        jComboBoxStatusFlag.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Operational", "Out of Order", "Awaiting Spares", "Due for Replacement " }));
        jComboBoxStatusFlag.setSelectedItem(null);
        jComboBoxStatusFlag.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(108, 145, 198), 1, true));
        jComboBoxStatusFlag.setPreferredSize(new java.awt.Dimension(210, 28));
        getContentPane().add(jComboBoxStatusFlag, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, -1, -1));

        jComboBoxEquipUsers.setBackground(new java.awt.Color(7, 13, 49));
        jComboBoxEquipUsers.setFont(new java.awt.Font("DejaVu Serif", 0, 14)); // NOI18N
        jComboBoxEquipUsers.setForeground(new java.awt.Color(252, 248, 245));
        jComboBoxEquipUsers.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Students", "Lecturers", "Administration", "Guests" }));
        jComboBoxEquipUsers.setSelectedItem(null);
        jComboBoxEquipUsers.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(108, 145, 198), 1, true));
        jComboBoxEquipUsers.setPreferredSize(new java.awt.Dimension(210, 28));
        getContentPane().add(jComboBoxEquipUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, -1, -1));

        jComboBoxSparePartsAvailable.setBackground(new java.awt.Color(7, 13, 49));
        jComboBoxSparePartsAvailable.setFont(new java.awt.Font("DejaVu Serif", 0, 14)); // NOI18N
        jComboBoxSparePartsAvailable.setForeground(new java.awt.Color(252, 248, 245));
        jComboBoxSparePartsAvailable.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "YES", "NO" }));
        jComboBoxSparePartsAvailable.setSelectedItem(null);
        jComboBoxSparePartsAvailable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(108, 145, 198), 1, true));
        jComboBoxSparePartsAvailable.setPreferredSize(new java.awt.Dimension(210, 28));
        getContentPane().add(jComboBoxSparePartsAvailable, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, -1, -1));

        jComboBoxCountryOfOrigin.setBackground(new java.awt.Color(7, 13, 49));
        jComboBoxCountryOfOrigin.setFont(new java.awt.Font("DejaVu Serif", 0, 14)); // NOI18N
        jComboBoxCountryOfOrigin.setForeground(new java.awt.Color(252, 248, 245));
        jComboBoxCountryOfOrigin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Abkhazia", "Afghanistan", "Åland Islands", "Albania", "Algeria", "American Samoa", "Andorra", "Angola", "Anguilla", "Antigua and Barbuda", "Argentina", "Armenia", "Aruba", "Ascension", "Australia", "Australian Antarctic Territory", "Australian External Territories", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Barbuda", "Belarus", "Belgium", "Belize", "Benin", "Bermuda", "Bhutan", "Bolivia", "Bonaire", "Bosnia and Herzegovina", "Botswana", "Brazil", "British Indian Ocean Territory", "British Virgin Islands", "Brunei Darussalam", "Bulgaria", "Burkina Faso", "Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Caribbean Netherlands", "Cayman Islands", "Central African Republic", "Chad", "Chatham Island, New Zealand", "Chile", "China", "Christmas Island", "Cocos (Keeling) Islands", "Colombia", "Comoros", "Congo", "Congo, Democratic Republic of the (Zaire)", "Cook Islands", "Costa Rica", "Ivory Coast", "Croatia", "Cuba", "Guantanamo Bay, Cuba", "Curaçao", "Cyprus", "Czech Republic", "Denmark", "Diego Garcia", "Djibouti", "Dominica", "Dominican Republic", "East Timor", "Easter Island", "Ecuador", "Egypt", "El Salvador", "Ellipso (Mobile Satellite service)", "EMSAT (Mobile Satellite service)", "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Falkland Islands", "Faroe Islands", "Fiji", "Finland", "France", "French Antilles", "French Guiana", "French Polynesia", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Gibraltar", "Global Mobile Satellite System (GMSS)", "Globalstar (Mobile Satellite Service)", "Greece", "Greenland", "Grenada", "Guadeloupe", "Guam", "Guatemala", "Guernsey", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Honduras", "Hong Kong", "Hungary", "Iceland", "ICO Global (Mobile Satellite Service)", "India", "Indonesia", "Inmarsat SNAC", "International Freephone Service (UIFN)", "International Networks", "International Premium Rate Service’", "International Shared Cost Service (ISCS)", "Iran", "Iraq", "Ireland", "Iridium (Mobile Satellite service)", "Isle of Man", "Israel", "Italy", "Jamaica", "Jan Mayen", "Japan", "Jersey", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Korea, North", "Korea, South", "Kosovo", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Macau", "Macedonia", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Martinique", "Mauritania", "Mauritius", "Mayotte", "Mexico", "Micronesia, Federated States of", "Midway Island, USA", "Moldova", "Monaco", "Mongolia", "Montenegro", "Montserrat", "Morocco", "Mozambique", "Myanmar", "Nagorno-Karabakh", "Namibia", "Nauru", "Nepal", "Netherlands", "Nevis", "New Caledonia", "New Zealand", "Nicaragua", "Niger", "Nigeria", "Niue", "Norfolk Island", "Northern Cyprus", "Northern Ireland", "Northern Mariana Islands", "Norway", "Oman", "Pakistan", "Palau", "Palestine, State of", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Pitcairn Islands", "Poland", "Portugal", "Puerto Rico", "Qatar", "Réunion", "Romania", "Russia", "Rwanda", "Saba", "Saint Barthélemy", "Saint Helena", "Saint Kitts and Nevis", "Saint Lucia", "Saint Martin (France)", "Saint Pierre and Miquelon", "Saint Vincent and the Grenadines", "Samoa", "San Marino", "São Tomé and Príncipe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Sint Eustatius", "Sint Maarten (Netherlands)", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Georgia and the South Sandwich Islands", "South Ossetia", "South Sudan", "Spain", "Sri Lanka", "Sudan", "Suriname", "Svalbard", "Swaziland", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania", "Telecommunications for Disaster Relief by OCHA", "Thailand", "Thuraya (Mobile Satellite service)", "Togo", "Tokelau", "Tonga", "Transnistria", "Trinidad and Tobago", "Tristan da Cunha", "Tunisia", "Turkey", "Turkmenistan", "Turks and Caicos Islands", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "Universal Personal Telecommunications (UPT)", "Uruguay", "US Virgin Islands", "Uzbekistan", "Vanuatu", "Venezuela", "Vatican City State (Holy See)", "Vietnam", "Wake Island, USA", "Wallis and Futuna", "Yemen", "Zambia", "Zanzibar", "Zimbabwe" }));
        jComboBoxCountryOfOrigin.setSelectedItem(null);
        jComboBoxCountryOfOrigin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(108, 145, 198), 1, true));
        jComboBoxCountryOfOrigin.setPreferredSize(new java.awt.Dimension(210, 28));
        getContentPane().add(jComboBoxCountryOfOrigin, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, -1, -1));

        jComboBoxAcquiredBy.setBackground(new java.awt.Color(7, 13, 49));
        jComboBoxAcquiredBy.setFont(new java.awt.Font("DejaVu Serif", 0, 14)); // NOI18N
        jComboBoxAcquiredBy.setForeground(new java.awt.Color(252, 248, 245));
        jComboBoxAcquiredBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Purchase", "Donation" }));
        jComboBoxAcquiredBy.setSelectedItem(null);
        jComboBoxAcquiredBy.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(108, 145, 198), 1, true));
        jComboBoxAcquiredBy.setPreferredSize(new java.awt.Dimension(210, 28));
        getContentPane().add(jComboBoxAcquiredBy, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        jTextFieldYearOfManufacture.setBackground(new java.awt.Color(7, 13, 49));
        jTextFieldYearOfManufacture.setFont(new java.awt.Font("DejaVu Serif Condensed", 0, 14)); // NOI18N
        jTextFieldYearOfManufacture.setForeground(new java.awt.Color(253, 243, 244));
        jTextFieldYearOfManufacture.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(108, 145, 198), 1, true));
        getContentPane().add(jTextFieldYearOfManufacture, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 210, 28));

        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 270, 30));

        jTextFieldWarrantyExpirationDate.setBackground(new java.awt.Color(7, 13, 49));
        jTextFieldWarrantyExpirationDate.setForeground(new java.awt.Color(254, 254, 254));
        jTextFieldWarrantyExpirationDate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(108, 145, 198), 1, true));
        jTextFieldWarrantyExpirationDate.setCaretColor(new java.awt.Color(254, 254, 254));
        getContentPane().add(jTextFieldWarrantyExpirationDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, 210, 28));

        jTextFieldInstallationDate.setBackground(new java.awt.Color(7, 13, 49));
        jTextFieldInstallationDate.setForeground(new java.awt.Color(254, 254, 254));
        jTextFieldInstallationDate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(108, 145, 198), 1, true));
        jTextFieldInstallationDate.setCaretColor(new java.awt.Color(254, 254, 254));
        getContentPane().add(jTextFieldInstallationDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 210, 28));

        jTextFieldAssetExpirationDate.setBackground(new java.awt.Color(7, 13, 49));
        jTextFieldAssetExpirationDate.setForeground(new java.awt.Color(254, 254, 254));
        jTextFieldAssetExpirationDate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(108, 145, 198), 1, true));
        jTextFieldAssetExpirationDate.setCaretColor(new java.awt.Color(254, 254, 254));
        getContentPane().add(jTextFieldAssetExpirationDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, 210, 28));

        jTextFieldService.setBackground(new java.awt.Color(7, 13, 49));
        jTextFieldService.setForeground(new java.awt.Color(254, 254, 254));
        jTextFieldService.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(108, 145, 198), 1, true));
        jTextFieldService.setCaretColor(new java.awt.Color(254, 254, 254));
        getContentPane().add(jTextFieldService, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, 210, 28));

        jTextFieldNextService.setBackground(new java.awt.Color(7, 13, 49));
        jTextFieldNextService.setForeground(new java.awt.Color(254, 254, 254));
        jTextFieldNextService.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(108, 145, 198), 1, true));
        jTextFieldNextService.setCaretColor(new java.awt.Color(254, 254, 254));
        getContentPane().add(jTextFieldNextService, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, 210, 28));

        jTextFieldAsOf.setBackground(new java.awt.Color(7, 13, 49));
        jTextFieldAsOf.setForeground(new java.awt.Color(254, 254, 254));
        jTextFieldAsOf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(108, 145, 198), 1, true));
        jTextFieldAsOf.setCaretColor(new java.awt.Color(254, 254, 254));
        getContentPane().add(jTextFieldAsOf, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 250, 210, 28));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/space_sky_spiral_galaxy_99967_1600x900.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1460, 710));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static Connection ConnectDb() {

        try {

            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:prototypemain.db");

            return conn;

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

            return null;

        }

    }

    private JFrame frame;

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        int row = jTable1.getSelectedRow();
        String selection = jTable1.getModel().getValueAt(row, 0).toString();
        String sql = "select * from project where id = " + selection;

        try {

            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            if (rs.next()) {

                jTextFieldAsset.setText(rs.getString("asset"));
                jTextFieldAssetDescription.setText(rs.getString("assetdescription"));
                jTextFieldVendor.setText(rs.getString("vendor"));
                jTextFieldManufacturer.setText(rs.getString("manufacturer"));
                jTextFieldModelNu.setText(rs.getString("model"));
                jTextFieldSerial.setText(rs.getString("serial"));
                jTextFieldEquipLocation.setText(rs.getString("equipmentlocaion"));
                jComboBoxAcquiredBy.setSelectedItem(rs.getString("acquiredby"));
                jTextFieldPurchase.setText(rs.getString("purchaceprice"));
                jTextFieldYearOfManufacture.setText(rs.getString("yearofmanufacture"));
                jTextFieldAssetExpirationDate.setText(rs.getString("assetexpirationdate"));
                jComboBoxCountryOfOrigin.setSelectedItem(rs.getString("equipcountryoforigin"));
                jComboBoxPowerRecquirement.setSelectedItem(rs.getString("powerrecquirement"));
                jTextFieldMaintenanceResponsibility.setText(rs.getString("maintenanceresponsibility"));
                jComboBoxSparePartsAvailable.setSelectedItem(rs.getString("sparepartsavailable"));
                jTextFieldYeah.setText(rs.getString("yeah"));
                jTextFieldInstallationDate.setText(rs.getString("installationdate"));
                jTextFieldWarrantyExpirationDate.setText(rs.getString("warrantyexpirationdate"));
                jTextFieldService.setText(rs.getString("service"));
                jTextFieldNextService.setText(rs.getString("nextservice"));
                jComboBoxStatusFlag.setSelectedItem(rs.getString("statusflag"));
                jTextFieldAsOf.setText(rs.getString("asof"));
                jComboBoxEquipUsers.setSelectedItem(rs.getString("equipmentusers"));
                jTextAreaoOther_notes.setText(rs.getString("othernotes"));

            }

            rs.close();
            pst.close();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        frame = new JFrame("Exit");
        if (JOptionPane.YES_NO_OPTION == JOptionPane.showConfirmDialog(frame, "comfirm exit", "University Equipment Database Management System",
                JOptionPane.YES_NO_OPTION)) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed

        jTextFieldAsset.setText(null);
        jTextFieldAssetDescription.setText(null);
        jTextFieldVendor.setText(null);
        jTextFieldManufacturer.setText(null);
        jTextFieldModelNu.setText(null);
        jTextFieldSerial.setText(null);
        jTextFieldEquipLocation.setText(null);
        jComboBoxAcquiredBy.setSelectedItem(null);
        jTextFieldPurchase.setText(null);
        jTextFieldYearOfManufacture.setText(null);
        jTextFieldAssetExpirationDate.setText(null);
        jComboBoxCountryOfOrigin.setSelectedItem(null);
        jComboBoxPowerRecquirement.setSelectedItem(null);
        jTextFieldMaintenanceResponsibility.setText(null);
        jComboBoxSparePartsAvailable.setSelectedItem(null);
        jTextFieldYeah.setText(null);
        jTextFieldInstallationDate.setText(null);
        jTextFieldWarrantyExpirationDate.setText(null);
        jTextFieldService.setText(null);
        jTextFieldNextService.setText(null);
        jComboBoxStatusFlag.setSelectedItem(null);
        jTextFieldAsOf.setText(null);
        jComboBoxEquipUsers.setSelectedItem(null);
        jTextAreaoOther_notes.setText(null);

    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jButtonPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrintActionPerformed

        try {

            jTextAreaData.print();

        } catch (PrinterException ex) {

            Logger.getLogger(project.class.getName()).log(Level.SEVERE, null, ex);

        }
    }//GEN-LAST:event_jButtonPrintActionPerformed

    private void jButtonSummaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSummaryActionPerformed

        String All2 = (jTextFieldAsset.getText());
        String All3 = (jTextFieldAssetDescription.getText());
        String All4 = (jTextFieldVendor.getText());
        String All5 = (jTextFieldManufacturer.getText());
        String All6 = (jTextFieldModelNu.getText());
        String All7 = (jTextFieldSerial.getText());
        String All8 = (jTextFieldEquipLocation.getText());
        String All9 = (jComboBoxAcquiredBy.getSelectedItem().toString());
        String All10 = (jTextFieldPurchase.getText());
        String All11 = (jComboBoxCountryOfOrigin.getSelectedItem().toString());
        String All12 = (jTextFieldYearOfManufacture.getText());
        String All13 = (jComboBoxPowerRecquirement.getSelectedItem().toString());
        String All14 = (jTextFieldMaintenanceResponsibility.getText());
        String All15 = (jComboBoxSparePartsAvailable.getSelectedItem().toString());
        String All16 = (jTextFieldInstallationDate.getText());
        String All17 = (jTextFieldWarrantyExpirationDate.getText());
        String All18 = (jTextFieldAssetExpirationDate.getText());
        String All19 = (jComboBoxStatusFlag.getSelectedItem().toString());
        String All20 = (jTextFieldAsOf.getText());
        String All21 = (jComboBoxEquipUsers.getSelectedItem().toString());
        String All22 = (jTextFieldService.getText());
        String All23 = (jTextFieldNextService.getText());
        String All24 = (jTextAreaoOther_notes.getText());
        String All25 = "";

        jTextAreaData.setText("");
        jTextAreaData.append(
                "\n\t University Equipment Database Management System\n"
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

            pst = conn.prepareStatement(sql);

            pst.setString(1, jTextFieldAsset.getText());
            pst.setString(2, jTextFieldAssetDescription.getText());
            pst.setString(3, jTextFieldVendor.getText());
            pst.setString(4, jTextFieldManufacturer.getText());
            pst.setString(5, jTextFieldModelNu.getText());
            pst.setString(6, jTextFieldSerial.getText());
            pst.setString(7, jTextFieldEquipLocation.getText());
            pst.setString(8, jComboBoxAcquiredBy.getSelectedItem().toString());
            pst.setString(9, jTextFieldPurchase.getText());
            pst.setString(10, jComboBoxCountryOfOrigin.getSelectedItem().toString());
            pst.setString(11, jTextFieldYearOfManufacture.getText());
            pst.setString(12, jComboBoxPowerRecquirement.getSelectedItem().toString());
            pst.setString(13, jTextFieldMaintenanceResponsibility.getText());
            pst.setString(14, jComboBoxSparePartsAvailable.getSelectedItem().toString());
            pst.setString(15, jTextFieldYeah.getText());
            pst.setString(16, jTextFieldInstallationDate.getText());
            pst.setString(17, jTextFieldWarrantyExpirationDate.getText());
            pst.setString(18, jTextFieldAssetExpirationDate.getText());
            pst.setString(19, jTextFieldService.getText());
            pst.setString(20, jTextFieldNextService.getText());
            pst.setString(21, jComboBoxStatusFlag.getSelectedItem().toString());
            pst.setString(22, jTextFieldAsOf.getText());
            pst.setString(23, jComboBoxEquipUsers.getSelectedItem().toString());
            pst.setString(24, jTextAreaoOther_notes.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successful");
            updateTable();

            rs.close();
            pst.close();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_jButtonInsert3ActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed

        String sql = "update project set "
                + " asset = '" + jTextFieldAsset.getText() + "',"
                + " assetdescription = '" + jTextFieldAssetDescription.getText() + "',"
                + " vendor = '" + jTextFieldVendor.getText() + "',"
                + " manufacturer = '" + jTextFieldManufacturer.getText() + "',"
                + " model = '" + jTextFieldModelNu.getText() + "',"
                + " serial = '" + jTextFieldSerial.getText() + "',"
                + " equipmentlocaion = '" + jTextFieldEquipLocation.getText() + "',"
                + " acquiredby = '" + jComboBoxAcquiredBy.getSelectedItem().toString() + "',"
                + " purchaceprice = '" + jTextFieldPurchase.getText() + "',"
                + " yearofmanufacture = '" + jTextFieldYearOfManufacture.getText() + "',"
                + " assetexpirationdate = '" + jTextFieldAssetExpirationDate.getText() + "',"
                + " equipcountryoforigin = '" + jComboBoxCountryOfOrigin.getSelectedItem().toString() + "',"
                + " powerrecquirement = '" + jComboBoxPowerRecquirement.getSelectedItem().toString() + "',"
                + " maintenanceresponsibility = '" + jTextFieldMaintenanceResponsibility.getText() + "',"
                + " sparepartsavailable = '" + jComboBoxSparePartsAvailable.getSelectedItem().toString() + "',"
                + " yeah = '" + jTextFieldYeah.getText() + "',"
                + " installationdate = '" + jTextFieldInstallationDate.getText() + "',"
                + " warrantyexpirationdate = '" + jTextFieldWarrantyExpirationDate.getText() + "',"
                + " service = '" + jTextFieldService.getText() + "',"
                + " nextservice = '" + jTextFieldNextService.getText() + "',"
                + " statusflag = '" + jComboBoxStatusFlag.getSelectedItem().toString() + "',"
                + " asof = '" + jTextFieldAsOf.getText() + "',"
                + " equipmentusers = '" + jComboBoxEquipUsers.getSelectedItem().toString() + "',"
                + " othernotes = '" + jTextAreaoOther_notes.getText() + "'"
                + " where id = " + jComboBox1.getSelectedItem().toString();

        try {

            pst = conn.prepareStatement(sql);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfully Updated");
            updateTable();

            rs.close();
            pst.close();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogoutActionPerformed
        Login lo = new Login();
        lo.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonLogoutActionPerformed

    private void jButtonDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDelete1ActionPerformed

        try {

            int row = jTable1.getSelectedRow();
            String cell = jTable1.getModel().getValueAt(row, 0).toString();
            String sql = "DELETE FROM project WHERE id = " + cell;

            pst = conn.prepareStatement(sql);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Record Deleted Successfully");
            updateTable();

            rs.close();
            pst.close();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_jButtonDelete1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDelete1;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonInsert3;
    private javax.swing.JButton jButtonLogout;
    private javax.swing.JButton jButtonPrint;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonSummary;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBoxAcquiredBy;
    private javax.swing.JComboBox<String> jComboBoxCountryOfOrigin;
    private javax.swing.JComboBox<String> jComboBoxEquipUsers;
    private javax.swing.JComboBox<String> jComboBoxPowerRecquirement;
    private javax.swing.JComboBox<String> jComboBoxSparePartsAvailable;
    private javax.swing.JComboBox<String> jComboBoxStatusFlag;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextAreaData;
    private javax.swing.JTextArea jTextAreaoOther_notes;
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
