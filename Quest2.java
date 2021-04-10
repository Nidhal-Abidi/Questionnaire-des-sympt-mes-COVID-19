package projProgr;

import java.awt.*;
import java.io.FileWriter;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Quest2 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private final ButtonGroup buttonGroup_3 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quest2 frame = new Quest2();
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
	public Quest2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 20,480, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("1/ Avez vous de la fièvre ?");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBounds(55, 23, 302, 39);
		contentPane.add(lblNewLabel);
		
		JRadioButton Fievre = new JRadioButton("Oui");
		Fievre.setBackground(new Color(255, 153, 153));
		Fievre.setForeground(new Color(0, 0, 0));
		buttonGroup.add(Fievre);
		Fievre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Fievre.setBounds(76, 100, 109, 23);
		contentPane.add(Fievre);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Non");
		rdbtnNewRadioButton_1.setBackground(new Color(204, 255, 153));
		rdbtnNewRadioButton_1.setForeground(new Color(0, 0, 0));
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnNewRadioButton_1.setBounds(236, 100, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("2/ Avez vous un mal à la tête ?");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(55, 152, 340, 39);
		contentPane.add(lblNewLabel_1);
		
		JRadioButton maltete = new JRadioButton("Oui");
		maltete.setBackground(new Color(255, 153, 153));
		maltete.setForeground(new Color(0, 0, 0));
		buttonGroup_1.add(maltete);
		maltete.setFont(new Font("Tahoma", Font.PLAIN, 16));
		maltete.setBounds(76, 243, 109, 23);
		contentPane.add(maltete);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Non");
		rdbtnNewRadioButton_2.setBackground(new Color(204, 255, 153));
		rdbtnNewRadioButton_2.setForeground(new Color(0, 0, 0));
		buttonGroup_1.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnNewRadioButton_2.setBounds(225, 245, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Non");
		rdbtnNewRadioButton_3.setBackground(new Color(204, 255, 153));
		rdbtnNewRadioButton_3.setForeground(new Color(0, 0, 0));
		buttonGroup_2.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnNewRadioButton_3.setBounds(225, 411, 109, 23);
		contentPane.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Non");
		rdbtnNewRadioButton_4.setBackground(new Color(204, 255, 153));
		rdbtnNewRadioButton_4.setForeground(new Color(0, 0, 0));
		buttonGroup_3.add(rdbtnNewRadioButton_4);
		rdbtnNewRadioButton_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnNewRadioButton_4.setBounds(236, 571, 109, 23);
		contentPane.add(rdbtnNewRadioButton_4);
		
		JRadioButton Toux = new JRadioButton("Oui");
		Toux.setBackground(new Color(255, 153, 153));
		Toux.setForeground(new Color(0, 0, 0));
		buttonGroup_2.add(Toux);
		Toux.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Toux.setBounds(76, 413, 109, 23);
		contentPane.add(Toux);
		
		JRadioButton Prblm_resp = new JRadioButton("Oui");
		Prblm_resp.setBackground(new Color(255, 153, 153));
		Prblm_resp.setForeground(new Color(0, 0, 0));
		buttonGroup_3.add(Prblm_resp);
		Prblm_resp.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Prblm_resp.setBounds(76, 571, 109, 23);
		contentPane.add(Prblm_resp);
		
		JLabel lblNewLabel_1_1 = new JLabel("3/ Avez vous une toux ?");
		lblNewLabel_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1_1.setBounds(55, 316, 290, 39);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("Suivant");
		btnNewButton.setForeground(new Color(204, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean fievre=Fievre.isSelected();
				boolean mal_tete=maltete.isSelected();
				boolean toux=Toux.isSelected();
				boolean prblm_respi=Prblm_resp.isSelected();
				String fv="Non";
				String ml_t="Non";
				String tou="Non";
				String pb_re="Non";
				if (fievre)
					 fv ="Oui";
				if (mal_tete)
					 ml_t="Oui";
				if (toux)
					tou="Oui";
				if (prblm_respi)
					pb_re="Oui";
				try { 
					FileWriter writer=new FileWriter("Quest1_data.txt",true);
					writer.write(fv+" ");
					writer.write(ml_t+" ");
					writer.write(tou+" ");
					writer.write(pb_re+" ");
					writer.close();
								
				}
				catch (Exception e1)
				{ 
					JOptionPane.showMessageDialog(rootPane,"Erreur");
				}
				
				if( !Fievre.isSelected() && !rdbtnNewRadioButton_1.isSelected() )
					JOptionPane.showMessageDialog(rootPane, "Tu dois sélectionner une réponse pour la 1er question!");
				else
				    if( !maltete.isSelected() && !rdbtnNewRadioButton_2.isSelected())
										
					    JOptionPane.showMessageDialog(rootPane, "Tu sélectionner une réponse pour la 2 éme question!");
				    else
					    if( !Toux.isSelected() && !rdbtnNewRadioButton_3.isSelected())
											
						    JOptionPane.showMessageDialog(rootPane, "Tu sélectionner une réponse pour la 3 éme question!");
					    else
						    if( !Prblm_resp.isSelected() && !rdbtnNewRadioButton_4.isSelected() )
												
							    JOptionPane.showMessageDialog(rootPane, "Tu sélectionner une réponse pour la 4 éme question!");
				      
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Quest3 frame = new Quest3();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnNewButton.setBounds(314, 616, 109, 34);
		contentPane.add(btnNewButton);
		
		JTextArea txtrAvezVousDautresproblmes = new JTextArea();
		txtrAvezVousDautresproblmes.setEditable(false);
		txtrAvezVousDautresproblmes.setForeground(new Color(0, 0, 0));
		txtrAvezVousDautresproblmes.setBackground(new Color(204, 204, 255));
		txtrAvezVousDautresproblmes.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txtrAvezVousDautresproblmes.setText("4/ Avez vous d'autres probl\u00E8mes \r\n respiratoires ?");
		txtrAvezVousDautresproblmes.setBounds(55, 467, 368, 66);
		contentPane.add(txtrAvezVousDautresproblmes);
	}
}
