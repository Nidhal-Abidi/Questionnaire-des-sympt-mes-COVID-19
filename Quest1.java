package projProgr;

import java.awt.*;
import java.io.FileWriter;
import java.awt.event.*;
import javax.swing.*;

public class Quest1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel_2;
	public String v1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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

	/**
	 * Create the frame.
	 */
	public Quest1() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 20,480, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 255));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDonnerVotreCin = new JLabel("Donner votre CIN:");
		lblDonnerVotreCin.setForeground(new Color(204, 0, 0));
		lblDonnerVotreCin.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblDonnerVotreCin.setBounds(77, 38, 307, 42);
		contentPane.add(lblDonnerVotreCin);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(74, 91, 271, 30);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel = new JLabel("Donner votre nom:");
		lblNewLabel.setBounds(77, 140, 307, 42);
		lblNewLabel.setForeground(new Color(204, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(74, 203, 271, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Donner Votre pr\u00E9nom:");
		lblNewLabel_1.setBounds(72, 244, 281, 30);
		lblNewLabel_1.setForeground(new Color(204, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(74, 285, 271, 30);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		v1 =textField_1.getText();

		
		lblNewLabel_2 = new JLabel("Donner votre age:");
		lblNewLabel_2.setBounds(74, 326, 235, 30);
		lblNewLabel_2.setForeground(new Color(204, 0, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		contentPane.add(lblNewLabel_2);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(82, 367, 49, 30);
		spinner.setFont(new Font("Tahoma", Font.PLAIN, 24));
		spinner.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		contentPane.add(spinner);
		
		JLabel lblNewLabel_3 = new JLabel("Choisir votre gouvernorat : ");
		lblNewLabel_3.setBounds(74, 408, 328, 30);
		lblNewLabel_3.setForeground(new Color(204, 0, 0));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 24));
		contentPane.add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(74, 449, 299, 42);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 24));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Ariana", "B\u00E9ja", "Ben Arous", "Bizerte", "Gab\u00E8s", "Gafsa", "Jendouba", "Kairouan", "Kasserine", "K\u00E9bili", "Kef", "Mahdia", "Manouba", "M\u00E9denine", "Monastir", "Nabeul", "Sfax", "Sidi Bouzid", "Siliana", "Sousse", "Tataouine", "Tozeur", "Tunis", "Zaghouan"}));
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_4 = new JLabel("Quel est votre genre:");
		lblNewLabel_4.setBounds(74, 502, 281, 30);
		lblNewLabel_4.setForeground(new Color(204, 0, 0));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 24));
		contentPane.add(lblNewLabel_4);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(82, 554, 165, 35);
		comboBox_1.setBackground(UIManager.getColor("Button.background"));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "Feminin", "Masculin"}));
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		contentPane.add(comboBox_1);
		
		JButton btnNewButton = new JButton("Suivant");
		btnNewButton.setBounds(289, 608, 136, 42);
		btnNewButton.setBackground(UIManager.getColor("Button.background"));
		btnNewButton.setForeground(new Color(204, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			
			
		public void actionPerformed(ActionEvent e) {
				try{
			    int cin=Integer.parseInt(textField_2.getText());									
				String nom=textField.getText();
				String prenom=textField_1.getText();
				Integer age = (Integer)spinner.getValue();
				String gouvernorat = (String)comboBox.getSelectedItem().toString();
				String genre = (String)comboBox_1.getSelectedItem().toString();
	
					FileWriter writer=new FileWriter("Quest1_data.txt",true);
					writer.write(cin+" ");
					writer.write(nom+" ");
					writer.write(prenom+" ");
					writer.write(age.toString()+" ");
					writer.write(gouvernorat+" ");
					writer.write(genre+" ");
					writer.close();
					if( !textField_2.getText().isEmpty()  ) {
						   if(  textField.getText().isEmpty())
							        JOptionPane.showMessageDialog(rootPane, "Tu dois saisir le nom");
						         else
						               if(  textField_1.getText().isEmpty())
												
							              JOptionPane.showMessageDialog(rootPane, "Tu dois saisir le prénom");
						}
						
				}		
				
				catch (Exception e1)
				{ 
					JOptionPane.showMessageDialog(rootPane,"Tu dois remplir le 1er champs et qu'avec 8  chiffres ");
					
				}
				
				
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			
	public void mouseClicked(MouseEvent e) {
				dispose();
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
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		contentPane.add(btnNewButton);
		
		
	}
}
