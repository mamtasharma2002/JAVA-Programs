import java.util.Scanner;
class TicTacToeGame {
	char arr[][] = new char[3][3];
	public TicTacToeGame() {
		for (int i = 0; i < 3; i++ ) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = '_';
			}
		}
	}
	void Display() {
		for (int i = 0; i < 3; i++ ) {
			System.out.print("\t");
			for (int j = 0; j < 3; j++) {
				if (j == 2)
					System.out.print(" " + arr[i][j]);
				else
					System.out.print(" " + arr[i][j] + " |");
			}
			System.out.println();

		}
	}
	void setData(int pos, char data) {
		int i = pos / 3;
		int j = pos % 3;
		if (arr[i][j] == '_') {
			if (data == 'X' || data == 'O')
				arr[i][j] = data;
			else
				System.out.println("Enter correct symbol");
		} else {
			System.out.println("Position already filled");
		}

	}
	void clearScreen() {
		try {
			Runtime.getRuntime().exec("cls");
		} catch (Exception e) {

		}
	}
	boolean check() {
		return false;

	}
}
class tictactoe {
	public static void main(String[] args) {
		TicTacToeGame t1 = new TicTacToeGame();
		int turn = 0;
		while (check()) {
			t1.Display();
			System.out.println("Enter the position(1-9):");
			Scanner sc = new Scanner(System.in);
			int pos = sc.nextInt();
			pos--;
			sc.close();
			if (turn == 0) {
				t1.setData(pos, 'O');
				turn = 1;
			} else {
				t1.setData(pos, 'X');
				turn = 0;
			}
		}

	}

	private static boolean check() {
		return false;
	}
}