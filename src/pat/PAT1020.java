package pat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PAT1020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int p = in.nextInt();
		ArrayList<Integer> num = new ArrayList<Integer>();
		int max =N;
		int min =N;
		int length = 0;
		for(int i=0;i<N;i++){
			num.add(in.nextInt());
		}
		Collections.sort(num);
		for(int i=num.size()-1;i>=0;i--){
			for(int j=min-1;j>=0;j--){
				if(num.get(i)<num.get(j)*p){
					max = i;
					min = j;
				}
			}
			if(length<(max-min+1))
			{
				length = max-min+1;	
			}
			
		}
		System.out.println(length);
	
	}

}
