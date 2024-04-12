package com.arraytwo_D;

public class MultiplyOfMatrix {

	public static void main(String[] args) {
		int [][]a = {{1,5,6},{7,6,2},{8,2,3}};
		int[][] b = {{5,6,3},{9,5,1},{5,8,3},{9,6,3}};
		
		int len = a.length;
		int c[][] = new int [len][len];
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<len;j++) {
				for(int k=0;k<len;k++) {
					c[i][j] = a[i][k]*b[k][j];
				}
			}
		}
		for(int[] row:c) {
			for(int r:row) {
				System.out.print(r+"\t");
			}
			System.out.println();
		}
	}

}
