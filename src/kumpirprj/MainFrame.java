package kumpirprj;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private int toplam = 0;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MainFrame() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\saday\\OneDrive\\Masaüstü\\Yeni klasör\\Kumpir.png"));
		setBackground(new Color(0, 0, 0));
		setTitle("Kumpir");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 569, 361);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 160, 122));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("KUMPİR BOX'A HOŞ GELDİNİZ!");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(130, 11, 303, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Sade Kumpir(12 TL)");
		lblNewLabel_1.setBounds(44, 66, 102, 14);
		contentPane.add(lblNewLabel_1);
		
		JCheckBox cbMisir = new JCheckBox("Mısır(3 TL)");
		cbMisir.setBackground(new Color(255, 160, 122));
		cbMisir.setForeground(new Color(0, 0, 0));
		cbMisir.setBounds(44, 100, 97, 23);
		contentPane.add(cbMisir);
		
		JCheckBox cbSosis = new JCheckBox("Sosis(5 TL)");
		cbSosis.setForeground(Color.BLACK);
		cbSosis.setBackground(new Color(255, 160, 122));
		cbSosis.setBounds(44, 137, 97, 23);
		contentPane.add(cbSosis);
		
		JCheckBox cbRusSalatas = new JCheckBox("Rus Salatası(7 TL)");
		cbRusSalatas.setForeground(Color.BLACK);
		cbRusSalatas.setBackground(new Color(255, 160, 122));
		cbRusSalatas.setBounds(44, 176, 132, 23);
		contentPane.add(cbRusSalatas);
		
		JCheckBox cbZeytin = new JCheckBox("Zeytin(3 TL)");
		cbZeytin.setForeground(Color.BLACK);
		cbZeytin.setBackground(new Color(255, 160, 122));
		cbZeytin.setBounds(44, 209, 97, 23);
		contentPane.add(cbZeytin);
		
		JComboBox comboBoxMisir = new JComboBox();
		comboBoxMisir.setModel(new DefaultComboBoxModel(new String[] {"1", "2"}));
		comboBoxMisir.setBounds(182, 100, 46, 22);
		contentPane.add(comboBoxMisir);
		
		JComboBox comboBoxSosis = new JComboBox();
		comboBoxSosis.setModel(new DefaultComboBoxModel(new String[] {"1", "2"}));
		comboBoxSosis.setBounds(182, 137, 46, 22);
		contentPane.add(comboBoxSosis);
		
		JComboBox comboBoxRuss = new JComboBox();
		comboBoxRuss.setModel(new DefaultComboBoxModel(new String[] {"1", "2"}));
		comboBoxRuss.setBounds(182, 176, 46, 22);
		contentPane.add(comboBoxRuss);
		
		JComboBox comboBoxZeytin = new JComboBox();
		comboBoxZeytin.setModel(new DefaultComboBoxModel(new String[] {"1", "2"}));
		comboBoxZeytin.setBounds(182, 209, 46, 22);
		contentPane.add(comboBoxZeytin);
		
		JLabel lblToplam = new JLabel("0");
		lblToplam.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblToplam.setBounds(156, 293, 31, 18);
		contentPane.add(lblToplam);
		
		JButton btnSiparisVer = new JButton("Sipariş Ver");
		btnSiparisVer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				toplam = 12;
				if(cbMisir.isSelected()) {
					toplam = toplam + Integer.parseInt(comboBoxMisir.getSelectedItem().toString())*3;
				}
				
				if(cbSosis.isSelected()) {
					toplam = toplam + Integer.parseInt(comboBoxSosis.getSelectedItem().toString())*5;
				}
				
				if(cbRusSalatas.isSelected()) {
					toplam = toplam + Integer.parseInt(comboBoxRuss.getSelectedItem().toString())*7;
				}
				
				if(cbZeytin.isSelected()) {
					toplam = toplam + Integer.parseInt(comboBoxZeytin.getSelectedItem().toString())*3;
				}
				
				lblToplam.setText(Integer.toString(toplam));
			}
		});
		btnSiparisVer.setBackground(new Color(50, 205, 50));
		btnSiparisVer.setBounds(44, 259, 175, 23);
		contentPane.add(btnSiparisVer);
		
		JLabel lblNewLabel_2 = new JLabel("Ödenecek Tutar:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(44, 293, 102, 18);
		contentPane.add(lblNewLabel_2);
		

		
		JLabel lblTl = new JLabel("TL");
		lblTl.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTl.setBounds(197, 293, 31, 18);
		contentPane.add(lblTl);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\saday\\OneDrive\\Masaüstü\\Yeni klasör\\Kumpir.png"));
		btnNewButton.setBounds(244, 66, 280, 216);
		contentPane.add(btnNewButton);
	}
}
