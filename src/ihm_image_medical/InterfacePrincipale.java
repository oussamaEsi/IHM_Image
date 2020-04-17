package ihm_image_medical;


import com.sun.comm.Win32Driver;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.comm.CommPortIdentifier;
import javax.comm.NoSuchPortException;
import javax.comm.PortInUseException;
import javax.comm.SerialPort;
import javax.comm.UnsupportedCommOperationException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class InterfacePrincipale extends javax.swing.JFrame {
    

    public InterfacePrincipale() {
        initComponents();
        jTabbedPane1.setIconAt(0, new ImageIcon("src\\ihm_image_medical\\Images\\00.png"));
        jTabbedPane1.setIconAt(1, new ImageIcon("src\\ihm_image_medical\\Images\\01.png"));
        jTabbedPane1.setIconAt(2, new ImageIcon("src\\ihm_image_medical\\Images\\02.png"));
        jTabbedPane1.setIconAt(3, new ImageIcon("src\\ihm_image_medical\\Images\\03.png"));
        jTabbedPane1.setIconAt(4, new ImageIcon("src\\ihm_image_medical\\Images\\04.png"));

        ImageIcon imageButton1 = new ImageIcon("src\\ihm_image_medical\\Images\\generer.png");
        jButton1.setIcon(imageButton1);
        ImageIcon imageButton2 = new ImageIcon("src\\ihm_image_medical\\Images\\sauvgarder.png");
        jButton2.setIcon(imageButton2);
        
        jTabbedPane2.setIconAt(0, new ImageIcon("src\\ihm_image_medical\\Images\\chiffrement.png"));
        jTabbedPane2.setIconAt(1, new ImageIcon("src\\ihm_image_medical\\Images\\dechiffrement.png"));

        ImageIcon imageToggleButton1 = new ImageIcon("src\\ihm_image_medical\\Images\\ajouter.png");
        jToggleButton1.setIcon(imageToggleButton1);
        ImageIcon imageToggleButton2 = new ImageIcon("src\\ihm_image_medical\\Images\\ajouter.png");
        jToggleButton2.setIcon(imageToggleButton2);
        ImageIcon imageButton3 = new ImageIcon("src\\ihm_image_medical\\Images\\chiffrer.png");
        jButton3.setIcon(imageButton3);
        ImageIcon imageButton4 = new ImageIcon("src\\ihm_image_medical\\Images\\initialiser.png");
        jButton4.setIcon(imageButton4);
        ImageIcon imageToggleButton3 = new ImageIcon("src\\ihm_image_medical\\Images\\ajouter.png");
        jToggleButton3.setIcon(imageToggleButton3);
        ImageIcon imageToggleButton4 = new ImageIcon("src\\ihm_image_medical\\Images\\ajouter.png");
        jToggleButton4.setIcon(imageToggleButton4);        
        ImageIcon imageButton5 = new ImageIcon("src\\ihm_image_medical\\Images\\dechiffrer.png");
        jButton5.setIcon(imageButton5);
        ImageIcon imageButton6 = new ImageIcon("src\\ihm_image_medical\\Images\\initialiser.png");
        jButton6.setIcon(imageButton6); 

        ImageIcon imageButton7 = new ImageIcon("src\\ihm_image_medical\\Images\\port.png");
        jButton7.setIcon(imageButton7);  
        ImageIcon imageButton8 = new ImageIcon("src\\ihm_image_medical\\Images\\initialiser.png");
        jButton8.setIcon(imageButton8);
        
        jTabbedPane3.setIconAt(1, new ImageIcon("src\\ihm_image_medical\\Images\\chiffrement.png"));
        jTabbedPane3.setIconAt(2, new ImageIcon("src\\ihm_image_medical\\Images\\dechiffrement.png"));
        jTabbedPane3.setIconAt(0, new ImageIcon("src\\ihm_image_medical\\Images\\text.png"));
        
        ImageIcon imageToggleButton5 = new ImageIcon("src\\ihm_image_medical\\Images\\ajouter.png");
        jToggleButton5.setIcon(imageToggleButton5);
        ImageIcon imageToggleButton6 = new ImageIcon("src\\ihm_image_medical\\Images\\ajouter.png");
        jToggleButton6.setIcon(imageToggleButton6);
        ImageIcon imageButton9 = new ImageIcon("src\\ihm_image_medical\\Images\\chiffrer.png");
        jButton9.setIcon(imageButton9);
        ImageIcon imageButton10 = new ImageIcon("src\\ihm_image_medical\\Images\\initialiser.png");
        jButton10.setIcon(imageButton10);
        ImageIcon imageToggleButton7 = new ImageIcon("src\\ihm_image_medical\\Images\\ajouter.png");
        jToggleButton7.setIcon(imageToggleButton7);
        ImageIcon imageToggleButton8 = new ImageIcon("src\\ihm_image_medical\\Images\\ajouter.png");
        jToggleButton8.setIcon(imageToggleButton8);        
        ImageIcon imageButton11 = new ImageIcon("src\\ihm_image_medical\\Images\\dechiffrer.png");
        jButton11.setIcon(imageButton11);
        ImageIcon imageButton12 = new ImageIcon("src\\ihm_image_medical\\Images\\initialiser.png");
        jButton12.setIcon(imageButton12);  
        
        ImageIcon imageToggleButton9 = new ImageIcon("src\\ihm_image_medical\\Images\\ajouter.png");
        jToggleButton9.setIcon(imageToggleButton9);
        
        this.setVisible(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox();
        jComboBox5 = new javax.swing.JComboBox();
        jComboBox6 = new javax.swing.JComboBox();
        jComboBox7 = new javax.swing.JComboBox();
        jComboBox8 = new javax.swing.JComboBox();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel30 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jComboBox11 = new javax.swing.JComboBox();
        jLabel31 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jToggleButton9 = new javax.swing.JToggleButton();
        jPanel32 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        jPanel33 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jButton14 = new javax.swing.JButton();
        jPanel34 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jButton15 = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jComboBox9 = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jComboBox10 = new javax.swing.JComboBox();
        jLabel25 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jToggleButton7 = new javax.swing.JToggleButton();
        jToggleButton8 = new javax.swing.JToggleButton();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AES-Image");

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N

        jPanel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jPanel29.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ihm_image_medical/Images/logo-cdta.png"))); // NOI18N

        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ihm_image_medical/Images/ImageHome.PNG"))); // NOI18N
        jLabel36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel36.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel36)
                .addGap(108, 108, 108))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel36)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("               Home Page", jPanel1);

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("Port :");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setText("Baud rate :");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel15.setText("Data :");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel16.setText("Parity :");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel17.setText("Stop :");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel18.setText("Flow control :");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "110", "300", "1200", "2400", "4800", "9600", "19200", "38400", "57600", "115200" }));
        jComboBox4.setSelectedIndex(5);

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "5", "6", "7", "8" }));
        jComboBox5.setSelectedIndex(3);

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Odd", "Even", "None", "Mark", "Space" }));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "1.5", "2" }));

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Xon / Xoff", "Hardware", "None" }));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addGap(47, 47, 47)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(41, 41, 41)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(47, 47, 47)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(49, 49, 49)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(47, 47, 47)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(49, 49, 49)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jButton7.setText("Apply");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Initialize");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(219, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(145, 145, 145))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(62, 62, 62))
        );

        jTabbedPane1.addTab("    Port Configuration", jPanel2);

        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jLabel1.setText("Algorithm ");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AES 128", "AES 192", "AES 256", " " }));

        jButton1.setText("Generate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Store");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField1.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jLabel2.setText("Key secret in Hexa  ");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)))
                .addGap(37, 37, 37))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(28, 28, 28)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(392, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("          Key Generation", jPanel3);

        jTabbedPane2.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N

        jPanel11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Algorithm ");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AES 128", "AES 192", "AES 256" }));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Secret key");

        jTextField2.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Image ");

        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jTextField2)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Original image", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Encrypted image", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton3.setText("Encrypt");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Initialize");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Encryption", jPanel9);

        jPanel15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Algorithm ");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AES 128", "AES 192", "AES 256" }));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Secret key");

        jTextField4.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Image ");

        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel16.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Encrypted image", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel17.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Decrypted image", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel18.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton5.setText("Decrypt");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Initialize");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 286, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton5))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Decryption", jPanel10);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jTabbedPane1.addTab("              AES in Java", jPanel4);

        jTabbedPane3.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N

        jPanel31.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel30.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel30.setText("Algorithm ");

        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AES 128", "AES 192", "AES 256" }));

        jLabel31.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel31.setText("Key secret");

        jTextField11.setEnabled(false);

        jToggleButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addComponent(jLabel30))
                .addGap(18, 18, 18)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addComponent(jTextField11, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel31)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jToggleButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel32.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel32.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel32.setText("Original Message");

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ihm_image_medical/Images/chiffrer.png"))); // NOI18N
        jButton13.setText("Encrption");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel32)
                        .addGap(33, 33, 33)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jPanel33.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel33.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel33.setText("Encrypted Message");

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ihm_image_medical/Images/dechiffrer.png"))); // NOI18N
        jButton14.setText("Decrption");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel33)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jPanel34.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel34.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel34.setText("Decrypted Message");

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ihm_image_medical/Images/initialiser.png"))); // NOI18N
        jButton15.setText("Initialize");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel34)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addGap(18, 18, 18)
                .addComponent(jButton15)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel33, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel32, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel31, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Test", jPanel30);

        jPanel20.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel19.setText("Algorithm ");

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AES 128", "AES 192", "AES 256" }));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel20.setText("Key secret");

        jTextField7.setEnabled(false);

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel21.setText("Image ");

        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });

        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jTextField7)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jTextField8)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel20)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel21)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jToggleButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Original image", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel22.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Encrypted image", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel23.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton9.setText("Encypt");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Initialize");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9)
                    .addComponent(jButton10))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane3.addTab("Encryption", jPanel19);

        jPanel25.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel24.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel24.setText("Algorithm ");

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AES 128", "AES 192", "AES 256" }));

        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel25.setText("Key secret");

        jTextField9.setEnabled(false);

        jLabel26.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel26.setText("Image");

        jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton7ActionPerformed(evt);
            }
        });

        jToggleButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(jLabel25)
                    .addComponent(jLabel24))
                .addGap(18, 18, 18)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jTextField9, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jTextField10, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel25)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jToggleButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel26)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jToggleButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel26.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel27.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Encypted image", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel27.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel28.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Decrypted image", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel28.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton11.setText("Decrypt");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("Initialize");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 286, Short.MAX_VALUE)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12)
                    .addComponent(jButton11))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Decryption", jPanel24);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("           AES in FPGA", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1032, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            CleSecrete cs = new CleSecrete(jComboBox1.getSelectedIndex());
            jTextField1.setText(cs.getCleSecrete());
        } 
        catch (Exception ex) {
            Logger.getLogger(InterfacePrincipale.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}//GEN-LAST:event_jButton1ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    if((jTextField1.getText()!=null)&&(jTextField1.getText().length()!=0)) {
        JFileChooser boiteOuvrir = new JFileChooser();
        boiteOuvrir.setCurrentDirectory(new File("fichiers" + File.separator));
        boiteOuvrir.addChoosableFileFilter(new Filtre(new String[]{"p12"}, "fichiers clés secrètes (.p12)"));
        boiteOuvrir.setFileHidingEnabled(false);
        boiteOuvrir.setAcceptAllFileFilterUsed(false);
        
        int choix = boiteOuvrir.showSaveDialog(boiteOuvrir);
        if (choix == boiteOuvrir.APPROVE_OPTION) {
            String urlCléSecrète=boiteOuvrir.getSelectedFile().getPath();
            switch(jComboBox1.getSelectedIndex()){
                case 0 : {
                    urlCléSecrète+="-AES128";
                    break;
                }
                case 1 : {
                    urlCléSecrète+="-AES192";
                    break;
                }
                case 2 : {
                    urlCléSecrète+="-AES256";
                    break;
                }
            }
            urlCléSecrète+=".p12";
          
            try {
                BufferedWriter out = new BufferedWriter(new FileWriter(urlCléSecrète));
                out.write(jTextField1.getText());
                out.close();
                jTextField1.setText(null);
            }
            catch (IOException ex) {
                JOptionPane jop=new JOptionPane();
                jop.showMessageDialog(null,ex.getMessage(),"Erreur",JOptionPane.ERROR_MESSAGE);
            }
        }
      } 

    else {
        JOptionPane jop=new JOptionPane();
        jop.showMessageDialog(null,"Générer une clé secrète.","Erreur",JOptionPane.ERROR_MESSAGE);
    }

}//GEN-LAST:event_jButton2ActionPerformed

private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
    JFileChooser boiteOuvrir = new JFileChooser();
    boiteOuvrir.setCurrentDirectory(new File("fichiers" + File.separator));
    boiteOuvrir.addChoosableFileFilter(new Filtre(new String[]{"p12"}, "fichiers clés secrètes (.p12)"));
    boiteOuvrir.setFileHidingEnabled(false);
    boiteOuvrir.setAcceptAllFileFilterUsed(false);
    
    int choix = boiteOuvrir.showOpenDialog(boiteOuvrir);
    if (choix == boiteOuvrir.APPROVE_OPTION) {
        String urlCleSecrete=boiteOuvrir.getSelectedFile().getPath();
        try {
            BufferedReader br = new BufferedReader(new FileReader(urlCleSecrete));
            String cle = br.readLine();
            br.close();
            jTextField2.setText(cle);
        }
        catch (IOException ex) {
            JOptionPane jop=new JOptionPane();
            jop.showMessageDialog(null,"La clé secrète est introuvable.","Erreur",JOptionPane.ERROR_MESSAGE);
            return;
        }
    }
}//GEN-LAST:event_jToggleButton1ActionPerformed

private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed

    JFileChooser boiteOuvrir = new JFileChooser();
    boiteOuvrir.setCurrentDirectory(new File("fichiers" + File.separator));
    boiteOuvrir.setFileHidingEnabled(false);
    boiteOuvrir.setAcceptAllFileFilterUsed(true);
    
    int choix = boiteOuvrir.showOpenDialog(boiteOuvrir);
    if (choix == boiteOuvrir.APPROVE_OPTION) {
        jTextField3.setText(boiteOuvrir.getSelectedFile().getPath());
    }
    
    String urlImage = jTextField3.getText();    
    ImageIcon imageOriginale = new ImageIcon(urlImage);
    jLabel9.setIcon(imageOriginale);
}//GEN-LAST:event_jToggleButton2ActionPerformed

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    String cle      = jTextField2.getText();
    String urlImage = jTextField3.getText();

    if(cle.length()!=32  ){
        JOptionPane jop=new JOptionPane();
        jop.showMessageDialog(null,"La clé secrète est invalide.","Erreur",JOptionPane.ERROR_MESSAGE);
        jTextField2.setText(null);
        return;
    }
    
    if(urlImage.length()==0  ){
        JOptionPane jop=new JOptionPane();
        jop.showMessageDialog(null,"Le chemin du fichier est invalide.","Erreur",JOptionPane.ERROR_MESSAGE);
        jTextField3.setText(null);
        return;
    }
    
    File File_in = new File(urlImage);
      
    BufferedImage imageEntree = null;	
        try {
            imageEntree = ImageIO.read(File_in);
        } catch (IOException ex) {
            Logger.getLogger(InterfacePrincipale.class.getName()).log(Level.SEVERE, null, ex);
        }
    int w = imageEntree.getWidth(); int h = imageEntree.getHeight();
   
    int [][] matrixPixel = new int [w][h];
    
    String urlImageChiffre = urlImage.substring(0, urlImage.lastIndexOf("."));
    urlImageChiffre+="_chiff.png";
    File file_out = new File(urlImageChiffre);
    
    BufferedImage imageSorti = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
    
    for( int i=0 ; i<w ; i++ )
        for( int j=0 ; j<h ; j++ ) {
            int pixel = imageEntree.getRGB(i,j);
            matrixPixel [i][j] = pixel;
        }        

    String[] resultat_message = Utils.Tab32To128( matrixPixel, w, h);
    
    	AES aes = new AES();
	AES_opr aes_opr = new AES_opr();
        int taille_resultat_table = 0;
        
        if((w*h)%4 != 0) taille_resultat_table = (int)(w*h/4)+1;
        else taille_resultat_table = (int)(w*h/4);

        int resultat_tablechiff[][] = new int [taille_resultat_table][4];
        int resultat_matrix[][] = new int [w][h];
        
        for (int i=0; i<taille_resultat_table ; i++){
            //encryption
            String msg_chiffre = aes_opr.encryption(aes,resultat_message[i], cle);
            int[] tablechiff = Utils.StringHexToInt(msg_chiffre);
            for (int j=0 ; j<4 ; j++){
                resultat_tablechiff[i][j] = tablechiff[j];  
            }           
        }
        
        int indic1=0, indic2 =0;
        for(int i=0 ; i<w ; i++)
           for(int j =0; j<h ; j++){
             resultat_matrix[i][j] =  resultat_tablechiff[indic1][indic2];
             indic2++;
             if(indic2 == 4){
             indic1++;
             indic2=0;
             }
           }
        
        for(int i=0 ; i<w ; i++ )
            for(int j=0 ; j<h ; j++ ) 
                imageSorti.setRGB(i,j, resultat_matrix[i][j]);
        
        try {
            ImageIO.write(imageSorti,"png", file_out);
        } catch (IOException ex) {
            Logger.getLogger(InterfacePrincipale.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ImageIcon imageChiffree = new ImageIcon(urlImageChiffre);
        jLabel10.setIcon(imageChiffree);
    
}//GEN-LAST:event_jButton3ActionPerformed

private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
    JFileChooser boiteOuvrir = new JFileChooser();
    boiteOuvrir.setCurrentDirectory(new File("fichiers" + File.separator));
    boiteOuvrir.addChoosableFileFilter(new Filtre(new String[]{"p12"}, "fichiers clés secrètes (.p12)"));
    boiteOuvrir.setFileHidingEnabled(false);
    boiteOuvrir.setAcceptAllFileFilterUsed(false);
    
    int choix = boiteOuvrir.showOpenDialog(boiteOuvrir);
    if (choix == boiteOuvrir.APPROVE_OPTION) {
        String urlCleSecrete=boiteOuvrir.getSelectedFile().getPath();
        try {
            BufferedReader br = new BufferedReader(new FileReader(urlCleSecrete));
            String cle = br.readLine();
            br.close();
            jTextField4.setText(cle);
        }
        catch (IOException ex) {
            JOptionPane jop=new JOptionPane();
            jop.showMessageDialog(null,"La clé secrète est introuvable.","Erreur",JOptionPane.ERROR_MESSAGE);
            return;
        }
    }        
}//GEN-LAST:event_jToggleButton3ActionPerformed

private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
    JFileChooser boiteOuvrir = new JFileChooser();
    boiteOuvrir.setCurrentDirectory(new File("fichiers" + File.separator));
    boiteOuvrir.setFileHidingEnabled(false);
    boiteOuvrir.setAcceptAllFileFilterUsed(true);
    
    int choix = boiteOuvrir.showOpenDialog(boiteOuvrir);
    if (choix == boiteOuvrir.APPROVE_OPTION) {
        jTextField5.setText(boiteOuvrir.getSelectedFile().getPath());
    } 
    
    String urlImageChiffre = jTextField5.getText();    
    ImageIcon imageChiffre = new ImageIcon(urlImageChiffre);
    jLabel11.setIcon(imageChiffre);
    
}//GEN-LAST:event_jToggleButton4ActionPerformed

private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    String cle             = jTextField4.getText();
    String urlImageChiffre = jTextField5.getText();
  
    if(cle.length()!=32  ){
        JOptionPane jop=new JOptionPane();
        jop.showMessageDialog(null,"La clé secrète est invalide.","Erreur",JOptionPane.ERROR_MESSAGE);
        jTextField4.setText(null);
        return;
    }
    
    if(urlImageChiffre.length()==0  ){
        JOptionPane jop=new JOptionPane();
        jop.showMessageDialog(null,"Le chemin du fichier est invalide.","Erreur",JOptionPane.ERROR_MESSAGE);
        jTextField5.setText(null);
        return;
    }
    
    File File_in = new File( urlImageChiffre );
    
    BufferedImage imageEntree = null;	
        try {
            imageEntree = ImageIO.read(File_in);
        } catch (IOException ex) {
            Logger.getLogger(InterfacePrincipale.class.getName()).log(Level.SEVERE, null, ex);
        }
    int w = imageEntree.getWidth(); int h = imageEntree.getHeight();
   
    int [][] matrixPixel = new int [w][h];
    
    String urlImageDechiffre = urlImageChiffre.substring(0, urlImageChiffre.lastIndexOf("."));
    urlImageDechiffre+="_dechiff.png";
    File file_out = new File( urlImageDechiffre );
    
    BufferedImage imageSorti = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
    
    for( int i=0 ; i<w ; i++ )
        for( int j=0 ; j<h ; j++ ) {
            int pixel = imageEntree.getRGB(i,j);
            matrixPixel [i][j] = pixel;
        }        

    String[] resultat_message = Utils.Tab32To128( matrixPixel, w, h);
    
	AES aes = new AES();
	AES_opr aes_opr = new AES_opr();
        int taille_resultat_table = 0;
        
        if((w*h)%4 != 0) taille_resultat_table = (int)(w*h/4)+1;
        else taille_resultat_table = (int)(w*h/4);
        
        int resultat_table[][]  = new int [taille_resultat_table][4];
        int resultat_matrix[][] = new int [w][h];
        
        for (int i=0; i<taille_resultat_table ; i++){
            System.out.println(resultat_message[i]);//1000
           
            // decryption
            String msg_dechiffre = aes_opr.decryption(aes, resultat_message[i], cle);                   
            System.out.println(msg_dechiffre);
            System.out.println();
            int[] table = Utils.StringHexToInt(msg_dechiffre);
            for (int j=0 ; j<4 ; j++){
                resultat_table[i][j] = table[j];  
            }
        }
        int indic1=0, indic2 =0;
        for(int i=0 ; i<w ; i++)
           for(int j =0; j<h ; j++){
             resultat_matrix[i][j] =  resultat_table[indic1][indic2];
             indic2++;
             if(indic2 == 4){
             indic1++;
             indic2=0;
             }
           }
        
        for(int i=0 ; i<w ; i++ )
            for(int j=0 ; j<h ; j++ ) 
                imageSorti.setRGB(i,j, resultat_matrix[i][j]);
        
        try {
            ImageIO.write(imageSorti,"png", file_out);
        } catch (IOException ex) {
            Logger.getLogger(InterfacePrincipale.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       ImageIcon imageDechiffre = new ImageIcon(urlImageDechiffre);
       jLabel12.setIcon(imageDechiffre);
        
}//GEN-LAST:event_jButton5ActionPerformed

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    jComboBox2.setSelectedIndex(0);
    jTextField2.setText(null);
    jTextField3.setText(null);
    jLabel9.setIcon(null);
    jLabel10.setIcon(null);  
}//GEN-LAST:event_jButton4ActionPerformed

private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    jComboBox3.setSelectedIndex(0);
    jTextField4.setText(null);
    jTextField5.setText(null);
    jLabel11.setIcon(null);
    jLabel12.setIcon(null);
}//GEN-LAST:event_jButton6ActionPerformed

private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    //--------- Ouverture de porte COM1
    Win32Driver w32Driver = new Win32Driver();
    w32Driver.initialize();
    //Enumeration portList = CommPortIdentifier.getPortIdentifiers();    
        
    String name = jTextField6.getText();
    if( name.length()== 00 ){
        JOptionPane jop = new JOptionPane();
        jop.showMessageDialog (null,"Enter the port name!","Error",JOptionPane.ERROR_MESSAGE);
        jTextField6.setText(null);
        return;
    }
    
    CommPortIdentifier portId = null;
        try {
            portId = CommPortIdentifier.getPortIdentifier("COM1");
        } catch (NoSuchPortException ex) {
            Logger.getLogger(InterfacePrincipale.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            port = (SerialPort)portId.open(name, 10000);
        } catch (PortInUseException ex) {
            Logger.getLogger(InterfacePrincipale.class.getName()).log(Level.SEVERE, null, ex);
        }
    
   String bitSecond = (String) jComboBox4.getItemAt(jComboBox4.getSelectedIndex());
   String bitDonnee = (String) jComboBox5.getItemAt(jComboBox5.getSelectedIndex());
   String bitArret  = (String) jComboBox7.getItemAt(jComboBox7.getSelectedIndex());
        try {
            port.setSerialPortParams(Integer.parseInt(bitSecond),Integer.parseInt(bitDonnee),Integer.parseInt(bitArret), SerialPort.PARITY_NONE);
            port.setFlowControlMode(SerialPort.FLOWCONTROL_NONE);
        } catch (UnsupportedCommOperationException ex) {
            Logger.getLogger(InterfacePrincipale.class.getName()).log(Level.SEVERE, null, ex);
        }
   System.out.print(port);
   jLabel29.setText("The port " + port +  " is ready ... ");
}//GEN-LAST:event_jButton7ActionPerformed

private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
    jTextField6.setText(null);
    jComboBox4.setSelectedIndex(3);
    jComboBox5.setSelectedIndex(3);
    jComboBox6.setSelectedIndex(2);
    jComboBox7.setSelectedIndex(0);
    jComboBox8.setSelectedIndex(1);
    jLabel29.setText("");
    port.close();
    
}//GEN-LAST:event_jButton8ActionPerformed

private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
    JFileChooser boiteOuvrir = new JFileChooser();
    boiteOuvrir.setCurrentDirectory(new File("fichiers" + File.separator));
    boiteOuvrir.addChoosableFileFilter(new Filtre(new String[]{"p12"}, "fichiers clés secrètes (.p12)"));
    boiteOuvrir.setFileHidingEnabled(false);
    boiteOuvrir.setAcceptAllFileFilterUsed(false);
    
    int choix = boiteOuvrir.showOpenDialog(boiteOuvrir);
    if (choix == boiteOuvrir.APPROVE_OPTION) {
        String urlCleSecrete=boiteOuvrir.getSelectedFile().getPath();
        try {
            BufferedReader br = new BufferedReader(new FileReader(urlCleSecrete));
            String cle = br.readLine();
            br.close();
            jTextField7.setText(cle);
        }
        catch (IOException ex) {
            JOptionPane jop=new JOptionPane();
            jop.showMessageDialog(null,"La clé secrète est introuvable.","Erreur",JOptionPane.ERROR_MESSAGE);
            return;
        }
    }

}//GEN-LAST:event_jToggleButton5ActionPerformed

private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed

    JFileChooser boiteOuvrir = new JFileChooser();
    boiteOuvrir.setCurrentDirectory(new File("fichiers" + File.separator));
    boiteOuvrir.setFileHidingEnabled(false);
    boiteOuvrir.setAcceptAllFileFilterUsed(true);
    
    int choix = boiteOuvrir.showOpenDialog(boiteOuvrir);
    if (choix == boiteOuvrir.APPROVE_OPTION) {
        jTextField8.setText(boiteOuvrir.getSelectedFile().getPath());
    }
    
    String urlImage = jTextField8.getText();    
    ImageIcon imageOriginale = new ImageIcon(urlImage);
    jLabel22.setIcon(imageOriginale);

}//GEN-LAST:event_jToggleButton6ActionPerformed

private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
     BufferedInputStream  in = null;
     BufferedOutputStream out = null;
     try {
        in  = new BufferedInputStream(port.getInputStream());
        out = new BufferedOutputStream(port.getOutputStream());
     } catch (IOException ex) {
        Logger.getLogger(InterfacePrincipale.class.getName()).log(Level.SEVERE, null, ex);
     }
     
     String cle      = jTextField7.getText();
     String urlImage = jTextField8.getText();
     
     if( cle.length() != 32 ){
        JOptionPane jop=new JOptionPane();
        jop.showMessageDialog(null,"La clé secrète est invalide.","Erreur",JOptionPane.ERROR_MESSAGE);
        jTextField7.setText(null);
        return;
     }
    
     if( urlImage.length() == 0 ){
        JOptionPane jop=new JOptionPane();
        jop.showMessageDialog(null,"Le chemin du fichier est invalide.","Erreur",JOptionPane.ERROR_MESSAGE);
        jTextField8.setText(null);
        return;
     }    
     
     File File_in = new File(urlImage);
      
     BufferedImage imageEntree = null;	
        try {
            imageEntree = ImageIO.read(File_in);
        } catch (IOException ex) {
            Logger.getLogger(InterfacePrincipale.class.getName()).log(Level.SEVERE, null, ex);
        }
     int w = imageEntree.getWidth(); int h = imageEntree.getHeight();
   
     int [][] matrixPixel = new int [w][h];
    
     String urlImageChiffre = urlImage.substring(0, urlImage.lastIndexOf("."));
     urlImageChiffre+="_chiff.png";
     File file_out = new File(urlImageChiffre);
    
     BufferedImage imageSorti = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
    
     for( int i=0 ; i<w ; i++ )
         for( int j=0 ; j<h ; j++ ) {
             int pixel = imageEntree.getRGB(i,j);
             matrixPixel [i][j] = pixel;
         }        
    
    String[] messages = Utils.Tab32To128( matrixPixel, w, h);
    String[] messages_chiffrer = new String[messages.length];
     
     
    int taille_messages = 0;
    if((w*h)%4 != 0) taille_messages = (int)(w*h/4)+1;
    else taille_messages = (int)(w*h/4);
    
    int tablechiff_intermediare[][] = new int [taille_messages][4];
    int nombre_iteration =0;
    int matrix_chiff[][] = new int [w][h];
    
    //Envoie de signal de commande Crypt/Decrypt
    byte Crypt_Dcrypt = 0;
        try {
            out.write(Crypt_Dcrypt);
            out.flush();
        } catch (IOException ex) {
            Logger.getLogger(InterfacePrincipale.class.getName()).log(Level.SEVERE, null, ex);
        }
    byte[] tab_cle = Utils.toByteArray(cle);
    for(int i=0; i<tab_cle.length; i++){
            try {
                out.write(tab_cle[i]);
            } catch (IOException ex) {
                Logger.getLogger(InterfacePrincipale.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
        try {
            out.flush();
        } catch (IOException ex) {
            Logger.getLogger(InterfacePrincipale.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    byte[] tab_result = new byte[16];
    for(int i=0; i<messages.length; i++){       
        byte[] tab_mess = Utils.toByteArray(messages[i]);
        System.out.println(messages[i]);
        for(int j=0; j<tab_mess.length; j++){
                try {
                     out.write(tab_mess[j]);
                } catch (IOException ex) {
                    Logger.getLogger(InterfacePrincipale.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        try {
             out.flush();
        } catch (IOException ex) {
             Logger.getLogger(InterfacePrincipale.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for(int k=0; k<16; k++){
                try {
                    tab_result[k] = (byte) in.read();
                } catch (IOException ex) {
                    Logger.getLogger(InterfacePrincipale.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        String resultat = Utils.toHexString(tab_result);
        messages_chiffrer[i] = resultat;
        System.out.println(resultat);
        
        int[] tablechiff = Utils.StringHexToInt(resultat);
        for (int j=0 ; j<4 ; j++){
            tablechiff_intermediare[i][j] = tablechiff[j];  
        }
        
        nombre_iteration++;
        System.out.println(nombre_iteration);
    }
    
        int indic1=0, indic2 =0;
    for(int i=0 ; i<w ; i++)
        for(int j =0; j<h ; j++){
            matrix_chiff[i][j] =  tablechiff_intermediare[indic1][indic2];
            indic2++;
            if(indic2 == 4){
                indic1++;
                indic2=0;
            }
        }    
 
    for(int i=0 ; i<w ; i++ )
        for(int j=0 ; j<h ; j++ ) 
            imageSorti.setRGB(i,j, matrix_chiff[i][j]);
        
    try {
         ImageIO.write(imageSorti,"png", file_out);
    } catch (IOException ex) {
          Logger.getLogger(InterfacePrincipale.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    ImageIcon imageChiffree = new ImageIcon(urlImageChiffre);
        jLabel23.setIcon(imageChiffree);
        
    try {
         in.close();
         out.close();
    } catch (IOException ex) {
         Logger.getLogger(InterfacePrincipale.class.getName()).log(Level.SEVERE, null, ex);
    }  
    port.close();
    
}//GEN-LAST:event_jButton9ActionPerformed

private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
    jComboBox9.setSelectedIndex(0);
    jTextField7.setText(null);
    jTextField8.setText(null);
    jLabel22.setIcon(null);
    jLabel23.setIcon(null);
}//GEN-LAST:event_jButton10ActionPerformed

private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton7ActionPerformed
    JFileChooser boiteOuvrir = new JFileChooser();
    boiteOuvrir.setCurrentDirectory(new File("fichiers" + File.separator));
    boiteOuvrir.addChoosableFileFilter(new Filtre(new String[]{"p12"}, "fichiers clés secrètes (.p12)"));
    boiteOuvrir.setFileHidingEnabled(false);
    boiteOuvrir.setAcceptAllFileFilterUsed(false);
    
    int choix = boiteOuvrir.showOpenDialog(boiteOuvrir);
    if (choix == boiteOuvrir.APPROVE_OPTION) {
        String urlCleSecrete=boiteOuvrir.getSelectedFile().getPath();
        try {
            BufferedReader br = new BufferedReader(new FileReader(urlCleSecrete));
            String cle = br.readLine();
            br.close();
            jTextField9.setText(cle);
        }
        catch (IOException ex) {
            JOptionPane jop=new JOptionPane();
            jop.showMessageDialog(null,"La clé secrète est introuvable.","Erreur",JOptionPane.ERROR_MESSAGE);
            return;
        }
    } 
}//GEN-LAST:event_jToggleButton7ActionPerformed

private void jToggleButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton8ActionPerformed
    JFileChooser boiteOuvrir = new JFileChooser();
    boiteOuvrir.setCurrentDirectory(new File("fichiers" + File.separator));
    boiteOuvrir.setFileHidingEnabled(false);
    boiteOuvrir.setAcceptAllFileFilterUsed(true);
    
    int choix = boiteOuvrir.showOpenDialog(boiteOuvrir);
    if (choix == boiteOuvrir.APPROVE_OPTION) {
        jTextField10.setText(boiteOuvrir.getSelectedFile().getPath());
    } 
    
    String urlImageChiffre = jTextField10.getText();    
    ImageIcon imageChiffre = new ImageIcon(urlImageChiffre);
    jLabel27.setIcon(imageChiffre);
}//GEN-LAST:event_jToggleButton8ActionPerformed

private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
     BufferedInputStream  in = null;
     BufferedOutputStream out = null;
     try {
        in  = new BufferedInputStream(port.getInputStream());
        out = new BufferedOutputStream(port.getOutputStream());
     } catch (IOException ex) {
        Logger.getLogger(InterfacePrincipale.class.getName()).log(Level.SEVERE, null, ex);
     }

    String cle             = jTextField9.getText();
    String urlImageChiffre = jTextField10.getText();

    if(cle.length()!=32  ){
        JOptionPane jop=new JOptionPane();
        jop.showMessageDialog(null,"La clé secrète est invalide.","Erreur",JOptionPane.ERROR_MESSAGE);
        jTextField9.setText(null);
        return;
    }
    
    if(urlImageChiffre.length()==0  ){
        JOptionPane jop=new JOptionPane();
        jop.showMessageDialog(null,"Le chemin du fichier est invalide.","Erreur",JOptionPane.ERROR_MESSAGE);
        jTextField10.setText(null);
        return;
    }    
    
    File File_in = new File( urlImageChiffre );
    
    BufferedImage imageEntree = null;	
        try {
            imageEntree = ImageIO.read(File_in);
        } catch (IOException ex) {
            Logger.getLogger(InterfacePrincipale.class.getName()).log(Level.SEVERE, null, ex);
        }
    int w = imageEntree.getWidth(); int h = imageEntree.getHeight();
   
    int [][] matrixPixel = new int [w][h];
    
    String urlImageDechiffre = urlImageChiffre.substring(0, urlImageChiffre.lastIndexOf("."));
    urlImageDechiffre+="_dechiff.png";
    File file_out = new File( urlImageDechiffre );
    
    BufferedImage imageSorti = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
    
    for( int i=0 ; i<w ; i++ )
        for( int j=0 ; j<h ; j++ ) {
            int pixel = imageEntree.getRGB(i,j);
            matrixPixel [i][j] = pixel;
        }        
    
    String[] messages = Utils.Tab32To128( matrixPixel, w, h);
    String[] messages_chiffrer = new String[messages.length];
    
    int taille_messages = 0;
    if((w*h)%4 != 0) taille_messages = (int)(w*h/4)+1;
    else taille_messages = (int)(w*h/4);
    
    int tablechiff_intermediare[][] = new int [taille_messages][4];
    int nombre_iteration =0;
    int matrix_chiff[][] = new int [w][h];
    
    //Envoie de signal de commande Crypt/Decrypt
    byte Crypt_Dcrypt = 1;
        try {
            out.write(Crypt_Dcrypt);
            out.flush();
        } catch (IOException ex) {
            Logger.getLogger(InterfacePrincipale.class.getName()).log(Level.SEVERE, null, ex);
        }

     //Envoie de la cle    
     byte[] tab_cle = Utils.toByteArray(cle);
     for(int i=0; i<tab_cle.length; i++){
            try {
                out.write(tab_cle[i]);
            } catch (IOException ex) {
                Logger.getLogger(InterfacePrincipale.class.getName()).log(Level.SEVERE, null, ex);
            }
     }
     try {
          out.flush();
     } catch (IOException ex) {
            Logger.getLogger(InterfacePrincipale.class.getName()).log(Level.SEVERE, null, ex);
     }
     
     byte[] tab_result = new byte[16];
     for(int i=0; i<messages.length; i++){       
        byte[] tab_mess = Utils.toByteArray(messages[i]);
        System.out.println(messages[i]);
        for(int j=0; j<tab_mess.length; j++){
                try {
                    out.write(tab_mess[j]);
                } catch (IOException ex) {
                    Logger.getLogger(InterfacePrincipale.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        try {
             out.flush();
        } catch (IOException ex) {
                Logger.getLogger(InterfacePrincipale.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for(int k=0; k<16; k++){
                try {
                    tab_result[k] = (byte) in.read();
                } catch (IOException ex) {
                    Logger.getLogger(InterfacePrincipale.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        String resultat = Utils.toHexString(tab_result);
        messages_chiffrer[i] = resultat;
        System.out.println(resultat);
        
        int[] tablechiff = Utils.StringHexToInt(resultat);
        for (int j=0 ; j<4 ; j++){
            tablechiff_intermediare[i][j] = tablechiff[j];  
        }
        
        nombre_iteration++;
        System.out.println(nombre_iteration);
     }
     
     int indic1=0, indic2 =0;
     for(int i=0 ; i<w ; i++)
         for(int j =0; j<h ; j++){
            matrix_chiff[i][j] =  tablechiff_intermediare[indic1][indic2];
            indic2++;
            if(indic2 == 4){
                indic1++;
                indic2=0;
            }
        }    
 
     for(int i=0 ; i<w ; i++ )
         for(int j=0 ; j<h ; j++ ) 
            imageSorti.setRGB(i,j, matrix_chiff[i][j]);
     
     try {
         ImageIO.write(imageSorti,"png", file_out);
     } catch (IOException ex) {
            Logger.getLogger(InterfacePrincipale.class.getName()).log(Level.SEVERE, null, ex);
     }
     
     ImageIcon imageDechiffre = new ImageIcon(urlImageDechiffre);
     jLabel28.setIcon(imageDechiffre);
        
     try {
         in.close();
         out.close();
     } catch (IOException ex) {
         Logger.getLogger(InterfacePrincipale.class.getName()).log(Level.SEVERE, null, ex);
     }  
     port.close();
    
}//GEN-LAST:event_jButton11ActionPerformed

private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
    jComboBox10.setSelectedIndex(0);
    jTextField9.setText(null);
    jTextField10.setText(null);
    jLabel27.setIcon(null);
    jLabel28.setIcon(null);
}//GEN-LAST:event_jButton12ActionPerformed

    private void jToggleButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton9ActionPerformed
    JFileChooser boiteOuvrir = new JFileChooser();
    boiteOuvrir.setCurrentDirectory(new File("fichiers" + File.separator));
    boiteOuvrir.addChoosableFileFilter(new Filtre(new String[]{"p12"}, "fichiers clés secrètes (.p12)"));
    boiteOuvrir.setFileHidingEnabled(false);
    boiteOuvrir.setAcceptAllFileFilterUsed(false);
    
    int choix = boiteOuvrir.showOpenDialog(boiteOuvrir);
    if (choix == boiteOuvrir.APPROVE_OPTION) {
        String urlCleSecrete=boiteOuvrir.getSelectedFile().getPath();
        try {
            BufferedReader br = new BufferedReader(new FileReader(urlCleSecrete));
            String cle = br.readLine();
            br.close();
            jTextField11.setText(cle);
        }
        catch (IOException ex) {
            JOptionPane jop=new JOptionPane();
            jop.showMessageDialog(null,"La clé secrète est introuvable.","Erreur",JOptionPane.ERROR_MESSAGE);
            return;
        }
    }
    }//GEN-LAST:event_jToggleButton9ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
 
    BufferedInputStream  in = null;
    BufferedOutputStream out = null;
    try {
        in  = new BufferedInputStream(port.getInputStream());
        out = new BufferedOutputStream(port.getOutputStream());
    } catch (IOException ex) {
        Logger.getLogger(InterfacePrincipale.class.getName()).log(Level.SEVERE, null, ex);
    }
 
    String cle      = jTextField11.getText();
    String message = jTextField12.getText();
    message = Utils.toHex(message);
    
    if( cle.length() != 32 ){
        JOptionPane jop=new JOptionPane();
        jop.showMessageDialog(null,"La clé secrète est invalide.","Erreur",JOptionPane.ERROR_MESSAGE);
        jTextField11.setText(null);
        return;
    }
    
    int nombre_iteration =0;
    String tab_message[];
    tab_message = Utils.SubDiviserString(message);    
    String[] messages_chiffrer = new String[tab_message.length];
    
    //Envoie de signal de commande Crypt/Decrypt
    byte Crypt_Dcrypt = 0;
        try {
            out.write(Crypt_Dcrypt);
            out.flush();
        } catch (IOException ex) {
            Logger.getLogger(InterfacePrincipale.class.getName()).log(Level.SEVERE, null, ex);
        }
    byte[] tab_cle = Utils.toByteArray(cle);
    for(int i=0; i<tab_cle.length; i++){
            try {
                out.write(tab_cle[i]);
            } catch (IOException ex) {
                Logger.getLogger(InterfacePrincipale.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
        try {
            out.flush();
        } catch (IOException ex) {
            Logger.getLogger(InterfacePrincipale.class.getName()).log(Level.SEVERE, null, ex);
        }
               
    byte[] tab_result = new byte[16];
    for(int i=0; i<tab_message.length; i++){       
        byte[] tab_mess = Utils.toByteArray(tab_message[i]);
        System.out.println(tab_message[i]);
        for(int j=0; j<tab_mess.length; j++){
                try {
                     out.write(tab_mess[j]);
                } catch (IOException ex) {
                    Logger.getLogger(InterfacePrincipale.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        try {
             out.flush();
        } catch (IOException ex) {
             Logger.getLogger(InterfacePrincipale.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for(int k=0; k<tab_result.length; k++){
                try {
                    tab_result[k] = (byte) in.read();
                } catch (IOException ex) {
                    Logger.getLogger(InterfacePrincipale.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        String resultat = Utils.toHexString(tab_result);
        messages_chiffrer[i] = resultat;
        System.out.println(resultat);
        
        nombre_iteration++;
        System.out.println(nombre_iteration);
    }
    
    String messageChiffre = "";
    for (int i=0;i<messages_chiffrer.length;i++){
        messageChiffre = messageChiffre + messages_chiffrer[i];
    }
    jTextField13.setText(messageChiffre);

    try {
         in.close();
         out.close();
    } catch (IOException ex) {
         Logger.getLogger(InterfacePrincipale.class.getName()).log(Level.SEVERE, null, ex);
    }  
    port.close();

    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed

    BufferedInputStream  in = null;
    BufferedOutputStream out = null;
    try {
        in  = new BufferedInputStream(port.getInputStream());
        out = new BufferedOutputStream(port.getOutputStream());
    } catch (IOException ex) {
        Logger.getLogger(InterfacePrincipale.class.getName()).log(Level.SEVERE, null, ex);
    }
 
    String cle      = jTextField11.getText();
    String message = jTextField13.getText();
    //message = Utils.toHex(message);
    
    if( cle.length() != 32 ){
        JOptionPane jop=new JOptionPane();
        jop.showMessageDialog(null,"La clé secrète est invalide.","Erreur",JOptionPane.ERROR_MESSAGE);
        jTextField11.setText(null);
        return;
    }
    
    int nombre_iteration =0;
    String tab_message[];
    tab_message = Utils.SubDiviserString(message);    
    String[] messages_chiffrer = new String[tab_message.length];
    
    //Envoie de signal de commande Crypt/Decrypt
    byte Crypt_Dcrypt = 1;
        try {
            out.write(Crypt_Dcrypt);
            out.flush();
        } catch (IOException ex) {
            Logger.getLogger(InterfacePrincipale.class.getName()).log(Level.SEVERE, null, ex);
        }
    byte[] tab_cle = Utils.toByteArray(cle);
    for(int i=0; i<tab_cle.length; i++){
            try {
                out.write(tab_cle[i]);
            } catch (IOException ex) {
                Logger.getLogger(InterfacePrincipale.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
        try {
            out.flush();
        } catch (IOException ex) {
            Logger.getLogger(InterfacePrincipale.class.getName()).log(Level.SEVERE, null, ex);
        }
               
    byte[] tab_result = new byte[16];
    for(int i=0; i<tab_message.length; i++){       
        byte[] tab_mess = Utils.toByteArray(tab_message[i]);
        System.out.println(tab_message[i]);
        for(int j=0; j<tab_mess.length; j++){
                try {
                     out.write(tab_mess[j]);
                } catch (IOException ex) {
                    Logger.getLogger(InterfacePrincipale.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        try {
             out.flush();
        } catch (IOException ex) {
             Logger.getLogger(InterfacePrincipale.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for(int k=0; k<tab_result.length; k++){
                try {
                    tab_result[k] = (byte) in.read();
                } catch (IOException ex) {
                    Logger.getLogger(InterfacePrincipale.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        String resultat = Utils.toHexString(tab_result);
        messages_chiffrer[i] = resultat;
        System.out.println(resultat);
        
        nombre_iteration++;
        System.out.println(nombre_iteration);
    }
    
    String messageChiffre = "";
    for (int i=0;i<messages_chiffrer.length;i++){
        messageChiffre = messageChiffre + messages_chiffrer[i];
    }
   
    jTextField14.setText(Utils.hexToString(messageChiffre));

    try {
         in.close();
         out.close();
    } catch (IOException ex) {
         Logger.getLogger(InterfacePrincipale.class.getName()).log(Level.SEVERE, null, ex);
    }  
    port.close();        
        
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        jComboBox11.setSelectedIndex(0);
        jTextField11.setText(null);
        jTextField12.setText(null);
        jTextField13.setText(null);
        jTextField14.setText(null);
    }//GEN-LAST:event_jButton15ActionPerformed

    //variable globals
    private SerialPort port = null;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox10;
    private javax.swing.JComboBox jComboBox11;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JComboBox jComboBox8;
    private javax.swing.JComboBox jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    private javax.swing.JToggleButton jToggleButton9;
    // End of variables declaration//GEN-END:variables
}
