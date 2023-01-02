package Hastane_sistemi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Hastane_sistemi.Sql_baglama_classı;


import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;

public class Hasta_randevu_goruntuleme extends JFrame {
	
	DefaultTableModel modelim = new DefaultTableModel();

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	
	Object[] kolonlar = {"Tc","ad","soyad","Hastane","Poliklinik","doktor","tarih","saat"};
	Object[] satirlar = new Object[8];
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hasta_randevu_goruntuleme frame = new Hasta_randevu_goruntuleme();
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
	public Hasta_randevu_goruntuleme() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 839, 315);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(23, 36, 773, 180);
		contentPane.add(scrollPane);
		
		table = new JTable();
		modelim.setColumnIdentifiers(kolonlar);
		modelim.addRow(satirlar);
		scrollPane.setColumnHeaderView(table);
		
		table_1 = new JTable();
		table_1.setModel(modelim);
		table_1.setBounds(630, 36, 503, 168);
		scrollPane.setViewportView(table_1);
		
		btnNewButton = new JButton("Randevumu görüntüle");
		btnNewButton.setForeground(new Color(128, 64, 64));
		btnNewButton.setFont(new Font("Century", Font.PLAIN, 30));
		btnNewButton.setBackground(new Color(207, 207, 207));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
                modelim.setRowCount(0);
				
				ResultSet myRs= Sql_baglama_classı.yap();
				
				/*try {
					while(myRs.next()) {
						satirlar[0] = myRs.getString("hasta_tc");
						satirlar[1] = myRs.getString("hasta_ad");
						satirlar[2] = myRs.getString("hasta_soyad");
						modelim.addRow(satirlar);
		
					}
				
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				table.setModel(modelim);*/
				
                modelim.setRowCount(0);
				
				String sql_sorgu=null;
				
				String alan= Hasta_tc_giris_ekrani.getRandevu_sorgula_txt().getText();
				
				
				//ResultSet myRs=null;
				
				
				
				
			 sql_sorgu = "select * FROM randevu_alma  WHERE hasta_tc='"+alan+"'";
				
				
				
				// sql_sorgu = "select * FROM ogrenci_tablosu WHERE ogr_ad='"+alan+"'";
				
				myRs= Sql_baglama_classı.sorgula(sql_sorgu);
				
				try {
					while(myRs.next()) {
						satirlar[0] = myRs.getString("hasta_tc");
						satirlar[1] = myRs.getString("hasta_ad");
						satirlar[2] = myRs.getString("hasta_soyad");
						satirlar[3] = myRs.getString("hasta_hastane");
						satirlar[4] = myRs.getString("hasta_pol");
						satirlar[5] = myRs.getString("hasta_doktor");
						satirlar[6] = myRs.getString("randevu_tarih");
						satirlar[7] = myRs.getString("randevu_saat");
						modelim.addRow(satirlar);
		
					}
				
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				table.setModel(modelim);
				
				
				
				
				
				
				
			}
		});
		btnNewButton.setBounds(23, 227, 398, 34);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Ana menüye dön");
		btnNewButton_1.setFont(new Font("Century", Font.PLAIN, 30));
		btnNewButton_1.setForeground(new Color(128, 64, 64));
		btnNewButton_1.setBackground(new Color(207, 207, 207));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				
			}
		});
		btnNewButton_1.setBounds(441, 227, 355, 34);
		contentPane.add(btnNewButton_1);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\syara\\Desktop\\My project.jpg"));
		lblNewLabel.setBounds(0, 0, 823, 276);
		contentPane.add(lblNewLabel);
		
		
	}
}
