
public class staticnonstatic {
	String name = "Mani";
	static int a;
	static int age;
	
static
{
	  a =1;
	
	 age = 25;
}
public staticnonstatic(String name, String age1)
{
	a++;
	System.out.println(a);
	String fname=this.name; 
	System.out.println(fname+name);
	System.out.println(age+age1);
}
public void abc(int b)
{
	b=1;
	
	System.out.println(b);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int b =100;
		staticnonstatic.a=5;
		staticnonstatic sn = new staticnonstatic("vasagam","years of age");
		sn.abc(b);
	}

}
