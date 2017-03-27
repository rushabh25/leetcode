package leetcode;

public class HammingDistance {
	public int getHammingDistance(int a, int b) {
		int counter = 0;
		String aa = Integer.toBinaryString(a);
		String bb = Integer.toBinaryString(b);
		
		int aa_length = aa.length();
		int bb_length = bb.length();
		
		if(aa_length > bb_length) {
			for(int i = 0 ; i < aa_length-bb_length; i++){
				bb = "0" + bb;
			}
		}
		if(bb_length > aa_length) {
			for(int i = 0 ; i < bb_length-aa_length; i++){
				aa = "0" + aa;
			}
		}
		for(int i =0; i < aa_length; i++){
			if(aa.charAt(i) != bb.charAt(i)){
				counter = counter + 1;
			}
		}
		return counter;
		
	}
}
