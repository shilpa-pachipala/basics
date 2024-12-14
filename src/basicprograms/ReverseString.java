package basicprograms;

public class ReverseString {
	public static void main(String[] args)
	{
		
		String input="Shilpa";
		String output="";
		for (int i=input.length()-1;i>=0;i--)
		{
			output=output+input.charAt(i);
			System.out.println(output); //if we print in loop each value will print
		}
		if(input.equals(output))
		//if(input.equals(output)==true)
		{
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}

}
