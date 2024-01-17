/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carregistration;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributeView;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author smgOP682
 */
public class CarShop extends javax.swing.JFrame implements ActionListener{
     public List<Car> cars;
     public Car currentCar;
    /**
     * Creates new form Registration
     */
    public CarShop() {
        initComponents();
        cars = new ArrayList<>();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        SellPanel = new javax.swing.JPanel();
        LabelInfo = new javax.swing.JLabel();
        LabelBrand = new javax.swing.JLabel();
        LabelModel = new javax.swing.JLabel();
        LabelYear = new javax.swing.JLabel();
        LabelColor = new javax.swing.JLabel();
        LabelMileage = new javax.swing.JLabel();
        LabelPrice = new javax.swing.JLabel();
        LabelPhone = new javax.swing.JLabel();
        TextFieldBrand = new javax.swing.JTextField();
        TextFieldModel = new javax.swing.JTextField();
        TextFieldYear = new javax.swing.JTextField();
        TextFieldColor = new javax.swing.JTextField();
        TextFieldMileage = new javax.swing.JTextField();
        TextFieldPrice = new javax.swing.JTextField();
        TextFieldPhone = new javax.swing.JTextField();
        LabelPhoto = new javax.swing.JLabel();
        ButtonAdd = new javax.swing.JButton();
        ButtonAttach = new javax.swing.JButton();
        LabelCarImage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ButtonCancel = new javax.swing.JButton();
        BuyPanel = new javax.swing.JScrollPane();
        listPanel = new javax.swing.JPanel();
        MenuBar = new javax.swing.JMenuBar();
        MenuBuy = new javax.swing.JMenu();
        MenuSell = new javax.swing.JMenu();
        MenuInfo = new javax.swing.JMenu();
        MenuAutohouses = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(30000, 30000));

        SellPanel.setBackground(new java.awt.Color(175, 214, 236));
        SellPanel.setToolTipText("");
        SellPanel.setMaximumSize(new java.awt.Dimension(610, 511));
        SellPanel.setPreferredSize(new java.awt.Dimension(610, 511));

        LabelInfo.setFont(new java.awt.Font("Lucida Grande", 0, 17)); // NOI18N
        LabelInfo.setText("Please enter the car's data.");
        LabelInfo.setToolTipText("");

        LabelBrand.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        LabelBrand.setText("Brand:");

        LabelModel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        LabelModel.setText("Model:");

        LabelYear.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        LabelYear.setText("Year:");

        LabelColor.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        LabelColor.setText("Color:");

        LabelMileage.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        LabelMileage.setText("Mileage:");

        LabelPrice.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        LabelPrice.setText("Price:");

        LabelPhone.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        LabelPhone.setText("Phone:");

        TextFieldBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldBrandActionPerformed(evt);
            }
        });

        TextFieldYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldYearActionPerformed(evt);
            }
        });

        TextFieldColor.setToolTipText("Enter...");

        TextFieldPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldPhoneActionPerformed(evt);
            }
        });

        LabelPhoto.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        LabelPhoto.setText("Image:");

        ButtonAdd.setBackground(new java.awt.Color(21, 127, 160));
        ButtonAdd.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        ButtonAdd.setForeground(new java.awt.Color(255, 255, 255));
        ButtonAdd.setText("Add");
        ButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAddActionPerformed(evt);
            }
        });

        ButtonAttach.setText("Attach");
        ButtonAttach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAttachActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(175, 214, 236));

        ButtonCancel.setBackground(new java.awt.Color(230, 73, 73));
        ButtonCancel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ButtonCancel.setForeground(new java.awt.Color(255, 255, 255));
        ButtonCancel.setText("Cancel");
        ButtonCancel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonCancel.setMaximumSize(new java.awt.Dimension(57, 27));
        ButtonCancel.setMinimumSize(new java.awt.Dimension(57, 27));
        ButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SellPanelLayout = new javax.swing.GroupLayout(SellPanel);
        SellPanel.setLayout(SellPanelLayout);
        SellPanelLayout.setHorizontalGroup(
            SellPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SellPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SellPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(SellPanelLayout.createSequentialGroup()
                        .addComponent(LabelInfo)
                        .addGap(388, 388, 388))
                    .addGroup(SellPanelLayout.createSequentialGroup()
                        .addGroup(SellPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelMileage)
                            .addComponent(LabelBrand, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LabelModel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LabelYear, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LabelColor, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LabelPrice, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LabelPhone, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LabelPhoto, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(SellPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(SellPanelLayout.createSequentialGroup()
                                .addComponent(LabelCarImage, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(SellPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(SellPanelLayout.createSequentialGroup()
                                        .addGap(267, 267, 267)
                                        .addComponent(ButtonAttach, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SellPanelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1)
                                        .addGap(94, 94, 94))))
                            .addGroup(SellPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(TextFieldPhone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                                .addComponent(TextFieldPrice, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TextFieldMileage, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TextFieldColor, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TextFieldYear, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TextFieldModel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TextFieldBrand, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(SellPanelLayout.createSequentialGroup()
                        .addComponent(ButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        SellPanelLayout.setVerticalGroup(
            SellPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SellPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(LabelInfo)
                .addGap(11, 11, 11)
                .addGroup(SellPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBrand))
                .addGap(8, 8, 8)
                .addGroup(SellPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SellPanelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(SellPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextFieldYear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelYear)))
                    .addGroup(SellPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TextFieldModel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LabelModel)))
                .addGap(5, 5, 5)
                .addGroup(SellPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelColor)
                    .addComponent(TextFieldColor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(SellPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldMileage, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelMileage))
                .addGroup(SellPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SellPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(SellPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelPrice)))
                    .addGroup(SellPanelLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(SellPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelPhone)
                            .addComponent(TextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SellPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelPhoto)
                    .addComponent(LabelCarImage, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(SellPanelLayout.createSequentialGroup()
                        .addComponent(ButtonAttach, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(SellPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        BuyPanel.setBackground(new java.awt.Color(175, 214, 236));
        BuyPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        BuyPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BuyPanel.setMaximumSize(new java.awt.Dimension(610, 511));
        BuyPanel.setPreferredSize(new java.awt.Dimension(610, 511));
        BuyPanel.setVerifyInputWhenFocusTarget(false);

        listPanel.setBackground(new java.awt.Color(175, 214, 236));
        listPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listPanel.setMaximumSize(new java.awt.Dimension(610, 511));
        listPanel.setPreferredSize(new java.awt.Dimension(610, 511));

        javax.swing.GroupLayout listPanelLayout = new javax.swing.GroupLayout(listPanel);
        listPanel.setLayout(listPanelLayout);
        listPanelLayout.setHorizontalGroup(
            listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );
        listPanelLayout.setVerticalGroup(
            listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 511, Short.MAX_VALUE)
        );

        BuyPanel.setViewportView(listPanel);

        MenuBuy.setText("Buy a Car");
        MenuBuy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuBuyMouseClicked(evt);
            }
        });
        MenuBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuBuyActionPerformed(evt);
            }
        });
        MenuBar.add(MenuBuy);

        MenuSell.setText("Sell a Car");
        MenuSell.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuSellMouseClicked(evt);
            }
        });
        MenuSell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSellActionPerformed(evt);
            }
        });
        MenuBar.add(MenuSell);

        MenuInfo.setText("About Us");
        MenuBar.add(MenuInfo);

        MenuAutohouses.setText("Autohouses");
        MenuBar.add(MenuAutohouses);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(SellPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(1, 1, 1)
                    .addComponent(BuyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(1, 1, 1)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SellPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(BuyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAddActionPerformed
        if(evt.getSource()==ButtonAdd){

            Car c = new Car();
            c.setBrand(TextFieldBrand.getText());
            c.setModel(TextFieldModel.getText());
            c.setYear(Integer.valueOf(TextFieldYear.getText()));
            c.setColor(TextFieldColor.getText());
            c.setMileage(Double.valueOf(TextFieldMileage.getText()));
            c.setPrice(Double.valueOf(TextFieldPrice.getText()));
            c.setPhone(TextFieldPhone.getText());
            c.setImageName(jLabel1.getText());
            

            cars.add(c);
           // System.out.println(c.toString());
           
           TextFieldBrand.setText(null);
            TextFieldModel.setText(null);
            TextFieldYear.setText(null);
            TextFieldColor.setText(null);
            TextFieldMileage.setText(null);
            TextFieldPrice.setText(null);
            TextFieldPhone.setText(null);
            jLabel1.setText(null);
           LabelCarImage.setIcon(null);
        }
        
       
    }//GEN-LAST:event_ButtonAddActionPerformed

    private void TextFieldPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldPhoneActionPerformed

    private void TextFieldYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldYearActionPerformed

    private void ButtonAttachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAttachActionPerformed
       JFileChooser fileChooser = new JFileChooser();
       fileChooser.addChoosableFileFilter(new ImageFilter());
       fileChooser.setAcceptAllFileFilterUsed(false);

       int option = fileChooser.showOpenDialog(this);
       if(option == JFileChooser.APPROVE_OPTION){
          File file = fileChooser.getSelectedFile();
          try {               
               Path resourceDirectory = Paths.get("src","resources");
               String absolutePath = resourceDirectory.toFile().getAbsolutePath();
              
               FileChannel src = new FileInputStream(file).getChannel();
               FileChannel dest = new FileOutputStream(new File(absolutePath+"/"+file.getName())).getChannel();
               dest.transferFrom(src, 0, src.size());
               src.close();
               dest.close();
               ImageIcon imgIcon = new ImageIcon(absolutePath+"/"+file.getName());
               LabelCarImage.setIcon(imgIcon);
               LabelCarImage.setSize(imgIcon.getIconWidth(), imgIcon.getIconHeight());
               jLabel1.setText(file.getName());
           } catch (Exception ex) {
               // TODO Auto-generated catch block
               ex.printStackTrace();
           }}
    }//GEN-LAST:event_ButtonAttachActionPerformed

    private void MenuBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuBuyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuBuyActionPerformed

    private void MenuSellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSellActionPerformed
        if(evt.getSource()==MenuSell){
            SellPanel.setVisible(true);
        }
    }//GEN-LAST:event_MenuSellActionPerformed

    private void MenuBuyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuBuyMouseClicked
       int x=10;
       int y=10;
        for(Car car:cars){
           CarDisplay display = new CarDisplay(this, car);
           display.setBounds(x,y, 588,179);
           listPanel.add(display);
           y+=189;           
       }
        BuyPanel.setViewportView(listPanel);
        BuyPanel.setVisible(true);
       SellPanel.setVisible(false);
    }//GEN-LAST:event_MenuBuyMouseClicked

    private void MenuSellMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuSellMouseClicked
         BuyPanel.setVisible(false);
       SellPanel.setVisible(true);
    }//GEN-LAST:event_MenuSellMouseClicked

    private void ButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelActionPerformed
         if(evt.getSource()==ButtonCancel){

            TextFieldBrand.setText(null);
            TextFieldModel.setText(null);
            TextFieldYear.setText(null);
            TextFieldColor.setText(null);
            TextFieldMileage.setText(null);
            TextFieldPrice.setText(null);
            TextFieldPhone.setText(null);
            jLabel1.setText(null);
            LabelCarImage.setIcon(null);
         }
    }//GEN-LAST:event_ButtonCancelActionPerformed

    private void TextFieldBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldBrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldBrandActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CarShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
           public void run() {
                new CarShop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAdd;
    private javax.swing.JButton ButtonAttach;
    private javax.swing.JButton ButtonCancel;
    private javax.swing.JScrollPane BuyPanel;
    private javax.swing.JLabel LabelBrand;
    private javax.swing.JLabel LabelCarImage;
    private javax.swing.JLabel LabelColor;
    private javax.swing.JLabel LabelInfo;
    private javax.swing.JLabel LabelMileage;
    private javax.swing.JLabel LabelModel;
    private javax.swing.JLabel LabelPhone;
    private javax.swing.JLabel LabelPhoto;
    private javax.swing.JLabel LabelPrice;
    private javax.swing.JLabel LabelYear;
    private javax.swing.JMenu MenuAutohouses;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu MenuBuy;
    private javax.swing.JMenu MenuInfo;
    private javax.swing.JMenu MenuSell;
    private javax.swing.JPanel SellPanel;
    private javax.swing.JTextField TextFieldBrand;
    private javax.swing.JTextField TextFieldColor;
    private javax.swing.JTextField TextFieldMileage;
    private javax.swing.JTextField TextFieldModel;
    private javax.swing.JTextField TextFieldPhone;
    private javax.swing.JTextField TextFieldPrice;
    private javax.swing.JTextField TextFieldYear;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel listPanel;
    // End of variables declaration//GEN-END:variables

    public void fillInCarEditMode(Car car){
        Path resourceDirectory = Paths.get("src","resources");
        String absolutePath = resourceDirectory.toFile().getAbsolutePath();
        
            TextFieldBrand.setText(car.getBrandr());
            TextFieldModel.setText(car.getModel());
            TextFieldYear.setText(String.valueOf(car.getYear()));
            TextFieldColor.setText(car.getColor());
            TextFieldMileage.setText(String.valueOf(car.getMileage()));
            TextFieldPrice.setText(String.valueOf(car.getPrice()));
            TextFieldPhone.setText(car.getPhone());
            LabelCarImage.setIcon(new ImageIcon(absolutePath+"/"+car.getImageName()));
            jLabel1.setText(car.getImageName());
    }
    public JPanel getSellPanel(){
        return SellPanel;
    }
    public JScrollPane getBuyPanel(){
        return BuyPanel;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
