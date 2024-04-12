package com.jaggu.arrays;

public class SmallestElement {

	public static void main(String[] args) {
		
		int a[] = {4,8,5,3,2,4,9,7,5,7,6,2};
		
		int small = a[0];	
		for(int i=1;i<a.length;i++) {
				if(a[i]<small) {
					small = a[i];
				}
				
			}
		System.out.println(small);
		
		}

}
