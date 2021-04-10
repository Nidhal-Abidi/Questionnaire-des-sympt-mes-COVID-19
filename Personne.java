package projProgr;

import java.io.*;

public class Personne {
	private int cin;
	private String nom ;
	private String prenom ;
	private int age ; 
	private  String gouver ;
	private  String genre ;
	private  Symptomes symptome ;
	
	public Personne() {}
	

	public int getCin() {
		return cin;
	}


	public void setCin(int cin) {
		this.cin = cin;
	}


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGouver() {
		return gouver;
	}

	public void setGouver(String gouver) {
		this.gouver = gouver;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Symptomes getSymptome() {
		return symptome;
	}

	public void setSymptome(Symptomes symptome) {
		this.symptome = symptome;
	}
	
	
	public boolean recherchePersonne ( ) {
		File f=new File("Quest1_data.txt");
		boolean test =false ;
		
		BufferedReader br=null; 
		try {
			br=new BufferedReader(new FileReader(f)) ;
			String line ;
			String [] fields ;
			while ((line =br.readLine())!=null) {
				fields =line.split(" ");
				if (Integer.toString(this.getCin()).equals(fields[0])) {
					test=true ;
					break ;
				}
			}
		}catch(FileNotFoundException e) {
			System.err.println("Fichier non trouvé ");
		}catch(IOException e) {
			System.err.println("Impossible de lire le contenu du fichier !");
		}
		
		
		try {
			br.close();
		}catch(IOException e) {
			System.err.println("Impossible de fermer le fichier !");
		}catch(NullPointerException e) {
			System.err.println("Impossible d'ouvrir le fichier !");
		}
		
		return test ;
	}
 
 	public String personneExiste( ) {
 		File f=new File("Quest1_data.txt");
		
		BufferedReader br=null; 
		try {
			br=new BufferedReader(new FileReader(f)) ;
			String line ;
			String [] fields ;
			String prvlin=null;
			boolean ok=false;
			while ((line =br.readLine())!=null) {
				 if (prvlin != null) {
						fields =prvlin.split("[\\s']");
				    if (Integer.toString(this.getCin()).equals(fields[0])) {
					 ok=true;
					return("\nVos données depuis la derniére réponse a notre questionnaire !"
					+ "\n\nVotre nom et prenom :"+fields[1]+" "+fields[2]+ "\nVotre Gouvernorat :"+fields[4]+"\n\nVos symptomes suite à la derniére  "
					+ "réponse à ce formulaire : \nFievre : "+fields[6]+"\nMal à la tête : "+fields[7]+"\nToux : "+fields[8]+"\nProblémes respiratoires : "
					+fields[9]+"\nDiarrhée : "+fields[10] +"\nFatigue : "+fields[11]
					+"\nArrivé de l'étranger : "+fields[12]
					+"\nPerte odorat : "+fields[13]
					+"\nPerte appetit : "+fields[14]
					+"\n\nVos symptomes suite à la réponse a ce formulaire :\n"
                    +"\nFievre : "+this.change(this.getSymptome().fievre)
					+"\nMal à la tête : "+this.change(this.getSymptome().mal_au_tete)
					+"\nToux : "+this.change(this.getSymptome().toux)
					+"\nProblèmes respiratoires : "+this.change(this.getSymptome().prob_respiratoire)
					+"\nDiarrhée : "+this.change(this.getSymptome().diarrhée)
					+"\nFatigue : "+this.change(this.getSymptome().fatigue)
					+"\nArrivé de l'étranger : "+this.change(this.getSymptome().arrivee_etrange)
					+"\nPerte odorat : "+this.change(this.getSymptome().perte_odorat)
					+"\nPerte appetit : "+this.change(this.getSymptome().perte_appetit));
				}
				 }
				    prvlin = line;
			}
			if (ok==false)
				return("Nouvelle inscripton!");
			
			
			
		}catch(FileNotFoundException e) {
			return("Fichier non trouvé ");
		}catch(IOException e) {
			return("Impossible de lire le contenu du fichier !");
		}
		
		try {
			br.close();
		}catch(IOException e) {
			return("Impossible de fermer le fichier !");
		}catch(NullPointerException e) {
			return("Impossible d'ouvrir le fichier !");
		}
		return("Personne non trouvée!");
		
 	}
 
 	
 	public String change(boolean b) {
 		if (b)
 			return ("Oui");
 		else 
 			return("Non");
 	}
 	
 	
 	
}

