package pat;

import java.util.Scanner;

public class PAT1011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int j;
		String num = in.next();
		int[] count = {0,0,0,0,0,0,0,0,0,0};
		for(int i=0;i<num.length();i++){
			count[(int)(num.charAt(i)-'0')]++;
		}
		for(int i=0;i<count.length;i++)
		{
			if(count[i]!=0)
				System.out.println(i+":"+count[i]);
		}
	}

}
