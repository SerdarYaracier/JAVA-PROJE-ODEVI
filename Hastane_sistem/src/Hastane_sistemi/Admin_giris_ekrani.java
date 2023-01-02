package Hastane_sistemi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Hastane_sistemi.Sql_baglama_classı;
import Hastane_sistemi.login_screen;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Admin_giris_ekrani extends JFrame {

	private JPanel contentPane;
	private JTextField username_txt;
	private JTextField sifre_txt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_giris_ekrani frame = new Admin_giris_ekrani();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Admin_giris_ekrani() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 235);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Admin kullanıcı adı");
		lblNewLabel.setForeground(new Color(128, 64, 64));
		lblNewLabel.setFont(new Font("Century", Font.PLAIN, 35));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 414, 39);
		contentPane.add(lblNewLabel);
		
		username_txt = new JTextField();
		username_txt.setBounds(106, 53, 199, 20);
		contentPane.add(username_txt);
		username_txt.setColumns(10);
		
		JLabel lblAdminifre = new JLabel("Admin Sifre");
		lblAdminifre.setForeground(new Color(128, 64, 64));
		lblAdminifre.setFont(new Font("Century", Font.PLAIN, 35));
		lblAdminifre.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdminifre.setBounds(106, 84, 199, 31);
		contentPane.add(lblAdminifre);
		
		sifre_txt = new JTextField();
		sifre_txt.setColumns(10);
		sifre_txt.setBounds(106, 126, 199, 20);
		contentPane.add(sifre_txt);
		
		final JButton giris_butonu = new JButton("giriş yap");
		giris_butonu.setBackground(new Color(207, 207, 207));
		giris_butonu.setForeground(new Color(255, 0, 0));
		giris_butonu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String ID= username_txt.getText();
				String sifre= sifre_txt.getText();
				
				String sql_sorgu = "Select count(admin_username) as Admin_giris_ekrani from admin_bilgileri where admin_username='"+ID+"'and admin_sifre= '"+sifre+"'";
				ResultSet myRs =Sql_baglama_classı.yap();
				myRs=Sql_baglama_classı.sorgula(sql_sorgu);
				
				try {
					while(myRs.next()) {
						if(myRs.getInt("Admin_giris_ekrani")==1) {
							admin_database_görme gor= new admin_database_görme();
							gor.setVisible(true);
							setVisible(false);
						}else { hatali_giris gir = new hatali_giris();
						gir.setVisible(true);
							
							
						}
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		giris_butonu.setBounds(10, 157, 199, 23);
		contentPane.add(giris_butonu);
		
		JButton btnNewButton = new JButton("Ana menüye dön");
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setBackground(new Color(207, 207, 207));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
			}
		});
		btnNewButton.setBounds(230, 157, 194, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\syara\\Desktop\\My project.jpg"));
		lblNewLabel_1.setBounds(0, 0, 434, 196);
		contentPane.add(lblNewLabel_1);
	}

}
