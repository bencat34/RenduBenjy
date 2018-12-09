package monProgramme;

import java.util.Scanner;

public class ex07 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Rentrez un nombre a multiplier SVP");
		int N = sc.nextInt();
		System.out.println("Rentrez le nombre de fois que vous voulez le multiplier SVP");
		int X = sc.nextInt();
		System.out.println("Voici le resultat ;) ");
		for(int i = 1; i <= X; i++ ) 
		{
			
			System.out.println(N * i);
		}
	}
}



