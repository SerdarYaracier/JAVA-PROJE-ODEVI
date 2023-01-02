package Hastane_sistemi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Hastane_sistemi.login_screen;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Hastane_A_Poliklinik extends JFrame {

	private JPanel contentPane;
	
	static String poliklinik;
	static String doktor;
	static String tarih;
	static String saat;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hastane_A_Poliklinik frame = new Hastane_A_Poliklinik();
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
	public Hastane_A_Poliklinik() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 738, 434);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hastane A Randevu Alma Ekrani");
		lblNewLabel.setFont(new Font("Century", Font.PLAIN, 30));
		lblNewLabel.setForeground(new Color(128, 64, 64));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 702, 42);
		contentPane.add(lblNewLabel);
		
		final JComboBox comboBox_HastaneA_poliklinik = new JComboBox();
		comboBox_HastaneA_poliklinik.setFont(new Font("Sitka Text", Font.PLAIN, 28));
		comboBox_HastaneA_poliklinik.setModel(new DefaultComboBoxModel(new String[] {"cocuk cerrahisi", "Kardiyoloji", "Genel cerrahi", "Plastik cerrahi", "Kalp damar cerrahisi", "Kadın doğum", "Üroloji"}));
		comboBox_HastaneA_poliklinik.setBounds(30, 114, 299, 42);
		contentPane.add(comboBox_HastaneA_poliklinik);
		
		final JComboBox comboBox_randevu_saat = new JComboBox();
		comboBox_randevu_saat.setFont(new Font("Sitka Text", Font.PLAIN, 28));
		comboBox_randevu_saat.setBounds(386, 259, 299, 42);
		contentPane.add(comboBox_randevu_saat);
		
		JLabel lblNewLabel_1 = new JLabel("Poliklinik seçiniz");
		lblNewLabel_1.setForeground(new Color(128, 64, 64));
		lblNewLabel_1.setFont(new Font("Century", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(30, 72, 262, 31);
		contentPane.add(lblNewLabel_1);
		
		final JComboBox comboBox_randevu_tarih = new JComboBox();
		comboBox_randevu_tarih.setFont(new Font("Sitka Text", Font.PLAIN, 28));
		comboBox_randevu_tarih.setBounds(386, 114, 299, 42);
		contentPane.add(comboBox_randevu_tarih);
		
		
		JLabel lblNewLabel_1_1 = new JLabel("Doktor seçiniz");
		lblNewLabel_1_1.setForeground(new Color(128, 64, 64));
		lblNewLabel_1_1.setFont(new Font("Century", Font.PLAIN, 30));
		lblNewLabel_1_1.setBounds(30, 217, 203, 31);
		contentPane.add(lblNewLabel_1_1);
		
		final JComboBox comboBox_doktor = new JComboBox();
		comboBox_doktor.setFont(new Font("Sitka Text", Font.PLAIN, 28));
		comboBox_doktor.setEditable(true);
		comboBox_doktor.setModel(new DefaultComboBoxModel(new String[] {" "}));
		comboBox_doktor.setBounds(30, 259, 299, 42);
		contentPane.add(comboBox_doktor);
		
		JButton kaydet_butonu = new JButton("Kaydet");
		kaydet_butonu.setForeground(new Color(255, 0, 0));
		kaydet_butonu.setBackground(new Color(207, 207, 207));
		kaydet_butonu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int secilen=comboBox_HastaneA_poliklinik.getSelectedIndex();
				
				switch(secilen) {
				
				case 0:
					comboBox_doktor.setModel(new DefaultComboBoxModel(new String[] {"Mehmet Fatih ","Fatma","Ece","Gülşen "}));	
					break;
					
				case 1:
					comboBox_doktor.setModel(new DefaultComboBoxModel(new String[] {"İlknuray","Haluk "}));
					break;
					
				case 2:
					comboBox_doktor.setModel(new DefaultComboBoxModel(new String[] {"Fatih","Emre","Yasin","Ceyda "}));
					break;
				case 3:
					comboBox_doktor.setModel(new DefaultComboBoxModel(new String[] {"Yunus Emre","Alp "}));
					break;
				case 4:
					comboBox_doktor.setModel(new DefaultComboBoxModel(new String[] {"Kübra "}));
				    break;
				case 5:	
					comboBox_doktor.setModel(new DefaultComboBoxModel(new String[] {"Sami","Umut "}));
					break;
				case 6:
					comboBox_doktor.setModel(new DefaultComboBoxModel(new String[] {"Kerem","Gulse"}));
				    break;
				}
				
				
			}
		});
		kaydet_butonu.setBounds(30, 167, 89, 23);
		contentPane.add(kaydet_butonu);
		
		JButton Hastane_A_kaydet_buton = new JButton("Kaydet");
		Hastane_A_kaydet_buton.setForeground(new Color(255, 0, 0));
		Hastane_A_kaydet_buton.setBackground(new Color(207, 207, 207));
		Hastane_A_kaydet_buton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int secilen2=comboBox_doktor.getSelectedIndex();
				
				switch(secilen2) {
				case 0:
					comboBox_randevu_tarih.setModel(new DefaultComboBoxModel(new String[] {"28.11.2022","29.12.2022 ","01.01.2023","02.02.2023"}));
					break;
					
				case 1:
					comboBox_randevu_tarih.setModel(new DefaultComboBoxModel(new String[] {"01.11.2022","02.12.2022 ","03.05.2023"}));
					break;
					
				case 2:
					comboBox_randevu_tarih.setModel(new DefaultComboBoxModel(new String[] {"08.1.2022","09.12.2022 "}));
					break;
				case 3:
					comboBox_randevu_tarih.setModel(new DefaultComboBoxModel(new String[] {"18.11.2022","29.12.2022 "}));
					break;
				case 4:
					comboBox_randevu_tarih.setModel(new DefaultComboBoxModel(new String[] {"14.1.2022"}));
					break;
				case 5:
					comboBox_randevu_tarih.setModel(new DefaultComboBoxModel(new String[] {"2.11.2022","2.12.2022 "}));
					break;
				case 6:
					comboBox_randevu_tarih.setModel(new DefaultComboBoxModel(new String[] {"8.10.2022","29.12.2022 "}));
					break;	
				
				
				}
				
				
				
				
				
				
				
				poliklinik =comboBox_HastaneA_poliklinik.getSelectedItem().toString();
				doktor  = comboBox_doktor.getSelectedItem().toString();
				String sql_sorgu;
				
				randevu_alma_jframe.Tc_no_txt.getText();
				
				
				
				
				
				//sql_sorgu="INSERT INTO randevu_alma(hastaTc,hasta_pol,hasta_doktor) VALUES ("+"'"+poliklinik+"','"+doktor+"')";
				//System.out.println(sql_sorgu);
				
	            
				
				
				//setVisible(false);
                
				
				
				
			}
		});
		Hastane_A_kaydet_buton.setBounds(30, 312, 89, 23);
		contentPane.add(Hastane_A_kaydet_buton);
		
		JLabel lblNewLabel_1_2 = new JLabel("Randevu tarihi seciniz");
		lblNewLabel_1_2.setForeground(new Color(128, 64, 64));
		lblNewLabel_1_2.setFont(new Font("Century", Font.PLAIN, 30));
		lblNewLabel_1_2.setBounds(386, 72, 326, 31);
		contentPane.add(lblNewLabel_1_2);
		
		JButton randevu_tarih_kaydet_buton = new JButton("Kaydet");
		randevu_tarih_kaydet_buton.setForeground(new Color(255, 0, 0));
		randevu_tarih_kaydet_buton.setBackground(new Color(207, 207, 207));
		randevu_tarih_kaydet_buton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int secilen3=comboBox_randevu_tarih.getSelectedIndex();
				switch(secilen3) {
				
			      
				
				case 0:
					comboBox_randevu_saat.setModel(new DefaultComboBoxModel(new String[] {"19.15","19.25 ","20.15"}));
					break;
				case 1:
					comboBox_randevu_saat.setModel(new DefaultComboBoxModel(new String[] {"18.45","18.55 ","22.30","23.00"}));
					break;
				case 2:
					comboBox_randevu_saat.setModel(new DefaultComboBoxModel(new String[] {"13.15","14.25 ","15.15"}));
					break;
				case 3:
					comboBox_randevu_saat.setModel(new DefaultComboBoxModel(new String[] {"09.15","10.25 ",}));
					break;
				case 4:
					comboBox_randevu_saat.setModel(new DefaultComboBoxModel(new String[] {"17.15","17.25","17.35"}));
					break;
				case 5:
					comboBox_randevu_saat.setModel(new DefaultComboBoxModel(new String[] {"13.15","13.25","13.55"}));
					break;
				default:
					comboBox_randevu_saat.setModel(new DefaultComboBoxModel(new String[] {"Uygun randevu yok"}));
					break;
					
				
					
				}
				
				
			}
		});
		randevu_tarih_kaydet_buton.setBounds(386, 167, 89, 23);
		contentPane.add(randevu_tarih_kaydet_buton);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Randevu saati seçiniz");
		lblNewLabel_1_2_1.setForeground(new Color(128, 64, 64));
		lblNewLabel_1_2_1.setFont(new Font("Century", Font.PLAIN, 30));
		lblNewLabel_1_2_1.setBounds(386, 216, 326, 31);
		contentPane.add(lblNewLabel_1_2_1);
		
		
		
		JButton randevu_saat_kaydet_buton = new JButton("Kaydet");
		randevu_saat_kaydet_buton.setForeground(new Color(255, 0, 0));
		randevu_saat_kaydet_buton.setBackground(new Color(207, 207, 207));
		randevu_saat_kaydet_buton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tarih =comboBox_randevu_tarih.getSelectedItem().toString();
				saat =comboBox_randevu_saat.getSelectedItem().toString();
				
				
				
				String sql_sorgu;
				sql_sorgu= "UPDATE randevu_alma SET hasta_pol='"+poliklinik+"',"+
						   "hasta_doktor='"+doktor+"',randevu_tarih='"+tarih+"',"+"randevu_saat='"+saat+"'WHERE hasta_tc="+randevu_alma_jframe.Tc_no_txt.getText();;
						   System.out.println(sql_sorgu);
						   Sql_baglama_classı.kaydet(sql_sorgu);
						   
						  randevu_basarili ac= new randevu_basarili();
							ac.setVisible(true);
							//setVisible(false);
							
							
							comboBox_randevu_saat.removeItem(comboBox_randevu_saat.getSelectedItem().toString());				
	
				
				 
			
				
				
				
				
				
			}
		});
		randevu_saat_kaydet_buton.setBounds(386, 312, 89, 23);
		contentPane.add(randevu_saat_kaydet_buton);
		
		JButton btnNewButton = new JButton("Ana Menüye Dön");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login_screen ac = new login_screen();
				ac.setVisible(true);
				setVisible(false);
				
				
				
			}
		});
		btnNewButton.setBackground(new Color(207, 207, 207));
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setBounds(10, 361, 139, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\syara\\Desktop\\My project.jpg"));
		lblNewLabel_2.setBounds(0, 0, 722, 395);
		contentPane.add(lblNewLabel_2);
		
		
		
	}
}
