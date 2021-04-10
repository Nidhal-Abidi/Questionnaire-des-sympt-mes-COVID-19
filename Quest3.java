package projProgr;

import java.awt.*;
import java.io.FileWriter;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Quest3 extends JFrame {

	private JPanel Panel;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private final ButtonGroup buttonGroup_3 = new ButtonGroup();
	private final ButtonGroup buttonGroup_4 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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

	/**
	 * Create the frame.
	 */
	public Quest3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 20,480, 700);
		Panel = new JPanel();
		Panel.setBackground(new Color(204, 204, 255));
		Panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Panel);
		Panel.setLayout(null);
		
		JTextArea txtrAvezVousUne = new JTextArea();
		txtrAvezVousUne.setEditable(false);
		txtrAvezVousUne.setBackground(new Color(204, 204, 255));
		txtrAvezVousUne.setFont(new Font("Tahoma", Font.PLAIN, 21));
		txtrAvezVousUne.setText("5/ Avez vous une diarrh\u00E9e \r\n(au moins 3 selles molles /jour) ?");
		txtrAvezVousUne.setBounds(52, 62, 378, 62);
		Panel.add(txtrAvezVousUne);
		
		JRadioButton diarrhé = new JRadioButton("Oui");
		diarrhé.setBackground(new Color(255, 153, 153));
		buttonGroup.add(diarrhé);
		diarrhé.setFont(new Font("Tahoma", Font.PLAIN, 16));
		diarrhé.setBounds(70, 131, 109, 23);
		Panel.add(diarrhé);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Non");
		rdbtnNewRadioButton_1.setBackground(new Color(204, 255, 153));
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnNewRadioButton_1.setBounds(254, 131, 109, 23);
		Panel.add(rdbtnNewRadioButton_1);
		
		JRadioButton fatigue = new JRadioButton("Oui");
		fatigue.setBackground(new Color(255, 153, 153));
		buttonGroup_1.add(fatigue);
		fatigue.setFont(new Font("Tahoma", Font.PLAIN, 16));
		fatigue.setBounds(70, 216, 109, 23);
		Panel.add(fatigue);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Non");
		rdbtnNewRadioButton_2.setBackground(new Color(204, 255, 153));
		buttonGroup_1.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnNewRadioButton_2.setBounds(254, 216, 109, 23);
		Panel.add(rdbtnNewRadioButton_2);
		
		JRadioButton odorat = new JRadioButton("Oui");
		odorat.setBackground(new Color(255, 153, 153));
		buttonGroup_2.add(odorat);
		odorat.setFont(new Font("Tahoma", Font.PLAIN, 16));
		odorat.setBounds(70, 327, 109, 23);
		Panel.add(odorat);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Non\r\n");
		rdbtnNewRadioButton_3.setBackground(new Color(204, 255, 153));
		buttonGroup_2.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnNewRadioButton_3.setBounds(254, 327, 109, 23);
		Panel.add(rdbtnNewRadioButton_3);
		
		JRadioButton appetit = new JRadioButton("Oui");
		appetit.setBackground(new Color(255, 153, 153));
		buttonGroup_3.add(appetit);
		appetit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		appetit.setBounds(70, 427, 109, 23);
		Panel.add(appetit);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Non");
		rdbtnNewRadioButton_4.setBackground(new Color(204, 255, 153));
		buttonGroup_3.add(rdbtnNewRadioButton_4);
		rdbtnNewRadioButton_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnNewRadioButton_4.setBounds(254, 427, 109, 23);
		Panel.add(rdbtnNewRadioButton_4);
		
		JRadioButton etranger = new JRadioButton("Oui");
		etranger.setBackground(new Color(255, 153, 153));
		buttonGroup_4.add(etranger);
		etranger.setFont(new Font("Tahoma", Font.PLAIN, 16));
		etranger.setBounds(70, 552, 109, 23);
		Panel.add(etranger);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Non");
		rdbtnNewRadioButton_5.setBackground(new Color(204, 255, 153));
		buttonGroup_4.add(rdbtnNewRadioButton_5);
		rdbtnNewRadioButton_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnNewRadioButton_5.setBounds(254, 552, 109, 23);
		Panel.add(rdbtnNewRadioButton_5);
		
		JButton btnNewButton = new JButton("Suivant");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setForeground(new Color(204, 0, 0));
		btnNewButton.setBackground(UIManager.getColor("Button.background"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean drh=diarrhé.isSelected();
				boolean ftg=fatigue.isSelected();
				boolean odr=odorat.isSelected();
				boolean appt=appetit.isSelected();
				boolean etr=etranger.isSelected();
				String fv="Non";
				String ml_t="Non";
				String tou="Non";
				String pb_re="Non";
				String pb="Non";
				if (drh)
					 fv ="Oui";
				if (ftg)
					 ml_t="Oui";
				if (odr)
					tou="Oui";
				if (appt)
					pb_re="Oui";
				if (etr)
					pb="Oui";
				try { 
					FileWriter writer=new FileWriter("Quest1_data.txt",true);
					writer.write(fv+" ");
					writer.write(ml_t+" ");					
					writer.write(tou+" ");
					writer.write(pb_re+" ");
					writer.write(pb+" ");
	     			writer.write(System.getProperty("line.separator"));
					writer.close();
								
				}
				catch (Exception e1)
				{ 
					JOptionPane.showMessageDialog(rootPane,"Erreur");
				}
				
				if( !diarrhé.isSelected() && !rdbtnNewRadioButton_1.isSelected() )
					JOptionPane.showMessageDialog(rootPane, "Tu dois sélectionner une réponse pour la 1er question!");
				else
				    if( !fatigue.isSelected() && !rdbtnNewRadioButton_2.isSelected())
										
					    JOptionPane.showMessageDialog(rootPane, "Tu sélectionner une réponse pour la 2 éme question!");
				    else
					    if( !odorat.isSelected() && !rdbtnNewRadioButton_3.isSelected())
											
						    JOptionPane.showMessageDialog(rootPane, "Tu sélectionner une réponse pour la 3 éme question!");
					    else
						    if( !appetit.isSelected() && !rdbtnNewRadioButton_4.isSelected() )
												
							    JOptionPane.showMessageDialog(rootPane, "Tu sélectionner une réponse pour la 4 éme question!");
						    else
							    if( !etranger.isSelected() && !rdbtnNewRadioButton_5.isSelected() )
													
								    JOptionPane.showMessageDialog(rootPane, "Tu sélectionner une réponse pour la 5 éme question!");
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Quest4 frame = new Quest4();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnNewButton.setBounds(329, 614, 109, 36);
		Panel.add(btnNewButton);
		
		JTextArea txtrAvezVousUne_1 = new JTextArea();
		txtrAvezVousUne_1.setEditable(false);
		txtrAvezVousUne_1.setBackground(new Color(204, 204, 255));
		txtrAvezVousUne_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		txtrAvezVousUne_1.setText("6/ Avez vous une fatigue inhabituelle ?");
		txtrAvezVousUne_1.setBounds(52, 173, 360, 36);
		Panel.add(txtrAvezVousUne_1);
		
		JTextArea txtrAvezVousUne_2 = new JTextArea();
		txtrAvezVousUne_2.setEditable(false);
		txtrAvezVousUne_2.setBackground(new Color(204, 204, 255));
		txtrAvezVousUne_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txtrAvezVousUne_2.setText("7/ Avez vous une perte de l'odorat ?");
		txtrAvezVousUne_2.setBounds(52, 267, 378, 51);
		Panel.add(txtrAvezVousUne_2);
		
		JTextArea txtrAvezVousUne_3 = new JTextArea();
		txtrAvezVousUne_3.setEditable(false);
		txtrAvezVousUne_3.setBackground(new Color(204, 204, 255));
		txtrAvezVousUne_3.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txtrAvezVousUne_3.setText("8/ Avez vous une perte d'appétit ?");
		txtrAvezVousUne_3.setBounds(52, 369, 358, 51);
		Panel.add(txtrAvezVousUne_3);
		
		JTextArea txtrEstCeQue = new JTextArea();
		txtrEstCeQue.setEditable(false);
		txtrEstCeQue.setBackground(new Color(204, 204, 255));
		txtrEstCeQue.setFont(new Font("Tahoma", Font.PLAIN, 19));
		txtrEstCeQue.setText("9/ Est ce que vous \u00E9tiez \u00E0 l'\u00E9tranger dans\r\n les 2 derni\u00E9res semaines ?");
		txtrEstCeQue.setBounds(52, 494, 358, 51);
		Panel.add(txtrEstCeQue);
		
		
		
		
	}
}
