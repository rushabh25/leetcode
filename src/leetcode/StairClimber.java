package leetcode;

public class StairClimber {
	public int climbStairs(int n) {
        /*
        Queue<Integer> queue = new LinkedList<>();
        int possibleWays = 0;
        queue.add(0);
        while(queue.size() != 0) {
            Integer value = queue.poll();
            if(value == n) {
                possibleWays += 1;
            }
            if(value + 1 <= n) queue.add(value + 1);
            if(value + 2 <= n) queue.add(value + 2);
        }
        return possibleWays;
        */
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;
        int prevPrev = 1;
        int prev = 2;
        int curr = 0;
        for(int i = 3; i <= n; i++) {
            curr = prevPrev + prev;
            prevPrev = prev;
            prev = curr;
        }
        return curr;
        
    }
}
