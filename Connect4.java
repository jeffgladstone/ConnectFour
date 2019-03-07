import java.util.Scanner;

/*
 * Title: Connect Four Game
 * Author: Jeff Gladstone
 * Date Created: 2/26/19
 */
public class Connect4 {

	//public field variables
	public static char[][] board = new char[6][7]; //6 x 7 board
	public static boolean player1 = false; //keeps track of player
	public static Scanner scan = new Scanner(System.in); //scanner for marker placement
	public static int[] curr = new int[]{0,0}; //current marker's coordinates (x,y)

	/*
	 * Plays unlimited games of Connect Four
	 */
	public static void main(String[] args)
	{
		while(true) {
			playGame();
			System.out.println("Press <ENTER> to play again!");
			new Scanner(System.in).next();
		}
	}

	/*
	 * playGame() begins with a welcoming message on the console.
	 * It contains the main game loop which iterates while the game is NOT over.
	 * Displays board at end of game
	 */
	public static void playGame()
	{
		System.out.println("Welcome to Connect Four. Player 1: X's, Player 2: O's.\n");
		populateBoard();
		while (!gameOver())
		{
			printBoard();
			player1 = !player1;
			if (player1)
				System.out.println("Player 1, pick a column to place an X: ");
			else
				System.out.println("Player 2, pick a column to place an 0: ");
			placeMarker();	
		}

		System.out.println("Final board:\n");
		printBoard();
	}

	/*
	 * gameOver() checks all win conditions as well as checking if the board is full
	 * after every turn.
	 */

	public static boolean gameOver() {
		if (isFilled())
		{
			System.out.println("Board is full.");
			return true;
		}
		if (checkCol() || checkRow() || checkDiag1() || checkDiag2())
		{
			if(player1)
				System.out.println("Player 1 wins!");
			else
				System.out.println("Player 2 wins!");
			return true;
		}
		else
			return false;

	}

	//Checks for 4 consecutive markers in a column
	public static boolean checkCol() {
		int y = curr[1];
		int same = 1;
		for (int x = 0; x < board.length-1; x++)
		{
			if (board[x][y] !='.' && board[x+1][y] == board[x][y])
				same++;
			else
				same = 1;
			if (same == 4)
			{
				System.out.print("\n4");
				if (player1)
					System.out.print(" X's ");
				else
					System.out.print(" 0s ");
				System.out.println("in a column!");
				return true;
			}
		}
		return false;
	}

	//Checks for 4 consecutive markers in a row
	public static boolean checkRow() {
		int x = curr[0];
		int same = 1;
		for (int y = 0; y < board[x].length-1; y++)
		{
			if (board[x][y] !='.' && board[x][y] == board[x][y+1])
				same++;
			else
				same = 1;
			if (same == 4)
			{
				System.out.print("\n4");
				if (player1)
					System.out.print(" X's ");
				else
					System.out.print(" 0s ");
				System.out.println("in a row!");
				return true;
			}
		}
		return false;
	}

	//Checks for 4 consecutive markers in the top-left to bottom-right diagonal
	public static boolean checkDiag1() {
		int x = 5;
		int y = 6;
		int same = 1;
		while (x > 0 && y > 0) {
			if (board[x][y] !='.' && board[x][y] == board[x-1][y-1])
				same++;
			else
				same = 1;
			if (same == 4)
			{
				System.out.print("\n4");
				if (player1)
					System.out.print(" X's ");
				else
					System.out.print(" 0s ");
				System.out.println("in a diagonal!");
				return true;
			}
			x--;
			y--;
		}
		//again
		x = 5;
		y = 3;
		same = 1;
		while (x > 0 && y > 0) {
			if (board[x][y] !='.' && board[x][y] == board[x-1][y-1])
				same++;
			else
				same = 1;
			if (same == 4)
			{
				System.out.print("\n4");
				if (player1)
					System.out.print(" X's ");
				else
					System.out.print(" 0s ");
				System.out.println("in a diagonal!");
				return true;
			}
			x--;
			y--;
		}
		//again
		x = 5;
		y = 4;
		same = 1;
		while (x > 0 && y > 0) {
			if (board[x][y] !='.' && board[x][y] == board[x-1][y-1])
				same++;
			else
				same = 1;
			if (same == 4)
			{
				System.out.print("\n4");
				if (player1)
					System.out.print(" X's ");
				else
					System.out.print(" 0s ");
				System.out.println("in a diagonal!");
				return true;
			}
			x--;
			y--;
		}
		//again
		x = 3;
		y = 5;
		same = 1;
		while (x > 0 && y > 0) {
			if (board[x][y] !='.' && board[x][y] == board[x-1][y-1])
				same++;
			else
				same = 1;
			if (same == 4)
			{
				System.out.print("\n4");
				if (player1)
					System.out.print(" X's ");
				else
					System.out.print(" 0s ");
				System.out.println("in a diagonal!");
				return true;
			}
			x--;
			y--;
		}
		//again
		x = 4;
		y = 5;
		same = 1;
		while (x > 0 && y > 0) {
			if (board[x][y] !='.' && board[x][y] == board[x-1][y-1])
				same++;
			else
				same = 1;
			if (same == 4)
			{
				System.out.print("\n4");
				if (player1)
					System.out.print(" X's ");
				else
					System.out.print(" 0s ");
				System.out.println("in a diagonal!");
				return true;
			}
			x--;
			y--;
		}
		//again
		x = 5;
		y = 5;
		same = 1;
		while (x > 0 && y > 0) {
			if (board[x][y] !='.' && board[x][y] == board[x-1][y-1])
				same++;
			else
				same = 1;
			if (same == 4)
			{
				System.out.print("\n4");
				if (player1)
					System.out.print(" X's ");
				else
					System.out.print(" 0s ");
				System.out.println("in a diagonal!");
				return true;
			}
			x--;
			y--;
		}
		return false;
	}

	//Checks for 4 consecutive markers in the bottom-left to top-right diagonal
	public static boolean checkDiag2() {
		int x = 5;
		int y = 0;
		int same = 1;
		while (x > 0 && y < 6) {
			if (board[x][y] !='.' && board[x][y] == board[x-1][y+1])
				same++;
			else
				same = 1;
			if (same == 4)
			{
				System.out.print("\n4");
				if (player1)
					System.out.print(" X's ");
				else
					System.out.print(" 0s ");
				System.out.println("in a diagonal!");
				return true;
			}
			x--;
			y++;
		}
		//again
		x = 4;
		y = 0;
		same = 1;
		while (x > 0 && y < 6) {
			if (board[x][y] !='.' && board[x][y] == board[x-1][y+1])
				same++;
			else
				same = 1;
			if (same == 4)
			{
				System.out.print("\n4");
				if (player1)
					System.out.print(" X's ");
				else
					System.out.print(" 0s ");
				System.out.println("in a diagonal!");
				return true;
			}
			x--;
			y++;
		}//again
		x = 3;
		y = 0;
		same = 1;
		while (x > 0 && y < 6) {
			if (board[x][y] !='.' && board[x][y] == board[x-1][y+1])
				same++;
			else
				same = 1;
			if (same == 4)
			{
				System.out.print("\n4");
				if (player1)
					System.out.print(" X's ");
				else
					System.out.print(" 0s ");
				System.out.println("in a diagonal!");
				return true;
			}
			x--;
			y++;
		}//again
		x = 5;
		y = 1;
		same = 1;
		while (x > 0 && y < 6) {
			if (board[x][y] !='.' && board[x][y] == board[x-1][y+1])
				same++;
			else
				same = 1;
			if (same == 4)
			{
				System.out.print("\n4");
				if (player1)
					System.out.print(" X's ");
				else
					System.out.print(" 0s ");
				System.out.println("in a diagonal!");
				return true;
			}
			x--;
			y++;
		}//again
		x = 5;
		y = 2;
		same = 1;
		while (x > 0 && y < 6) {
			if (board[x][y] !='.' && board[x][y] == board[x-1][y+1])
				same++;
			else
				same = 1;
			if (same == 4)
			{
				System.out.print("\n4");
				if (player1)
					System.out.print(" X's ");
				else
					System.out.print(" 0s ");
				System.out.println("in a diagonal!");
				return true;
			}
			x--;
			y++;
		}
		//again
		x = 5;
		y = 3;
		same = 1;
		while (x > 0 && y < 6) {
			if (board[x][y] !='.' && board[x][y] == board[x-1][y+1])
				same++;
			else
				same = 1;
			if (same == 4)
			{
				System.out.print("\n4");
				if (player1)
					System.out.print(" X's ");
				else
					System.out.print(" 0s ");
				System.out.println("in a diagonal!");
				return true;
			}
			x--;
			y++;
		}
		return false;
	}

	//Populates the board at the start of the game with dots
	public static void populateBoard() {
		for (int i = 0; i < board.length; i++)
		{
			for (int j = 0; j < board[i].length; j++)
			{
				board[i][j] = '.';
			}
		}
	}

	//Prints board to console
	public static void printBoard() {
		System.out.println(" 0 1 2 3 4 5 6");
		System.out.println(" _____________");
		for (int i = 0; i < board.length; i++)
		{
			System.out.print(" ");
			for (int j = 0; j < board[i].length; j++)
			{
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	//Prompts and validates user input, and places a marker
	public static void placeMarker() {
		int y = -1;
		boolean valid = false;
		while(!valid)
		{
			if (scan.hasNextInt())
			{
				y = scan.nextInt();
				if (y > -1 && y < 7)
				{
					if (board[0][y] == '.')
						valid = true;
					else
						System.out.println("This column is full. Try again: ");
				}
				else
					System.out.println("Invalid column number. Try again: ");
			}
			else
			{
				valid = false;
				System.out.println("Not a number! Try again: ");
				scan.next();

			}
		}
		int x = 0;
		if (board[5][y] == '.')
		{
			x = 5;
			if (player1)
				board[x][y] = 'X';
			else
				board[x][y] = '0';
		}
		else
		{
			while(board[x+1][y] == '.')
			{
				x++;
			}
			if (player1)
				board[x][y] = 'X';
			else
				board[x][y] = '0';
		}
		curr[0] = x;
		curr[1] = y;
	}

	//Checks if board is filled
	public static boolean isFilled()
	{
		for (int i = 0; i < board.length; i++)
		{
			for (int j = 0; j < board[i].length; j++)
			{
				if (board[i][j] == '.')
					return false;
			}
		}
		return true;
	}
}
