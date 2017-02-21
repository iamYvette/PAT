package pat;

import java.util.ArrayList;
import java.util.Scanner;

public class PAT1012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		int D = in.nextInt();
		int sum = A+B;
		int temp = 0;
		int finalNum = 0;
		ArrayList<Integer> numElem = new ArrayList<Integer>();
		while(sum!=0){
			temp = sum%D;
			sum = sum/D;
			numElem.add(temp);
		}
		for(int k=numElem.size()-1;k>=0;k--)
		{
			System.out.print(numElem.get(k));
		}
	}

}
