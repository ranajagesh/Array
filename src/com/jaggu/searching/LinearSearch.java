package com.jaggu.searching;

public class LinearSearch {

	public static void main(String[] args) {
		int []a = {4,5,8,6,5,1,3,9};
		System.out.println(search(a, 2));
	}
	public static int search(int[]a,int key) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==key) return i;
		}
		return -1;
	}

}
