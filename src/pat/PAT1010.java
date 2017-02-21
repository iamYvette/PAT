package pat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PAT1010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int num = in.nextInt();
		int D = in.nextInt();
		double profit = 0.0;
		int[] stock = new int[num];
		for(int i=0;i<stock.length;i++){
			stock[i] = in.nextInt();
		}
		int[] salesValue = new int[num];
		for(int i=0;i<salesValue.length;i++){
			salesValue[i] = in.nextInt();
		}
		ArrayList<MoonCake> list = new ArrayList<MoonCake>();
		for(int i=num-1;i>=0;i--){
			list.add(new MoonCake(stock[i],salesValue[i]));
		}
		Collections.sort(list);
//		for(MoonCake k:list){
//			System.out.println(k.toString());
//		}
		for(MoonCake k :list){
			if(k.stock<D){
				profit =profit + k.salesValue;
				D = D-k.stock;
			}
			else if(k.stock>=D){
				profit = profit + D*(double)k.salesValue/k.stock;
				break;
			}
		}
		System.out.printf("%.2f",profit);
		

	}
}
class MoonCake implements Comparable<MoonCake>{
	int stock;
	int salesValue;
	double price;
	public MoonCake(int s,int sV){
		this.stock = s;
		this.salesValue = sV;
		this.price = (double)sV/s;
	}
	public int compareTo(MoonCake mc){
		if(this.price>mc.price)
			return -1;
		else if(this.price==mc.price)
			return 0;
		else
			return 1;
	}
//	public String toString(){
//		return stock+" "+salesValue+" "+price;
//	}
	
}
