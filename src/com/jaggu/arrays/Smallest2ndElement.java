package com.jaggu.arrays;

public class Smallest2ndElement {

	public static void main(String[] args) {
		int []a = {5,4,8,7,9,10,22,3,5,4,2,1};
		int small = a[0];
		int small2nd = a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]<small) {
				small2nd = small;
				small = a[i];
			} else if((small==small2nd||a[i]<small2nd) && (a[i]!=small)) small2nd=a[i];
		}
		System.out.println(small);
		System.out.println(small2nd);
	}

}
