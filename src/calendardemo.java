import java.text.SimpleDateFormat;
import java.util.Calendar;

public class calendardemo {

	public calendardemo(int a, int b)
	{
	int cd=a+b;
	System.out.println(cd);
	
	}
	public calendardemo()
	{
	int cd=10+55;
	System.out.println(cd);
	}
	 void calendardemo1()
	{
	int cd=10+55;
	System.out.println(cd);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("M/dd/yy");
		Calendar cal=	Calendar.getInstance();
		System.out.println(sdf.format(cal.getTime()));
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		System.out.println(cal.getCalendarType());
		//System.out.println(cal.DAY_OF_YEAR);
		calendardemo c = new calendardemo(5, 10);
		calendardemo cg = new calendardemo();
	//System.out.println(m);
	}

}
