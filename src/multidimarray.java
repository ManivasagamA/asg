
public class multidimarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[][]=new int [3][3];
a[0][0]=8;
a[0][1]=12;
a[0][2]=3;
a[1][0]=4;
a[1][1]=5;
a[1][2]=6;
a[2][0]=7;
a[2][1]=8;
a[2][2]=9;
int small=1000;
for (int i=0;i<3;i++)
	{
	for (int j=0;j<3;j++)
	{
		if( small>a[i][j])
		{
	//System.out.println(a[i][j]);
			small=a[i][j];
	
	
	}
	}
	}
System.out.println(small);
	}

}
