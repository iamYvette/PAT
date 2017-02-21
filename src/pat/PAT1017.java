package pat;

import java.util.Scanner;

public class PAT1017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		String chara = in.next();
		char c = chara.charAt(0);
		int sum = 0;
		int row=1,rest=0;
		if(num ==1){
			System.out.println(c);
			System.out.println('0');
		}
		else{
			
			while(true){
				sum = (1*row+row*(row-1))*2-1;
				if(num<sum)
				{
					break;
				}
				row++;
			}
			int realRow =row-1;
			int initial = 2*realRow-1;
			for(int n = realRow; n>0;n--){
				int t = 2*n-1;
				int spaceNum = initial-t;
				int spaceNum1 = spaceNum/2;
				int spaceNum2 = spaceNum/2;
				while(t>0){
					while((spaceNum1)>0){
						System.out.print(" ");
						spaceNum1--;
					}
					System.out.print(c);
					t--;
				}
				System.out.println();
			}
			for(int n= 2;n<=realRow;n++){
				int t = 2*n-1;
				int spaceNum = initial-t;
				int spaceNum1 = spaceNum/2;
				int spaceNum2 = spaceNum/2;
				while(t>0){
					while((spaceNum1)>0){
						System.out.print(" ");
						spaceNum1--;
					}
					System.out.print(c);
					t--;
				}
				System.out.println();
			}
			rest = num-((realRow+realRow*(realRow-1))*2-1);
			if(rest>0){
				System.out.println(num-((realRow+realRow*(realRow-1))*2-1));
			}
		}
	}

}
