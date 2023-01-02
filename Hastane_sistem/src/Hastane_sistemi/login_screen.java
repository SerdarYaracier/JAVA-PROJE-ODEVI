package Hastane_sistemi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;

public class login_screen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login_screen frame = new login_screen();
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
	public login_screen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 693, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hasta Randevu alma");
		lblNewLabel.setForeground(new Color(128, 64, 64));
		lblNewLabel.setFont(new Font("Century", Font.PLAIN, 25));
		lblNewLabel.setBounds(32, 188, 245, 32);
		contentPane.add(lblNewLabel);
		
		JButton randevu_al_buton = new JButton("Tıkla");
		randevu_al_buton.setBackground(new Color(207, 207, 207));
		randevu_al_buton.setForeground(new Color(255, 0, 0));
		randevu_al_buton.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e)
			{
				randevu_alma_jframe randevu = new randevu_alma_jframe();
				randevu.setVisible(true);
				setVisible(false);
				
				
				
				
			}
		});
		randevu_al_buton.setBounds(42, 231, 89, 47);
		contentPane.add(randevu_al_buton);
		
		JLabel lblNewLabel_1 = new JLabel("Hasta Mevcut Randevu Görme");
		lblNewLabel_1.setForeground(new Color(128, 64, 64));
		lblNewLabel_1.setFont(new Font("Century", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(39, 289, 341, 32);
		contentPane.add(lblNewLabel_1);
		
		JButton btnTkla = new JButton("Tıkla");
		btnTkla.setBackground(new Color(207, 207, 207));
		btnTkla.setForeground(new Color(255, 0, 0));
		btnTkla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hasta_tc_giris_ekrani gir = new Hasta_tc_giris_ekrani();
				gir.setVisible(true);
				
			}
		});
		btnTkla.setBounds(42, 332, 89, 47);
		contentPane.add(btnTkla);
		
		JLabel lblDoktorGirii = new JLabel("Doktor Girisi");
		lblDoktorGirii.setForeground(new Color(128, 64, 64));
		lblDoktorGirii.setFont(new Font("Century", Font.PLAIN, 25));
		lblDoktorGirii.setBounds(422, 188, 200, 32);
		contentPane.add(lblDoktorGirii);
		
		JButton btnNewButton_1_1 = new JButton("Tıkla");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doktor_giris ac = new  doktor_giris();
				ac.setVisible(true);
				
			}
		});
		btnNewButton_1_1.setBackground(new Color(207, 207, 207));
		btnNewButton_1_1.setForeground(new Color(255, 0, 0));
		btnNewButton_1_1.setBounds(422, 231, 89, 47);
		contentPane.add(btnNewButton_1_1);
		
		JLabel lblYonetcGrs = new JLabel("Bashekim Girisi");
		lblYonetcGrs.setForeground(new Color(128, 64, 64));
		lblYonetcGrs.setFont(new Font("Century", Font.PLAIN, 25));
		lblYonetcGrs.setBounds(421, 289, 245, 32);
		contentPane.add(lblYonetcGrs);
		
		JButton btnNewButton_1_1_1_1 = new JButton("Tıkla");
		btnNewButton_1_1_1_1.setBackground(new Color(207, 207, 207));
		btnNewButton_1_1_1_1.setForeground(new Color(255, 0, 0));
		btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin_giris_ekrani gir = new Admin_giris_ekrani();
				gir.setVisible(true);
				
				
				
			}
		});
		btnNewButton_1_1_1_1.setBounds(422, 332, 89, 47);
		contentPane.add(btnNewButton_1_1_1_1);
		
		JLabel lblYardm = new JLabel("Yardim");
		lblYardm.setForeground(new Color(128, 64, 64));
		lblYardm.setFont(new Font("Century", Font.PLAIN, 30));
		lblYardm.setBounds(266, 374, 245, 47);
		contentPane.add(lblYardm);
		
		JButton yardım_butonu = new JButton("Tıkla");
		yardım_butonu.setBackground(new Color(207, 207, 207));
		yardım_butonu.setForeground(new Color(255, 0, 0));
		yardım_butonu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Yardım_page yardim= new Yardım_page();
				yardim.setVisible(true);
				
			}
		});
		yardım_butonu.setBounds(276, 432, 89, 47);
		contentPane.add(yardım_butonu);
		
		JLabel lblNewLabel_2 = new JLabel("Adanalılar hastane zinciri ");
		lblNewLabel_2.setForeground(new Color(128, 64, 64));
		lblNewLabel_2.setFont(new Font("Century", Font.PLAIN, 40));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 11, 657, 47);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Hastane Sistemine Hos Geldiniz");
		lblNewLabel_3.setForeground(new Color(128, 64, 64));
		lblNewLabel_3.setFont(new Font("Century", Font.PLAIN, 40));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(10, 90, 657, 41);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\syara\\Desktop\\My project.jpg"));
		lblNewLabel_4.setBounds(0, 0, 677, 501);
		contentPane.add(lblNewLabel_4);
	}
}
