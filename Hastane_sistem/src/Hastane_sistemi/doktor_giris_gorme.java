package Hastane_sistemi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Hastane_sistemi.Sql_baglama_classı;


import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;

public class doktor_giris_gorme extends JFrame {

	private JPanel contentPane;
	
	private JTable table;
	DefaultTableModel modelim = new DefaultTableModel();
	
	Object[] kolonlar = {"no","isim","soyad","yas","kan grubu","cinsiyet","Rh","hastane","poliklinik","doktor","tarih","saat"};
	Object[] satirlar = new Object[12];
	private JButton btnNewButton_1;
	private JTextField hasta_tc_txt;
	private JTextField hasta_adi_txt;
	private JTextField hasta_soyadi_txt;
	private JTextField hasta_hastane_txt;
	private JTextField hasta_pol_txt;
	private JTextField hasta_doktor_txt;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField randevu_tarih_txt;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField randevu_saat_txt;
	private JButton btnNewButton_3;
	private JLabel lblNewLabel_6;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					doktor_giris_gorme frame = new doktor_giris_gorme();
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
	public doktor_giris_gorme() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 858, 437);
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
		
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				hasta_tc_txt.setText( modelim.getValueAt(table.getSelectedRow(), 0).toString());
				hasta_adi_txt.setText((String) modelim.getValueAt(table.getSelectedRow(), 1));
				hasta_soyadi_txt.setText((String) modelim.getValueAt(table.getSelectedRow(), 2));
				hasta_hastane_txt.setText((String) modelim.getValueAt(table.getSelectedRow(), 7));
				hasta_pol_txt.setText((String) modelim.getValueAt(table.getSelectedRow(), 8));
				hasta_doktor_txt.setText((String) modelim.getValueAt(table.getSelectedRow(), 9));
				randevu_tarih_txt.setText((String) modelim.getValueAt(table.getSelectedRow(), 10));
				randevu_saat_txt.setText((String) modelim.getValueAt(table.getSelectedRow(), 11));
				
			}
		});
		
		
		
		
		
		
		JButton btnNewButton = new JButton("Hastalarımı göster");
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setBackground(new Color(214, 214, 214));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					
					
					modelim.setRowCount(0);
					
					ResultSet myRs= Sql_baglama_classı.yap();
					
					/*try {
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
					table.setModel(modelim);*/
					
					 modelim.setRowCount(0);
						
						String sql_sorgu=null;
						
						String alan= doktor_giris.getDoktor_kullaniciadi_txt().getText();
						
						
						//ResultSet myRs=null;
						
						
						
						
					 sql_sorgu = "select * FROM randevu_alma  WHERE hasta_doktor='"+alan+"'";
						
						
						
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
		btnNewButton.setBounds(44, 223, 271, 20);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Seçili randevu sil");
		btnNewButton_1.setForeground(new Color(255, 0, 0));
		btnNewButton_1.setBackground(new Color(214, 214, 214));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String no,sql_sorgu;
				no=hasta_tc_txt.getText();
				
				sql_sorgu= "DELETE FROM randevu_alma WHERE hasta_tc="+no;
				
				Sql_baglama_classı.sil(sql_sorgu);
				
				
			}
		});
		btnNewButton_1.setBounds(593, 223, 225, 20);
		contentPane.add(btnNewButton_1);
		
		hasta_tc_txt = new JTextField();
		hasta_tc_txt.setEditable(false);
		hasta_tc_txt.setBounds(185, 254, 86, 20);
		contentPane.add(hasta_tc_txt);
		hasta_tc_txt.setColumns(10);
		
		hasta_adi_txt = new JTextField();
		hasta_adi_txt.setEditable(false);
		hasta_adi_txt.setBounds(185, 286, 86, 20);
		contentPane.add(hasta_adi_txt);
		hasta_adi_txt.setColumns(10);
		
		hasta_soyadi_txt = new JTextField();
		hasta_soyadi_txt.setEditable(false);
		hasta_soyadi_txt.setBounds(185, 317, 86, 20);
		contentPane.add(hasta_soyadi_txt);
		hasta_soyadi_txt.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Seçili hasta adı");
		lblNewLabel.setFont(new Font("Century", Font.PLAIN, 16));
		lblNewLabel.setBounds(44, 285, 163, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblSeiliHastaTc = new JLabel("Seçili hasta tc");
		lblSeiliHastaTc.setFont(new Font("Century", Font.PLAIN, 16));
		lblSeiliHastaTc.setBounds(44, 254, 163, 22);
		contentPane.add(lblSeiliHastaTc);
		
		JLabel lblSeiliHastaSoyad = new JLabel("Seçili hasta soyadı");
		lblSeiliHastaSoyad.setFont(new Font("Century", Font.PLAIN, 16));
		lblSeiliHastaSoyad.setBounds(44, 317, 163, 22);
		contentPane.add(lblSeiliHastaSoyad);
		
		JButton btnNewButton_2 = new JButton("randevu düzenle");
		btnNewButton_2.setForeground(new Color(255, 0, 0));
		btnNewButton_2.setBackground(new Color(214, 214, 214));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
					String tc,ad,soyad,hastane,poliklinik,doktor,tarih,saat,sql_sorgu;
					tc=hasta_tc_txt.getText();
					ad=hasta_adi_txt.getText();
					soyad=hasta_soyadi_txt.getText();
					hastane = hasta_hastane_txt.getText();
					poliklinik= hasta_pol_txt.getText();
					doktor= hasta_doktor_txt.getText();
					tarih=randevu_tarih_txt.getText();
					saat= randevu_saat_txt.getText();
					
					
					
					
					sql_sorgu= "UPDATE randevu_alma SET hasta_tc="+tc+","+
							   "hasta_ad='"+ad+"',hasta_soyad='"+soyad+"',randevu_tarih='"+tarih+"',randevu_saat='"+saat+"' WHERE hasta_tc="+tc;
					System.out.println(sql_sorgu);
				 
					Sql_baglama_classı.güncelle(sql_sorgu);
				
			}
		});
		btnNewButton_2.setBounds(325, 223, 258, 20);
		contentPane.add(btnNewButton_2);
		
		hasta_hastane_txt = new JTextField();
		hasta_hastane_txt.setEditable(false);
		hasta_hastane_txt.setColumns(10);
		hasta_hastane_txt.setBounds(417, 255, 86, 20);
		contentPane.add(hasta_hastane_txt);
		
		hasta_pol_txt = new JTextField();
		hasta_pol_txt.setEditable(false);
		hasta_pol_txt.setColumns(10);
		hasta_pol_txt.setBounds(417, 286, 86, 20);
		contentPane.add(hasta_pol_txt);
		
		hasta_doktor_txt = new JTextField();
		hasta_doktor_txt.setEditable(false);
		hasta_doktor_txt.setColumns(10);
		hasta_doktor_txt.setBounds(417, 317, 86, 20);
		contentPane.add(hasta_doktor_txt);
		
		lblNewLabel_1 = new JLabel("Seçili Hastane");
		lblNewLabel_1.setFont(new Font("Century", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(293, 255, 126, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Seçili poliklinik");
		lblNewLabel_2.setFont(new Font("Century", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(293, 287, 126, 14);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Seçili doktor");
		lblNewLabel_3.setFont(new Font("Century", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(294, 318, 113, 14);
		contentPane.add(lblNewLabel_3);
		
		randevu_tarih_txt = new JTextField();
		randevu_tarih_txt.setBounds(666, 255, 86, 20);
		contentPane.add(randevu_tarih_txt);
		randevu_tarih_txt.setColumns(10);
		
		lblNewLabel_4 = new JLabel("Seçili tarih");
		lblNewLabel_4.setFont(new Font("Century", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(567, 255, 99, 14);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Seçili saat");
		lblNewLabel_5.setFont(new Font("Century", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(567, 287, 86, 14);
		contentPane.add(lblNewLabel_5);
		
		randevu_saat_txt = new JTextField();
		randevu_saat_txt.setBounds(666, 286, 86, 20);
		contentPane.add(randevu_saat_txt);
		randevu_saat_txt.setColumns(10);
		
		btnNewButton_3 = new JButton("Ana menüye don");
		btnNewButton_3.setForeground(new Color(255, 0, 0));
		btnNewButton_3.setBackground(new Color(214, 214, 214));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton_3.setBounds(593, 316, 225, 23);
		contentPane.add(btnNewButton_3);
		
		lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\syara\\Desktop\\My project.jpg"));
		lblNewLabel_6.setBounds(0, 0, 842, 398);
		contentPane.add(lblNewLabel_6);
	}
}
