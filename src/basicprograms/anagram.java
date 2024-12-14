package basicprograms;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {

            String name1="ram";
            String name2="arm";
            char[] c1=name1.toCharArray();
            char[] c2=name2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            System.out.println(c1);
            System.out.println(c2);
            if(c1.equals(c2))
            //if(Arrays.equals(c1,c2))
            {
            	System.out.println("anagram word");
            }
            else {
            	System.out.println("not anagram");
            }
            
            
	}

}
