package com.prithul;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JTextArea;

public class MyApp {

	private JFrame frame;
	
	private JTextArea jt3;
	private JTextArea jt4;
	private JTextArea jt5;
	private JTextArea jt6;
	private JTextArea jt7;
	private JTextArea jt8;
	private JTextArea jt9;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyApp window = new MyApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws IOException 
	 */
	public MyApp() throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	private void initialize() throws IOException {
		frame = new JFrame("This is Prithul :)");
		frame.setBounds(100, 100, 600, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		//Tab1
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 51, 204));
		tabbedPane.addTab("About", null, panel, null);
		tabbedPane.setForegroundAt(0, new Color(0, 0, 0));
		tabbedPane.setBackgroundAt(0, new Color(204, 51, 204));
		panel.setLayout(new GridLayout(1,3));
		
		Image aboutMe = ImageIO.read(getClass().getResource("Image/Me.png"));
		aboutMe = aboutMe.getScaledInstance(40,40, java.awt.Image.SCALE_SMOOTH);
	    ImageIcon myImageIconMe = new ImageIcon(aboutMe);
		
		JButton btnNewButton = new JButton("About Me",myImageIconMe );
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(204, 51, 204));
		btnNewButton.setFont(new Font("Serif", Font.BOLD, 24));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			    jt8.setText("\n\n\n\n\n          I'm 6!");
				ImageIcon cake = new ImageIcon(Hi.class.getResource("Image/cake.png"));
				JOptionPane.showMessageDialog(null,"Today is my Birthday!","Hi there! How are you?",JOptionPane.INFORMATION_MESSAGE,cake);
			}
		});
		
		panel.add(btnNewButton);
		
    	Image myImage = ImageIO.read(getClass().getResource("Image/Prithul1.jpg"));
	    myImage = myImage.getScaledInstance(220,380, java.awt.Image.SCALE_SMOOTH);
	    ImageIcon myImageIcon = new ImageIcon(myImage);
	    panel.add(new JLabel(myImageIcon));
		
		JLabel lblNewLabel_1 = new JLabel("");
		jt8 = new JTextArea();
		jt8.setBackground(new Color(255, 255, 102));
		jt8.setForeground(new Color(255,51,51));
		jt8.setFont(new Font("Serif", Font.BOLD, 24));
		panel.add(lblNewLabel_1.add(jt8));
		//Tab2
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 255));
		tabbedPane.addTab("Favorite", null, panel_1, null);
		tabbedPane.setForegroundAt(1, new Color(255, 255, 255));
		tabbedPane.setBackgroundAt(1, new Color(0, 0, 255));
		panel_1.setLayout(new GridLayout(1,3));
		
		Image fav = ImageIO.read(getClass().getResource("Image/OptimusPrime.png"));
		fav = fav.getScaledInstance(40,40, java.awt.Image.SCALE_SMOOTH);
	    ImageIcon myImageIconfav = new ImageIcon(fav);
		
		JButton btnNewButton_1 = new JButton("Favorite", myImageIconfav);
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(0, 0, 255));
		btnNewButton_1.setFont(new Font("Serif", Font.BOLD, 24));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				jt9.setText("\n\n\n\n\n    Transformers!");
				ImageIcon trans = new ImageIcon(Hi.class.getResource("Image/transformer.jpg"));
				JOptionPane.showMessageDialog(null,"Optimus Prime:The leader of the Autobots!","Do you know that?",JOptionPane.INFORMATION_MESSAGE,trans);
			}
		});
		
		panel_1.add(btnNewButton_1);
		
		Image myImage1 = ImageIO.read(getClass().getResource("Image/pri3.jpg"));
	    myImage1 = myImage1.getScaledInstance(220,380, java.awt.Image.SCALE_SMOOTH);
	    ImageIcon myImageIcon1 = new ImageIcon(myImage1);
	    panel_1.add(new JLabel(myImageIcon1));
		
		JLabel lblNewLabel_2 = new JLabel("");
		jt9 = new JTextArea();
		jt9.setBackground(new Color(255, 102, 0));
		jt9.setForeground(new Color(0, 0, 0));
		jt9.setFont(new Font("Serif", Font.BOLD, 24));
		panel_1.add(lblNewLabel_2.add(jt9));
		//Tab3
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(175, 238, 238));
		tabbedPane.addTab("Activities", null, panel_2, null);
		tabbedPane.setForegroundAt(2, new Color(0, 0, 0));
		tabbedPane.setBackgroundAt(2, new Color(175, 238, 238));
		panel_2.setLayout(new GridLayout(1,3));
		
		Image tennis = ImageIO.read(getClass().getResource("Image/Tennis.png"));
		tennis = tennis.getScaledInstance(40,40, java.awt.Image.SCALE_SMOOTH);
	    ImageIcon myImageIconTennis = new ImageIcon(tennis);
		
		JButton btnNewButton_2 = new JButton("Funtivities",myImageIconTennis);
		btnNewButton_2.setForeground(new Color(255, 102, 0));
		btnNewButton_2.setBackground(new Color(175, 238, 238));
		btnNewButton_2.setFont(new Font("Serif", Font.BOLD, 24));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				jt3.setText("\n\n  Tennis" +"\n  Soccer"+"\n  Photography!"+"\n  Paper Magic");
				ImageIcon dslr = new ImageIcon(Hi.class.getResource("Image/dslr.jpg"));
				JOptionPane.showMessageDialog(null,"Activities with Fun!","What I like most..",JOptionPane.INFORMATION_MESSAGE,dslr);
			}
		});
		
		panel_2.add(btnNewButton_2);
		
		Image myImage2 = ImageIO.read(getClass().getResource("Image/pri7.jpg"));
	    myImage2 = myImage2.getScaledInstance(220,380, java.awt.Image.SCALE_SMOOTH);
	    ImageIcon myImageIcon2 = new ImageIcon(myImage2);
	    panel_2.add(new JLabel(myImageIcon2));
		
		JLabel lblNewLabel_3 = new JLabel("");
		jt3 = new JTextArea();
		jt3.setBackground(new Color(255, 51, 51));
		jt3.setForeground(new Color(0, 0, 0));
		jt3.setFont(new Font("Serif", Font.BOLD, 24));
		panel_2.add(lblNewLabel_3.add(jt3));
		//Tab4
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 153, 102));
		tabbedPane.addTab("Food", null, panel_3, null);
		tabbedPane.setForegroundAt(3, new Color(255, 255, 255));
		tabbedPane.setBackgroundAt(3, new Color(0, 153, 102));
		panel_3.setLayout(new GridLayout(1,3));
		
		Image food = ImageIO.read(getClass().getResource("Image/IceCream.png"));
		food = food.getScaledInstance(40,40, java.awt.Image.SCALE_SMOOTH);
	    ImageIcon myImageIconfood = new ImageIcon(food);
		
		JButton btnNewButton_3 = new JButton("Fav Food",myImageIconfood);
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(0, 153, 102));
		btnNewButton_3.setFont(new Font("Serif", Font.BOLD, 24));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				jt4.setText("\n\n  Chicken"+"\n  Waffle"+"\n  Cake"+"\n  Cone Icecream"+"\n  Sandesh!");
				ImageIcon chicken = new ImageIcon(Hi.class.getResource("Image/Chicken.png"));
				JOptionPane.showMessageDialog(null,"Chicken!","Yummy Yummy...",JOptionPane.INFORMATION_MESSAGE,chicken);
			}
		});
		panel_3.add(btnNewButton_3);
		
		Image myImage3 = ImageIO.read(getClass().getResource("Image/pri5.jpg"));
	    myImage3 = myImage3.getScaledInstance(220,380, java.awt.Image.SCALE_SMOOTH);
	    ImageIcon myImageIcon3 = new ImageIcon(myImage3);
	    panel_3.add(new JLabel(myImageIcon3));
		
		JLabel lblNewLabel_4 = new JLabel("");
		jt4 = new JTextArea();
		jt4.setBackground(new Color(255, 102, 0));
		jt4.setForeground(new Color(0, 0, 0));
		jt4.setFont(new Font("Serif", Font.BOLD, 24));
		panel_3.add(lblNewLabel_4.add(jt4));
		//Tab5
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 255, 102));
		tabbedPane.addTab("Place", null, panel_4, null);
		tabbedPane.setForegroundAt(4, new Color(0, 0, 0));
		tabbedPane.setBackgroundAt(4, new Color(255, 255, 102));
		panel_4.setLayout(new GridLayout(1,3));
		
		Image pg = ImageIO.read(getClass().getResource("Image/Playground.png"));
		pg = pg.getScaledInstance(50,50, java.awt.Image.SCALE_SMOOTH);
	    ImageIcon myImageIconPG = new ImageIcon(pg);
		
		JButton btnNewButton_4 = new JButton("Place", myImageIconPG);
		btnNewButton_4.setForeground(new Color(0, 0, 0));
		btnNewButton_4.setBackground(new Color(255, 255, 102));
		btnNewButton_4.setFont(new Font("Serif", Font.BOLD, 24));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				jt5.setText("\n\n\n\n  Park"+"\n  Playground"+"\n  Museum");
				ImageIcon park = new ImageIcon(Hi.class.getResource("Image/park.jpg"));
				JOptionPane.showMessageDialog(null,"Park & Playground!","Places I love most...",JOptionPane.INFORMATION_MESSAGE,park);
			}
		});
		
		panel_4.add(btnNewButton_4);
		
		Image myImage4 = ImageIO.read(getClass().getResource("Image/pri6.jpg"));
	    myImage4 = myImage4.getScaledInstance(220,380, java.awt.Image.SCALE_SMOOTH);
	    ImageIcon myImageIcon4 = new ImageIcon(myImage4);
	    panel_4.add(new JLabel(myImageIcon4));
	    
		JLabel lblNewLabel_5 = new JLabel("");
		jt5 = new JTextArea();
		jt5.setBackground(new Color(0, 153, 102));
		jt5.setForeground(new Color(255,255,255));
		jt5.setFont(new Font("Serif", Font.BOLD, 24));
		panel_4.add(lblNewLabel_5.add(jt5));
		//Tab6
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 102, 0));
		tabbedPane.addTab("Hobby", null, panel_5, null);
		tabbedPane.setForegroundAt(5, new Color(255, 255, 255));
		tabbedPane.setBackgroundAt(5, new Color(255, 102, 0));
		panel_5.setLayout(new GridLayout(1,3));
		
		Image kite = ImageIO.read(getClass().getResource("Image/kite.png"));
		kite = kite.getScaledInstance(65,65, java.awt.Image.SCALE_SMOOTH);
	    ImageIcon myImageIconKite = new ImageIcon(kite);
	    
		
		JButton btnNewButton_5 = new JButton("Hobby", myImageIconKite);
		btnNewButton_5.setFont(new Font("Serif", Font.BOLD, 24));
		btnNewButton_5.setForeground(new Color(0, 255, 255));
		btnNewButton_5.setBackground(new Color(255, 102, 0));
		btnNewButton_4.setFont(new Font("Serif", Font.BOLD, 24));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				jt7.setText("\n\n\n\n\n      Flying Kites!");
				ImageIcon kite = new ImageIcon(Hi.class.getResource("Image/kite.jpg"));
				JOptionPane.showMessageDialog(null,"Kites can fly!","Without Wings...",JOptionPane.INFORMATION_MESSAGE,kite);
			}
		});
		panel_5.add(btnNewButton_5);
		
		Image myImage5 = ImageIO.read(getClass().getResource("Image/pri8.jpg"));
	    myImage5 = myImage5.getScaledInstance(220,380, java.awt.Image.SCALE_SMOOTH);
	    ImageIcon myImageIcon5 = new ImageIcon(myImage5);
	    panel_5.add(new JLabel(myImageIcon5));
		
		JLabel lblNewLabel_6 = new JLabel("");
		jt7 = new JTextArea();
		jt7.setBackground(new Color(0, 0, 255));
		jt7.setForeground(new Color(255, 255, 255));
		jt7.setFont(new Font("Serif", Font.BOLD, 24));
		panel_5.add(lblNewLabel_6.add(jt7));
		//Tab7
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 51, 51));
		tabbedPane.addTab("Devices", null, panel_6, null);
		tabbedPane.setForegroundAt(6, new Color(0, 0, 0));
		tabbedPane.setBackgroundAt(6, new Color(255, 51, 51));
		panel_6.setLayout(new GridLayout(1,3));
		
		Image tel = ImageIO.read(getClass().getResource("Image/Telescope.png"));
		tel = tel.getScaledInstance(60,60, java.awt.Image.SCALE_SMOOTH);
	    ImageIcon myImageIconTel = new ImageIcon(tel);
		
		JButton btnNewButton_6 = new JButton("I Own", myImageIconTel);
		btnNewButton_6.setForeground(new Color(0, 0, 0));
		btnNewButton_6.setBackground(new Color(255, 51, 51));
		btnNewButton_6.setFont(new Font("Serif", Font.BOLD, 24));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				jt6.setText("\n\n    TV"+"\n    Laptop"+"\n    iPad"+"\n    DSLR (Inherit)"+"\n    Telescope");
				ImageIcon laptop = new ImageIcon(Hi.class.getResource("Image/laptop.jpg"));
				JOptionPane.showMessageDialog(null,"Life is good!","And, so far...",JOptionPane.INFORMATION_MESSAGE,laptop);
			}
		});
		panel_6.add(btnNewButton_6);
		
		Image myImage6 = ImageIO.read(getClass().getResource("Image/pri9.jpg"));
	    myImage6 = myImage6.getScaledInstance(220,380, java.awt.Image.SCALE_SMOOTH);
	    ImageIcon myImageIcon6 = new ImageIcon(myImage6);
	    panel_6.add(new JLabel(myImageIcon6));
		
		JLabel lblNewLabel_7 = new JLabel("");
		jt6 = new JTextArea();
		jt6.setBackground(new Color(175, 238, 238));
		jt6.setForeground(new Color(0, 0, 0));
		jt6.setFont(new Font("Serif", Font.BOLD, 24));
		panel_6.add(lblNewLabel_7.add(jt6));
		
		
		
	}

}
