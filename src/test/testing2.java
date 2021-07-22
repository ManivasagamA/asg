package test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Objects;
import com.sun.org.apache.bcel.internal.generic.AALOAD;

public class testing2 {

	public static void main(String[] args) {
		/*
		 * // TODO Auto-generated method stub
		 * 
		 * // for (int i=-15;i<=10;i++) // { // System.out.println(i); // // } //
		 * Scanner sc = new Scanner(System.in); //
		 * System.out.println("Enter the number:"); // int a= sc.nextInt(); // for (int
		 * i =1;i<=10;i++) // { // System.out.println(i+"*"+a+"=6"+i*a ); // } // Array
		 * m[]=new Array[3]; Arrays.asList(m); ArrayList<Integer> al = new
		 * ArrayList<Integer>(); al.add(1); al.add(2); al.add(3);
		 * 
		 * System.out.println(al.contains(1)); System.out.println(al.indexOf(2));
		 * System.out.println(al.size()); //Array[] a=new Array[al.size()]; Object[]
		 * objects = al.toArray();
		 * 
		 * // Printing array of objects for (Object obj : objects) System.out.print(obj
		 * + " ");
		 * 
		 * Integer [] ac=al.toArray(new Integer[al.size()]);
		 * //System.out.println(Arrays.toString(ac)); System.out.println(ac);
		 * HashSet<String> hs =new HashSet<String>(); hs.add("Mani"); hs.add("Mani1");
		 * hs.add("Mani"); hs.add("Mani3"); hs.add("");
		 * 
		 * Iterator <String> i = hs.iterator(); i.hasNext(); i.next();
		 * 
		 * System.out.println(hs);
		 * 
		 * HashMap <Integer,String> hm = new HashMap <Integer,String>(); hm.put(0,"A");
		 * hm.put(1,"B"); hm.put(2,"C"); hm.put(3,"D"); hm.put(4,"E"); hm.put(5,"");
		 * hm.remove(3); Set es =hm.entrySet(); Iterator it1= es.iterator(); while
		 * (it1.hasNext()) {
		 * 
		 * Map.Entry mp =(Map.Entry) it1.next(); System.out.println(mp.getKey());
		 * System.out.println(mp.getValue()); }
		 * 
		 * String [] a= {"1","2","3"}; // Using Arrays.stream() to convert List<String>
		 * list = Arrays.asList(a); System.out.println(list.toString()); int [] a1=
		 * {1,2,3,5,6,2,8,6,1,3,4,9}; // Using Arrays.stream() to convert
		 * ArrayList<Integer> list1 = new
		 * ArrayList(Arrays.asList(1,2,3,5,6,2,8,6,1,3,4,9));
		 * 
		 * System.out.println(list1.stream().distinct().collect(Collectors.toList()));
		 */
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		String url="https://wipro.udemy.com/organization/home/";
		//((JavascriptExecutor) driver).executescript("window.location = \'"+url+"\'");
		 ((JavascriptExecutor)driver).executeScript("window.location = \'"+url+"\'");
		
	
	}

}
