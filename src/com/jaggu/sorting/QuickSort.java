package com.jaggu.sorting;

public class QuickSort {

	public static void main(String[] args) {
		int a[] = {2,10,6,9,7,8,1,11,4,8,6,3};
		quicksort(a,0,a.length-1);
		for(int n:a) {
			System.out.print(n+" ");
		}
	}
	public static void quicksort(int a[],int start,int end) {
		if(start>=end) return;
		
		int i=start,j=end;
		int pivot = a[(start+end)/2];  // middle index
		while(i<=j) {
			while(a[i]<pivot) i++;
			while(a[j]>pivot) j--;
			
			if(i<=j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}
		quicksort(a,start,j);
		quicksort(a,i,end);
	}

}
