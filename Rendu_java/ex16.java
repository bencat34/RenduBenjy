package monProgramme;
import java.util.Scanner;
class ex16 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("veuillez saisir un mot SVP ");//j'imprime a l'ecran 
		String mot = sc.nextLine();
		String motmin = mot.toLowerCase();
		boolean pal = true;
		int debut = 0;
		int  fin = motmin.length()-1; 
		while (debut < fin && pal)
		{
			if (motmin.charAt(debut) != motmin.charAt(fin))
			{
				pal = false;
			}
			fin--;
			debut++;
		}
		 
		if (pal)
		{
			System.out.println("pal");//j'imprime a l'ecran
		}
		else
			System.out.println("pas pal ");//j'imprime a l'ecran
		sc.close();
	}
}
