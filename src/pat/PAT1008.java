package pat;

import java.util.HashMap;
import java.util.Scanner;

public class PAT1008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int Awin = 0;
		int Bwin = 0;
		int Alose =0;
		int Blose =0;
		int Adraw =0;
		int Bdraw = 0;
		int AC=0,AB=0,AJ=0,BC=0,BB=0,BJ=0;
		while(num>0)
		{
			
			String a = in.next();
			String b = in.next();
			char A = a.charAt(0);
			char B = b.charAt(0);
			if(A=='C'&&B=='C')
			{
				Adraw++;
				Bdraw++;
			}
			else if(A=='C'&&B=='B')
			{
				Alose++;
				Bwin++;
				BB++;
			}
			else if(A=='C'&&B=='J')
			{
				Awin++;
				Blose++;
				AC++;
			}
			else if(A=='B'&&B=='C')
			{
				Awin++;
				Blose++;
				AB++;
			}		
			else if(A=='B'&&B=='B')
			{
				Adraw++;
				Bdraw++;
			}	
			else if(A=='B'&&B=='J')
			{
				Alose++;
				Bwin++;
				BJ++;
			}
			else if(A=='J'&&B=='C')
			{
				Alose++;
				Bwin++;
				BC++;
			}
			else if(A=='J'&&B=='B')
			{
				Awin++;
				Blose++;
				AJ++;
			}
			else if(A=='J'&&B=='J')
			{
				Adraw++;
				Bdraw++;
			}
			num--;	
		}
		System.out.println(Awin+" "+Adraw+" "+Alose);
		System.out.println(Bwin+" "+Bdraw+" "+Blose);
		if(AC>AB)
		{
			if(AC>=AJ)
			{
				System.out.print("C");
			}
			else
			{
				System.out.print("J");
			}
		}
		else if(AB>=AC)
		{
			if(AB>=AJ)
			{
				System.out.print("B");
			}
			else
			{
				System.out.print("J");
			}
		}
		System.out.print(" ");
		if(BC>BB)
		{
			if(BC>=BJ)
			{
				System.out.print("C");
			}
			else
			{
				System.out.print("J");
			}
		}
		else if(BB>=BC)
		{
			if(BB>=BJ)
			{
				System.out.print("B");
			}
			else
			{
				System.out.print("J");
			}
		}
		
	}

}
