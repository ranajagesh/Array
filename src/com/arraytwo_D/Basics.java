package com.arraytwo_D;

public class Basics {

	public static void main(String[] args) {
		//int [][] a = {{1,2,3},{4,5,6},{7,8,9}};
		/* for(int[] arr:a) {
			for(int n:arr) {
				System.out.print(n+"\t");
			}
			System.out.println();
			
		}
		*/
		/*
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j] +"\t");
			}
			System.out.println();
		}
		*/
		
		int [][] a = new int[3][];
		a[0] = new int[5];
		a[1] = new int[2];
		a[2] = new int[3];
		
		for(int []arr:a) {
			for(int n:arr) {
				System.out.print(n+"\t");
			}
			System.out.println();
		}
	}

}
