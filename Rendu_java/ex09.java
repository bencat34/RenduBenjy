package monProgramme;

import java.util.Scanner;

public class ex09 
{
	public static void main(String[] args) 
	{	//Je déclare les variables et leurs donne une (valeur = initialiser)
		int nbr_util = 1;
		int count0_20 = 0;
		int count21_40 = 0;
		int count41_100 = 0;
		int saisie_util = 1;
		int util100 = 0;
		var sc = new Scanner(System.in);// J'ouvre le scanner
		while( nbr_util <= 20)//J'ouvre une boucle avec les parametres souhaiter
		{					//Dans cette boucle nous pouvons faire plein de choses :)
			System.out.println("rentre ton age STP "+ nbr_util);//je demande a l'utilisateur de saisir son age
			saisie_util = sc.nextInt();							//j'utilise la variable pour la retenir 
			 if (saisie_util <= 100)							// sur cette ligne je teste si l'age est inferieur à 100 
			 {							// SI l'age est inferieur SEULEMENT SI 	 
				 if((saisie_util > 0) && (saisie_util < 20 )) 
				 {
					 count0_20++;
				 }
				 else if((saisie_util >= 20) && (saisie_util < 40 ))
				 {
					 count21_40++;
				 }
				 else if((saisie_util >= 40) && (saisie_util <= 100 ))
				 {
					 count41_100++;
				 } 
			 }
			 else
			 {
				    util100++;
					System.out.println("vous etes trop vieux !!!");
					break;
			 }
			nbr_util++;
			 }
			 System.out.println("Il y a " + count0_20 + " personnes entre 0 et 19 ans");
			 System.out.println("Il y a " + count21_40 + " personnes entre 20 et 40 ans");
			 System.out.println("Il y a " + count41_100 + " personnes entre 40 et 100 ans");
			 System.out.println("il y a "+ util100 +  " personnes de plus de 100 ans " );
		}
}
