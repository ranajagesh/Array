package com.arraytwo_D;

public class TransposeMatrix {

	public static void main(String[] args) {
		int a[][] = {{1,4,7},{2,5,8},{3,6,9}};
		int len = a.length;
		int[][]b = new int[len][len];
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				b[j][i] = a[i][j];
			}
		}
		for(int[] row :b) {
			for(int n:row) {
				System.out.print(n+"\t");
			}
			System.out.println();
		}
	}

}
