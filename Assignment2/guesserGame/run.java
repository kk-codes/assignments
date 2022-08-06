package guesserGame;

import java.util.Scanner;

class GuesserGameFont{
	int n=5;
	int m=6;
	int row=3;
	int col=60;
	public void guesserGameFonr()
	{
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
				System.out.print("* ");
			System.out.println();
		}
		System.out.println();
		//Guesser Game font
		for(int i=0;i<n;i++)
		{
			//Alphabet G
			for(int j=0;j<n;j++)
			{	
				if(i==0&&j>0||j==0&&i>0&&i<n-1||i==n-1&&j>0&&j<n-1||j==n-1&&i>(n-1)/2&&i<n-1||i==(n-1)/2&&j>(n-1)/2)
				System.out.print("x ");
				else
					System.out.print("  ");
			}
			System.out.print("  ");
			//Alphabet U
			for(int j=0;j<n;j++)
			{
				
				if(j==0&&i<n-1||i==n-1&&j>0&&j<n-1||j==n-1&&i<n-1)
				{
					System.out.print("x ");
				}
				else
					System.out.print("  ");
			}
			//Alphabet S
			for(int j=0;j<n;j++)
			{
				
				if(j==0&&i<(n-1)/2&&i>0||i==n-1&&j<n-1||i==0&&j>0||i==(n-1)/2&&j>0&&j<n-1||j==n-1&&i>(n-1)/2&&i<n-1)
				{
					System.out.print("x ");
				}
				else
					System.out.print("  ");
			}
			System.out.print("  ");
			//Alphabet S
			for(int j=0;j<n;j++)
			{
				
				if(j==0&&i<(n-1)/2&&i>0||i==n-1&&j<n-1||i==0&&j>0||i==(n-1)/2&&j>0&&j<n-1||j==n-1&&i>(n-1)/2&&i<n-1)
				{
					System.out.print("x ");
				}
				else
					System.out.print("  ");
			}
			System.out.print("  ");
			//Alphabet E
			for(int j=0;j<n;j++)
			{
				
				if(j==0||i==n-1||i==0||i==(n-1)/2)
				{
					System.out.print("x ");
				}
				else
					System.out.print("  ");
			}
			System.out.print("  ");
			//Alphabet R
			for(int j=0;j<n;j++)
			{
				
				if(j==0||i==0&&j<n-1||j==n-1&&i>0&&i<(n-1)/2||i==(n-1)/2&&j<n-1||i-j==1&&j>=(n-1)/2)
				{
					System.out.print("x ");
				}
				else
					System.out.print("  ");
			}
			System.out.print("     ");
			//Alphabet G
			for(int j=0;j<n;j++)
			{	
				if(i==0&&j>0||j==0&&i>0&&i<n-1||i==n-1&&j>0&&j<n-1||j==n-1&&i>(n-1)/2&&i<n-1||i==(n-1)/2&&j>(n-1)/2)
				System.out.print("x ");
				else
					System.out.print("  ");
			}
			System.out.print("  ");
			//Alphabet A
			for(int j=0;j<n;j++)
			{
				
				if(j==0 && i>0 || i==0 && j>0 && j<n-1 || i==(n-1)/2 || j==n-1 && i>0)
				{
					System.out.print("x ");
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
					System.out.print("x ");
				}
				else
					System.out.print("  ");
			}
			System.out.print(" ");
			for(int j=0;j<n;j++)
			{
				
				if(j==0||i==n-1||i==0||i==(n-1)/2)
				{
					System.out.print("x ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
				System.out.print("* ");
			System.out.println();
		}
	}
}
class Guesser{
	
	int numberGuessed;
	
	public int guess() {
		Scanner sc = new Scanner(System.in);
		boolean validNum = false;
		System.out.println("=>				Please enter a number between 1 and 10");
		while(!validNum)
		{
			numberGuessed=sc.nextInt();
			if(numberGuessed>0&&numberGuessed<=10)
				validNum=true;
			else
				System.out.println("=>				Please enter a valid number");
		}
	  return numberGuessed;
	}
	
}

class NoOfPlayers
{
	int numberOfPlayers;
	boolean valid = false;
	Scanner sc = new Scanner(System.in);
	public int noOfPlayers()
	{
		System.out.println("=>				Enter Number of players between 2 and 5");
		while(!valid)
		{
				numberOfPlayers=sc.nextInt();
				if(numberOfPlayers>=2&&numberOfPlayers<=5)
					valid=true;
				else
					System.out.println("=>				INVALID NUMBER:Members allowed to play is between 2 to 5!!");
		}
		return numberOfPlayers;
	}
	
}
class Player
{
	int playerNum;
	
	public int playerNumGuess() 
	{
		Scanner sc = new Scanner(System.in);
		boolean validNum = false;
		System.out.println("=>				Please enter a number between 1 and 10");
		while(!validNum)
		{
			playerNum=sc.nextInt();
			if(playerNum>0&&playerNum<=10)
				validNum=true;
			else
				System.out.println("=>				Please enter a valid number!!");
		}
		return playerNum;
	}
	
}
	

class Umpire
{
	int guesserNum;
	int p1Num;
	int p2Num;
	int p3Num;
	int p4Num;
	int p5Num;
	int numberOfplayers;
	public void getGuesserNum()
	{
		Guesser obj = new Guesser();
		guesserNum = obj.guess();
	}
	 public void getPlayerNum()
	 {
		
		 NoOfPlayers obj = new NoOfPlayers();
		 numberOfplayers =obj.noOfPlayers();
		 if(numberOfplayers==2)
			{
				Player p1 = new Player();
				Player p2 = new Player();
				p1Num = p1.playerNumGuess();
				p2Num = p2.playerNumGuess();
			}
			if(numberOfplayers==3)
			{
				Player p1 = new Player();
				Player p2 = new Player();
				Player p3 = new Player();
				p1Num = p1.playerNumGuess();
				p2Num = p2.playerNumGuess();
				p3Num = p3.playerNumGuess();
			}
			if(numberOfplayers==4)
			{
				Player p1 = new Player();
				Player p2 = new Player();
				Player p3 = new Player();
				Player p4 = new Player();
				p1Num = p1.playerNumGuess();
				p2Num = p2.playerNumGuess();
				p3Num = p3.playerNumGuess();
				p4Num = p4.playerNumGuess();
			}
			if(numberOfplayers==5)
			{
				Player p1 = new Player();
				Player p2 = new Player();
				Player p3 = new Player();
				Player p4 = new Player();
				Player p5 = new Player();
				p1Num = p1.playerNumGuess();
				p2Num = p2.playerNumGuess();
				p3Num = p3.playerNumGuess();
				p4Num = p4.playerNumGuess();
				p5Num = p5.playerNumGuess();
			}
	 }
	 public void compare()
	 {
		 
		 switch (numberOfplayers)
		 {
		 case 2:
			 	if(guesserNum==p1Num)
			 	{
			 		if(p1Num==p2Num)
			 			System.out.println("		=>=>=>=>=>=>=>	Player 1 and player 2 guessed correctly	<=<=<=<=<=<=<=");
			 		else
			 			System.out.println("		=>=>=>=>=>=>=>	Player 1 won the game	<=<=<=<=<=<=<=");
			 	}
			 	else if(guesserNum==p2Num)
			 		System.out.println("		=>=>=>=>=>=>=>	Player 2 won the game	<=<=<=<=<=<=<=");
			 	else
			 		System.out.println("		=>=>=>=>=>=>=>	All players lost the game	<=<=<=<=<=<=<=");
			 break;
		 case 3:
			 	if(guesserNum==p1Num)
			 	{
			 		if(p1Num==p2Num)
			 		{
			 			if(p1Num==p3Num)
			 				System.out.println("		=>=>=>=>=>=>=>	All 3 players guessed correctly	<=<=<=<=<=<=<=");
			 			else
				 		    System.out.println("		=>=>=>=>=>=>=>	Player 1 and player 2 guessed correctly	<=<=<=<=<=<=<=");
			 		}
			 		else if(p1Num==p3Num)
			 			System.out.println("		=>=>=>=>=>=>=>	Player 1 and Player 3 won the game	<=<=<=<=<=<=<=");
			 		else
			 			System.out.println("		=>=>=>=>=>=>=>	Player 1 won the game	<=<=<=<=<=<=<=");
			 	}
			 	else if(guesserNum==p2Num)
			 	{
			 		if(p2Num==p3Num)
		 				System.out.println("		=>=>=>=>=>=>=>	Player 2 and player 3 guessed correctly	<=<=<=<=<=<=<=");
			 		else
			 			System.out.println("		=>=>=>=>=>=>=>	Player 2 won the game	<=<=<=<=<=<=<=");
			 	}
			 	else if(guesserNum==p3Num)
			 		System.out.println("		=>=>=>=>=>=>=>	Player 3 won the game	<=<=<=<=<=<=<=");
			 	else
			 		System.out.println("		=>=>=>=>=>=>=>	All players lost the game	<=<=<=<=<=<=<=");
			 break;
		 case 4:
			 	if(guesserNum==p1Num)
			 	{
			 		if(p1Num==p2Num)
			 		{
			 			if(p1Num==p3Num)
			 			{
			 				if(p1Num==p4Num)
			 					System.out.println("		=>=>=>=>=>=>=>	All 4 players guessed correctly	<=<=<=<=<=<=<=");
			 				else
			 					System.out.println("		=>=>=>=>=>=>=>	Player 1, Player 2 and Player 3 guessed correctly	<=<=<=<=<=<=<=");
			 			}
			 			else if(p1Num==p4Num)
			 				System.out.println("		=>=>=>=>=>=>=>	Player 1, Player 2 and Player 4 guessed correctly	<=<=<=<=<=<=<=");
			 			else
			 				System.out.println("		=>=>=>=>=>=>=>	Player 1 and player 2 guessed correctly	<=<=<=<=<=<=<=");
			 		}
			 		else if(p1Num==p3Num)
			 		{
			 			if(p1Num==p4Num)	
			 				System.out.println("		=>=>=>=>=>=>=>	Player 1,Player3 and Player 4 guessed correctly	<=<=<=<=<=<=<=");
			 			else
			 				System.out.println("		=>=>=>=>=>=>=>	Player 1 and Player 3 won the game	<=<=<=<=<=<=<=");
			 		}
			 		else if(p1Num==p4Num)
			 			System.out.println("		=>=>=>=>=>=>=>	Player 1 and Player 4 won the game	<=<=<=<=<=<=<=");
			 		else
			 			System.out.println("		=>=>=>=>=>=>=>	Player 1 won the game");
			 	}
			 	else if(guesserNum==p2Num)
			 	{
			 		if(p2Num==p3Num)
			 		{
			 			if(p2Num==p4Num)
			 				System.out.println("		=>=>=>=>=>=>=>	Player 2,Player 3 and Player 4 guessed correctly	<=<=<=<=<=<=<=");
			 			else
			 				System.out.println("		=>=>=>=>=>=>=>	Player 2 and player 3 guessed correctly	<=<=<=<=<=<=<=");
			 		}
			 		else if(p2Num==p4Num)
			 			System.out.println("		=>=>=>=>=>=>=>	Player 2 and player 4 guessed correctly	<=<=<=<=<=<=<=");
			 		else
			 			System.out.println("		=>=>=>=>=>=>=>	Player 2 won the game	<=<=<=<=<=<=<=");
			 	}
			 	else if(guesserNum==p3Num)
			 	{
			 	if(p3Num==p4Num)
			 		System.out.println("		=>=>=>=>=>=>=>	Player 3 and Player 4 won the game	<=<=<=<=<=<=<=");
			 	else
			 		System.out.println("		=>=>=>=>=>=>=>	Player 3 won the game	<=<=<=<=<=<=<=");
			 	}
			 	else if(guesserNum==p4Num)
			 		System.out.println("		=>=>=>=>=>=>=>	Player 4 won the game	<=<=<=<=<=<=<=");
			 	else
			 		System.out.println("		=>=>=>=>=>=>=>	All players lost the game	<=<=<=<=<=<=<=");	
			 break;
		 case 5:
			 if(guesserNum == p1Num)
			 {
				 if(p1Num==p2Num)
				 {
					 if(p1Num==p3Num)
					 {
						 if(p1Num==p4Num)
						 {
							 if(p1Num==p5Num)
								 System.out.println("		=>=>=>=>=>=>=>	All 5 players guessed correctly	<=<=<=<=<=<=<=");
							 else
								 System.out.println("		=>=>=>=>=>=>=>	Player 1,Player 2,Player 3 and player 4 guessed correctly	<=<=<=<=<=<=<=");
						 }
						 else if(p1Num==p5Num)
							 System.out.println("		=>=>=>=>=>=>=>	Player 1,Player 2,Player 3 and player 5 guessed correctly	<=<=<=<=<=<=<=");
						 else
							 System.out.println("		=>=>=>=>=>=>=>	Player 1, Player 2 and Player 3 guessed correctly	<=<=<=<=<=<=<=");
					 }
					 else if(p1Num==p4Num)
					 {
						 if(p1Num==p5Num)
							 System.out.println("		=>=>=>=>=>=>=>	Player 1,Player 2,Player 4 and Player 5 guessed correctly	<=<=<=<=<=<=<=");
						 else
							 System.out.println("		=>=>=>=>=>=>=>	PLayer 1,Player 2 and Player 4 guessed correctly	<=<=<=<=<=<=<=");
					 }
					 else if(p1Num==p5Num)
						 System.out.println("		=>=>=>=>=>=>=>	Player 1,Player 2 and Player 5 guessed correctly	<=<=<=<=<=<=<=");
					 else
						 System.out.println("		=>=>=>=>=>=>=>	Player 1 and player 2 guessed correctly	<=<=<=<=<=<=<=");
				 }
				 else if(p1Num==p3Num)
				 {
					 if(p1Num==p4Num)
					 {
						 if(p1Num==p5Num)
							 System.out.println("		=>=>=>=>=>=>=>	Player 1,Player 3,Player 4 and player 5 guessed correctly	<=<=<=<=<=<=<=");
						 else
							 System.out.println("		=>=>=>=>=>=>=>	Player 1,Player 3 and player 4 guessed correctly	<=<=<=<=<=<=<=");
					 }
					 else if(p1Num==p5Num)
						 System.out.println("		=>=>=>=>=>=>=>	Player 1, Player 3 and Player 5 guessed correctly	<=<=<=<=<=<=<=");
					 else
						 System.out.println("		=>=>=>=>=>=>=>	Player 1 and Player 3 guessed correctly	<=<=<=<=<=<=<=");
				 }
				 else if(p1Num==p4Num)
				 {
					 if(p1Num==p5Num)
						 System.out.println("		=>=>=>=>=>=>=>	Player 1,Player 4 and player 5 guessed correctly	<=<=<=<=<=<=<=");
					 else
						 System.out.println("		=>=>=>=>=>=>=>	Player 1 and Player 4 won the game	<=<=<=<=<=<=<=");
				 }	
				 else if(p1Num==p5Num)
			 		System.out.println("		=>=>=>=>=>=>=>	Player 1 and Player 5 won the game	<=<=<=<=<=<=<=");
				 else
					 System.out.println("		=>=>=>=>=>=>=>	Player 1 won the game	<=<=<=<=<=<=<=");
			 }
			 else if(guesserNum == p2Num)
			 {
				 if(p2Num==p3Num)
				 {
					 if(p2Num==p4Num)
					 {
						 if(p2Num==p5Num)
						 {
							 System.out.println("		=>=>=>=>=>=>=>	Player2,Player 3,Player 4 and player 5 guessed correctly	<=<=<=<=<=<=<=");
						 }
						 else
							 System.out.println("		=>=>=>=>=>=>=>	Player2,Player 3 and Player 4 guessed correctly	<=<=<=<=<=<=<=");
					 }
					 else if(p2Num==p5Num)
						 System.out.println("		=>=>=>=>=>=>=>	Player 2,Player 3 and Player 5 guessed correctly	<=<=<=<=<=<=<=");
					 else
						 System.out.println("		=>=>=>=>=>=>=>	Player 2 and Player 3 won the game	<=<=<=<=<=<=<=");
				 }
				 else if(p2Num==p4Num)
				 {
					 if(p2Num==p5Num)
						 System.out.println("		=>=>=>=>=>=>=>	Player 2,Player 4 and Player 5 guessed coprrectly	<=<=<=<=<=<=<=");
					 else	
						 System.out.println("		=>=>=>=>=>=>=>	Player 2 and player 4 guessed correctly	<=<=<=<=<=<=<=");
				 }
				 else if(p2Num==p5Num)
					 System.out.println("		=>=>=>=>=>=>=>	Player 2 and Player 5 guessed coprrectly	<=<=<=<=<=<=<=");
				 else
					 System.out.println("		=>=>=>=>=>=>=>	Player 2 won the game	<=<=<=<=<=<=<=");
			 }
			 else if(guesserNum==p3Num)
			 	{
			 	if(p3Num==p4Num)
			 	{
			 		if(p3Num==p5Num)
			 		{
			 			System.out.println("		=>=>=>=>=>=>=>	Player 3,Player 4 and Player 5 won the game	<=<=<=<=<=<=<=");
			 		}
			 		else
			 			System.out.println("		=>=>=>=>=>=>=>	Player 3 and Player 4 won the game	<=<=<=<=<=<=<=");
			 	}
			 	else if(p3Num==p5Num)
			 		System.out.println("		=>=>=>=>=>=>=>	Player 3 and Player 5 guessed correctly	<=<=<=<=<=<=<=");
			 	else
			 		System.out.println("		=>=>=>=>=>=>=>	Player 3 won the game	<=<=<=<=<=<=<=");
			 	}
			 else if(guesserNum==p4Num)
			 	{
				 	if(p4Num==p5Num)
				 		System.out.println("		=>=>=>=>=>=>=>	Player 4 and Player 5 won the game	<=<=<=<=<=<=<=");
				 	else
				 		System.out.println("		=>=>=>=>=>=>=>	Player 4 won the game	<=<=<=<=<=<=<=");
			 	}
			 else if(guesserNum == p5Num)
				 System.out.println("		=>=>=>=>=>=>=>	Player 5 won the game	<=<=<=<=<=<=<=");
			 else
				 System.out.println("		=>=>=>=>=>=>=>	Game lost by all three!	<=<=<=<=<=<=<=");
			break;
		 }
		
	 }

}
class EndFont
{
	int n=5;
	int m=6;
	int row=3;
	int col=60;
	public void endFont(){
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
				System.out.print("* ");
			System.out.println();
		}
		for(int i=0;i<n;i++)
		{
			//space
			for(int j=0;j<n;j++)
			{
					System.out.print("  ");
			}
			//space
			for(int j=0;j<n;j++)
			{
					System.out.print("  ");
			}
			//Alphabet T
			for(int j=0;j<n;j++)
			{
				
				if(i==0||j==(n-1)/2)
				{
					System.out.print("x ");
				}
				else
					System.out.print("  ");
			}
			
			System.out.print("  ");
			//Alphabet H
			for(int j=0;j<n;j++)
			{
				
				if(j==0||j==n-1||i==(n-1)/2)
				{
					System.out.print("x ");
				}
				else
					System.out.print("  ");
			}
			
			System.out.print("  ");
			//Alphabet E
			for(int j=0;j<n;j++)
			{
				
				if(j==0||i==n-1||i==0||i==(n-1)/2)
				{
					System.out.print("x ");
				}
				else
					System.out.print("  ");
			}
			System.out.print("   ");
			
			//Alphabet E
			for(int j=0;j<n;j++)
			{
				
				if(j==0||i==n-1||i==0||i==(n-1)/2)
				{
					System.out.print("x ");
				}
				else
					System.out.print("  ");
			}
			System.out.print("  ");
			//Alphabet N
			for(int j=0;j<n;j++)
			{
			
				if(j==0||i==j||j==n-1)
				{
					System.out.print("x ");
				}
				else
					System.out.print("  ");
			}
			System.out.print(" ");
			for(int j=0;j<n;j++)
			{
				if(j==0||i==0&&j<n-1||j==n-1&&i<n-1&&i>0||i==n-1&&j<n-1)
				{
					System.out.print("x ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
				System.out.print("* ");
			System.out.println();
		}
	}
}
public class run {

	public static void main(String[] args) {
		GuesserGameFont gfont = new GuesserGameFont();
		gfont.guesserGameFonr();
		Umpire obj = new Umpire();
		obj.getGuesserNum();
		obj.getPlayerNum();
		obj.compare();
		System.out.println();
		EndFont font = new EndFont();
		font.endFont();
	}
}
