package test1;

import java.util.ArrayList;

public class demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aaabbccca";
		char a;

		ArrayList<Character>  ab= new ArrayList<Character> ();
		for (int i=0;i<s.length();i++)
		{
			a=s.charAt(i);
		if(!ab.contains(a))
		{
			ab.add(a);
			int count=1;
		for (int j=i+1;j<s.length();j++)
		{
			if(a==s.charAt(j))
			{
				 count =count +1;
			}
		}

		System.out.print(a);
		System.out.print(count);
		}}}}
	
