package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDublicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "its java sessions in week3"
    			+ "";

    	char[] chars = string.toCharArray();
    	Set<Character> charSet = new LinkedHashSet<Character>();
    	for (char l : chars) {
    	    charSet.add(l);
    	}

    	StringBuilder sl = new StringBuilder();
    	for (Character character : charSet) {
    	    sl.append(character);
    	}
    	System.out.println(sl.toString());
    	
    }

	}


