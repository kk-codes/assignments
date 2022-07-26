package practice;

public class IneuronPattern 
{
public static void main(String[] args)
{
	int n=7;
	for(int i=0;i<n;i++)
	{
		//Ineuron pattern
		//Alphabet I
		for(int j=0;j<n;j++)
		{
		
			if(i==0||j==(n-1)/2||i==n-1)
			{
				System.out.print("* ");
			}
			else
				System.out.print("  ");
		}
		//Alphabet N
		
		System.out.print(" ");
		for(int j=0;j<n;j++)
		{
		
			if(j==0||i==j||j==n-1)
			{
				System.out.print("* ");
			}
			else
				System.out.print("  ");
		}
		System.out.print(" ");
		//Alphabet E
		for(int j=0;j<n;j++)
		{
			
			if(j==0||i==n-1||i==0||i==(n-1)/2)
			{
				System.out.print("* ");
			}
			else
				System.out.print("  ");
		}
		//Alphabet U
				for(int j=0;j<n;j++)
				{
					
					if(j==0&&i<n-1||i==n-1&&j>0&&j<n-1||j==n-1&&i<n-1)
					{
						System.out.print("* ");
					}
					else
						System.out.print("  ");
				}
				
				System.out.print(" ");  
				//Alphabet R
				for(int j=0;j<n;j++)
				{
					
					if(j==0||i==0&&j<n-1||j==n-1&&i>0&&i<(n-1)/2||i==(n-1)/2&&j<n-1||i-j==1&&j>=(n-1)/2)
					{
						System.out.print("* ");
					}
					else
						System.out.print("  ");
				}
				System.out.print(" "); 
				//Alphabet O
				for(int j=0;j<n;j++)
				{
					if(j==0&&i>0&&i<n-1||i==0&&j>0&&j<n-1||i==n-1&&j<n-1&&j>0||j==n-1&&i>0&&i<n-1)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				
				//Alphabet N
				
				System.out.print(" ");
				for(int j=0;j<n;j++)
				{
				
					if(j==0||i==j||j==n-1)
					{
						System.out.print("* ");
					}
					else
						System.out.print("  ");
				}
		System.out.println();
	}
}
}
