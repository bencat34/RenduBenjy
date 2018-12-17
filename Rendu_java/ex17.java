package monProgramme;

import java.util.Scanner;

class ex17 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("rentre le mot a trouvé ");
		String motCacher = sc.nextLine().toLowerCase();
		int debuti =motCacher.length() ;
		int conteur = 0;
		while (conteur < 5)
		{	 
			System.out.println("veuillez saisir une lettre "); 
				   String lettre = sc.nextLine().toLowerCase();
				
				int fin = lettre.length();
			for (int i= 0; i < debuti;i++)
			{
				
				  
				
				if (lettre.charAt(fin) == motCacher.charAt(debuti))//String lettremin = lettremin
				{
					System.out.println("y a pas "+ conteur + "/ 5");
					conteur++;
					
				}
				else //if (lettre.charAt(fin) <= motCacher.charAt(debuti))
				{
					System.out.println("il y as une lettre pareil"+ fin);
					
				}	
				 
			}	
		}
		sc.close();
	}
}


