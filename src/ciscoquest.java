
public class ciscoquest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int [3][3];
		a[0][0]=10;
		a[0][1]=20;
		a[0][2]=30;
		a[1][0]=4000;
		a[1][1]=50;
		a[1][2]=60;
		a[2][0]=100070;
		a[2][1]=80;
		a[2][2]=90;
		int small=a[0][0];
		int columnno=0;
		for (int i=0;i<3;i++)
			{
			for (int j=0;j<3;j++)
			{
		
				if( small>a[i][j])
				{
					small=a[i][j];
					columnno=j;

			//System.out.println(small);	
			}
		
		}}	
		int max=a[0][columnno];
		int k=0;		while(k<3)
		{
			if( max<a[k][columnno])
			{
				max=a[k][columnno];
			
			}
			k++;
			
		}
		System.out.println(max);
		
			}}