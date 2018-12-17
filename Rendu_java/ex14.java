package monProgramme;

import java.util.Scanner;

class ex14 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("veuillez saisir un mot SVP ");
		String mot = sc.nextLine();
		String lettre = mot.substring(0,1).toUpperCase() + mot.substring(1).toLowerCase();
		System.out.println(lettre);
		sc .close();
	}
}
