package monProgramme;
import java.util.Scanner;

public class ex13 
{
	public static void main(String[] args)
	{
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("veuillez saisir un mot SVP ");
		String mot = sc.nextLine();
		System.out.println("veuillez saisir une lettre SVP ");
		String lettre = sc.nextLine();
		System.out.println();
		for(int i = 0; i < mot.length();i++)
		{
			//System.out.println(mot.charAt(i));
			
			if(mot.charAt(i) == lettre.charAt(0))
			{
				count++;
			}
		}
		System.out.println("il y a "+ count+" "+ lettre + " dans la chaine ");
		sc.close();
	}
}
