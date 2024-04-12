package com.arraytwo_D;

public class PascalTriangle {

	public static void main(String[] args) {
		int [][]a = pascal(6);
		int space = 10;
		for(int[] row:a) {
			for(int i=1;i<=space;i++) {
				System.out.print(" ");
			}
			for(int n:row) {
				System.out.print(n+" ");
			}
			System.out.println();
		}
	}
	public static int[][] pascal (int size) {
		int [][]a = new int [size][];
		for(int i=0;i<a.length;i++) {
			a[i] = new int [i+1];
			
			for(int j=0;j<a[i].length;j++) {
				if(j==0||i==j) a[i][j]= 1;
				else a[i][j] = a[i-1][j-1]+a[i-1][j];
			}
		}
		return a;
	}

}
