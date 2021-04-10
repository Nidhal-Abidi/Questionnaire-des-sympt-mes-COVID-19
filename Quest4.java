package projProgr;

import java.io.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

import java.awt.event.*;


public class Quest4 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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

	/**
	 * Create the frame.
	 */
	public Quest4() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100,720,480);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Personne p=new Personne();
		Symptomes s=new Symptomes();
		
		 
		JButton btnNewButton = new JButton("Afficher le r\u00E9sultat !");
		btnNewButton.setBorder(new CompoundBorder());
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBackground(new Color(204, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
try {
		         
		            FileReader file = new FileReader("Quest1_data.txt");
		            BufferedReader reader = new BufferedReader(file);
		            
		           for (String line = reader.readLine(); line != null; line = reader.readLine())
		            	{           	              
		            	 String [] words=line.split("[\\s']");
		            	 p.setCin(Integer.parseInt(words[0]));
		            	 p.setNom(words[1]);
		            	 p.setPrenom(words[2]);
		            	 p.setAge(Integer.parseInt(words[3]));
		            	 p.setGouver(words[4]);
		            	 p.setGenre(words[5]);
		            	 if (words[6].equals("Oui")) {
		         			s.fievre=true;
		         		}
		         		else {
		         			s.fievre=false ;
		         		}
		            	 if (words[7].equals("Oui")) {
		         			s.mal_au_tete=true;
		         		}
		         		else {
		         			s.mal_au_tete=false ;
		         		}
		            	 if (words[8].equals("Oui")) {
		         			s.toux=true;
		         		}
		         		else {
		         			s.toux=false ;
		         		}
		            	 if (words[9].equals("Oui")) {
		         			s.prob_respiratoire=true;
		         		}
		         		else {
		         			s.prob_respiratoire=false ;
		         		}
		            	 if (words[10].equals("Oui")) {
		         			s.diarrhée=true;
		         		}
		         		else {
		         			s.diarrhée=false ;
		         		}
		            	 if (words[11].equals("Oui")) {
		         			s.fatigue=true;
		         		}
		         		else {
		         			s.fatigue=false ;
		         		}
		            	 if (words[12].equals("Oui")) {
		         			s.perte_odorat=true;
		         		}
		         		else {
		         			s.perte_odorat=false ;
		         		}
		            	 if (words[13].equals("Oui")) {
		         			s.perte_appetit=true;
		         		}
		         		else {
		         			s.perte_appetit=false ;
		         		}
		            	 if (words[14].equals("Oui")) {
		         			s.arrivee_etrange=true;
		         		}
		         		else {
		         			s.arrivee_etrange=false ;
		         		}	        			             		           				  
		              } 
		           p.setSymptome(s);
		          int proba=p.getSymptome().calcul_prob();
		            String msg=Integer.toString( proba);
		            	
		             file.close();
		             JOptionPane.showMessageDialog(rootPane, p.personneExiste());
		            JOptionPane.showMessageDialog(rootPane, "La probabilité d'étre  atteint est à peu prés "+msg+"%"+p.getSymptome().conseils(proba));
	           	 
		 	            } 
			 
		       	 
		        catch (IOException e4) {
		        	
		            System.err.println("Error dans le fichier Quest1_data " );
		        
				  }  
                    
		}
		});
		btnNewButton.setForeground(new Color(0, 204, 204));
		btnNewButton.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 26));
		btnNewButton.setBounds(193, 300, 346, 65);
		contentPane.add(btnNewButton);
		
		JTextArea txtrVousAvezRempli = new JTextArea();
		txtrVousAvezRempli.setEditable(false);
		txtrVousAvezRempli.setBackground(new Color(204, 204, 204));
		txtrVousAvezRempli.setFont(new Font("Tahoma", Font.PLAIN, 34));
		txtrVousAvezRempli.setText("   Vous avez rempli le questionnaire \r\n     avec succ\u00E8s cliquer ci-dessous \r\n            pour avoir le r\u00E9sultat\r\n                de votre  test!");
		txtrVousAvezRempli.setBounds(30, 51, 587, 193);
		contentPane.add(txtrVousAvezRempli);

	}
}
