package monProgramme;

import java.util.Scanner;

public class ex05 
{
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("quelle table voulez vous ? ;)");
			int table = sc.nextInt();
			if(table >1000) 
			{
				System.out.println("nombre trop grand");
			}
			else
			for(int i = 0; i<=10; i++) 
			{
				System.out.println(i * table);
			}
		}
}

