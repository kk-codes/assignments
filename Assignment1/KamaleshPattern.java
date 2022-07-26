package practice;

public class KamaleshPattern {

	public static void main(String[] args) {
		
		int n=11;
		for(int i=0;i<n;i++)
		{
			//R.Kamaleshkumar Pattern
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
			
			//dot
			
			for(int j=0;j<n;j++)
			{
				
				if(i==(n-1)/2&&j>=0&&j<2||i==((n-1)/2)+1&&j>=0&&j<2)
				{
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			
			//Alphabet K
			for(int j=0;j<n;j++)
			{
				if(j==0||i+j==n-2&&j>=(n-1)/2||i==(n-1)/2&&j<(n-1)/2||i-j==1&&j>=(n-1)/2)
				{
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			
			//Alphabet A
			for(int j=0;j<n;j++)
			{
				
				if(j==0 && i>0 || i==0 && j>0 && j<n-1 || i==(n-1)/2 || j==n-1 && i>0)
				{
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			
			System.out.print(" "); 
			//Alphabet M
			for(int j=0;j<n;j++)
			{
				
				if(j==0||j==n-1||i==j&&i<=(n-1)/2||i+j==n-1&&i<=(n-1)/2)
				{
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			
			
			System.out.print(" ");
			//Alphabet A
			for(int j=0;j<n;j++)
			{
				
				if(j==0 && i>0 || i==0 && j>0 && j<n-1 || i==(n-1)/2 || j==n-1 && i>0)
				{
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			
			System.out.print(" ");
			//Alphabet L
			for(int j=0;j<n;j++)
			{
				
				if(j==0||i==n-1)
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
			
			System.out.print(" ");
			//Alphabet S
			for(int j=0;j<n;j++)
			{
				
				if(j==0&&i<(n-1)/2&&i>0||i==n-1&&j<n-1||i==0&&j>0||i==(n-1)/2&&j>0&&j<n-1||j==n-1&&i>(n-1)/2&&i<n-1)
				{
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			
			System.out.print(" ");
			//Alphabet H
			for(int j=0;j<n;j++)
			{
				
				if(j==0||j==n-1||i==(n-1)/2)
				{
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			
			System.out.print("  ");
			//Alphabet K
			for(int j=0;j<n;j++)
			{
				if(j==0||i+j==n-2&&j>=(n-1)/2||i==(n-1)/2&&j<(n-1)/2||i-j==1&&j>=(n-1)/2)
				{
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			
			System.out.print(" ");
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
			//Alphabet M
			for(int j=0;j<n;j++)
			{
				
				if(j==0||j==n-1||i==j&&i<=(n-1)/2||i+j==n-1&&i<=(n-1)/2)
				{
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			
			System.out.print(" "); 
			//Alphabet A
			for(int j=0;j<n;j++)
			{
				
				if(j==0 && i>0 || i==0 && j>0 && j<n-1 || i==(n-1)/2 || j==n-1 && i>0)
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
						
			System.out.println();
			
		
		}
	}
}
