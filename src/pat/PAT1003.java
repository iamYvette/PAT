package pat;

import java.util.Scanner;

public class PAT1003 {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int M = in.nextInt();
        int N = in.nextInt();
        int k=1,count=1;
        boolean isPrime = true;
        for(int i=2;k<=N;i++)
        {
            for(int j=2;j<=(int)Math.sqrt(i);j++)
            {
                if(i%j==0)
                {
                    isPrime=false;
                    break;
                }
            }
            if(isPrime)
            {
                if(k>=M&&k<=N)
                {
                	if(count%10==0)
                	{
                		System.out.print(i);
                		System.out.println();
                		count=0;
                	}
                	else if(count%10!=0)
                		if(k==N)
                			System.out.print(i);
                		else
                			System.out.print(i+" ");
                	count++;              	
                }
                k++;
            }
            isPrime = true;
        }

    }
}