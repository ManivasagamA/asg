package test;

public class stringrev {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="Hello Manivasagam Arumugam";
		String [] strarray= str.split(" ");
		for (String a:strarray)
		{
			if (a.equalsIgnoreCase("Manivasagam"))
			{
				StringBuilder s= new StringBuilder(a) ;
				 s.reverse();
				 a= s.toString();
			}
			System.out.print(a + " ");
		}
		
	}

}
