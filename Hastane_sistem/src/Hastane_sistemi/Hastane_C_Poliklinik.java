package Hastane_sistemi;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Hastane_C_Poliklinik extends JFrame {

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
					Hastane_C_Poliklinik frame = new Hastane_C_Poliklinik();
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
	public Hastane_C_Poliklinik() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 419);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
contentPane.setLayout(null);
		
		final JComboBox comboBox_HastaneA_poliklinik = new JComboBox();
		comboBox_HastaneA_poliklinik.setFont(new Font("Sitka Text", Font.PLAIN, 30));
		comboBox_HastaneA_poliklinik.setModel(new DefaultComboBoxModel(new String[] {"Periodonti", "Plastik Cerrahi", "Romatoloji", "Nöroloji", "Psikiyatri", "Tıbbi Genetik", "Nefroloji"}));
		comboBox_HastaneA_poliklinik.setBounds(10, 107, 300, 44);
		contentPane.add(comboBox_HastaneA_poliklinik);
		
		final JComboBox comboBox_randevu_saat = new JComboBox();
		comboBox_randevu_saat.setFont(new Font("Sitka Text", Font.PLAIN, 30));
		comboBox_randevu_saat.setEditable(true);
		comboBox_randevu_saat.setBounds(362, 261, 300, 44);
		contentPane.add(comboBox_randevu_saat);
		
		final JComboBox comboBox_randevu_tarih = new JComboBox();
		comboBox_randevu_tarih.setFont(new Font("Sitka Text", Font.PLAIN, 30));
		comboBox_randevu_tarih.setBounds(362, 107, 300, 44);
		contentPane.add(comboBox_randevu_tarih);
		
		final JComboBox comboBox_doktor = new JComboBox();
		comboBox_doktor.setFont(new Font("Sitka Text", Font.PLAIN, 30));
		comboBox_doktor.setEditable(true);
		comboBox_doktor.setModel(new DefaultComboBoxModel(new String[] {" "}));
		comboBox_doktor.setBounds(10, 261, 300, 44);
		contentPane.add(comboBox_doktor);
		
		JButton kaydet_butonu = new JButton("Kaydet");
		kaydet_butonu.setForeground(new Color(255, 0, 0));
		kaydet_butonu.setBackground(new Color(207, 207, 207));
		kaydet_butonu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int secilen=comboBox_HastaneA_poliklinik.getSelectedIndex();
				
				switch(secilen) {
				
				case 0:
					comboBox_doktor.setModel(new DefaultComboBoxModel(new String[] {"Serdar","Şeyma","Fatih","Mehmet "}));
					break;
					
				case 1:
					comboBox_doktor.setModel(new DefaultComboBoxModel(new String[] {"İlknuray","Sami "}));
					break;
					
				case 2:
					comboBox_doktor.setModel(new DefaultComboBoxModel(new String[] {"Yunus","Emre","Yasin","Ceyda "}));
					break;
				case 3:
					comboBox_doktor.setModel(new DefaultComboBoxModel(new String[] {"Esma","Alp "}));
					break;
				case 4:
					comboBox_doktor.setModel(new DefaultComboBoxModel(new String[] {"Tugrul "}));
				    break;
				case 5:	
					comboBox_doktor.setModel(new DefaultComboBoxModel(new String[] {"Yalcin","Umut "}));
					break;
				case 6:
					comboBox_doktor.setModel(new DefaultComboBoxModel(new String[] {"Cuneyt","Gulse"}));
				    break;
				}
				
				
			}
		});
		kaydet_butonu.setBounds(10, 162, 106, 23);
		contentPane.add(kaydet_butonu);
		
		JButton Hastane_C_kaydet_buton = new JButton("Kaydet");
		Hastane_C_kaydet_buton.setForeground(new Color(255, 0, 0));
		Hastane_C_kaydet_buton.setBackground(new Color(207, 207, 207));
		Hastane_C_kaydet_buton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
int secilen2=comboBox_doktor.getSelectedIndex();
				
				switch(secilen2) {
				case 0:
					comboBox_randevu_tarih.setModel(new DefaultComboBoxModel(new String[] {"28.11.2022","29.12.2022 ","01.01.2023","02.02.2023"}));
					break;
					
				case 1:
					comboBox_randevu_tarih.setModel(new DefaultComboBoxModel(new String[] {"18.11.2022","19.12.2022 "}));
					break;
					
				case 2:
					comboBox_randevu_tarih.setModel(new DefaultComboBoxModel(new String[] {"8.1.2022",}));
					break;
				case 3:
					comboBox_randevu_tarih.setModel(new DefaultComboBoxModel(new String[] {"18.11.2022","29.12.2022 "}));
					break;
				case 4:
					comboBox_randevu_tarih.setModel(new DefaultComboBoxModel(new String[] {"28.1.2022","29.1.2022 "}));
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
				
				//sql_sorgu= "UPDATE randevu_alma SET hasta_pol='"+poliklinik+"',"+
						//   "hasta_doktor='"+doktor+"'WHERE hasta_tc="+randevu_alma_jframe.Tc_no_txt.getText();;
				//System.out.println(sql_sorgu);
				
				
				//sql_sorgu="INSERT INTO randevu_alma(hastaTc,hasta_pol,hasta_doktor) VALUES ("+"'"+poliklinik+"','"+doktor+"')";
				//System.out.println(sql_sorgu);
				
				//Sql_baglama_classı.kaydet(sql_sorgu);
				
				
				//setVisible(false);
				
				//login_screen ac= new login_screen();
				//ac.setVisible(true);
				
				
			}
		});
		Hastane_C_kaydet_buton.setBounds(10, 316, 106, 23);
		contentPane.add(Hastane_C_kaydet_buton);
		
		
		
		JButton randevu_tarih_kaydet_buton = new JButton("Kaydet");
		randevu_tarih_kaydet_buton.setForeground(new Color(255, 0, 0));
		randevu_tarih_kaydet_buton.setBackground(new Color(207, 207, 207));
		randevu_tarih_kaydet_buton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int secilen3=comboBox_randevu_tarih.getSelectedIndex();
				switch(secilen3) {
				
				case 0:
					comboBox_randevu_saat.setModel(new DefaultComboBoxModel(new String[] {"19.15","19.25 ","20.45"}));
					break;
				case 1:
					comboBox_randevu_saat.setModel(new DefaultComboBoxModel(new String[] {"19.45","19.55 "}));
					break;
				case 2:
					comboBox_randevu_saat.setModel(new DefaultComboBoxModel(new String[] {"1.15","9.25 "}));
					break;
				case 3:
					comboBox_randevu_saat.setModel(new DefaultComboBoxModel(new String[] {"9.15","1.25 "}));
					break;
				case 4:
					comboBox_randevu_saat.setModel(new DefaultComboBoxModel(new String[] {"17.15","17.25 "}));
					break;
				case 5:
					comboBox_randevu_saat.setModel(new DefaultComboBoxModel(new String[] {"3.15","3.25 "}));
					break;
				default:
					comboBox_randevu_saat.setModel(new DefaultComboBoxModel(new String[] {"Uygun randevu yok"}));
					break;
					
				
				
				}
				
				
			}
			
		});
		randevu_tarih_kaydet_buton.setBounds(372, 162, 96, 23);
		contentPane.add(randevu_tarih_kaydet_buton);
		
		
		
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
						   
						   //login_screen ac= new login_screen();
							//ac.setVisible(true);
							//setVisible(false);
						   
						   randevu_basarili ac= new randevu_basarili();
							ac.setVisible(true);
							
							comboBox_randevu_saat.removeItem(comboBox_randevu_saat.getSelectedItem().toString());
			}
		});
		randevu_saat_kaydet_buton.setBounds(362, 316, 106, 23);
		contentPane.add(randevu_saat_kaydet_buton);
		
		JLabel lblNewLabel_1 = new JLabel("Poliklinik seçiniz");
		lblNewLabel_1.setForeground(new Color(128, 64, 64));
		lblNewLabel_1.setFont(new Font("Century", Font.PLAIN, 30));
		lblNewLabel_1.setBackground(new Color(207, 207, 207));
		lblNewLabel_1.setBounds(10, 71, 252, 31);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Doktor seçiniz");
		lblNewLabel_1_1.setForeground(new Color(128, 64, 64));
		lblNewLabel_1_1.setFont(new Font("Century", Font.PLAIN, 30));
		lblNewLabel_1_1.setBackground(new Color(207, 207, 207));
		lblNewLabel_1_1.setBounds(10, 219, 252, 31);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel randevu_tarihi_lbl = new JLabel("Randevu tarihi seçiniz");
		randevu_tarihi_lbl.setForeground(new Color(128, 64, 64));
		randevu_tarihi_lbl.setFont(new Font("Century", Font.PLAIN, 30));
		randevu_tarihi_lbl.setBounds(362, 71, 332, 31);
		contentPane.add(randevu_tarihi_lbl);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Randevu saati seçiniz");
		lblNewLabel_1_1_1.setForeground(new Color(128, 64, 64));
		lblNewLabel_1_1_1.setFont(new Font("Century", Font.PLAIN, 30));
		lblNewLabel_1_1_1.setBounds(362, 217, 332, 31);
		contentPane.add(lblNewLabel_1_1_1);
		
		JButton btnNewButton = new JButton("Ana Menüye Dön");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				login_screen ac = new login_screen();
				ac.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBackground(new Color(207, 207, 207));
		btnNewButton.setBounds(10, 350, 132, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblHastaneBRandevu = new JLabel("Hastane C Randevu Alma Ekrani");
		lblHastaneBRandevu.setHorizontalAlignment(SwingConstants.CENTER);
		lblHastaneBRandevu.setForeground(new Color(128, 64, 64));
		lblHastaneBRandevu.setFont(new Font("Century", Font.PLAIN, 35));
		lblHastaneBRandevu.setBounds(10, 11, 684, 42);
		contentPane.add(lblHastaneBRandevu);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\syara\\Desktop\\My project.jpg"));
		lblNewLabel.setBounds(0, 0, 704, 380);
		contentPane.add(lblNewLabel);
		
		
	}

}
