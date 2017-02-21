package pat;

import java.util.Scanner;

public class PAT1002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int[] A2= new int[num];
		int x=0, r=0, j=0, k=0, q=0;
		int sum0=0,sum1=0,sum3=0;
		for(int i=0;i<num;i++)
		{
			int a=in.nextInt();
			if(a%5==0&&a%2==0)
				{
					sum0=sum0+a;
					x++;
				}
			else if(a%5==1)
			{
				A2[r]=a;
				r++;			
			}
			else if(a%5==2)
				j++;
			else if(a%5==3)
			{
				sum3 = sum3+a;
				k++;
			}
			else if(a%5==4)
			{
				if(a>q)
					q=a;
			}
				
		}
		for(int i=0;i<A2.length;i++)
		{
			sum1=sum1+A2[i]*(int)Math.pow(-1, i);
		}
		if(x==0)
			System.out.print("N"+" ");			
		else
			System.out.print(sum0+" ");
		if(r==0)
			System.out.print("N"+" ");
		else
			System.out.print(sum1+" ");
		if(j==0)
			System.out.print("N"+" ");
		else
			System.out.print(j+" ");
		if(k==0)
			System.out.print("N");
		else
			System.out.printf("%.1f",(double)sum3/k);
		if(q==0)
			System.out.print(" "+"N");
		else
			System.out.print(" "+q);
		
	}

}
