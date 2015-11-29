/**
 * Autor kodu: Sewery Adamczyk
 * Pochodzenie: http://pl.spoj.com/problems/JPESEL/
 */

import java.util.*;

public class Main {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();
		in.nextLine();
		for(int i=0; i<t; i++)
		{
			String PESEL = in.nextLine();
			
			int suma = 0;
			char litera;
			
			for(int j=0; j<11; j++)
			{
				int liczba=0;
				litera = PESEL.charAt(j);
				liczba = Character.getNumericValue(litera);
				if(j == 1) // druga cyfra
				{
					liczba = liczba*3;
				}
				if(j == 2) // trzecia cyfra
				{
					liczba = liczba*7;
				}
				if(j == 3) // czwarta cyfra
				{
					liczba = liczba*9;
				}
				if(j == 5) // szósta cyfra
				{
					liczba = liczba*3;
				}
				if(j == 6) // siódma cyfra
				{
					liczba = liczba*7;
				}
				if(j == 7) // ósma cyfra
				{
					liczba = liczba*9;
				}
				if(j == 9) // dziesi¹ta cyfra
				{
					liczba = liczba*3;
				}
				suma = suma + liczba;
			}
			if(suma%10 == 0)
			{
				System.out.println("D");
			}
			else
			{
				System.out.println("N");
			}
			
			
		}
		
		in.close();
	}

}

