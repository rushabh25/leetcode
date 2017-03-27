package leetcode;

import java.util.HashMap;

public class Sqrt {
	public double getSqrt(double n) {
		double ans = 1.0;
		
		double error = 0.00001;
		
		while(Math.abs(ans - (n/ans)) >= error) {
				ans = (ans + (n/ans)) / 2;
			} 
		
		return ans;
	}
}
