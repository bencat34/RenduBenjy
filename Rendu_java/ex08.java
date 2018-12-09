package monProgramme;

import java.util.Scanner;

public class ex08 
{
	public static void main(String[] args) 
	{	
		int i = 1;
		int count = 0;
		int saisi = 1;
		Scanner sc = new Scanner(System.in);
		while( i <= 3)
		{
			System.out.println("rentre ton age "+ i);
			 saisi = sc.nextInt();
			 if (saisi < 20)
				{
					count++;
				}
			 i++;		
		}
		System.out.println("Il y a " + count + " personnes de moin de 20 ans");
	}
}