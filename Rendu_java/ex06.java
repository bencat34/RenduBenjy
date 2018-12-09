package monProgramme;
import java.util.Scanner;
public class ex06 
{
	
	
	
			public static void main(String[] args) 
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("Rentrez un premier nombre SVP");
				int Nombre1 = sc.nextInt();
				System.out.println("Rentrez un deuxieme nombre SVP");
				int Nombre2 = sc.nextInt();
				System.out.println("rentrez un operateur");
				sc.nextLine();
				String operateur = sc.nextLine();
				if((Nombre1 >= -1000) && (Nombre1 <= 1000) && (Nombre2 >= -1000) && (Nombre2 <= 1000)) 

				switch(operateur) 
				{
					case "+":
						System.out.println(Nombre1 + Nombre2);
						break;
					case "-":
						System.out.println(Nombre1 - Nombre2);
						break;
					case "*":
						System.out.println(Nombre1 * Nombre2);
						break;
					case "/":
						if((Nombre1 == 0 || Nombre2 == 0)) 
						{
							System.out.println("impossible de diviser par 0");
						}
						else
						System.out.println(Nombre1 / Nombre2);
						break;
					default :
						System.out.println("veuillez saisir un operateur valide +,-,/,* une addition est effectué");
						System.out.println(Nombre1 + Nombre2);
						
						
				}
			else
			{
				System.out.println("nombre trop grand");
			}
		}
}

