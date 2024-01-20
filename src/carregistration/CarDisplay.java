/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carregistration;


import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author smgOP682
 */
public class CarDisplay extends javax.swing.JPanel {

    CarShop carShopFrame;
    Car currentcar;
    /**
     * Creates new form CarDisplay
     */
    public CarDisplay(CarShop carShopFrame, Car car) {
        this.carShopFrame = carShopFrame;
        this.currentcar = car;
        initComponents();
       Path resourceDirectory = Paths.get("src","resources");
        String absolutePath = resourceDirectory.toFile().getAbsolutePath();
        
        LabelListBrand.setText(car.getBrandr());
        LabelListColor.setText(car.getColor());
        LabelListMileage.setText(String.valueOf(car.getMileage()));
        LabelListModel.setText(car.getModel());
        LabelListPhone.setText(car.getPhone());
        LabelListPic.setIcon(new ImageIcon(absolutePath+"/"+car.getImageName()));
        LabelListPrice.setText(String.valueOf(car.getPrice()));
        LabelListYear.setText(String.valueOf(car.getYear()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelListPic = new javax.swing.JLabel();
        LabelListBrand = new javax.swing.JLabel();
        LabelListModel = new javax.swing.JLabel();
        LabelListYear = new javax.swing.JLabel();
        LabelListColor = new javax.swing.JLabel();
        LabelListMileage = new javax.swing.JLabel();
        LabelListPhone = new javax.swing.JLabel();
        LabelListPrice = new javax.swing.JLabel();
        ButtonEdit = new javax.swing.JButton();
        ButtonDelete = new javax.swing.JButton();
        km = new javax.swing.JLabel();
        lv = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(234, 244, 247));
        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setPreferredSize(new java.awt.Dimension(588, 179));

        LabelListBrand.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        LabelListBrand.setText("Brand");

        LabelListModel.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        LabelListModel.setText("Model");

        LabelListYear.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        LabelListYear.setText("Year");

        LabelListColor.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        LabelListColor.setText("Color");

        LabelListMileage.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        LabelListMileage.setText("Mileage");

        LabelListPhone.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        LabelListPhone.setText("Phone");

        LabelListPrice.setFont(new java.awt.Font("Helvetica Neue", 0, 17)); // NOI18N
        LabelListPrice.setText("Price");
        LabelListPrice.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(36, 96, 156), 1, true));

        ButtonEdit.setBackground(new java.awt.Color(135, 137, 144));
        ButtonEdit.setForeground(new java.awt.Color(255, 255, 255));
        ButtonEdit.setText("Edit");
        ButtonEdit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonEdit.setMinimumSize(new java.awt.Dimension(11, 11));
        ButtonEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonEditMouseClicked(evt);
            }
        });
        ButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEditActionPerformed(evt);
            }
        });

        ButtonDelete.setBackground(new java.awt.Color(230, 73, 73));
        ButtonDelete.setForeground(new java.awt.Color(255, 255, 255));
        ButtonDelete.setText("Delete");
        ButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDeleteActionPerformed(evt);
            }
        });

        km.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        km.setText("km");

        lv.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lv.setText("лв.");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("📞");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(LabelListPic, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelListYear)
                            .addComponent(LabelListColor)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelListMileage)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(km)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(LabelListPhone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(LabelListBrand)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelListModel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelListPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lv)
                                .addGap(16, 16, 16))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ButtonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LabelListBrand)
                                    .addComponent(LabelListModel))
                                .addGap(18, 18, 18)
                                .addComponent(LabelListYear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelListColor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LabelListMileage)
                                    .addComponent(km)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ButtonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ButtonDelete)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(LabelListPhone)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LabelListPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lv))
                                .addGap(10, 10, 10))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LabelListPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDeleteActionPerformed
         if(evt.getSource()==ButtonDelete){
         this.setVisible(false);
         }
    }//GEN-LAST:event_ButtonDeleteActionPerformed

    private void ButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEditActionPerformed
        if(evt.getSource()==ButtonEdit){
        carShopFrame.fillInCarEditMode(currentcar);
        carShopFrame.getSellPanel().setVisible(true);
        carShopFrame.getBuyPanel().setVisible(false);
        }
    }//GEN-LAST:event_ButtonEditActionPerformed

    private void ButtonEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonEditMouseClicked
  
    }//GEN-LAST:event_ButtonEditMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonDelete;
    private javax.swing.JButton ButtonEdit;
    private javax.swing.JLabel LabelListBrand;
    private javax.swing.JLabel LabelListColor;
    private javax.swing.JLabel LabelListMileage;
    private javax.swing.JLabel LabelListModel;
    private javax.swing.JLabel LabelListPhone;
    private javax.swing.JLabel LabelListPic;
    private javax.swing.JLabel LabelListPrice;
    private javax.swing.JLabel LabelListYear;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel km;
    private javax.swing.JLabel lv;
    // End of variables declaration//GEN-END:variables

    
}
