package com.jaggu.sorting;

public class SelectionSort {

	public static void main(String[] args) {
//		int []a = {7,5,4,8,6,1,21,11,4,5,2,3};
		int a[] = {4,5,8,7,9,6,2,1,3,10,15};
		
		selectionsort(a);
		for(int n:a) {
			System.out.println(n);
		}
	}
	public static void selectionsort(int a[]) {
		for(int i=0;i<a.length-1;i++) {
			int index = i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[index]) {
					index = j;
				}
				if(i!=index) {
					int temp = a[i];
					a[i] = a[index];
					a[index] = temp;
				}
			}
		}
	}

}
