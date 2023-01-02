package Hastane_sistemi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;

public class Yardım_page extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Yardım_page frame = new Yardım_page();
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
	public Yardım_page() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 631, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Yardım Sayfasını açtınız");
		lblNewLabel.setForeground(new Color(128, 64, 64));
		lblNewLabel.setFont(new Font("Century", Font.PLAIN, 35));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 595, 43);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Bu sayfa, programın nasıl kullanıldığını anlatır");
		lblNewLabel_1.setForeground(new Color(128, 64, 64));
		lblNewLabel_1.setFont(new Font("Century", Font.PLAIN, 25));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 56, 595, 43);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Hasta girişinizi yaptıktan sonra istediğiniz hastane, bölüm ve doktoru seçiniz");
		lblNewLabel_2.setForeground(new Color(128, 64, 64));
		lblNewLabel_2.setFont(new Font("Century", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(10, 133, 595, 23);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Kendinize uygun randevu tarihi ve saatini seçiniz. ");
		lblNewLabel_2_1.setForeground(new Color(128, 64, 64));
		lblNewLabel_2_1.setFont(new Font("Century", Font.PLAIN, 16));
		lblNewLabel_2_1.setBounds(10, 167, 595, 23);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("İstediğiniz doktorun uygun randevusu olmayabilir");
		lblNewLabel_2_1_1.setForeground(new Color(128, 64, 64));
		lblNewLabel_2_1_1.setFont(new Font("Century", Font.PLAIN, 17));
		lblNewLabel_2_1_1.setBounds(10, 201, 424, 23);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Doktorunuz randevu gün ve saatinizi değiştirebilir. Aralıklarla kontrol ediniz");
		lblNewLabel_2_1_1_1.setForeground(new Color(128, 64, 64));
		lblNewLabel_2_1_1_1.setFont(new Font("Century", Font.PLAIN, 16));
		lblNewLabel_2_1_1_1.setBounds(10, 235, 605, 23);
		contentPane.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_3 = new JLabel("Sağlıklı günler dileriz");
		lblNewLabel_2_1_1_3.setForeground(new Color(128, 64, 64));
		lblNewLabel_2_1_1_3.setFont(new Font("Century", Font.PLAIN, 35));
		lblNewLabel_2_1_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_3.setBounds(10, 283, 595, 43);
		contentPane.add(lblNewLabel_2_1_1_3);
		
		JButton btnNewButton = new JButton("sekmeyi kapat");
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setBackground(new Color(202, 202, 202));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				
			}
		});
		btnNewButton.setBounds(230, 337, 145, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\syara\\Desktop\\My project.jpg"));
		lblNewLabel_3.setBounds(0, 0, 615, 371);
		contentPane.add(lblNewLabel_3);
	}
}
