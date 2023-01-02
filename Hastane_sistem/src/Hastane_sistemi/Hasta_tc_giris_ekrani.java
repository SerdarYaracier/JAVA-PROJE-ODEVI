package Hastane_sistemi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Hastane_sistemi.login_screen;
import Hastane_sistemi.Sql_baglama_classı;
import Hastane_sistemi.login_screen;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Hasta_tc_giris_ekrani extends JFrame {

	private JPanel contentPane;
	private static JTextField randevu_sorgula_txt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hasta_tc_giris_ekrani frame = new Hasta_tc_giris_ekrani();
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
	public Hasta_tc_giris_ekrani() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 251);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TC kimlik no giriniz");
		lblNewLabel.setForeground(new Color(128, 64, 64));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Century", Font.PLAIN, 40));
		lblNewLabel.setBounds(10, 11, 414, 54);
		contentPane.add(lblNewLabel);
		
		setRandevu_sorgula_txt(new JTextField());
		getRandevu_sorgula_txt().setBounds(72, 80, 290, 54);
		contentPane.add(getRandevu_sorgula_txt());
		getRandevu_sorgula_txt().setColumns(10);
		
		final JButton randevu_sorgula_buton = new JButton("Randevu sorgula");
		randevu_sorgula_buton.setBackground(new Color(207, 207, 207));
		randevu_sorgula_buton.setForeground(new Color(255, 0, 0));
		randevu_sorgula_buton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Tc= getRandevu_sorgula_txt().getText();
				
				String sql_sorgu = "Select count(hasta_tc) as Hasta_tc_giris_ekrani from randevu_alma where hasta_tc='"+Tc+"'";
				ResultSet myRs =Sql_baglama_classı.yap(); 
				myRs=Sql_baglama_classı.sorgula(sql_sorgu);
				
				Hasta_randevu_goruntuleme gor = new Hasta_randevu_goruntuleme();
				gor.setVisible(true);
				setVisible(false);
				
				
				/*try {
					while(myRs.next()) {
						if(myRs.getInt("giris")==1) {
							login_screen sql= new login_screen();
							sql.setVisible(true);
							setVisible(false);
						}else {randevu_sorgula_buton.setText("Hatalı giris");
							
						}
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}*/
				
				
				
				
			}
		});
		randevu_sorgula_buton.setBounds(72, 145, 132, 39);
		contentPane.add(randevu_sorgula_buton);
		
		JButton randevu_sorgula_buton_1 = new JButton("Ana menüye dön");
		randevu_sorgula_buton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				
			}
		});
		randevu_sorgula_buton_1.setForeground(Color.RED);
		randevu_sorgula_buton_1.setBackground(new Color(207, 207, 207));
		randevu_sorgula_buton_1.setBounds(231, 145, 132, 39);
		contentPane.add(randevu_sorgula_buton_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\syara\\Desktop\\My project.jpg"));
		lblNewLabel_1.setBounds(0, 0, 434, 212);
		contentPane.add(lblNewLabel_1);
	}

	public static JTextField getRandevu_sorgula_txt() {
		return randevu_sorgula_txt;
	}

	public void setRandevu_sorgula_txt(JTextField randevu_sorgula_txt) {
		this.randevu_sorgula_txt = randevu_sorgula_txt;
	}
}
