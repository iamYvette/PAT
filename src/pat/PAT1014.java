package pat;

import java.util.Scanner;

public class PAT1014 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String input = in.next();
		int base = input.indexOf("E");
		int num = Integer.parseInt(input.substring(base+2, input.length()));
		int num2 = input.substring(input.indexOf(".")+1,base).length();
		if(input.charAt(0)=='-'){
			System.out.print('-');
		}
		if(input.charAt(base+1)=='-'){
			System.out.print("0.");
			num--;
			while(num!=0){
				System.out.print("0");
				num--;
			}
			for(int i=1;i<base;i++){		
				if(input.charAt(i)>='0'&&input.charAt(i)<='9'){
					System.out.print(input.charAt(i));
				}
			}
		}else if(input.charAt(base+1)=='+'){
			int a = num-num2;
			for(int i=1;i<base;i++){		
				if(input.charAt(i)>='0'&&input.charAt(i)<='9'){
					System.out.print(input.charAt(i));
				}
			}
			while(a!=0){
				System.out.print("0");
				a--;
			}
		}
	}

}
