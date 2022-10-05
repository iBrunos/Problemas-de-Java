import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt();
        int Z = scan.nextInt();
        int cont = 0;
        int soma = 0;
        while (Z <= X) {
        	Z = scan.nextInt();
        }
        while (soma < Z) {
        	soma += X;
        	cont++;
        	X++;
        }
        System.out.println(cont);
        scan.close();


    }
}
