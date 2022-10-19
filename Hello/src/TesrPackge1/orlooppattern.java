package TesrPackge1;

public class orlooppattern {

	public static void main(String[] args) 
	{
	int row=5;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			for(int j=i;j<=row;j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
			
		}
		
		
	}
	}
	