package com.arrays;

import java.util.Arrays;

/**
 * @author Ganesh Patidar
 *
 */
public class ArrayRotation {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6,7,8,9};
		int rotateBy  = 2;
		
		getRotatedArray(a,rotateBy);
	}

	private static void getRotatedArray(int[] a, int rotateBy) {
		int[] b = new int[rotateBy];
		
		for (int i = 0; i < rotateBy; i++) {
			b[i] = a[i];
		}
		
		for (int i = 0; i < a.length-rotateBy; i++) {
			a[i] = a[i+rotateBy];
		}
		
		for (int i = 0; i < b.length; i++) {
			a[a.length-rotateBy+i] = b[i];
		}
		
		System.out.println("Array rotated by 2 is  --> "+Arrays.toString(a));
	}

}
