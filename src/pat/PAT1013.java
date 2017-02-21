package pat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PAT1013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
//		String str ="0123456789";
		Integer[] a = new Integer[10];
		for(int i=0;i<a.length;i++){
			a[i] = in.nextInt();
		}
		for(int i=1;i<a.length;i++){
			if(a[i]!=0){
				System.out.print(i);
				a[i]--;
				break;
			}
		}
		for(int i=0;i<a.length;i++){
			for(int j=a[i];j>0;j--){
				System.out.print(i);
			}
		}
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		for(int i=0;i<a.length;i++){
//			int count = a[i];
//			while(count!=0){
//				list.add((int)(str.charAt(i)-'0'));
//				count--;
//			}			
//		}
//		Collections.sort(list);
//		if(list.get(0)==0){
//			for(int i=1;i<list.size();i++){
//				if(list.get(i)!=0){
//					int temp = list.get(i);
//					list.set(i, list.get(0));
//					list.set(0, temp);
//					break;		
//				}
//			}
//		}
//		for(int k:list){
//			System.out.print(k);
//		}
		
	}

}
