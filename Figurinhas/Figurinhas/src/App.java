import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
            Figuras troca = new Figuras();
            Scanner prompt = new Scanner(System.in);
            int count;
            count = prompt.nextInt();
    
            for (int i = 0; i < count; i ++) {
                troca.a = prompt.nextInt();
                troca.b = prompt.nextInt();
    
                troca.trocarFigura(troca.a, troca.b);
    
                int resp = troca.trocarFigura(troca.a, troca.b);
    
                System.out.println(resp);
            }

    }

    private static class Figuras {
        int a;
        int b;
    
         int trocarFigura (int a, int b) {
            if ((a % b) == 0) {
                return b;
            }
                return trocarFigura(b, a % b);
        }
    }


}
