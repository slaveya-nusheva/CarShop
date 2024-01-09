/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carregistration;

import java.awt.LayoutManager;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author smgOP682
 */
public class CarDisplay extends javax.swing.JPanel {

    /**
     * Creates new form CarDisplay
     */
    public CarDisplay(Car car) {
        initComponents();
        LabelListBrand.setText(car.getBrandr());
        LabelListColor.setText(car.getColor());
        LabelListMileage.setText(String.valueOf(car.getMileage()));
        LabelListModel.setText(car.getModel());
        LabelListPhone.setText(car.getPhone());
        LabelListPic.setIcon(new ImageIcon(car.getImageName()));
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

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

        jButton1.setBackground(new java.awt.Color(102, 153, 0));
        jButton1.setForeground(new java.awt.Color(102, 153, 0));
        jButton1.setText("jButton1");

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setForeground(new java.awt.Color(204, 0, 0));
        jButton2.setText("jButton1");

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
                        .addComponent(LabelListPhone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelListPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelListYear)
                                    .addComponent(LabelListColor)
                                    .addComponent(LabelListMileage))
                                .addGap(0, 250, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelListBrand)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelListModel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
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
                                .addComponent(LabelListMileage))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelListPhone, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(LabelListPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LabelListPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelListBrand;
    private javax.swing.JLabel LabelListColor;
    private javax.swing.JLabel LabelListMileage;
    private javax.swing.JLabel LabelListModel;
    private javax.swing.JLabel LabelListPhone;
    private javax.swing.JLabel LabelListPic;
    private javax.swing.JLabel LabelListPrice;
    private javax.swing.JLabel LabelListYear;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables

    
}
