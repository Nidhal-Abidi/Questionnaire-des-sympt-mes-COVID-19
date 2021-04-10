package projProgr;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;

import javax.swing.*;

public class Quest extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quest frame = new Quest();
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
	public Quest() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100,720,480);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBackground(new Color(220, 20, 60));
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("D\u00E9marrer");
		btnNewButton.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Quest1 frame = new Quest1();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				
		        			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 32));
		btnNewButton.setForeground(new Color(255, 0, 102));
		btnNewButton.setBounds(328, 383, 175, 47);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Quitter");
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.addMouseListener((MouseListener) new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setForeground(new Color(220, 20, 60));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1.setBounds(0, 0, 160, 29);
		contentPane.add(btnNewButton_1);
		
		JTextArea txtrNousMettons = new JTextArea();
		txtrNousMettons.setForeground(SystemColor.inactiveCaptionText);
		txtrNousMettons.setBackground(new Color(220, 20, 60));
		txtrNousMettons.setEditable(false);
		txtrNousMettons.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtrNousMettons.setText("Nous mettons \u00E0 votre disposition un programme pour\r\n s'enqu\u00E9rir \u00E0 votre sant\u00E9 !\r\n\r\nLes questions et les r\u00E9ponses fournient par ce programme \r\nne substituent en aucun cas un test de la part de votre \r\nm\u00E9decin ou d'un professionnel.\r\n\r\nEn cas de doute ,VEUILLEZ CONTACTER VOTRE MEDECIN OU \r\nLE NUMERO 190.\r\n\r\nNB:les informations personnelles sont priv\u00E9es et ne seront jamais \r\ndistribu\u00E9es au public.");
		txtrNousMettons.setBounds(170, 31, 524, 290);
		contentPane.add(txtrNousMettons);
		
		JLabel lblNewLabel = new JLabel("Diagnostic du \r\n");
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblNewLabel.setForeground(new Color(220, 20, 60));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(SystemColor.controlHighlight);
		lblNewLabel.setBounds(0, 0, 160, 248);
		contentPane.add(lblNewLabel);
		
		JLabel lblDuCovid = new JLabel("COVID_19");
		lblDuCovid.setVerticalAlignment(SwingConstants.TOP);
		lblDuCovid.setOpaque(true);
		lblDuCovid.setHorizontalAlignment(SwingConstants.CENTER);
		lblDuCovid.setForeground(new Color(220, 20, 60));
		lblDuCovid.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblDuCovid.setBackground(SystemColor.controlHighlight);
		lblDuCovid.setAlignmentY(1.0f);
		lblDuCovid.setBounds(0, 248, 160, 193);
		contentPane.add(lblDuCovid);
	}
}
