package com.jaggu.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int[]a = {5,8,7,9,2,5,3,6};
		bubblesort(a);
		for(int m :a) {
			System.out.println(m);
		}
	}
	public static void bubblesort(int [] a) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}

}
