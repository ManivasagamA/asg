
public class demo1 extends demo2{
	int b=2;
	String a="Hello Manivasagam";
	public void  setdata()
	{
		System.out.println(super.a);
		//System.out.println(a);
		
	}
	public void  getdata()
	{ super.getdata();
		//System.out.println(super.a);
		//System.out.println("in child const");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello World");
		//System.out.println("Hello Mani");
		//demo1 a= new demo1();
		//System.out.println(a.abc());
		//System.out.println(a.b);
		//demo2 b= new demo2();
		//b.setdata();
		demo1 d = new demo1();
		//d.abc();
		//System.out.println(a);
		d.setdata();
		d.getdata();
		
		
	}

}
