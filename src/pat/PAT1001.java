package pat;

import java.util.Scanner;

public class PAT1001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		String answer[]= new String[T];
		for(int i=0;i<T;i++)
		{
			long A = in.nextLong();
			long B = in.nextLong();
			long C = in.nextLong();
			if(A+B>C)
				answer[i]="true";
			else
				answer[i]="false";
			
		}
		for(int i=0;i<answer.length;i++)
		{
			System.out.println("Case #"+(i+1)+": "+answer[i]);
		}
	}

}
