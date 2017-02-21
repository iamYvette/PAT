package pat;

import java.util.Scanner;

public class PAT1009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		do{
			int[] a = new int[4];
			for(int i=0;i<a.length;i++){
				a[i] = n%10;
				n=n/10;
			}
			int high =shengxu(a);
			int low =jiangxu(a);
			n = high-low;
			System.out.printf("%04d - %04d = %04d\n", high,low,n);
			if(n==0){
				break;
			}		
		}while(n!=6174);
	}
	public static int shengxu(int[] a){
		int length = a.length, temp ,low=0;
		for(int i=0;i<length;i++)
		{
			for(int j=i;j<length;j++){
				if(a[i]>a[j]){
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		for(int i=length-1;i>=0;i--){
			low = low+a[i]*(int)Math.pow(10, i);
		}
		return low;
	}
	public static int jiangxu(int[] a){
		int length = a.length, temp, high=0;
		for(int i=0;i<length;i++)
		{
			for(int j=i;j<length;j++){
				if(a[j]>a[i]){
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		for(int i=length-1;i>=0;i--){
			high = high +a[i]*(int)Math.pow(10, i);
		}
		return high;
	}
}
