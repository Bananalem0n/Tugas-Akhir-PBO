/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package data;
import tools.DBconnection;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import tools.Function;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;  

public class Form_Transaksi extends javax.swing.JFrame {

    DefaultTableModel tblmodel;
    Connection conn;
    Function function = new Function();
    String arr[] = {"id_transaksi","id_karyawan","id_tipe_kendaraan","id_cabang","liter","tanggal"}, 
           nama_table = "transaksi";
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
    LocalDateTime now = LocalDateTime.now(); 
    
    
    public Form_Transaksi() {
        initComponents();
        
        DBconnection openconn = new DBconnection();
        this.conn = openconn.create_connection();
        this.tblmodel = (DefaultTableModel)TblTransaksi.getModel();
        function.load_table(tblmodel, arr, nama_table);
        TxtTanggalWaktu.setText(dtf.format(now));
        TxtTanggalWaktu.setEditable(false);
        load_comboBox();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel3 = new javax.swing.JLabel();
        cboxCabang = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        btnTambah = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cboxKaryawan = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        TxtTanggalWaktu = new javax.swing.JTextField();
        TxtIDTerpilih = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnBack = new javax.swing.JToggleButton();
        btnEdit = new javax.swing.JButton();
        cboxTipeKendaraan = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        TxtLiter = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblTransaksi = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jDesktopPane1.setBackground(new java.awt.Color(222, 229, 235));

        jLabel3.setText("ID Cabang");

        jLabel6.setText("ID Terpilih");

        btnTambah.setText("Add");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        jLabel2.setText("ID Tipe Kendaraan ");

        jLabel4.setText("Jumlah Liter");

        jLabel1.setText("ID Karyawan");

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel5.setText("Waktu");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Transaction Records");

        TxtLiter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtLiterActionPerformed(evt);
            }
        });

        TblTransaksi.setBackground(new java.awt.Color(252, 252, 250));
        TblTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID TRANSAKSI", "ID KARYAWAN", "ID TIPE KENDARAAN", "ID CABANG", "JUMLAH LITER", "TANGGAL WAKTU"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TblTransaksi.setShowHorizontalLines(true);
        TblTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblTransaksiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TblTransaksi);

        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(cboxCabang, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnTambah, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(cboxKaryawan, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnDelete, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(TxtTanggalWaktu, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(TxtIDTerpilih, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnBack, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnEdit, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(cboxTipeKendaraan, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(TxtLiter, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(237, 237, 237)
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(cboxCabang, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cboxTipeKendaraan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(TxtLiter))
                                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cboxKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtTanggalWaktu, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TxtIDTerpilih, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))))
        );

        jDesktopPane1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {TxtLiter, TxtTanggalWaktu, cboxCabang, cboxKaryawan, cboxTipeKendaraan});

        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(TxtIDTerpilih, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cboxKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(cboxTipeKendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboxCabang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TxtLiter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TxtTanggalWaktu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jDesktopPane1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnBack, jLabel7});

        jDesktopPane1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {TxtIDTerpilih, TxtLiter, TxtTanggalWaktu, cboxCabang, cboxKaryawan, cboxTipeKendaraan});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TxtLiterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtLiterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtLiterActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        
        /* 
            -- add button function
                -- take ( table_name, field_name, and data_field ) as an argument
        */
        
        String arr[] = {"id_karyawan","id_tipe_kendaraan","id_cabang","liter","tanggal"};
        String arr2[] = {"'"+cboxKaryawan.getSelectedItem()+"'","'"+cboxTipeKendaraan.getSelectedItem()+"'",
            "'"+cboxCabang.getSelectedItem()+"'","'"+TxtLiter.getText()+"'","'"+TxtTanggalWaktu.getText()+"'"};
        function.add_table(nama_table, arr, arr2);
        function.load_table(tblmodel, this.arr, nama_table);
        
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        
        try {
            String id_karyawan = cboxKaryawan.getSelectedItem().toString();
            String id_tipe_kendaraan = cboxTipeKendaraan.getSelectedItem().toString();
            String id_cabang = cboxCabang.getSelectedItem().toString();
            String jumlah_liter = TxtLiter.getText();
            String tanggal_waktu = TxtTanggalWaktu.getText();
            

            String id_terpilih = TxtIDTerpilih.getText();
            
            String sql = "UPDATE transaksi SET id_karyawan = ?, id_tipe_kendaraan = ?, id_cabang = ?, liter = ?, tanggal = ? WHERE id_transaksi = ?";
            
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, id_karyawan);
            statement.setString(2, id_tipe_kendaraan);
            statement.setString(3, id_cabang);
            statement.setString(4, jumlah_liter);
            statement.setString(5, tanggal_waktu);
            
            statement.setString(6, id_terpilih);
            
            int konfirmasi_update = JOptionPane.showConfirmDialog(null, "Apakah Ingin Update Transaksi " + TxtIDTerpilih.getText());
            
            if (konfirmasi_update == 0){
                int rows = statement.executeUpdate();
                if (rows > 0){
                    function.load_table(tblmodel, arr, nama_table);
                    JOptionPane.showMessageDialog(this, "Transaksi  " + TxtIDTerpilih.getText() + " Terupdate");
                    resetInput();
                }
            }            
        }
        catch (SQLException e) {
            e.printStackTrace();
        } 
        
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        /* 
        Delete Function usage
            -- this function will pass arguments to tools function
                -- delete argument must filled with ( table_name, field + primary key ) 
        */
        
        int konfirmasi_delete = JOptionPane.showConfirmDialog(this, "transaksi " + TxtIDTerpilih.getText() + " Terhapus");
        if (konfirmasi_delete == 0){
                
                JOptionPane.showMessageDialog(this, "transaksi " + TxtIDTerpilih.getText() + " Terhapus");
                function.delete_table(nama_table, "id_transaksi=" + TxtIDTerpilih.getText());
                function.load_table(tblmodel, arr, nama_table);
                resetInput();
            }
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        dispose();
        MenuAdmin menu = new MenuAdmin();
        menu.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void TblTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblTransaksiMouseClicked
        
        /* 
        MouseClicked Action Table Function usage
            -- this function will set all textbox with current clicked data
                -- this function takes primary key to get data
        */
        
        int column = TblTransaksi.getSelectedColumn(), row = TblTransaksi.getSelectedRow();
        String select = (String) TblTransaksi.getValueAt(row, 0);
        TxtIDTerpilih.setText(select);
        
       try
        {
            String sql = "SELECT * FROM transaksi where id_transaksi = " + select;
            DBconnection.create_connection().createStatement();
            ResultSet result = DBconnection.create_connection().createStatement().executeQuery(sql);
            
            while (result.next()){
                cboxKaryawan.setSelectedItem(result.getString(2));
                cboxTipeKendaraan.setSelectedItem(result.getString(3));
                cboxCabang.setSelectedItem(result.getString(4));
                TxtLiter.setText(result.getString(5));            
                TxtTanggalWaktu.setText(result.getString(6));
                
            }
        } catch (SQLException e) { System.out.println(e); }
       
    }//GEN-LAST:event_TblTransaksiMouseClicked

    
    public void resetInput(){
        String t = "";
        cboxKaryawan.setSelectedItem(null);
        cboxTipeKendaraan.setSelectedItem(null);
        cboxCabang.setSelectedItem(null);
        TxtLiter.setText(t);
        TxtTanggalWaktu.setText(t);
        TxtIDTerpilih.setText(t);
    }
    
    public void load_comboBox(){
        
        
        try{

            String sql = "select id_karyawan from karyawan";
            Statement statement = this.conn.createStatement();
            ResultSet result = statement.executeQuery(sql);
            cboxKaryawan.removeAllItems();
            cboxKaryawan.addItem(null);
            while (result.next()){
                String id = result.getString(1);
                cboxKaryawan.addItem(id);
            }
            
            sql = "select id_tipe_kendaraan from tipe_kendaraan";
            result = statement.executeQuery(sql);
            cboxTipeKendaraan.removeAllItems();
            cboxTipeKendaraan.addItem(null);
            while (result.next()){
                String id = result.getString(1);
                cboxTipeKendaraan.addItem(id);
            }
            
            
            sql = "select id_cabang from cabang";
            result = statement.executeQuery(sql);
            cboxCabang.removeAllItems();
            cboxCabang.addItem(null);
            while (result.next()){
                String id = result.getString(1);
                cboxCabang.addItem(id);
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TblTransaksi;
    private javax.swing.JTextField TxtIDTerpilih;
    private javax.swing.JTextField TxtLiter;
    private javax.swing.JTextField TxtTanggalWaktu;
    private javax.swing.JToggleButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnTambah;
    private javax.swing.JComboBox<String> cboxCabang;
    private javax.swing.JComboBox<String> cboxKaryawan;
    private javax.swing.JComboBox<String> cboxTipeKendaraan;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
