package TesrPackge1;

public class pattern10 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
			  System.out.print("  ");
			}
			  for(int j=i;j<=i;j++)
			{
				   System.out.print("* ");
			}

			  for(int j=1;j<=4;j++)
			{
				   System.out.print("* ");
			}
			  System.out.println("");
			
		}
	}

}
