package Hastane_sistemi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Hastane_sistemi.Sql_baglama_classı;
import Hastane_sistemi.login_screen;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;

public class doktor_giris extends JFrame {

	private JPanel contentPane;
	static private JTextField doktor_kullaniciadi_txt;
	public static JTextField getDoktor_kullaniciadi_txt() {
		return doktor_kullaniciadi_txt;
	}

	public static void setDoktor_kullaniciadi_txt(JTextField doktor_kullaniciadi_txt) {
		doktor_giris.doktor_kullaniciadi_txt = doktor_kullaniciadi_txt;
	}

	private JTextField doktor_sifre_txt;
	static String usern;
	static String sifre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					doktor_giris frame = new doktor_giris();
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
	public doktor_giris() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 414, 285);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		doktor_kullaniciadi_txt = new JTextField();
		doktor_kullaniciadi_txt.setBounds(80, 98, 228, 23);
		contentPane.add(doktor_kullaniciadi_txt);
		doktor_kullaniciadi_txt.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Doktor sifre");
		lblNewLabel_1_1.setForeground(new Color(128, 64, 64));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Century", Font.PLAIN, 26));
		lblNewLabel_1_1.setBounds(10, 132, 378, 28);
		contentPane.add(lblNewLabel_1_1);
		
		doktor_sifre_txt = new JTextField();
		doktor_sifre_txt.setColumns(10);
		doktor_sifre_txt.setBounds(80, 171, 228, 23);
		contentPane.add(doktor_sifre_txt);
		
		JLabel lblNewLabel = new JLabel("Doktor Giris Sekmesi");
		lblNewLabel.setForeground(new Color(128, 64, 64));
		lblNewLabel.setFont(new Font("Century", Font.PLAIN, 33));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 378, 37);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Doktor kullanıcı adı");
		lblNewLabel_1.setForeground(new Color(128, 64, 64));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Century", Font.PLAIN, 26));
		lblNewLabel_1.setBounds(20, 59, 368, 28);
		contentPane.add(lblNewLabel_1);
		
		JButton giris_yap = new JButton("giris yap");
		giris_yap.setForeground(new Color(255, 0, 0));
		giris_yap.setBackground(new Color(214, 214, 214));
		giris_yap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				usern= doktor_kullaniciadi_txt.getText();
				sifre= doktor_sifre_txt.getText();
				
				String sql_sorgu = "Select count(Doktor_usern) as doktor_giris from doktor_giris_bilgileri where Doktor_usern='"+usern+"'and doktor_passw= '"+sifre+"'";
				ResultSet myRs =Sql_baglama_classı.yap();
				myRs=Sql_baglama_classı.sorgula(sql_sorgu);
				
				try {
					while(myRs.next()) {
						if(myRs.getInt("doktor_giris")==1) {
							doktor_giris_gorme sql= new doktor_giris_gorme();
							sql.setVisible(true);
							setVisible(false);
						}else {hatali_giris gir = new hatali_giris();
						gir.setVisible(true);
							
						}
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
               
				
				
			}
		});
		giris_yap.setBounds(80, 212, 89, 23);
		contentPane.add(giris_yap);
		
		
		
		JButton btnNewButton_1 = new JButton("ana menü");
		btnNewButton_1.setForeground(new Color(255, 0, 0));
		btnNewButton_1.setBackground(new Color(214, 214, 214));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton_1.setBounds(210, 212, 98, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\syara\\Desktop\\My project.jpg"));
		lblNewLabel_2.setBounds(0, 0, 398, 246);
		contentPane.add(lblNewLabel_2);
	}
}
