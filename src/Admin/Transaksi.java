package Admin;

/**
 *
 * @author hp
 */
import database.koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Transaksi extends javax.swing.JFrame {
private Connection con;
private Statement st;
private ResultSet rs;
private String sql="";

    static void setVisible() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private final DefaultTableModel model;

    /**
     * Creates new form Transaksi
     */
    public Transaksi() {
        koneksi();
        initComponents();
        tampildata("SELECT * FROM tb_penyewaan");
    
        model = new DefaultTableModel ( );
        daftar_transaksi.setModel(model); 
             model.addColumn("jenis_kendaraan");
             model.addColumn("nama_kendaraan");
             model.addColumn("tanggal_sewa");
             model.addColumn("tanggal_kembali");
             getData();
    }
    
    public void getData( ){
     
     model.getDataVector( ).removeAllElements( );
     model.fireTableDataChanged( );
 
     try{
           
//membuat statemen untuk memanggil data tb_penyewaan
           koneksi connection = new koneksi();   
           Statement stat = connection.getkoneksi().createStatement( );
           String sql        = "Select * from tb_penyewaan";
           ResultSet res   = stat.executeQuery(sql);
 
           
//pengecekan terhadap data tb_penyewaan
           while(res.next ()){
                Object[] obj = new Object[7];
                obj[0] = res.getString("jenis_kendaraan");
                obj[1] = res.getString("nama_kendaraan");
                obj[2] = res.getString("tanggal_sewa");
                obj[3] = res.getString("tanggal_kembali");
                model.addRow(obj);
            }
      }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage() );
      }
        
      private void tampildata(String sql){
        DefaultTableModel datalist = new DefaultTableModel();
        datalist.addColumn("jenis_kendaraan");
        datalist.addColumn("nama_kendaraan");
        datalist.addColumn("tanggal_sewa");
        datalist.addColumn("tanggal_kembali");
     
    }

     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        daftar_transaksi = new javax.swing.JTable();
        tambah = new javax.swing.JButton();
        Hapus = new javax.swing.JButton();
        Simpan = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/Background motor.jpg"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/Background motor.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/Background mobil.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DAFTAR TRANSAKSI");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 190, 30));

        daftar_transaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Mobil Matic", "Kijang Innova", "02-01-2022", "04-01-2022"},
                {"Motor Gigi", "Astrea Star", "05-01-2022", "08-01-2022"},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Jenis Kendaraan", "Nama Kendaraan", "Tanggal Sewa", "Tanggal Kembali"
            }
        ));
        jScrollPane2.setViewportView(daftar_transaksi);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 660, 160));

        tambah.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        tambah.setText("TAMBAH");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });
        getContentPane().add(tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 120, 50));

        Hapus.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Hapus.setText("HAPUS");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });
        getContentPane().add(Hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 120, 50));

        Simpan.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Simpan.setText("SIMPAN");
        Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanActionPerformed(evt);
            }
        });
        getContentPane().add(Simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 120, 50));

        keluar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        keluar.setText("KELUAR");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        getContentPane().add(keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 120, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/Background motor.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, -120, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tambahActionPerformed

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        // TODO add your handling code here:      
        try {
            sql= "DELETE from tb_penyewaan";
            st=con.createStatement();
            st.execute(sql);
            tampildata("Select * from tb_penyewaan");
           
            JOptionPane.showMessageDialog(null, 
                    "Data Berhasil Dihapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Dihapus \n"+e.getMessage());
        }
    }//GEN-LAST:event_HapusActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        DashboardAdmin da = new DashboardAdmin();
        da.setVisible(true);
        dispose();
    }//GEN-LAST:event_keluarActionPerformed

    private void SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_SimpanActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Hapus;
    private javax.swing.JButton Simpan;
    private javax.swing.JTable daftar_transaksi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton keluar;
    private javax.swing.JButton tambah;
    // End of variables declaration//GEN-END:variables
}
