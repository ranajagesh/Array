package com.jaggu.arrays;

public class Largest2ndElement {

	public static void main(String[] args) {
		int [] a = {5,8,7,2,5,11,33,54,1,5,4};
		int max= 0;
		int max2nd = 0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max2nd = max;
				max = a[i];
			} else if(a[i]>max2nd && a[i]!=max) max2nd=a[i];
		}
		System.out.println(max2nd);
	}

}
