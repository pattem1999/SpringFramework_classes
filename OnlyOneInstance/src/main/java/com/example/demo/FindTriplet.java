package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTriplet {

	 List<List < Integer >> find3Numbers(int A[], int arr_size, int sum) {
	        List < List < Integer >> ans = new ArrayList < > ();
	        int l, r;

	        /* Sort the elements */
	        if (A == null || A.length < 3) {
	            return ans;
	        }
	        Arrays.sort(A);

	        /* Now fix the first element one by one and find the
	        other two elements */
	        for (int i = 0; i < arr_size - 2; i++) {
	            if (i > 0 && A[i] == A[i - 1])
	                continue;

	            // To find the other two elements, start two
	            // index variables from two corners of the array
	            // and move them toward each other
	            l = i + 1; // index of the first element in the
	            // remaining elements
	            r = arr_size - 1; // index of the last element
	            while (l < r) {
	                if (A[i] + A[l] + A[r] == sum) {
	                    ans.add(Arrays.asList(A[i], A[l], A[r]));
	                    l++;
	                    while (l < r && A[l] == A[l - 1]) {
	                        l++;
	                    }

	                    while (l < r && A[r] == A[r - 1]) {
	                        r--;
	                    }
	                } 
	                else if (A[i] + A[l] + A[r] < sum)
	                    l++;
	                else // A[i] + A[l] + A[r] > sum
	                    r--;
	            }
	        }
	        return ans;
	    }

	    // Driver program to test above functions
	    public static void main(String[] args) {
	        FindTriplet triplet = new FindTriplet();
	        int A[] = {-1,     0,
	            1,
	            2,
	            -1,
	            -4
	        };
	       
	        int sum = 0;
	        int arr_size = A.length;

	        triplet.find3Numbers(A, arr_size, sum).forEach(System.out::println);
	    }
	
}
