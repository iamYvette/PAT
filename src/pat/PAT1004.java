package pat;

import java.util.Scanner;

public class PAT1004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String A1 = in.next();
		String A2 = in.next();
		String B1 = in.next();
		String B2 = in.next();
		char d,date = 'A',hour = '0';
		int minute=0;
		loop:
		for(int i=0;i<A1.length();i++)
		{
			if(Character.isUpperCase(A1.charAt(i)))
				{
					d=A1.charAt(i);
					if(A2.charAt(i)==d)
					{
						date = d;
						for(int j = A1.indexOf(d)+1;j<A1.length();j++)
						{
							if(A1.charAt(j)==A2.charAt(j))
							{
								hour = A1.charAt(j);
								break loop;
							}
								
						}
					}
				}
		}
		for(int i=0;i<B1.length();i++)
		{
			if((B1.charAt(i)>='A'&&B1.charAt(i)<='Z')||(B1.charAt(i)>='a'&&B1.charAt(i)<='z'))
			{
				if(B1.charAt(i)==B2.charAt(i))
				{	
					minute = i;
					break;
				}
			}
			
		}
		switch(date)
		{
			case 'A' : System.out.print("MON");break;
			case 'B' : System.out.print("TUE");break;
			case 'C' : System.out.print("WED");break;
			case 'D' : System.out.print("THU");break;
			case 'E' : System.out.print("FRI");break;
			case 'F' : System.out.print("SAT");break;
			case 'G' : System.out.print("SUN");break;
		}
		System.out.print(" ");
		switch(hour)
		{
			case '0' :System.out.print("00");break;
			case '1' :System.out.print("01");break;
			case '2' :System.out.print("02");break;
			case '3' :System.out.print("03");break;
			case '4' :System.out.print("04");break;
			case '5' :System.out.print("05");break;
			case '6' :System.out.print("06");break;
			case '7' :System.out.print("07");break;
			case '8' :System.out.print("08");break;
			case '9' :System.out.print("09");break;
			case 'A' :System.out.print("10");break;
			case 'B' :System.out.print("11");break;
			case 'C' :System.out.print("12");break;
			case 'D' :System.out.print("13");break;
			case 'E' :System.out.print("14");break;
			case 'F' :System.out.print("15");break;
			case 'G' :System.out.print("16");break;
			case 'H' :System.out.print("17");break;
			case 'I' :System.out.print("18");break;
			case 'J' :System.out.print("19");break;
			case 'K' :System.out.print("20");break;
			case 'L' :System.out.print("21");break;
			case 'M' :System.out.print("22");break;
			case 'N' :System.out.print("23");break;
		}
		System.out.print(":");
		if(minute<10)
			System.out.print("0"+minute);
		else
			System.out.print(minute);
	}

}
