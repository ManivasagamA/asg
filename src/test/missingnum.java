package test;

public class missingnum {
	
	public static void main(String[] args) {

int a[]= {1,2,3,4,5,6,7,9};
System.out.println(mis(a,9));
	}

	public static int mis(int a[],int num)
	{
		int sum= 0;
		int total=num*(num+1)/2;
		for(int i:a )
		{
			 sum=sum+i;
		}
		int t=total-sum;
		return t;
	}
}
