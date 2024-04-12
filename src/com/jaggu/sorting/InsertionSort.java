package com.jaggu.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int a [] = {9,7,5,4,2,6,8,1,10,8,2,9,4,5,7,3};
		insertionsort(a);
		for(int s:a) {
			System.out.println(s);
		}
	}
	public static void insertionsort(int [] a) {
		for(int i=1;i<a.length;i++) {
			int key = a[i];
			int j = i-1;
			
			while(j>=0 && a[j]>key) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = key;
		}
	}

}
