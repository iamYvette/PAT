package pat;

import java.util.Scanner;
import java.util.TreeSet;

public class PAT1005 {
	
	public static void main(String[] args) {
		TreeSet<KaoshengInfo> dcjb = new TreeSet<KaoshengInfo>();
		TreeSet<KaoshengInfo> dsc = new TreeSet<KaoshengInfo>();
		TreeSet<KaoshengInfo> dcjw = new TreeSet<KaoshengInfo>();
		TreeSet<KaoshengInfo> rest = new TreeSet<KaoshengInfo>();
		Scanner in = new Scanner(System.in);
		int Num = in.nextInt();
		int L = in.nextInt();
		int H = in.nextInt();
		while(Num>0){
			int id = in.nextInt();
			int df = in.nextInt();
			int cf = in.nextInt();
			KaoshengInfo ksInfo = new KaoshengInfo(id,df,cf);
			if(ksInfo.df<L || ksInfo.cf<L)
			{
				Num--;
				continue;
			}
			if(ksInfo.df>=H && ksInfo.cf>=H){
				dcjb.add(ksInfo);
			}else if(ksInfo.df>=H && ksInfo.cf<H){
				dsc.add(ksInfo);
			}else if(ksInfo.df<H && ksInfo.cf<H && ksInfo.df>=ksInfo.cf){
				dcjw.add(ksInfo);
			}else{rest.add(ksInfo);}
			Num--;		
		}
		System.out.println(dcjb.size()+dsc.size()+dcjw.size()+rest.size());
		printf(dcjb);
		printf(dsc);
		printf(dcjw);
		printf(rest);

	}
	public static void printf(TreeSet<KaoshengInfo> set){
		for(KaoshengInfo info : set){
			System.out.println(info.Id+" "+info.df+" "+info.cf);
		}
	}

}
class KaoshengInfo implements Comparable<KaoshengInfo>{
	int Id , df, cf,sum;
	public KaoshengInfo(int id,int d, int c){
		this.Id = id;
		this.df = d;
		this.cf = c;
		this.sum = (d+c);
	}
	public int compareTo(KaoshengInfo ksInfo){
		if(this.sum!=ksInfo.sum)
			return ksInfo.sum-this.sum;
		else if(this.df!=ksInfo.df)
			return ksInfo.df-this.df;
		else 
			return this.Id-ksInfo.Id;
 
	}
	
	
}