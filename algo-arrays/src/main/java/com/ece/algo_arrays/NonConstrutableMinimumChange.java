/**
 * 
 */
package com.ece.algo_arrays;

/**
 * @author nagendrappae
 *
 *         Given an array of positive integers representing the values of coins
 *         in your possession, write a function that returns the minimum amount
 *         of change (the minimum sum of money) that you
 * 
 *         create. The given coins can have any positive integer value and
 *         aren't necessarily unique (i.e., you can have multiple coins of the
 *         same value).
 * 
 * 
 * 
 *         For example, if you're given coins [1,2,5] the minimum amount of
 *         change you cant give is 4,if you are given no coin's the minimum
 *         amount of change you cant create is 1
 * 
 * 
 *         sample input :[5,7,1,1,2,3,22]
 * 
 *         output: 20
 */
public class NonConstrutableMinimumChange {

	public static void main(String[] args) {

		// int array[] = { 1, 2, 5 };
		int array[] = { 5, 7, 1, 1, 2, 3, 22 };

		// need to sort array

		for (int j = 0; j < array.length; j++) {

			for (int k = j + 1; k < array.length; k++) {

				if (array[j] > array[k]) {
					int temp = array[k];
					array[k] = array[j];
					array[j] = temp;

				}

			}

		}

		int sum = 1;// cant create change is 1 rs with no coins given
		for (int i = 0; i < array.length; i++) {

			if (array[i] > sum) {

				System.out.println(sum);

				break;
			}

			sum = sum + array[i];

		}

	}

}
