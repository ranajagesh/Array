package com.arraytwo_D;

public class AntiDiagonalMatrix {

	public static void main(String[] args) {
		int [][] a = {{5,7,8},{7,3,1},{9,5,1}};
		int sum =0;
		 
		for(int i=0;i<a.length;i++) {
			sum+=a[i][i];
			if(a.length%2!=0 && i==a.length/2) continue;
			sum+=a[i][a.length-1-i];
		}
		System.out.println(sum);
	}

}
