package test;

import java.util.Scanner;

//"Find the sum of even and odd numbers in the given array.
//Ex1: Input[1,2]			→ Output evenSum= 1, oddSum=2
//Ex2: Input[3,4,7]		→ Output evenSum= 4, oddSum=10
//Ex3: Input[8,1,4,6]		→ Output evenSum= 18,oddSum=1
//Ex4: Input[6,1,3,7,9]	→ Output evenSum= 6, oddSum=18
//Ex5: Input[1,2,3,0,4,6]	→ Output evenSum= 12, oddSum=1"
public class sumoddeven {
	int i=0;
	int es=0;
	int os=0;
	public void sum()
	{
	
	// TODO Auto-generated method stub
int a [] =new int[6];
System.out.println("Enter the 6 nums");
Scanner s = new Scanner(System.in);
s.useDelimiter("\\D");

for(i=0;i<a.length;i++)
{
a[i]=s.nextInt();
//System.out.println(a[i]);
if(a[i]%2==0)
{
es =es +a[i];

}
else 
{
os =os +a[i];
}

}
System.out.println("Even Sum="+es);
System.out.println("Odd Sum="+os);
s.close();

	}
	public void formanum()
	{
		
		System.out.println("Enter the num of input");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int a [] =new int[num];
		System.out.println("Enter the num of input");
		s.useDelimiter("\\D");

for(i=0;i<a.length;i++)
{
a[i]=s.nextInt();
}
int max=a[0];
for(int j=0;j<a.length;j++)
{
	for(int k=1;k<j+1;k++)
	{
if(a[i]>max)
{
 max =a[i];
	
}}}}
	
	public static void main(String[] args) {
		sumoddeven s =new sumoddeven();
		s.sum();
	}

}


"int a[] = { 1, 2, 3, 0, 4, 6 };
System.out.println(""Even Sum :"" + Arrays.stream(a).filter(x -> x % 2 == 0).sum());
System.out.println(""Odd sum :"" + Arrays.stream(a).filter(x -> x % 2 != 0).sum());


"import java.util.*;
public class Largest {
  
 public static String  ln (int[] num) {
        String[] array_nums = Arrays.stream(num).mapToObj(String::valueOf).toArray(String[]::new);
        Arrays.sort(array_nums, (String str1, String str2) -> (str2 + str1).compareTo(str1 + str2));
        return Arrays.stream(array_nums).reduce((a, b) -> a.equals(""0"") ? b : a + b).get();
    }  
  
  public static void main(String[] args)
  {
    int[] nums = {1, 2, 3, 0, 4, 6};
  System.out.printf(""\nOriginal array: ""+Arrays.toString(nums));  
  System.out.printf(""\nLargest number using the said array numbers: ""+ln(nums));
   }  
}



