package Hastane_sistemi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Tc_bos_girildi extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tc_bos_girildi frame = new Tc_bos_girildi();
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
	public Tc_bos_girildi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 368, 261);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tc,Ad ,soyad,yas kısımlarında ");
		lblNewLabel.setForeground(new Color(128, 64, 64));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Century", Font.PLAIN, 23));
		lblNewLabel.setBounds(10, 22, 332, 43);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Hata ile karşılaşıldı");
		lblNewLabel_1.setForeground(new Color(128, 64, 64));
		lblNewLabel_1.setFont(new Font("Century", Font.PLAIN, 23));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(20, 65, 297, 43);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Randevu alma ekranına geri dön");
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setBackground(new Color(214, 214, 214));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
			}
		});
		btnNewButton.setBounds(56, 158, 230, 38);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Lütfen tekrar deneyiniz");
		lblNewLabel_2.setForeground(new Color(128, 64, 64));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Century", Font.PLAIN, 23));
		lblNewLabel_2.setBounds(10, 119, 332, 28);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\syara\\Desktop\\My project.jpg"));
		lblNewLabel_3.setBounds(0, 0, 352, 222);
		contentPane.add(lblNewLabel_3);
	}

}
