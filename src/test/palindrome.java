package test;

public class palindrome {

	//public static void main(String[] args)
	 static {
		// TODO Auto-generated method stub

		String a="Malayalam";
		StringBuilder sb = new StringBuilder(a);
		if(sb.reverse().toString().equalsIgnoreCase(a))
				{
					System.out.println("Palindrome");	
				}
		else
		{
			System.out.println("Not a Palindrome");	
		}
		
	}

}
