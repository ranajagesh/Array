package com.arraytwo_D;

public class AddDiagonalArray {

	public static void main(String[] args) {
		int [][]a = {{4,5,1,2},{7,6,8,7},{1,9,7,2},{3,2,7,6}};
		int sum =0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i][i];
			
		}
		System.out.println(sum);
	}

}
