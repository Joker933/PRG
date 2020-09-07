import java.util.Scanner;

public class Delitelnost {

	public static void main(String[] args) {

		int x = 0;
		int y = 0;
		int pocet;
		int zbytek=0;
		Scanner in = new Scanner(System.in);
		System.out.print("Zadej Prvocisla : ");

		int number = in.nextInt();

		if(number % 7 == 0) {
			System.out.println("Ano, je delitelne");
		} else {
			System.out.println("Ne, neni delitelne");
		}
		System.out.println("-----------------------------------------------");

		for ( x = 0; x < 100; x++) {
            pocet = 0;
                for ( y = 1; y <= x; y++) {
                    zbytek = x%y;
                    if (zbytek == 0) {
                        pocet = pocet + 1;
                }
            }if (pocet == 2) {
                System.out.print(x + ", ");
            }
        }
	}
}