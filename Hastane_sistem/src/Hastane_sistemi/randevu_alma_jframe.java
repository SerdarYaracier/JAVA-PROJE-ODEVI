package Hastane_sistemi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Hastane_sistemi.Sql_baglama_classı;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;

public class randevu_alma_jframe extends JFrame  {

	

	private JPanel contentPane;
	static JTextField Tc_no_txt;
	private JTextField hasta_ad_txt;
	private JTextField hasta_soyad_txt;
	private JTextField hasta_yas_txt;
	static String Tc;
	
	
	
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					randevu_alma_jframe frame = new randevu_alma_jframe();
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
	public randevu_alma_jframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 654, 376);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Randevu alma sekmesine hosgeldiniz");
		lblNewLabel.setForeground(new Color(128, 64, 64));
		lblNewLabel.setFont(new Font("Century", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 618, 64);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Hasta Tc No");
		lblNewLabel_1.setForeground(new Color(128, 64, 64));
		lblNewLabel_1.setFont(new Font("Century", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(33, 108, 187, 30);
		contentPane.add(lblNewLabel_1);
		
		setTc_no_txt(new JTextField());
		getTc_no_txt().setBounds(33, 149, 86, 20);
		contentPane.add(getTc_no_txt());
		getTc_no_txt().setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Hasta adı");
		lblNewLabel_1_1.setForeground(new Color(128, 64, 64));
		lblNewLabel_1_1.setFont(new Font("Century", Font.PLAIN, 25));
		lblNewLabel_1_1.setBounds(33, 180, 171, 30);
		contentPane.add(lblNewLabel_1_1);
		
		hasta_ad_txt = new JTextField();
		hasta_ad_txt.setColumns(10);
		hasta_ad_txt.setBounds(33, 221, 86, 20);
		contentPane.add(hasta_ad_txt);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Hasta Soyadı");
		lblNewLabel_1_1_1.setForeground(new Color(128, 64, 64));
		lblNewLabel_1_1_1.setFont(new Font("Century", Font.PLAIN, 25));
		lblNewLabel_1_1_1.setBounds(33, 252, 171, 30);
		contentPane.add(lblNewLabel_1_1_1);
		
		hasta_soyad_txt = new JTextField();
		hasta_soyad_txt.setColumns(10);
		hasta_soyad_txt.setBounds(33, 293, 86, 20);
		contentPane.add(hasta_soyad_txt);
		
		JLabel lblNewLabel_1_2 = new JLabel("Kan grubu");
		lblNewLabel_1_2.setForeground(new Color(128, 64, 64));
		lblNewLabel_1_2.setFont(new Font("Century", Font.PLAIN, 25));
		lblNewLabel_1_2.setBounds(263, 108, 171, 30);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Cinsiyet");
		lblNewLabel_1_1_1_1.setForeground(new Color(128, 64, 64));
		lblNewLabel_1_1_1_1.setFont(new Font("Century", Font.PLAIN, 25));
		lblNewLabel_1_1_1_1.setBounds(263, 180, 171, 30);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		final JComboBox comboBox_cinsiyet = new JComboBox();
		comboBox_cinsiyet.setModel(new DefaultComboBoxModel(new String[] {"Erkek", "Kadın"}));
		comboBox_cinsiyet.setBounds(263, 220, 86, 22);
		contentPane.add(comboBox_cinsiyet);
		
		final JComboBox comboBox_kgrubu = new JComboBox();
		comboBox_kgrubu.setModel(new DefaultComboBoxModel(new String[] {"0", "A", "B", "AB"}));
		comboBox_kgrubu.setBounds(263, 148, 86, 22);
		contentPane.add(comboBox_kgrubu);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Rh grubu");
		lblNewLabel_1_2_1.setForeground(new Color(128, 64, 64));
		lblNewLabel_1_2_1.setFont(new Font("Century", Font.PLAIN, 25));
		lblNewLabel_1_2_1.setBounds(448, 108, 171, 30);
		contentPane.add(lblNewLabel_1_2_1);
		
		final JComboBox comboBox_Rh = new JComboBox();
		comboBox_Rh.setModel(new DefaultComboBoxModel(new String[] {"Rh+", "Rh-"}));
		comboBox_Rh.setBounds(448, 148, 86, 22);
		contentPane.add(comboBox_Rh);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Hasta yasi");
		lblNewLabel_1_1_2.setForeground(new Color(128, 64, 64));
		lblNewLabel_1_1_2.setFont(new Font("Century", Font.PLAIN, 25));
		lblNewLabel_1_1_2.setBounds(263, 247, 171, 41);
		contentPane.add(lblNewLabel_1_1_2);
		
		hasta_yas_txt = new JTextField();
		hasta_yas_txt.setColumns(10);
		hasta_yas_txt.setBounds(263, 293, 86, 20);
		contentPane.add(hasta_yas_txt);
		
		JLabel lblNewLabel_2 = new JLabel("Hastane seçimi");
		lblNewLabel_2.setForeground(new Color(128, 64, 64));
		lblNewLabel_2.setFont(new Font("Century", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(441, 180, 187, 30);
		contentPane.add(lblNewLabel_2);
		
		final JComboBox comboBox_H_adi = new JComboBox();
		comboBox_H_adi.setModel(new DefaultComboBoxModel(new String[] {"A", "B", "C"}));
		comboBox_H_adi.setBounds(448, 220, 86, 22);
		contentPane.add(comboBox_H_adi);
		
		JButton bilgi_kaydet_buton = new JButton("Bilgilerimi kaydet");
		bilgi_kaydet_buton.setBackground(new Color(207, 207, 207));
		bilgi_kaydet_buton.setForeground(new Color(255, 0, 0));
		bilgi_kaydet_buton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ad,soyad,kgrubu,cinsiyet,yas,rh,hastane,sql_sorgu;
				Tc=getTc_no_txt().getText();
				ad=hasta_ad_txt.getText();
				soyad=hasta_soyad_txt.getText();
				yas=hasta_yas_txt.getText();
				
				if(Tc.length()!= 11 || ad.length()==0 || soyad.length()==0 || yas.length()==0 || yas.length()>2) {
					
					Tc_bos_girildi ac = new Tc_bos_girildi();
					ac.setVisible(true);
					
					
				}else {
				
				
				
				
				
				
				
				kgrubu=comboBox_kgrubu.getSelectedItem().toString();
				cinsiyet=comboBox_cinsiyet.getSelectedItem().toString();
				rh=comboBox_Rh.getSelectedItem().toString();
				hastane=comboBox_H_adi.getSelectedItem().toString();
				
				
				
				
				
				
				setVisible(false);
				
                int secilen=comboBox_H_adi.getSelectedIndex();
				
				if(secilen==0) {
					Hastane_A_Poliklinik randevu = new Hastane_A_Poliklinik ();
					randevu.setVisible(true);
					
					sql_sorgu="INSERT INTO randevu_alma(hasta_tc,hasta_ad,hasta_soyad,hasta_yas,hasta_kgrubu,hasta_cinsiyet,hasta_rh,hasta_hastane,hasta_pol,hasta_doktor,randevu_tarih,randevu_saat) VALUES "
							+ "("+Tc+",'"+ad+"',"+"'"+soyad+"',"+yas+",'"+kgrubu+"','"+cinsiyet+"','"+rh+"','"+hastane+"','"+Hastane_A_Poliklinik.poliklinik+"','"+Hastane_A_Poliklinik.doktor
							+"','"+Hastane_A_Poliklinik.tarih+"','"+Hastane_A_Poliklinik.saat+"')";
					//System.out.println(sql_sorgu);
					 
					 
					Sql_baglama_classı.kaydet(sql_sorgu);
					  
				}else if(secilen == 1) {
					Hastane_B_Poliklinik randevu = new Hastane_B_Poliklinik ();
					randevu.setVisible(true);
					
					sql_sorgu="INSERT INTO randevu_alma(hasta_tc,hasta_ad,hasta_soyad,hasta_yas,hasta_kgrubu,hasta_cinsiyet,hasta_rh,hasta_hastane,hasta_pol,hasta_doktor) VALUES "
							+ "("+Tc+",'"+ad+"',"+"'"+soyad+"',"+yas+",'"+kgrubu+"','"+cinsiyet+"','"+rh+"','"+hastane+"','"+Hastane_B_Poliklinik.poliklinik+"','"+Hastane_B_Poliklinik.doktor+"')";
					 
					Sql_baglama_classı.kaydet(sql_sorgu);
				}else if(secilen==2) {
					
					Hastane_C_Poliklinik randevu = new Hastane_C_Poliklinik ();
					randevu.setVisible(true);
					
					sql_sorgu="INSERT INTO randevu_alma(hasta_tc,hasta_ad,hasta_soyad,hasta_yas,hasta_kgrubu,hasta_cinsiyet,hasta_rh,hasta_hastane,hasta_pol,hasta_doktor) VALUES "
							+ "("+Tc+",'"+ad+"',"+"'"+soyad+"',"+yas+",'"+kgrubu+"','"+cinsiyet+"','"+rh+"','"+hastane+"','"+Hastane_B_Poliklinik.poliklinik+"','"+Hastane_B_Poliklinik.doktor+"')";
					 
					Sql_baglama_classı.kaydet(sql_sorgu);
					
					
					
					
				}
				
				
				
				
				}}
		});
		bilgi_kaydet_buton.setBounds(448, 251, 175, 45);
		contentPane.add(bilgi_kaydet_buton);
		
		JButton btnNewButton = new JButton("Ana menüye dön");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login_screen ac = new login_screen();
				ac.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setBackground(new Color(207, 207, 207));
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setBounds(448, 303, 171, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\syara\\Desktop\\My project.jpg"));
		lblNewLabel_3.setBounds(0, 0, 638, 337);
		contentPane.add(lblNewLabel_3);
		
		
		
	}

	public JTextField getTc_no_txt() {
		return Tc_no_txt;
	}

	public void setTc_no_txt(JTextField tc_no_txt) {
		Tc_no_txt = tc_no_txt;
	}
	
	
				
}

