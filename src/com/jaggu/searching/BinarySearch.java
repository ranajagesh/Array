package com.jaggu.searching;

public class BinarySearch {

	public static void main(String[] args) {
		int a[] = {2,5,7,9,88,45,1,21,90};
		System.out.println(search(a, 90));
	}
	public static int search(int []a,int key) {
		int start = 0;
		int end = a.length;
		
		while(start<=end) {
			int mid = (start+end)/2;
			if(key==a[mid]) return mid;
			else if(key>a[mid]) start = mid+1;
			else end = mid-1;
		}
		return -1;
	}

}
