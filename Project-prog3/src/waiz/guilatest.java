/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waiz;
///testtest
import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Waiz
 */
public class guilatest extends javax.swing.JFrame {
int i = 0;
    /**
     * Creates new form guilatest
     */
    DateFormat dateFormat = new SimpleDateFormat("DD/MM/YY");
    Date date = new Date();
    Calendar cal = Calendar.getInstance();
    
    
    DefaultTableModel model;
    public guilatest() {
        initComponents();
        dateTF.setText(" "+ dateFormat.format(date));
        label50.setVisible(false);
        label51.setVisible(false);
        text1.setVisible(false);
        text2.setVisible(false);
        gambar1.setVisible(false);
        gambar2.setVisible(false);
        text3tf.setVisible(false);
        normal.setVisible(false);
        normaltext.setVisible(false);
        overweight.setVisible(false);
        overweighttext.setVisible(false);
        obese.setVisible(false);
        obesetext.setVisible(false);
        mobobese.setVisible(false);
        mobobesetext.setVisible(false);
        
        addRowToJTable();
        addRowToJTable2();
        
        /////////////////   
        
    }
    
    public class bmi1{
    	public String categories;
    	public String bmirange;
    	
    	public bmi1(String Categories, String Bmirange) 
    	{
    		this.categories = Categories;
    		this.bmirange = Bmirange;
    	}
    }
    
    public  ArrayList ListBmi()
    {
    	ArrayList<bmi1> list = new ArrayList<bmi1>();
    	bmi1 bod1 = new bmi1("Normal Weight","19 - 24.9");
    	bmi1 bod2 = new bmi1("Over Weight","25 - 29.9");
    	bmi1 bod3 = new bmi1("Obesity Level 1","30 - 34.9");
    	bmi1 bod4 = new bmi1("Obesity Level 2","35 - 39.9");
    	bmi1 bod5 = new bmi1("Obesity Level 3","Above 40");
    	list.add(bod1);
    	list.add(bod2);
    	list.add(bod3);
    	list.add(bod4);
    	list.add(bod5);
    	return list;
    }
    public void addRowToJTable()
    {
    	DefaultTableModel  model = (DefaultTableModel) jTable1.getModel();
    	ArrayList<bmi1> list = ListBmi();
    	Object rowData[] = new Object[2];
    	for(int i = 0; i < list.size(); i++) 
    	{
    		rowData[0] = list.get(i).categories;
    		rowData[1] = list.get(i).bmirange;
    		model.addRow(rowData);
    	}
    }
    
    /////////////////////
    
    
    public class bmi2{
    	public String categories;
    	public String bmirange;
    	
    	public bmi2(String age, String Bmirange2) 
    	{
    		this.categories = age;
    		this.bmirange = Bmirange2;
    	}
    }
    
    public  ArrayList ListBmi2()
    {
    	ArrayList<bmi2> list = new ArrayList<bmi2>();
    	bmi2 bod1 = new bmi2("19 - 24","19 - 24");
    	bmi2 bod2 = new bmi2("25 - 34","20 - 25");
    	bmi2 bod3 = new bmi2("35 - 44","21 - 26");
    	bmi2 bod4 = new bmi2("45 - 54","22 - 27");
    	bmi2 bod5 = new bmi2("55 - 64","23 - 28");
    	bmi2 bod6 = new bmi2("Above 64","24 - 29");
    	list.add(bod1);
    	list.add(bod2);
    	list.add(bod3);
    	list.add(bod4);
    	list.add(bod5);
    	list.add(bod6);
    	return list;
    }
    public void addRowToJTable2()
    {
    	DefaultTableModel  model = (DefaultTableModel) jTable2.getModel();
    	ArrayList<bmi2> list = ListBmi2();
    	Object rowData[] = new Object[2];
    	for(int i = 0; i < list.size(); i++) 
    	{
    		rowData[0] = list.get(i).categories;
    		rowData[1] = list.get(i).bmirange;
    		model.addRow(rowData);
    	}
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TabPane = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        label50 = new javax.swing.JLabel();
        text2 = new javax.swing.JScrollPane();
        text22 = new javax.swing.JTextArea();
        text1 = new javax.swing.JScrollPane();
        text11 = new javax.swing.JTextArea();
        label51 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        gambar1 = new javax.swing.JLabel();
        gambar2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bg2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        fnameTF = new javax.swing.JTextField();
        enterBTN = new javax.swing.JButton();
        lnameTF = new javax.swing.JTextField();
        emailTF = new javax.swing.JTextField();
        addressTF = new javax.swing.JTextField();
        contactTF = new javax.swing.JTextField();
        priceTF = new javax.swing.JTextField();
        dateTF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        genderTF = new javax.swing.JComboBox<>();
        subTF = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        text3tf = new javax.swing.JTextField();
        text1tf = new javax.swing.JTextField();
        text2tf = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        normal = new javax.swing.JLabel();
        normaltext = new javax.swing.JLabel();
        overweight = new javax.swing.JLabel();
        overweighttext = new javax.swing.JLabel();
        obesetext = new javax.swing.JLabel();
        obese = new javax.swing.JLabel();
        mobobese = new javax.swing.JLabel();
        mobobesetext = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        bg3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(null);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/HOMEbtn-01.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(90, 150, 200, 70);

        label50.setFont(new java.awt.Font("Comic Sans MS", 1, 30)); // NOI18N
        label50.setText("AT HOME AEROBIC");
        jPanel2.add(label50);
        label50.setBounds(450, 120, 310, 40);

        text22.setColumns(20);
        text22.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        text22.setRows(5);
        text22.setText("Thiss class package will included:\n1)Learning how to swimming correctly.\n2)Learning aerobic using Stationary Bike.\n3)Learning aerobic using Elliptical.\n\nEquipment you need is:\n1)pool, swimsuit, goggles (optional)\n2)stationary bike\n3)elliptical machine\n\nSubscription Price:\nRM250\n\n\n\n\n\n\n\n");
        text2.setViewportView(text22);

        jPanel2.add(text2);
        text2.setBounds(460, 170, 490, 340);

        text11.setEditable(false);
        text11.setColumns(20);
        text11.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        text11.setRows(5);
        text11.setText("This class package will included:\n1)Learning how start Jump Rope aerobic at Home.\n2)Learning how to do Aerobic Strength Circuit at Home.\n3)Guiding on how to do running & Jogging properly. \n\nEquipment you need is:\n1)1x Jump  Rope\n2)Gym Shoes\n3)Running Shoes\n\nPrice for this Package is: \nRM150/month\n\n\n");
        text1.setViewportView(text11);

        jPanel2.add(text1);
        text1.setBounds(460, 170, 490, 340);

        label51.setFont(new java.awt.Font("Comic Sans MS", 1, 30)); // NOI18N
        label51.setText("AT GYM AEROBIC");
        jPanel2.add(label51);
        label51.setBounds(450, 120, 290, 40);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gym-01.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);
        jButton6.setBounds(90, 260, 200, 70);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit-01.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7);
        jButton7.setBounds(1160, 10, 130, 50);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/REGISTRATON-01.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8);
        jButton8.setBounds(90, 370, 200, 70);

        gambar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/homegambar-01.png"))); // NOI18N
        jPanel2.add(gambar1);
        gambar1.setBounds(960, 210, 280, 240);

        gambar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gymgambar-01.png"))); // NOI18N
        jPanel2.add(gambar2);
        gambar2.setBounds(964, 244, 270, 180);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Designed & Developed by Muhamad Waiz  © Copyright 2021");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(530, 540, 330, 14);

        bg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/asdasdasdasdas-01.png"))); // NOI18N
        jPanel2.add(bg2);
        bg2.setBounds(0, 0, 1310, 570);

        TabPane.addTab("Aerobic Class Menu", jPanel2);

        jPanel1.setLayout(null);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "First Name", "Last Name", "Gender", "Email", "Address", "Contact", "Subscription", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setGridColor(new java.awt.Color(102, 102, 102));
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(440, 120, 810, 380);

        fnameTF.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel1.add(fnameTF);
        fnameTF.setBounds(160, 110, 230, 30);

        enterBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/registerbtn-01.png"))); // NOI18N
        enterBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterBTNActionPerformed(evt);
            }
        });
        jPanel1.add(enterBTN);
        enterBTN.setBounds(270, 470, 150, 40);

        lnameTF.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel1.add(lnameTF);
        lnameTF.setBounds(160, 150, 230, 30);

        emailTF.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel1.add(emailTF);
        emailTF.setBounds(160, 230, 230, 30);

        addressTF.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jPanel1.add(addressTF);
        addressTF.setBounds(160, 270, 230, 50);

        contactTF.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel1.add(contactTF);
        contactTF.setBounds(210, 350, 180, 30);

        priceTF.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        priceTF.setForeground(new java.awt.Color(153, 0, 204));
        priceTF.setText("RM");
        jPanel1.add(priceTF);
        priceTF.setBounds(90, 470, 150, 30);

        dateTF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dateTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(dateTF);
        dateTF.setBounds(1170, 20, 90, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reset-01.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(320, 520, 100, 40);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/recordbtn-01_1.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(1150, 530, 110, 40);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/deletebtn-01.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(900, 530, 110, 40);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/printbtn-01.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(1030, 530, 100, 40);

        genderTF.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        genderTF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please Choose..", "Male", "Female" }));
        jPanel1.add(genderTF);
        genderTF.setBounds(160, 190, 140, 30);

        subTF.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        subTF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please Choose..", "At Home Aerobic", "At Gym Aerobic" }));
        jPanel1.add(subTF);
        subTF.setBounds(180, 400, 210, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DELETE | Delete selected data from table");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(440, 530, 260, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PRINT | Print table data to printer");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(440, 540, 230, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("RECORD | Record entire table to .txt file");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(440, 550, 240, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 51));
        jLabel4.setText("Legend:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(440, 510, 60, 20);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AEROBICCLASS-01.png"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);
        jButton9.setBounds(691, 530, 190, 40);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Designed & Developed by Muhamad Waiz  © Copyright 2021");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(640, 510, 330, 14);

        bg.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bglatest-01.png"))); // NOI18N
        jPanel1.add(bg);
        bg.setBounds(0, -10, 1307, 590);

        TabPane.addTab("User Registration System", jPanel1);

        jPanel3.setLayout(null);

        text3tf.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        text3tf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text3tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text3tfActionPerformed(evt);
            }
        });
        jPanel3.add(text3tf);
        text3tf.setBounds(80, 470, 180, 50);

        text1tf.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        text1tf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(text1tf);
        text1tf.setBounds(80, 210, 180, 50);

        text2tf.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        text2tf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(text2tf);
        text2tf.setBounds(80, 340, 180, 50);

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/calculatebtn-01.png"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton10);
        jButton10.setBounds(440, 520, 160, 40);

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reset2btn-01.png"))); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton11);
        jButton11.setBounds(610, 520, 100, 40);

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new DefaultTableModel(
        	new Object[][] {
        	},
        	new String[] {
        		"Categories", "BMI Range"
        	}
        ));
        jScrollPane2.setViewportView(jTable1);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(460, 170, 370, 120);

        jTable2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable2.setModel(new DefaultTableModel(
        	new Object[][] {
        	},
        	new String[] {
        		"AGE", "BMI Range"
        	}
        ));
        jScrollPane3.setViewportView(jTable2);

        jPanel3.add(jScrollPane3);
        jScrollPane3.setBounds(460, 350, 370, 130);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Body Mass Index Table");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(490, 142, 210, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("AGE BMI Table");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(490, 322, 180, 30);

        normal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/normal-01.png"))); // NOI18N
        jPanel3.add(normal);
        normal.setBounds(1030, 130, 140, 330);

        normaltext.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        normaltext.setForeground(new java.awt.Color(0, 255, 51));
        normaltext.setText("YOUR BMI IS NORMAL");
        jPanel3.add(normaltext);
        normaltext.setBounds(1000, 470, 210, 22);

        overweight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/overweight-01.png"))); // NOI18N
        jPanel3.add(overweight);
        overweight.setBounds(1030, 130, 140, 330);

        overweighttext.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        overweighttext.setForeground(new java.awt.Color(204, 204, 0));
        overweighttext.setText("YOUR BMI IS OVERWEIGHT");
        jPanel3.add(overweighttext);
        overweighttext.setBounds(980, 470, 270, 22);

        obesetext.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        obesetext.setForeground(new java.awt.Color(255, 153, 0));
        obesetext.setText("YOUR BMI IS OBESE");
        jPanel3.add(obesetext);
        obesetext.setBounds(1020, 470, 190, 22);

        obese.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/obese-01.png"))); // NOI18N
        jPanel3.add(obese);
        obese.setBounds(1030, 130, 140, 330);

        mobobese.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mobobese-01.png"))); // NOI18N
        jPanel3.add(mobobese);
        mobobese.setBounds(1030, 130, 140, 330);

        mobobesetext.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mobobesetext.setForeground(new java.awt.Color(255, 0, 0));
        mobobesetext.setText("YOUR BMI IS MORBIDLY OBESE");
        jPanel3.add(mobobesetext);
        mobobesetext.setBounds(960, 470, 290, 22);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Designed & Developed by Muhamad Waiz  © Copyright 2021");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(730, 530, 340, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Example 170cm, type = 1.7");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(90, 270, 160, 15);

        jLabel11.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Example 80kg, type = 80");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(100, 400, 150, 14);

        bg3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bmibg-01.png"))); // NOI18N
        jPanel3.add(bg3);
        bg3.setBounds(0, -10, 1310, 590);

        TabPane.addTab("BMI CALCULATOR", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1310, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabPane, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enterBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterBTNActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model;
        model = (DefaultTableModel) table.getModel();

        model.addRow(new Object[]{
           dateTF.getText(),
           fnameTF.getText(),
           lnameTF.getText(),
           genderTF.getSelectedItem(),
           emailTF.getText(),
           addressTF.getText(),
           contactTF.getText(),
           subTF.getSelectedItem(),
           priceTF.getText(),
        });
    }//GEN-LAST:event_enterBTNActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
        File file = new File("RecordedAerobic.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        
        for(int i =0; i<table.getRowCount();i++){
            for(int j = 0; j<table.getColumnCount(); j++){
                bw.write(table.getModel().getValueAt(i, j)+" ");
            }
            bw.write("\n____________________________________________________________________________________________________\n");
        }
        bw.close();
        fw.close();
        JOptionPane.showMessageDialog(null,"Data Exported");
        
        }catch(Exception ex){
           ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        fnameTF.setText("");
        lnameTF.setText("");
   
        emailTF.setText("");
        addressTF.setText("");
        contactTF.setText("");
  
        priceTF.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model;
        model = (DefaultTableModel) table.getModel();
        if(table.getSelectedRow()==-1){
            if(table.getRowCount()==0){
                
                
            }else{
                
            }
        }else{
            model.removeRow(table.getSelectedRow());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try {
    if (! table.print()) {
        System.err.println("User cancelled printing");
    }
} catch (java.awt.print.PrinterException e) {
    System.err.format("Cannot print %s%n", e.getMessage());
}
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        label50.setVisible(true);
        text1.setVisible(true);
        label51.setVisible(false);
        text2.setVisible(false);
        gambar1.setVisible(true);
        gambar2.setVisible(false);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        label51.setVisible(true);
        text2.setVisible(true);
        label50.setVisible(false);
        text1.setVisible(false);
        gambar1.setVisible(false);
        gambar2.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        i++; i=1;
        TabPane.setSelectedIndex(i);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        i--; i=0;
        TabPane.setSelectedIndex(i);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        double height = Double.parseDouble(text1tf.getText());
        double weight = Double.parseDouble(text2tf.getText());
        double BMI = weight / (height * height);
        
        String calbmi = String.format("%.2f", BMI);
        text3tf.setText(calbmi);
        text3tf.setVisible(true);
        
        if (BMI<=24.9)
        {
            text3tf.setOpaque(true);
            text3tf.setBackground(Color.GREEN);
            text3tf.setForeground(Color.BLACK);
            normal.setVisible(true);
            normaltext.setVisible(true);
            overweight.setVisible(false);
            overweighttext.setVisible(false);
            obese.setVisible(false);
            obesetext.setVisible(false);
            mobobese.setVisible(false);
            mobobesetext.setVisible(false);
        }
        else if (BMI<=29.9)
        {
            text3tf.setOpaque(true);
            text3tf.setBackground(Color.YELLOW);
            text3tf.setForeground(Color.BLACK);
            overweight.setVisible(true);
            overweighttext.setVisible(true);
            normal.setVisible(false);
            normaltext.setVisible(false);
            obese.setVisible(false);
            obesetext.setVisible(false);
            mobobese.setVisible(false);
            mobobesetext.setVisible(false);
            
        }
        else if (BMI<=34.9)
        {
            text3tf.setOpaque(true);
            text3tf.setBackground(Color.ORANGE);
            text3tf.setForeground(Color.BLACK);
            overweight.setVisible(false);
            overweighttext.setVisible(false);
            normal.setVisible(false);
            normaltext.setVisible(false);
            obese.setVisible(true);
            obesetext.setVisible(true);
            mobobese.setVisible(false);
            mobobesetext.setVisible(false);
        }
        else if (BMI<=39.9)
        {
            text3tf.setOpaque(true);
            text3tf.setBackground(Color.RED);
            text3tf.setForeground(Color.BLACK);
            overweight.setVisible(false);
            overweighttext.setVisible(false);
            normal.setVisible(false);
            normaltext.setVisible(false);
            obese.setVisible(false);
            obesetext.setVisible(false);
            mobobese.setVisible(true);
            mobobesetext.setVisible(true);
        }
        else if (BMI>=40)
        {
            text3tf.setOpaque(true);
            text3tf.setBackground(Color.RED);
            text3tf.setForeground(Color.BLACK);
            overweight.setVisible(false);
            overweighttext.setVisible(false);
            normal.setVisible(false);
            normaltext.setVisible(false);
            obese.setVisible(false);
            obesetext.setVisible(false);
            mobobese.setVisible(true);
            mobobesetext.setVisible(true);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        text1tf.setText(null);
        text2tf.setText(null);
        text3tf.setText(null);
        text3tf.setBackground(Color.WHITE);
        text3tf.setVisible(false);
        normal.setVisible(false);
        normaltext.setVisible(false);
        overweight.setVisible(false);
        overweighttext.setVisible(false);
        obese.setVisible(false);
        obesetext.setVisible(false);
        mobobese.setVisible(false);
        mobobesetext.setVisible(false);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void text3tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text3tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text3tfActionPerformed

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
            java.util.logging.Logger.getLogger(guilatest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guilatest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guilatest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guilatest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new guilatest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane TabPane;
    private javax.swing.JTextField addressTF;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel bg2;
    private javax.swing.JLabel bg3;
    private javax.swing.JTextField contactTF;
    private javax.swing.JTextField dateTF;
    private javax.swing.JTextField emailTF;
    private javax.swing.JButton enterBTN;
    private javax.swing.JTextField fnameTF;
    private javax.swing.JLabel gambar1;
    private javax.swing.JLabel gambar2;
    private javax.swing.JComboBox<String> genderTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel label50;
    private javax.swing.JLabel label51;
    private javax.swing.JTextField lnameTF;
    private javax.swing.JLabel mobobese;
    private javax.swing.JLabel mobobesetext;
    private javax.swing.JLabel normal;
    private javax.swing.JLabel normaltext;
    private javax.swing.JLabel obese;
    private javax.swing.JLabel obesetext;
    private javax.swing.JLabel overweight;
    private javax.swing.JLabel overweighttext;
    private javax.swing.JTextField priceTF;
    private javax.swing.JComboBox<String> subTF;
    private javax.swing.JTable table;
    private javax.swing.JScrollPane text1;
    private javax.swing.JTextArea text11;
    private javax.swing.JTextField text1tf;
    private javax.swing.JScrollPane text2;
    private javax.swing.JTextArea text22;
    private javax.swing.JTextField text2tf;
    private javax.swing.JTextField text3tf;
    // End of variables declaration//GEN-END:variables
}
