package projProgr;

public class Symptomes {
	 boolean fievre ; 
	 boolean mal_au_tete ;
	 boolean toux ;
	 boolean prob_respiratoire ;
	 boolean diarrhée ;
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
		 if (this.diarrhée) {
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
			 return("\nVotre état de santé ne nécessite aucune intervention ! "
			 		+ "\nRestez chez vous et limiter vos contact avec les autres "
			 		+ "\nRespecter les mesures d'hygiénes \nPour plus d'informations :"
			 		+ "\nAppeler 80101919 ou tapez *2020# ");
		 }
		 else if (n<=60) {
			return("\nVos symptômes indiquent qu’un avis médical est nécessaire !\nMesurez votre température 2 fois/jours "
					+ "\nPour lutter contre votre fièvre éviter de prendre des Anti-inflammatoires et prenez du paracétamol "
					+ "\nNe vous déplacez pas pour aller consulter dans une structure sanitaire privée ou publique "
					+ "\nPour rechercher un avis médical, appelez votre médecin traitant ou utilisez le service de télécommunication"
					+ "\nEn cas d’apparition de signes de gravités (difficultés respiratoire, fièvre persistante malgré les antipyrétiques,…"
					+ "\nS’isoler, portez un masque chirurgical et appelez immédiatement le 190. Alertez par mail:stopcorona@rns.tn "
					+ "\nPour plus d’informations: Appelez le 80101919 ");
		 }
		 else {
			 return("\nVos symptômes nécessitent une prise en charge rapide !!"
			 		+ "\nSolez-vous et portez un masque chirurgical"
			 		+ "\nNe vous déplacez pas pour aller consulter dans une structure sanitaire privée ou publique. Appelez immédiatement le 190"
			 		+ "\nPour lutter contre votre fièvre évitez de prendre des Anti-inflammatoires et prenez du paracétamol");
		 }
	 }
	 
}
