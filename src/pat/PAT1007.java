package pat;

import java.util.Scanner;


public class PAT1007 {
	public static int divider(int r,int num,int b)
	{
		int x = r*10+num;
		int q = x%b;
		return q;
	}
	public static int divideq(int r, int num, int b)
	{
		int x = r*10+num;
		return x/b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String a = in.next();
		int B = in.nextInt();
		char[] a1 = new char[a.length()];
		int[] A = new int[a.length()];
		int[] Q = new int[a.length()];
		int r =0, j=0;
		for(int i=0;i<a.length();i++)
		{
			a1[i]=a.charAt(i);
			A[i]=(int)a1[i]-48;
		}
		while(j< A.length)
		{
			Q[j]=divideq(r,A[j],B);
			r = divider(r, A[j],B);
			j++;
			}
	
		if(Q[0]!=0)
		{
			for(int i =0;i<Q.length;i++)
				System.out.print(Q[i]);
		}
		else if(Q[0]==0)
		{
			if(Q.length>1)
			{
				for(int i=1;i<Q.length;i++)
					System.out.print(Q[i]);
			}
			else if(Q.length==1)
				System.out.print(Q[0]);
		}
		System.out.print(" "+r);
		}
	}


