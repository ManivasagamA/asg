
public class childclass extends parentdemo {
	
	public childclass()
	{
		super();
		System.out.println("This is child constructor");
	}

	public void mani()
	{
		super.mani();
		System.out.println("This is child class");
	}
	public static void mani1()
	{
	
		System.out.println("This is child class");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childclass cd  = new childclass();
		cd.mani();
		
	}

}
