/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package website;

import java.awt.*;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.event.*;
/**
 *
 * @author Cintaku
 */
public class Order extends javax.swing.JFrame {

    /**
     * Creates new form Order
     */

    private double total=0.0;
    private int x=0;
    private double fee=0.0;

    private final String[] items = {"Cheezy Beef", "Mushroom", "Meat Lovers", "Four Cheese", "Pepperoni", "Veggies"};
    private final double[] prices = {8000.0, 5000.0, 7000.0, 6000.0, 7500.0, 4000.0};
    private final int[] quantities = {0, 0, 0, 0, 0, 0};
    
    
    
    public Order() {
        initComponents();
        total = 0.0;
        int x=0;
        fee=1500.0;
        jCheckout.setEnabled(true);
        scaleImage();
        scaleImage2();
        scaleImage3();
        scaleImage4();
        scaleImage5();
        scaleImage6();
        scaleImage7();
        addChangeListeners();
    }
    
    
     private void addChangeListeners() {
        jSpinner8.addChangeListener(new ItemChangeListener(0, jCheckBox1, jSpinner8));
        jSpinner9.addChangeListener(new ItemChangeListener(1, jCheckBox2, jSpinner9));
        jSpinner7.addChangeListener(new ItemChangeListener(2, jCheckBox3, jSpinner7));
        jSpinner11.addChangeListener(new ItemChangeListener(3, jCheckBox6, jSpinner11));
        jSpinner12.addChangeListener(new ItemChangeListener(4, jCheckBox4, jSpinner12));
        jSpinner10.addChangeListener(new ItemChangeListener(5, jCheckBox5, jSpinner10));
     }
    private void updateOrderDetails() {
        jTextField3.setText(String.valueOf(String.format("₦%.2f", total)));
        jTextField1.setText(String.valueOf("₦" + fee));
        jTextField2.setText(String.valueOf("₦" + (total + fee)));
    }
    private void updateTextArea() {
        StringBuilder sb = new StringBuilder();
        sb.append("*************************************************\n")
                .append("******************Pizza Place******************\n")
                .append("*************************************************\n")
                .append("  Name\t\t").append("    Price\n");

        total = 0.0;
        for (int i = 0; i < items.length; i++) {
            if (quantities[i] > 0) {
                double price = quantities[i] * prices[i];
                total += price;
                sb.append(items[i]).append("\t\t").append("₦").append(price).append("\n");
            }
        }

        jTextArea.setText(sb.toString());
        updateOrderDetails();
    }

    private class ItemChangeListener implements ChangeListener {
        private final int index;
        private final JCheckBox checkBox;
        private final JSpinner spinner;

        public ItemChangeListener(int index, JCheckBox checkBox, JSpinner spinner) {
            this.index = index;
            this.checkBox = checkBox;
            this.spinner = spinner;
        }

        @Override
        public void stateChanged(ChangeEvent e) {
            int qty = (int) spinner.getValue();
            if (qty > 0) {
                checkBox.setSelected(true);
                quantities[index] = qty;
            } else {
                checkBox.setSelected(false);
                quantities[index] = 0;
            }
            updateTextArea();
        }
    }
    

    
    
    public void orderDetails()
    {
        jTextField3.setText(String.valueOf(String.format("₦%.2f",total)));
        jTextField1.setText(String.valueOf("₦"+fee));
        jTextField2.setText(String.valueOf("₦"+(total+fee)));
}
    public boolean qtyzero(int qty)
    {
        if(qty==0){
            JOptionPane.showMessageDialog(this,"Increase quantity to add");
            return false;
        }
        
        return true;
    }
   
    public void reset()
    {
        Cart cart;
        //jCheckout.setEnabled(false);
        total = 0.0;
        int x=0;
        jSpinner8.setValue(0);
        jSpinner9.setValue(0);
        jSpinner10.setValue(0);
        jSpinner11.setValue(0);
        jSpinner12.setValue(0);
        jSpinner7.setValue(0);
        jTextField3.setText("0.0");
        jTextField2.setText("0.0");
        jTextField1.setText("0.0");
        jTextArea.setText("");
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jCheckBox3.setSelected(false);
        jCheckBox4.setSelected(false);
        jCheckBox5.setSelected(false);
        jCheckBox6.setSelected(false); 
        jCheckout.setEnabled(true);  
    }
    public void scaleImage()
    {
        ImageIcon icon = new ImageIcon(getClass().getResource("/images/PhotoRoom-20240708_124638.png"));
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        imageLabel.setIcon(scaledIcon);       
    }
    
    public void scaleImage2()
    {
        ImageIcon icon = new ImageIcon(getClass().getResource("/images/PhotoRoom-20240708_125546.png"));
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(imageLabel2.getWidth(), imageLabel2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        imageLabel2.setIcon(scaledIcon);       
    }
    
    public void scaleImage3()
    {
        ImageIcon icon = new ImageIcon(getClass().getResource("/images/PhotoRoom-20240708_125221.png"));
        Image img = icon.getImage();
        Image imgScale2 = img.getScaledInstance(imageLabel3.getWidth(), imageLabel3.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon2 = new ImageIcon(imgScale2);
        imageLabel3.setIcon(scaledIcon2);       
    }
    
    public void scaleImage4()
    {
        ImageIcon icon = new ImageIcon(getClass().getResource("/images/PhotoRoom-20240708_125128.png"));
        Image img = icon.getImage();
        Image imgScale2 = img.getScaledInstance(imageLabel4.getWidth(), imageLabel4.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon2 = new ImageIcon(imgScale2);
        imageLabel4.setIcon(scaledIcon2);       
    }
    
    public void scaleImage5()
    {
        ImageIcon icon = new ImageIcon(getClass().getResource("/images/PhotoRoom-20240708_124944.png"));
        Image img = icon.getImage();
        Image imgScale2 = img.getScaledInstance(imageLabel5.getWidth(), imageLabel5.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon2 = new ImageIcon(imgScale2);
        imageLabel5.setIcon(scaledIcon2);       
    }
    
    public void scaleImage6()
    {
        ImageIcon icon = new ImageIcon(getClass().getResource("/images/PhotoRoom-20240708_125057.png"));
        Image img = icon.getImage();
        Image imgScale2 = img.getScaledInstance(imageLabel6.getWidth(), imageLabel6.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon2 = new ImageIcon(imgScale2);
        imageLabel6.setIcon(scaledIcon2);       
    }
    
    public void scaleImage7()
    {
        ImageIcon icon = new ImageIcon(getClass().getResource("/images/9295991.png"));
        Image img = icon.getImage();
        Image imgScale2 = img.getScaledInstance(background.getWidth(), background.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon2 = new ImageIcon(imgScale2);
        background.setIcon(scaledIcon2);       
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        imageLabel = new javax.swing.JLabel();
        imageLabel2 = new javax.swing.JLabel();
        imageLabel3 = new javax.swing.JLabel();
        imageLabel4 = new javax.swing.JLabel();
        imageLabel5 = new javax.swing.JLabel();
        imageLabel6 = new javax.swing.JLabel();
        jSpinner7 = new javax.swing.JSpinner();
        jSpinner8 = new javax.swing.JSpinner();
        jSpinner9 = new javax.swing.JSpinner();
        jSpinner10 = new javax.swing.JSpinner();
        jSpinner11 = new javax.swing.JSpinner();
        jSpinner12 = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jCheckout = new javax.swing.JButton();
        background = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Order");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCheckBox1.setText("Add to Cart");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel4.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 90, -1));

        jCheckBox2.setText("Add to Cart");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jPanel4.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 90, 20));

        jCheckBox3.setText("Add to Cart");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        jPanel4.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 90, 20));

        jCheckBox4.setText("Add to Cart");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });
        jPanel4.add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 90, -1));

        jCheckBox5.setText("Add to Cart");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });
        jPanel4.add(jCheckBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, 90, -1));

        jCheckBox6.setText("Add to Cart");
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });
        jPanel4.add(jCheckBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 90, -1));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Home");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 90, 40));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Order");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 90, 40));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("About");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 90, 40));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 90, 40));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 90, 40));

        jPanel1.setBackground(new java.awt.Color(255, 177, 95));
        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 90, 40));

        jLabel15.setFont(new java.awt.Font("Segoe UI Variable", 1, 12)); // NOI18N
        jLabel15.setText("Veggies");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI Variable", 1, 12)); // NOI18N
        jLabel16.setText("Meat Lovers");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Variable", 1, 12)); // NOI18N
        jLabel12.setText("Pepperoni");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Variable", 1, 12)); // NOI18N
        jLabel11.setText("Mushroom");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Variable", 1, 12)); // NOI18N
        jLabel7.setText("Four Cheese");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 70, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Variable", 1, 12)); // NOI18N
        jLabel2.setText("Cheezy Beef ");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Variable", 1, 12)); // NOI18N
        jLabel3.setText("Price: ₦7000");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 352, 90, 20));

        jLabel24.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel24.setText("Menu");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 60, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI Variable", 1, 12)); // NOI18N
        jLabel13.setText("Price: ₦5000");
        jLabel13.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel13.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 242, 90, 20));

        jLabel20.setFont(new java.awt.Font("Segoe UI Variable", 1, 12)); // NOI18N
        jLabel20.setText("Price: ₦7500");
        jLabel20.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel20.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 242, 90, 20));

        jLabel21.setFont(new java.awt.Font("Segoe UI Variable", 1, 12)); // NOI18N
        jLabel21.setText("Price: ₦4000");
        jLabel21.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel21.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 352, 90, 20));

        jLabel22.setFont(new java.awt.Font("Segoe UI Variable", 1, 12)); // NOI18N
        jLabel22.setText("Price: ₦8000");
        jLabel22.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel22.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 132, 90, 20));

        jLabel23.setFont(new java.awt.Font("Segoe UI Variable", 1, 12)); // NOI18N
        jLabel23.setText("Price: ₦6000");
        jLabel23.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel23.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 132, 90, 20));
        jPanel4.add(imageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 120, 120));
        jPanel4.add(imageLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 120, 120));
        jPanel4.add(imageLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 120, 120));
        jPanel4.add(imageLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 120, 120));
        jPanel4.add(imageLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 120, 120));
        jPanel4.add(imageLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 120, 120));

        jSpinner7.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanel4.add(jSpinner7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 90, -1));

        jSpinner8.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSpinner8.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jSpinner8InputMethodTextChanged(evt);
            }
        });
        jPanel4.add(jSpinner8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 90, -1));

        jSpinner9.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanel4.add(jSpinner9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 90, -1));

        jSpinner10.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanel4.add(jSpinner10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 90, -1));

        jSpinner11.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanel4.add(jSpinner11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 90, -1));

        jSpinner12.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanel4.add(jSpinner12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 90, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI Variable", 1, 12)); // NOI18N
        jButton1.setText("Clear");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, -1, -1));

        jCheckout.setFont(new java.awt.Font("Segoe UI Variable", 1, 12)); // NOI18N
        jCheckout.setText("Checkout");
        jCheckout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckoutActionPerformed(evt);
            }
        });
        jPanel4.add(jCheckout, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 390, -1, -1));

        background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/9295991.png"))); // NOI18N
        background.setMaximumSize(new java.awt.Dimension(760, 430));
        background.setMinimumSize(new java.awt.Dimension(760, 430));
        jPanel4.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 430));
        jPanel4.add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 90, 170));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 430));

        jPanel5.setBackground(new java.awt.Color(253, 236, 221));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea.setEditable(false);
        jTextArea.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea.setColumns(20);
        jTextArea.setRows(5);
        jScrollPane2.setViewportView(jTextArea);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 250, 290));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel18.setText("Sub Total:");
        jLabel18.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 70, 20));

        jTextField3.setEditable(false);
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("0.0");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 130, -1));

        jTextField1.setEditable(false);
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("0.0");
        jPanel5.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 130, -1));

        jTextField2.setEditable(false);
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("0.0");
        jTextField2.setSelectionColor(new java.awt.Color(0, 255, 51));
        jPanel5.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 130, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Total(₦)");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 60, 20));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel17.setText("Delivery Fee:");
        jLabel17.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 90, 20));

        jLabel19.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Cart");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 250, 30));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 290, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        About abt = new About();
        abt.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        Homepageweb home = new Homepageweb();
        home.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        reset();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckoutActionPerformed
        // TODO add your handling code here:
        if(total==0.0){
            JOptionPane.showMessageDialog(this,"You haven't picked anything");
        }
        else{
            jTextArea.setText(jTextArea.getText()
                    +"************************************************\n"
                    +"Sub Total: \t\t" +"₦"+total
                    +"\nDelivery Fee: \t\t" +"₦"+fee+"\n"
                    +"Total: \t\t"+"₦"+(fee+total)+"\n\n"
                    +"*******************Thank You******************\n");
            jCheckout.setEnabled(false);    
            //Payment pay = new Payment();
            //pay.setVisible(true);
            try{
            int n=-1;
            while(n<0)
            {
                
                String mess= JOptionPane.showInputDialog(this,"Enter address to be delivered");
                if(mess!=null && !mess.isEmpty())
                {
                    n++;
                    if(total!=0)
        
                    {
                        try 
                        {
                            jTextArea.print();
                        } catch (PrinterException ex) {
                            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
                        }
                }
                    else{
                        //JOptionPane.showMessageDialog(this, "You have not purchased anything :/");
                    }
                }
                else
                {
                   JOptionPane.showMessageDialog(this, "Address input is required. Please try again.");
                   
                }
            }
            } 
            catch(Exception e)
            {
                System.out.println(e);
            }
            
       }
    }//GEN-LAST:event_jCheckoutActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    public void pizzaPlace()
    {
        Homepageweb home = new Homepageweb();
        jTextArea.setText("*************************************************\n"
        +"******************Pizza Place******************\n"
        +"*************************************************\n"
                +"      Name\t\t"+"    Price\n");
    }
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        int qty = Integer.parseInt(jSpinner8.getValue().toString());
        if(qtyzero(qty) && jCheckBox1.isSelected())
        {
            
        }
        else{
            jCheckBox1.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    
    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
        int qty = Integer.parseInt(jSpinner9.getValue().toString());
        if(qtyzero(qty) && jCheckBox2.isSelected())
        {
            
        }
        else{
            jCheckBox2.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
        int qty = Integer.parseInt(jSpinner7.getValue().toString());
        if(qtyzero(qty) && jCheckBox3.isSelected())
        {
            
        }
        else{
            jCheckBox3.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
        int qty = Integer.parseInt(jSpinner12.getValue().toString());
        if(qtyzero(qty) && jCheckBox4.isSelected())
        {
            
        }
        else{
            jCheckBox4.setSelected(false);
        }
        
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        // TODO add your handling code here:
        int qty = Integer.parseInt(jSpinner10.getValue().toString());
        if(qtyzero(qty) && jCheckBox5.isSelected())
        {
            
        }
        else{
            jCheckBox5.setSelected(false);
        }
        
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        // TODO add your handling code here:
        int qty = Integer.parseInt(jSpinner11.getValue().toString());
        if(qtyzero(qty) && jCheckBox6.isSelected())
        {
            
        }
        else{
            jCheckBox6.setSelected(false);
        }
        
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jSpinner8InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jSpinner8InputMethodTextChanged
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jSpinner8InputMethodTextChanged

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
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel imageLabel2;
    private javax.swing.JLabel imageLabel3;
    private javax.swing.JLabel imageLabel4;
    private javax.swing.JLabel imageLabel5;
    private javax.swing.JLabel imageLabel6;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JButton jCheckout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner10;
    private javax.swing.JSpinner jSpinner11;
    private javax.swing.JSpinner jSpinner12;
    private javax.swing.JSpinner jSpinner7;
    public javax.swing.JSpinner jSpinner8;
    private javax.swing.JSpinner jSpinner9;
    private javax.swing.JTextArea jTextArea;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
