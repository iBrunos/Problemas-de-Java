import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int tipo = 0;
		while (tipo != 4) {
			tipo = scan.nextInt();
			while (tipo < 1 || tipo > 4) {
				tipo = scan.nextInt();
			}
			switch (tipo) {
				case 1: alcool++; break;
				case 2: gasolina++; break;
				case 3: diesel++; break;
			}
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
        scan.close();

    }
}
