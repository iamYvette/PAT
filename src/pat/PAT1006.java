package pat;

import java.util.Scanner;

public class PAT1006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String A = in.next();
		String DA = in.next();
		String B = in.next();
		String DB = in.next();
		int A1[] = new int[A.length()];
		int B1[] = new int[B.length()];
		int a = A.indexOf(DA);
		int b = B.indexOf(DB);
		int i=0,j=0;
		int da = 0;
		int db = 0;
		while(a!=-1)
		{
			A1[i]=Integer.parseInt(DA);
			a = DA.length()+a;
			a = A.indexOf(DA, a);
			da = da+A1[i]*(int)Math.pow(10, i);
			i++;
		}
		while(b!=-1)
		{
			B1[j]=Integer.parseInt(DB);
			b = DB.length()+b;
			b = B.indexOf(DB, b);
			db = db+B1[j]*(int)Math.pow(10, j);
			j++;
		}
		int sum = da+db;
		System.out.println((sum));
		
	}

}
