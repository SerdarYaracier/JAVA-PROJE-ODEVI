package Hastane_sistemi;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Hastane_sistemi.Sql_baglama_classı;
import java.awt.Color;
import javax.swing.ImageIcon;



public class admin_database_görme extends JFrame {
	
	
	private JTable table;
	DefaultTableModel modelim = new DefaultTableModel();
	
	Object[] kolonlar = {"no","isim","soyad","yas","kan grubu","cinsiyet","Rh","hastane","poliklinik","doktor","tarih","saat"};
	Object[] satirlar = new Object[12];

	private JPanel contentPane;
	private JTextField ad_sorgula_txt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					admin_database_görme frame = new admin_database_görme();
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
	public admin_database_görme() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 906, 371);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
contentPane.setLayout(null);
		
		
		
		table = new JTable();
		modelim.setColumnIdentifiers(kolonlar);
		
		table.setBounds(50, 135, 254, 91);
		JScrollPane scrollPane = new JScrollPane();
		table.addMouseListener(new MouseAdapter() {
			
			
		});
		scrollPane.setBounds(44, 35, 774, 177);
		contentPane.add(scrollPane);
		scrollPane.setViewportView(table);
		
		
		
		JButton lisetele_butonu = new JButton("Listele");
		lisetele_butonu.setBackground(new Color(202, 202, 202));
		lisetele_butonu.setForeground(new Color(255, 0, 0));
		lisetele_butonu.setBounds(44, 223, 242, 37);
		contentPane.add(lisetele_butonu);
		
		
		
		lisetele_butonu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				modelim.setRowCount(0);
				
				ResultSet myRs= Sql_baglama_classı.yap();
				
				try {
					while(myRs.next()) {
						satirlar[0] = myRs.getString("hasta_tc");
						satirlar[1] = myRs.getString("hasta_ad");
						satirlar[2] = myRs.getString("hasta_soyad");
						satirlar[3] = myRs.getString("hasta_yas");
						satirlar[4] = myRs.getString("hasta_kgrubu");
						satirlar[5] = myRs.getString("hasta_cinsiyet");
						satirlar[6] = myRs.getString("hasta_rh");
						satirlar[7] = myRs.getString("hasta_hastane");
						satirlar[8] = myRs.getString("hasta_pol");
						satirlar[9] = myRs.getString("hasta_doktor");
						satirlar[10] = myRs.getString("randevu_tarih");
						satirlar[11] = myRs.getString("randevu_saat");
						modelim.addRow(satirlar);
		
					}
				
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				table.setModel(modelim);
			}
		});
		//giren_kisi_yadir_lbl.setText(giris.ad);
		final JComboBox Kutu_kombo = new JComboBox();
		Kutu_kombo.setModel(new DefaultComboBoxModel(new String[] {"Hasta Tc", "Hasta ad", "Hasta soyad", "Hasta yas", "Hasta cinsiyet", "Hasta kan grubu", "Hastane adı", "Poliklinik adı", "Doktor adı", "Tarih"}));
		Kutu_kombo.setBounds(467, 230, 255, 22);
		contentPane.add(Kutu_kombo);
		
		ad_sorgula_txt = new JTextField();
		ad_sorgula_txt.setBounds(732, 231, 86, 20);
		contentPane.add(ad_sorgula_txt);
		ad_sorgula_txt.setColumns(10);
		
		JButton ad_sorgula_butonu = new JButton("Sorgula");
		ad_sorgula_butonu.setBackground(new Color(202, 202, 202));
		ad_sorgula_butonu.setForeground(new Color(255, 0, 0));
		ad_sorgula_butonu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modelim.setRowCount(0);
				
				String sql_sorgu=null;
				
				String alan= ad_sorgula_txt.getText();
				
				ResultSet myRs=null;
				
				int secilen=Kutu_kombo.getSelectedIndex();
				
				if(secilen==0) {
					  sql_sorgu = "select * FROM randevu_alma WHERE hasta_tc='"+alan+"'";
				}else if(secilen == 1) {
					 sql_sorgu = "select * FROM randevu_alma WHERE hasta_ad='"+alan+"'";
					
				}else if(secilen==2) {
					 sql_sorgu = "select * FROM randevu_alma WHERE hasta_soyad='"+alan+"'";
				}
				else if(secilen==3) {
					 sql_sorgu = "select * FROM randevu_alma WHERE hasta_yas='"+alan+"'";
				}
				else if(secilen==4) {
					 sql_sorgu = "select * FROM randevu_alma WHERE hasta_cinsiyet='"+alan+"'";
				}
				else if(secilen==5) {
					 sql_sorgu = "select * FROM randevu_alma WHERE hasta_kgrubu='"+alan+"'";
				}
				else if(secilen==6) {
					 sql_sorgu = "select * FROM randevu_alma WHERE hasta_hastane='"+alan+"'";
				}
				else if(secilen==7) {
					 sql_sorgu = "select * FROM randevu_alma WHERE hasta_pol='"+alan+"'";
				}
				else if(secilen==8) {
					 sql_sorgu = "select * FROM randevu_alma WHERE hasta_doktor='"+alan+"'";
				}
				else if(secilen==9) {
					 sql_sorgu = "select * FROM randevu_alma WHERE randevu_tarih='"+alan+"'";
				}
				
				
				// sql_sorgu = "select * FROM ogrenci_tablosu WHERE ogr_ad='"+alan+"'";
				
				myRs= Sql_baglama_classı.sorgula(sql_sorgu);
				
				try {
					while(myRs.next()) {
						satirlar[0] = myRs.getString("hasta_tc");
						satirlar[1] = myRs.getString("hasta_ad");
						satirlar[2] = myRs.getString("hasta_soyad");
						satirlar[3] = myRs.getString("hasta_yas");
						satirlar[4] = myRs.getString("hasta_kgrubu");
						satirlar[5] = myRs.getString("hasta_cinsiyet");
						satirlar[6] = myRs.getString("hasta_rh");
						satirlar[7] = myRs.getString("hasta_hastane");
						satirlar[8] = myRs.getString("hasta_pol");
						satirlar[9] = myRs.getString("hasta_doktor");
						satirlar[10] = myRs.getString("randevu_tarih");
						satirlar[11] = myRs.getString("randevu_saat");
						modelim.addRow(satirlar);
		
					}
				
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				table.setModel(modelim);
				
				
				
				
				 
				
			}
		});
		ad_sorgula_butonu.setBounds(729, 262, 89, 23);
		contentPane.add(ad_sorgula_butonu);
		
		JButton btnNewButton = new JButton("Ana menüye dön");
		btnNewButton.setBackground(new Color(202, 202, 202));
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				setVisible(false);
			}
		});
		btnNewButton.setBounds(44, 271, 175, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\syara\\Desktop\\My project.jpg"));
		lblNewLabel.setBounds(0, 0, 890, 332);
		contentPane.add(lblNewLabel);
		
		
		
		
		//contentPane.add(table);
	}


	

	
	
	
	
}	

