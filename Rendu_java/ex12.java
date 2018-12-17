package monProgramme;

public class ex12 
{
	public static void main (String[] args)
	{
		int tab1[] = new int [5];
		for(int i = 0; i < tab1.length;i++)
		{
			tab1[i] = (int) (Math.random() *10 + 1);
			System.out.println(tab1[i]);
		}
		System.out.println("");
		for(int x = 0; x < tab1.length; x++)
		{
			if (tab1[x] == 4)
			{
				System.out.println("il y a un 4 dans la case " + (x+1));
			}
		}
	}
}
