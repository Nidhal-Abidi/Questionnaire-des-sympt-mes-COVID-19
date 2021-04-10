package projProgr;

public class Symptomes {
	 boolean fievre ; 
	 boolean mal_au_tete ;
	 boolean toux ;
	 boolean prob_respiratoire ;
	 boolean diarrh�e ;
	 boolean fatigue ; 
	 boolean arrivee_etrange;
	 boolean perte_odorat;
	 boolean perte_appetit ;
	 
	 
	 public Symptomes() {}
	 
	 public int calcul_prob() {
		 int somme=0;
		 if (this.fievre) {
			 somme+=10;
		 }
		 if (this.mal_au_tete) {
			 somme+=4;
		 }
		 if (this.toux) {
			 somme+=7;
		 }
		 if (this.prob_respiratoire) {
			 somme+=16;
		 }
		 if (this.diarrh�e) {
			 somme+=6;
		 }
		 if (this.fatigue) {
			 somme+=8;
		 }
		 if (this.arrivee_etrange) {
			 somme+=25;
		 }
		 if (this.perte_odorat) {
			 somme+=4;
		 }
		 if (this.perte_appetit) {
			 somme+=5;
		 }
		 return somme;
	 }
	 
	 public String conseils(int n) { 
		 if ( n<=40 ) {
			 return("\nVotre �tat de sant� ne n�cessite aucune intervention ! "
			 		+ "\nRestez chez vous et limiter vos contact avec les autres "
			 		+ "\nRespecter les mesures d'hygi�nes \nPour plus d'informations :"
			 		+ "\nAppeler 80101919 ou tapez *2020# ");
		 }
		 else if (n<=60) {
			return("\nVos sympt�mes indiquent qu�un avis m�dical est n�cessaire !\nMesurez votre temp�rature 2 fois/jours "
					+ "\nPour lutter contre votre fi�vre �viter de prendre des Anti-inflammatoires et prenez du parac�tamol "
					+ "\nNe vous d�placez pas pour aller consulter dans une structure sanitaire priv�e ou publique "
					+ "\nPour rechercher un avis m�dical, appelez votre m�decin traitant ou utilisez le service de t�l�communication"
					+ "\nEn cas d�apparition de signes de gravit�s (difficult�s respiratoire, fi�vre persistante malgr� les antipyr�tiques,�"
					+ "\nS�isoler, portez un masque chirurgical et appelez imm�diatement le 190. Alertez par mail:stopcorona@rns.tn "
					+ "\nPour plus d�informations: Appelez le 80101919 ");
		 }
		 else {
			 return("\nVos sympt�mes n�cessitent une prise en charge rapide !!"
			 		+ "\nSolez-vous et portez un masque chirurgical"
			 		+ "\nNe vous d�placez pas pour aller consulter dans une structure sanitaire priv�e ou publique. Appelez imm�diatement le 190"
			 		+ "\nPour lutter contre votre fi�vre �vitez de prendre des Anti-inflammatoires et prenez du parac�tamol");
		 }
	 }
	 
}
