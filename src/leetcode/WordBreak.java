package leetcode;
import java.util.*;

public class WordBreak {

	public boolean wordBreak(String s, List<String> wordDict) {
        String concatenatedString = "";
        for(String x: wordDict){
            concatenatedString += x;
        }
        //System.out.println(concatenatedString.toLowerCase());
        //System.out.println(s.toLowerCase());
        if(s.toLowerCase().equals(concatenatedString.toLowerCase())) return true;
        return false;
    }
	
}
