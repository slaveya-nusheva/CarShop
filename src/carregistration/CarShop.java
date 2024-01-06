/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carregistration;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributeView;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JPanel;

/**
 *
 * @author smgOP682
 */
public class CarShop extends javax.swing.JFrame implements ActionListener{
     public List<Car> cars;
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
        LabelCarImage = new javax.swing.JLabel();
        ButtonAttach = new javax.swing.JButton();
        BuyPanel = new javax.swing.JPanel();
        MenuBar = new javax.swing.JMenuBar();
        MenuBuy = new javax.swing.JMenu();
        MenuSell = new javax.swing.JMenu();
        MenuInfo = new javax.swing.JMenu();
        MenuAutohouses = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(30000, 30000));

        SellPanel.setBackground(new java.awt.Color(175, 214, 236));
        SellPanel.setToolTipText("");

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

        LabelCarImage.setBackground(new java.awt.Color(255, 255, 255));

        ButtonAttach.setText("Attach");
        ButtonAttach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAttachActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SellPanelLayout = new javax.swing.GroupLayout(SellPanel);
        SellPanel.setLayout(SellPanelLayout);
        SellPanelLayout.setHorizontalGroup(
            SellPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SellPanelLayout.createSequentialGroup()
                .addGroup(SellPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SellPanelLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
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
                            .addComponent(ButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(SellPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TextFieldPhone)
                                .addComponent(TextFieldPrice)
                                .addComponent(TextFieldMileage)
                                .addComponent(TextFieldColor)
                                .addComponent(TextFieldYear)
                                .addComponent(TextFieldModel)
                                .addComponent(TextFieldBrand)
                                .addGroup(SellPanelLayout.createSequentialGroup()
                                    .addComponent(LabelCarImage, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(ButtonAttach, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(SellPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LabelInfo)))
                .addGap(0, 34, Short.MAX_VALUE))
        );
        SellPanelLayout.setVerticalGroup(
            SellPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SellPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(LabelInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                    .addComponent(LabelCarImage, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonAttach, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(ButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        BuyPanel.setForeground(new java.awt.Color(175, 214, 236));

        javax.swing.GroupLayout BuyPanelLayout = new javax.swing.GroupLayout(BuyPanel);
        BuyPanel.setLayout(BuyPanelLayout);
        BuyPanelLayout.setHorizontalGroup(
            BuyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 588, Short.MAX_VALUE)
        );
        BuyPanelLayout.setVerticalGroup(
            BuyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 491, Short.MAX_VALUE)
        );

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
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(BuyPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SellPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(BuyPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            c.setImageName(LabelCarImage.getText());
            

            cars.add(c);
            System.out.println(c.toString());
            
            
            JPanel jp = new CarDisplay();
            //setLabelListBrand(c.getBrandr());
            BuyPanel.add(jp);
        }
        
       
    }//GEN-LAST:event_ButtonAddActionPerformed

    private void TextFieldPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldPhoneActionPerformed

    private void TextFieldYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldYearActionPerformed

    private void ButtonAttachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAttachActionPerformed
       JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File sourceFile = chooser.getSelectedFile();
        String sourceImagePath = sourceFile.getAbsolutePath();
        
        
        Path sourcePath = sourceFile.toPath();
        Path targetPath = Path.of(System.getProperty("user.dir"), "CarShopImages", sourcePath.getFileName().toString());
        LabelCarImage.setText(sourcePath.getFileName().toString());
        try{
            Files.createDirectories(targetPath.getParent());
         Files.copy(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);   
        } catch(IOException ioe){
            throw new RuntimeException("cannot copy image file", ioe);
        }
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
       BuyPanel.setVisible(true);
       SellPanel.setVisible(false);
    }//GEN-LAST:event_MenuBuyMouseClicked

    private void MenuSellMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuSellMouseClicked
         BuyPanel.setVisible(false);
       SellPanel.setVisible(true);
    }//GEN-LAST:event_MenuSellMouseClicked

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
    private javax.swing.JPanel BuyPanel;
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
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}