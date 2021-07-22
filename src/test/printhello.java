package test;

import java.util.stream.Stream;

public class printhello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1: Print HELLO for the given string "AHCECLWLXO"
		String before= "AHCECLWLXO";
		String s2="";
		for (int i=1;i<=before.length();i+=2)
		{//System.out.print(before.charAt(i));
		
			s2=s2+(before.charAt(i));
			s2.toUpperCase();
		
			
			
	}	System.out.print(s2);
		
	
		//String s="AHCECLWLXO";
		// Approach2
		//Stream.iterate(1, i -> i + 2).map(i -> s.charAt(i)).limit(s.length()/2).forEach(System.out::print);
		}

}
