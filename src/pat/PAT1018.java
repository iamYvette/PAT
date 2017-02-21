package pat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PAT1018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		ArrayList<residentInfo> list = new ArrayList<residentInfo>();
		for(int k=0;k<num;k++){
			String name = in.next();
			String birth = in.next();
			String[] birthSpilt = birth.split("/");
			if((birth.compareTo("2014/09/06")<1)&&(birth.compareTo("1814/09/06"))>-1)
			{
				list.add(new residentInfo(name,birth));		
			}
		}
		System.out.print(list.size()+" "+Collections.max(list)+" "+Collections.min(list));
		
	}

}
class residentInfo implements Comparable<residentInfo>{
	private String name;
	private String birthday;
	public residentInfo(String n , String b){
		this.name = n;
		this.birthday = b;
	}
	public int compareTo(residentInfo r){
		return -(this.birthday.compareTo(r.birthday));
	}
	public String toString(){
		return this.name;
	}
	
}
