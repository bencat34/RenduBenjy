package monProgramme;

public class ex10 
{
	public static void main (String[] args) 
	{
		int tab1[] = {4,67,25,87};
		double tab2[] = {4.5, 67, 25.50, 87.00};
		char tab3[] = {'r', '2', '?' , '+'};
		String tab4[] = {"Robert","Noemie", "David" , "Bertrand"};
		
		System.out.println("1er emplacement tab1 "+ tab1[0]);
		System.out.println("avant transformation du 2ème emplacement de tab1 "+ tab1[2]);
		tab1[2] = 42;
		System.out.println("apres transformation du 2ème emplacement de tab1 " +tab1[2]);
		System.out.println("le contenue du tab3 est ");
		for(int i = 0; i < 4; i++)
		{
			System.out.println(tab3[i]);
		}
		System.out.println(tab1.length);
		System.out.println(tab2[3]+" "+ tab4[2]);
	}
}
