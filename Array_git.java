package array;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_git {

	public static void main(String[] args) {
	
	}
	
	
	// Napisati metodu koja brise duplikate u nizu
	public static int[] eliminateDuplicates(int[] list) {
		
		ArrayList<Integer> removeDuplicates = new ArrayList<Integer>();
		for(int i : list)
			removeDuplicates.add(i);
		
		Integer checkDuplicate = null;
		for(int i = 0; i < removeDuplicates.size() - 1; i++) {
			checkDuplicate = removeDuplicates.get(i);
			for(int k = i + 1; k < removeDuplicates.size(); k++) {
				
				if(removeDuplicates.get(k).equals(checkDuplicate)) {
					removeDuplicates.remove(k);
				}
				
			}
		}
		
		int[] returnList = new int[removeDuplicates.size()];
		for(int i = 0; i < returnList.length; i++) {
			returnList[i] = (int)(removeDuplicates.get(i));
		}
		
		return returnList;
		
	}
	
	// Napisati metodu koja vraca true ako je niz sortiran
	public static boolean isSorted(int[] list) {
		
		int[] list1 = new int[list.length];
		for(int i = 0; i < list.length; i++)
			list1[i] = list[i];
		
		Arrays.sort(list1);
		
		boolean twoArraysAreSame = true;
		
		for(int i = 0; i < list.length; i++) {
			if(list[i] != list1[i])
			{
				twoArraysAreSame = false;
				break;
			}
		}
		
		return twoArraysAreSame;
		
	}
	
	// Napisati medotu koja vraca sortiran String
	public static String sort(String s) {
		return s;
	}
	
	// Napisati metodu koja sabira sve brojeve u glavnoj matrici n*n
	public static double sumMajorDiagonal(double[][] m) {
		return 0;
		
	}


}
