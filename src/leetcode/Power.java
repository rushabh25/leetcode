package leetcode;

public class Power {
	public double mathPower(double x, int n) {
		if(n<0) return 1.0/mathPower(x,-1*n);
		if(n== 0) return 1;
		if(n%2 == 1) return x * mathPower(x, n-1);
		return mathPower(x, n/2) * mathPower(x, n/2);
	}
	public double mathPower2(double x, int n) {
		double ans = 1;
		for(int i =1; i<=n; i++) {
			ans = ans * x;
		}
		return ans;
	}
}
