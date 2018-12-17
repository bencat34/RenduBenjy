package monProgramme;

import java.util.Scanner;

class ex15 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("veuillez saisir un mot SVP ");//j'imprime a l'ecran 
		String mot = sc.nextLine();// je demande a l'utilisateur de rentrer un mot.
		int convert = mot.length();// je converti ma chaine de caractere en int
		String result1 = mot.substring(convert -3);// j'enleve les trois derniers caractere de la chaine
		
			System.out.println("la premiere partie de l'exercice est : ("+result1+") <---");
			if (convert < 6)
			{
				System.out.println("pas assez de lettre pour la deuxieme partie");
			}
			else
			{
				String result2 = mot.substring(2,convert -3); /*j'enleve les 2 premiers et les trois derniers caractere
																de la chaine*/
				System.out.println("la deuxieme partie de l'exercice est : ("+result2+") <---");
			}
		sc .close();
	}
}