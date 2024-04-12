package com.jaggu.arrays;

public class LargestElement {

	public static void main(String[] args) {
		int [] a = {4,8,7,5,9,77,5,88,12,3,6,5,5,22};
		int max = 0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max =a[i];
			}
		}
		System.out.println(max);
	}

}
