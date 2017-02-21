package pat;
import java.util.ArrayList;
import java.util.Scanner;

public class PAT1019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String line1 = in.next().toUpperCase();
		String line2 = in.next().toUpperCase();
		ArrayList<Character> c = new ArrayList<Character>();
		for(int i=0;i<line1.length();i++){
			if(line2.indexOf(line1.charAt(i))==-1){
				if(!c.contains(line1.charAt(i))){
					c.add(line1.charAt(i));
				}
			}
		}
		for(char k:c){
			System.out.print(k);
		}
	}

}
