package patterns;

public class Pat9 
{
	 public static void main(String[] args)
	  {
		int count=1;
		char ch='A';
		for(int i=1;i<=4;i++)
		{

			for(int j=1;j<=4;j++)
			{
					System.out.print(ch);
					System.out.print(count+"  ");
	
					ch++;
					count++;
				
		    }
			
			System.out.println();
			
			}
						
		}
}
