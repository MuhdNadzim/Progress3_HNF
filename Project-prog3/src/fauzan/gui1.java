package fauzan;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.Window.Type;
import java.nio.charset.StandardCharsets;

public class gui1 {

	private JFrame frmOutdoorSportsRegistry;
	private JTextField txtname1;
	private JTextField txtname2;
	private JComboBox cbgen;
	private JTable table;
	private static Scanner x;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui1 window = new gui1();
					window.frmOutdoorSportsRegistry.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public gui1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		info inf=new info();
		Random rand=new Random();
		outdoorsportdemo ods=new outdoorsportdemo();
		frmOutdoorSportsRegistry = new JFrame();
		frmOutdoorSportsRegistry.setTitle("Outdoor Sports Club");
		frmOutdoorSportsRegistry.getContentPane().setBackground(Color.DARK_GRAY);
		frmOutdoorSportsRegistry.setBounds(100, 100, 1010, 581);
		frmOutdoorSportsRegistry.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmOutdoorSportsRegistry.getContentPane().setLayout(null);
		
		JLabel MainTitle = new JLabel("Outdoor Sports Club");
		MainTitle.setForeground(Color.ORANGE);
		MainTitle.setBackground(Color.WHITE);
		MainTitle.setBounds(10, 11, 399, 70);
		MainTitle.setFont(new Font("Vivaldi", Font.BOLD, 40));
		frmOutdoorSportsRegistry.getContentPane().add(MainTitle);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 76, 974, 455);
		frmOutdoorSportsRegistry.getContentPane().add(tabbedPane);
		
		JPanel Register = new JPanel();
		Register.setBackground(Color.LIGHT_GRAY);
		Register.setBorder(new LineBorder(Color.ORANGE, 5));
		tabbedPane.addTab("Register", null, Register, null);
		tabbedPane.setBackgroundAt(0, Color.LIGHT_GRAY);
		Register.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel(" Info On Sport");
		lblNewLabel_1.setFont(new Font("Agency FB", Font.PLAIN, 35));
		lblNewLabel_1.setBounds(10, 85, 173, 43);
		Register.add(lblNewLabel_1);
		
		JTextPane infotxt = new JTextPane();
		infotxt.setFont(new Font("Tahoma", Font.PLAIN, 25));
		infotxt.setBounds(10, 139, 560, 277);
		Register.add(infotxt);
		
		txtname1 = new JTextField();
		txtname1.setBounds(290, 11, 280, 20);
		Register.add(txtname1);
		txtname1.setColumns(10);
		
		txtname2 = new JTextField();
		txtname2.setColumns(10);
		txtname2.setBounds(290, 42, 280, 20);
		Register.add(txtname2);
		
		JLabel l4 = new JLabel("");
		l4.setHorizontalAlignment(SwingConstants.CENTER);
		l4.setBounds(590, 139, 369, 277);
		Register.add(l4);
		
		cbgen = new JComboBox();
		cbgen.setModel(new DefaultComboBoxModel(new String[] {"Choose a Gender", "Male", "Female"}));
		cbgen.setBounds(290, 73, 280, 20);
		Register.add(cbgen);
		
		JComboBox cbsport = new JComboBox();
		cbsport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=String.valueOf(cbsport.getSelectedItem());
					infotxt.setText(ods.print1(a));
					if(a=="Hiking") {
						l4.setIcon(new ImageIcon(menu1.class.getResource("/icon/hiking.jpg")));
					}else if(a=="Surfing") {
						l4.setIcon(new ImageIcon(menu1.class.getResource("/icon/surfingsport.jpg")));
					}else if(a=="Cycling") {
						l4.setIcon(new ImageIcon(menu1.class.getResource("/icon/Cycling.png")));
					}else {
						l4.setIcon(new ImageIcon(menu1.class.getResource("")));
					}
				
				
			}
		});
		cbsport.setMaximumRowCount(5);
		cbsport.setModel(new DefaultComboBoxModel(new String[] {"Choose a Sport", "Hiking", "Cycling", "Surfing"}));
		cbsport.setBounds(10, 41, 155, 22);
		Register.add(cbsport);
		
		
		
		
		JLabel lblNewLabel_2 = new JLabel("Outdoor Sport name");
		lblNewLabel_2.setBounds(10, 14, 155, 14);
		Register.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("First Name");
		lblNewLabel_3.setBounds(204, 14, 76, 14);
		Register.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Last Name");
		lblNewLabel_3_1.setBounds(204, 45, 76, 14);
		Register.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Gender");
		lblNewLabel_3_2.setBounds(204, 76, 76, 14);
		Register.add(lblNewLabel_3_2);
		
		
		
		JComboBox cbrace = new JComboBox();
		cbrace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ot="";
				if(cbrace.getSelectedItem()=="Other") {
					ot=JOptionPane.showInputDialog("Input Your Race", ot);
					if(JOptionPane.showConfirmDialog(frmOutdoorSportsRegistry, "Did you type "+ot+"?", "Outdoor Sport Club",
				            JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					cbrace.setModel(new DefaultComboBoxModel(new String[] {"Choose a Race", "Melayu", "Cina", "India",ot,"Other"}));
					cbrace.setSelectedItem(ot);
					}else {
						cbrace.setSelectedItem("Choose a Race");	
					}
			}
				}
		});
		cbrace.setModel(new DefaultComboBoxModel(new String[] {"Choose a Race", "Melayu", "Cina", "India","Other"}));
		cbrace.setBounds(290, 101, 280, 20);
		Register.add(cbrace);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("Race");
		lblNewLabel_3_2_1.setBounds(204, 104, 76, 14);
		Register.add(lblNewLabel_3_2_1);
		
		JPanel Table = new JPanel();
		Table.setBorder(new LineBorder(Color.PINK, 5));
		tabbedPane.addTab("Table", null, Table, null);
		Table.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(153, 11, 806, 405);
		Table.add(scrollPane);
		
		table = new JTable();
		table.setBackground(Color.WHITE);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "sport", "firstname", "lastname", "gender", "race"
			}
			
		));
		try {
			String id1="";String sport1="";String name1="";String name2="";String gen1="";String rac1="";
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			x=new Scanner(new File("record.txt"));
			x.useDelimiter("[,\n]");

			while(x.hasNext()) {
				id1=x.next();
				sport1=x.next();
				name1=x.next();
				name2=x.next();
				gen1=x.next();
				rac1=x.next();
				
				model.addRow(new Object[]{
					id1,
					sport1,
					name1,
					name2,
					gen1,
					rac1,
			
			});
			}
			x.close();
		}catch(Exception e){
			//JOptionPane.showConfirmDialog(null, "bruh, unable to load");
			JOptionPane.showInternalConfirmDialog(null, "No record found!","Outdoor Sport Club", 0);
		}
		scrollPane.setViewportView(table);
		
		JButton DelBut = new JButton("Delete");
		DelBut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				int row=table.getSelectedRow();
				int col=table.getSelectedColumn();
				if(col!=0) {
					JOptionPane.showMessageDialog(null, "Please pick an ID");
				}else {
				String b=String.valueOf(table.getValueAt(row,col));
				inf.remrec(b);
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null, "No data available","Outdoor Sport Club",
								JOptionPane.OK_OPTION);}
					else {
						JOptionPane.showMessageDialog(null, "Select a row to delete","Outdoor Sport Club",
								JOptionPane.OK_OPTION);}
				}
				
					else {
						model.removeRow(table.getSelectedRow());
				}
				}
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Please pick an ID");
				}	
				
			
			}
		});
		DelBut.setBounds(10, 254, 133, 74);
		Table.add(DelBut);
		
		JButton PrToCSVBut = new JButton("Print to CSV");
		PrToCSVBut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File fl= new File("RECORD2.csv");
					FileWriter csvW = new FileWriter(fl);
					BufferedWriter bw=new BufferedWriter(csvW);
					PrintWriter pw=new PrintWriter(bw);
					ArrayList<String> nfo1=new ArrayList<String>();
					nfo1=inf.print();
					bw.write("ID,Sport,First Name,Last Name,Gender,Race");
					bw.newLine();
					String g="";
					 for(int i=0;i<nfo1.size();i++)
				        {
						 	g=nfo1.get(i);
						 	bw.write(g);
				        }
					pw.flush();
					bw.flush();
					pw.close();
					bw.close();
					csvW.close();					
					JOptionPane.showMessageDialog(null, "Success");
				}catch(Exception e2) {
					JOptionPane.showMessageDialog(null, "Oops something went wrong");
				}
			}
		});
		PrToCSVBut.setBounds(10, 339, 133, 77);
		Table.add(PrToCSVBut);
		
		JButton RegistBut = new JButton("Register");
		RegistBut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		RegistBut.setBounds(10, 14, 133, 77);
		Table.add(RegistBut);
		
		JButton butreg = new JButton("Register");
		butreg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(cbsport.getSelectedItem()=="Choose a Sport"|| cbgen.getSelectedItem()=="Choose a Gender"||
							cbrace.getSelectedItem()=="Choose a Race") {
						JOptionPane.showMessageDialog(null,"Please Enter the info properly");
					}else {
				int rnum=rand.nextInt(10000000)+1;
				while(rnum<0) {
					rnum=rand.nextInt(10000000)+1;
				}
				String id=String.valueOf(rnum);
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						id,
						cbsport.getSelectedItem(),
						txtname1.getText(),
						txtname2.getText(),
						cbgen.getSelectedItem(),
						cbrace.getSelectedItem(),
						
				
				});
				inf.addrec(id,cbsport.getSelectedItem(),txtname1.getText(),txtname2.getText(),cbgen.getSelectedItem(),cbrace.getSelectedItem());
				txtname1.setText("");
				txtname2.setText("");
				cbgen.setSelectedItem("Choose a Gender");
				cbrace.setSelectedItem("Choose a Race");
				JOptionPane.showMessageDialog(null,txtname1.getText()+" added");
					
					}
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, "Something Went Wrong");
				}
			}
		});
		butreg.setBounds(580, 98, 89, 23);
		Register.add(butreg);
		
		JButton exitbt = new JButton("EXIT");
		exitbt.setBounds(895, 58, 89, 23);
		frmOutdoorSportsRegistry.getContentPane().add(exitbt);
		exitbt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					if(JOptionPane.showConfirmDialog(frmOutdoorSportsRegistry, "Confirm if you to exit", "Outdoor Sport Club",
				            JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
						System.exit(0);
					}
				
			}
		});
		
	
	}
}
