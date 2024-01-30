
package travel.management.system;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Loading extends JFrame implements Runnable {

	private JPanel contentPane;
	private JProgressBar progressBar;
	Connection conn;
        String username;
	int s;
	Thread th;

	public static void main(String[] args) {
            new Loading("").setVisible(true);
	}

	public void setUploading() {
            setVisible(false);
            th.start();
	}

	public void run() {
            try {
                for (int i = 0; i <= 100; i++) {
                    s = s + 1;
                    int m = progressBar.getMaximum();
                    int v = progressBar.getValue();
                    if (v < m) {
                        progressBar.setValue(progressBar.getValue() + 1);
                    } else {
                        i = 101;
                        setVisible(false);
                        new Home(username).setVisible(true);
                    }
                    Thread.sleep(50);
                }
            } catch (Exception e) {
		e.printStackTrace();
            }
	}

	public Loading(String username) {
            this.username = username;
            th = new Thread((Runnable) this);

            setBounds(450, 150, 600, 400);
            contentPane = new JPanel();
            contentPane.setBackground(Color.RED);
            setContentPane(contentPane);
            contentPane.setLayout(null);

            JLabel lm = new JLabel("LE Tour and Travel Application");
            lm.setForeground(Color.BLACK);
            lm.setFont(new Font("Trebuchet MS", Font.BOLD, 35));
            lm.setBounds(50, 46, 700, 35);
            contentPane.add(lm);
	
            progressBar = new JProgressBar();
            progressBar.setFont(new Font("Tahoma", Font.BOLD, 12));
            progressBar.setStringPainted(true);
            progressBar.setBounds(130, 135, 300, 25);
            contentPane.add(progressBar);

            JLabel lblNewLabel_2 = new JLabel("Please Wait....");
            lblNewLabel_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
            lblNewLabel_2.setForeground( Color.BLACK);
            lblNewLabel_2.setBounds(220, 200, 450, 20);
            contentPane.add(lblNewLabel_2);

            JPanel panel = new JPanel();
            panel.setBackground(Color.WHITE);
            panel.setBounds(10, 10, 580, 380);
            contentPane.add(panel);
              
            setUndecorated(true);
            setUploading();
	}
}