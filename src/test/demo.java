package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =1;
		Collection<Integer> integers;
		int b=0;
		ArrayList <String> abc = new ArrayList<String>();
		abc.add("Mani");
		System.out.println(abc);
		abc.add(0, "Vasagam");
		System.out.println(abc);
		int n[]=new int[3];
		n[0]= 3;
		n[1]= 33;
		n[2]= 333;
		List<Integer> abc1 = Arrays.stream(n).boxed().collect(Collectors.toList());
		System.out.println(abc);
	int max1= Collections.max(abc1);
			
	/*try {
			
		int c=a/b;
		System.out.println(c);
		}
	/*		catch (Exception e) {
			System.out.println(e);
	}
		finally
		{
			System.out.println("Hi");
		}
*/
}}
