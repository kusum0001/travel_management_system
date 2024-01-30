package travel.management.system;


import java.awt.BorderLayout;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JTable;
import java.sql.*;	
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class ViewCustomers extends JFrame {
	Connection conn = null;
	private JPanel contentPane;
	private JTable table;
	private JLabel lblusername;
	private JLabel lblidtype;
	private JLabel lblNumber;
	private JLabel lblName;
	private JLabel lblGender;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewCustomers frame = new ViewCustomers();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

        
	public ViewCustomers() throws SQLException {
		//conn = Javaconnect.getDBConnection();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 50, 900, 680);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/viewall.jpg"));
                Image i3 = i1.getImage().getScaledInstance(626, 201,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel l1 = new JLabel(i2);
                l1.setBounds(0,450,626,201);
                add(l1);
                
                ImageIcon i4  = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/viewall.jpg"));
                Image i5 = i4.getImage().getScaledInstance(626, 201,Image.SCALE_DEFAULT);
               ImageIcon i6 = new ImageIcon(i5);
                JLabel l2 = new JLabel(i6);
                l2.setBounds(615,450,626,201);
                add(l2);
                
		
		table = new JTable();
		table.setBounds(0, 40, 900, 350);
		contentPane.add(table);
                
                try{
                    Conn c = new Conn();
                        String displayCustomersql = "select * from customer";
                        ResultSet rs = c.s.executeQuery(displayCustomersql);
                        table.setModel(DbUtils.resultSetToTableModel(rs));
                }
                catch(Exception e1){
                        e1.printStackTrace();
                }
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton.setBounds(390, 400, 120, 30);
                btnNewButton.setBackground(Color.BLACK);
                btnNewButton.setForeground(Color.WHITE);
		contentPane.add(btnNewButton);
		
		lblusername = new JLabel("Username");
		lblusername.setBounds(10, 15, 69, 14);
		contentPane.add(lblusername);
		
		lblidtype = new JLabel("Id Type");
		lblidtype.setBounds(110, 15, 76, 14);
		contentPane.add(lblidtype);
		
		lblNumber = new JLabel("Number");
		lblNumber.setBounds(220, 15, 46, 14);
		contentPane.add(lblNumber);
		
		lblName = new JLabel("Name");
		lblName.setBounds(320, 15, 76, 14);
		contentPane.add(lblName);

		
		lblGender = new JLabel("Gender");
		lblGender.setBounds(420, 15, 90, 14);
		contentPane.add(lblGender);
                
                JLabel l3 = new JLabel("Country");
		l3.setBounds(520, 15, 90, 14);
		contentPane.add(l3);
                
                JLabel l4 = new JLabel("Address");
		l4.setBounds(620, 15, 90, 14);
		contentPane.add(l4);
                
                JLabel l5 = new JLabel("Phone");
		l5.setBounds(720, 15, 90, 14);
		contentPane.add(l5);
                
                JLabel l6 = new JLabel("Email");
		l6.setBounds(820, 15, 90, 14);
		contentPane.add(l6);
                
                getContentPane().setBackground(Color.WHITE);
	}

}