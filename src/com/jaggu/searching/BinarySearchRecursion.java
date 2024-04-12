package com.jaggu.searching;

public class BinarySearchRecursion {

	public static void main(String[] args) {
		int []a = {1,4,6,8,9,45,2,3,22,10};
		System.out.println(search(a, 10, 0, a.length-1));
	}
	public static int search(int a[],int key,int st,int end) {
		if(st>end) return -1;
		int mid = (st+end)/2;
		
		if(key==a[mid]) return mid;
		else if(key>a[mid]) return search(a, key, mid+1, end);
		else return search(a,key,st,mid);
		
	}

}
