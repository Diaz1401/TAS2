/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package event;

import com.formdev.flatlaf.FlatClientProperties;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.Koneksi;

/**
 *
 * @author Diaz Nuraji
 */
public class FormEventPanel extends javax.swing.JPanel {

    private static Connection cn;
    private static ResultSet rs;
    private static Statement st;
    private static PreparedStatement pst;

    /**
     * Creates new form FormEventPanel
     */
    public FormEventPanel() {
        initComponents();
        txtIDEvent.setText(GenerateID());
        UpdateTable();
        pnEvent.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:12;" // Sudut
                + "background:$Login.background");
        lbTitleEvent.putClientProperty(FlatClientProperties.STYLE, ""
                + "font:+bold +20");
    }

    public void UpdateTable() {
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("ID Event");
        tbl.addColumn("Nama");
        tbl.addColumn("Tanggal");
        tbl.addColumn("Biaya");
        Table.setModel(tbl);
        try {
            cn = Koneksi.koneksiDB();
            st = cn.createStatement();
            rs = st.executeQuery("SELECT * FROM event");

            while (rs.next()) {
                tbl.addRow(new Object[]{
                    rs.getString("id_event"),
                    rs.getString("nama"),
                    rs.getString("tanggal"),
                    rs.getString("biaya")
                });
                Table.setModel(tbl);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal memuat data: " + e.getMessage());
        }
        txtIDEvent.setText(GenerateID());
    }

    public String GenerateID() {
        Random random = new Random();
        // Random number 10000000 to 99999999
        int number = random.nextInt(89999999) + 10000000;
        String id = "EVENT_" + number;
        return id;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnEvent = new javax.swing.JPanel();
        lbTitleEvent = new javax.swing.JLabel();
        txtIDEvent = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        txtNama = new javax.swing.JTextField();
        txtBiaya = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDeskripsi = new javax.swing.JTextArea();
        btnTambah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        txtTanggal = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnUbah = new javax.swing.JButton();

        lbTitleEvent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitleEvent.setText("Jadwal Event");

        txtIDEvent.setEnabled(false);

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table);

        txtDeskripsi.setColumns(20);
        txtDeskripsi.setRows(5);
        jScrollPane2.setViewportView(txtDeskripsi);

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        txtTanggal.setDateFormatString("yyyy-MM-dd");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ID Event");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nama Event");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Biaya Event");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Tanggal Event");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Deskripsi Event");

        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnEventLayout = new javax.swing.GroupLayout(pnEvent);
        pnEvent.setLayout(pnEventLayout);
        pnEventLayout.setHorizontalGroup(
            pnEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnEventLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(pnEventLayout.createSequentialGroup()
                        .addGroup(pnEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtIDEvent, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNama, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBiaya, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTanggal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
                            .addComponent(lbTitleEvent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnTambah, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(btnHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUbah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnEventLayout.setVerticalGroup(
            pnEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnEventLayout.createSequentialGroup()
                .addGroup(pnEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(lbTitleEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnEventLayout.createSequentialGroup()
                        .addComponent(btnTambah)
                        .addGap(18, 18, 18)
                        .addComponent(btnHapus)
                        .addGap(18, 18, 18)
                        .addComponent(btnUbah))
                    .addGroup(pnEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(pnEventLayout.createSequentialGroup()
                            .addComponent(txtIDEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtBiaya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(55, 55, 55)
                            .addComponent(jLabel5))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        if (txtIDEvent.getText().isEmpty()
                || txtNama.getText().isEmpty()
                || txtTanggal.getDate().toString().isEmpty()
                || txtBiaya.getText().isEmpty()
                || txtDeskripsi.getText().isEmpty()) {
            // Show an error message
            JOptionPane.showMessageDialog(null, "Semua kolom harus diisi");
            return;
        }
        String id_event = txtIDEvent.getText();
        String nama = txtNama.getText();
        String deskripsi = txtDeskripsi.getText();
        String biaya = txtBiaya.getText();

        // Tanggal
        Calendar SelectTanggal = txtTanggal.getCalendar();
        SimpleDateFormat FormatTanggal = new SimpleDateFormat("yyyy-MM-dd");
        String tanggal = FormatTanggal.format(SelectTanggal.getTime());

        try {
            // Connect
            String sql = "INSERT INTO event (id_event, nama, deskripsi, tanggal, biaya) VALUES (?, ?, ?, ?, ?)";
            cn = Koneksi.koneksiDB();
            pst = cn.prepareStatement(sql);

            // Set paramater
            pst.setString(1, id_event);
            pst.setString(2, nama);
            pst.setString(3, deskripsi);
            pst.setString(4, tanggal);
            pst.setString(5, biaya);

            // Execute
            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal menyimpan data: " + e.getMessage());
        }
        // Update table
        UpdateTable();
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        int row = Table.getSelectedRow();

        if (row < 0) {
            // Error if row not selected
            JOptionPane.showMessageDialog(null, "Pilih data yang akan dihapus");
            return;
        }
        // get value from first row
        String id_event = txtIDEvent.getText();

        try {
            String sql_del = "DELETE from event WHERE id_event = ?";
            cn = Koneksi.koneksiDB();
            pst = cn.prepareStatement(sql_del);

            // Set parameter
            pst.setString(1, id_event);

            // Execute
            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Data Berhasil Di Hapus");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal menghapus data: " + e.getMessage());
        }
        UpdateTable();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        String id_event = txtIDEvent.getText();
        String nama = txtNama.getText();
        String biaya = txtBiaya.getText();
        String deskripsi = txtDeskripsi.getText();

        // Tanggal
        Calendar SelectTanggal = txtTanggal.getCalendar();
        SimpleDateFormat FormatTanggal = new SimpleDateFormat("yyyy-MM-dd");
        String tanggal = FormatTanggal.format(SelectTanggal.getTime());

        try {
            // Connect
            String sql = "UPDATE event SET nama = ?, deskripsi = ?, tanggal = ?, biaya = ? WHERE id_event = ?";
            cn = Koneksi.koneksiDB();
            pst = cn.prepareStatement(sql);

            // Set the parameter values
            pst.setString(1, nama);
            pst.setString(2, deskripsi);
            pst.setString(3, tanggal);
            pst.setString(4, biaya);
            pst.setString(5, id_event);

            // Execute the statement
            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Data berhasil diubah");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal mengubah data: " + e.getMessage());
        }

        // Clear text
        txtIDEvent.setText(null);
        txtNama.setText(null);
        txtDeskripsi.setText(null);
        txtBiaya.setText(null);

        // Update table
        UpdateTable();
    }//GEN-LAST:event_btnUbahActionPerformed

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        int row = Table.getSelectedRow();
        String id_event = Table.getValueAt(row, 0).toString();
        String deskripsi = null;
        String nama = null;
        String biaya = null;
        SimpleDateFormat sdf;
        Date date = null;
        try {
            cn = Koneksi.koneksiDB();
            pst = cn.prepareStatement("SELECT * FROM event WHERE id_event = ?");
            pst.setString(1, id_event);
            rs = pst.executeQuery();
            rs.next(); // Move cursor to first row
            nama = rs.getString("nama");
            deskripsi = rs.getString("deskripsi");
            biaya = rs.getString("biaya");

            // Format String to Date
            sdf = new SimpleDateFormat("yyyy-MM-dd");
            date = sdf.parse(rs.getString("tanggal"));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal memuat data: " + e.getMessage());
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Gagal memuat tanggal: " + ex.getMessage());
        }
        txtIDEvent.setText(id_event);
        txtNama.setText(nama);
        txtDeskripsi.setText(deskripsi);
        txtTanggal.setDate(date);
        txtBiaya.setText(biaya);
    }//GEN-LAST:event_TableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbTitleEvent;
    private javax.swing.JPanel pnEvent;
    private javax.swing.JTextField txtBiaya;
    private javax.swing.JTextArea txtDeskripsi;
    private javax.swing.JTextField txtIDEvent;
    private javax.swing.JTextField txtNama;
    private com.toedter.calendar.JDateChooser txtTanggal;
    // End of variables declaration//GEN-END:variables
}
