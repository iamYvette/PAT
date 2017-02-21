package pat;

import java.util.Scanner;

public class PAT1016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int c1 = in.nextInt();
		int c2 = in.nextInt();
		final int CLK_TCK = 100;
		int Second = Math.round((float)(c2-c1)/CLK_TCK);
		int second = Second%60;
		int Minute = Second/60;
		int minute = Minute%60;
		int hour = Minute/60;
		if(hour<10)
			System.out.print("0"+hour+":");
		else
			System.out.print(hour+":");
		if(minute<10)
			System.out.print("0"+minute+":");
		else
			System.out.print(minute+":");
		if(second<10)
			System.out.print("0"+second);
		else
			System.out.print(second);
		
		
	}

}
