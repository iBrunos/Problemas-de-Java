import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        Integer N,LA,LB,SA,SB,i,j, count1, count2;

       
        N = scan.nextInt();
        LA = scan.nextInt();
        LB = scan.nextInt();
        SA = scan.nextInt();
        SB = scan.nextInt();
        
        count1 = 0;
        count2 = 0;


        for(i = LA; i <= LB; i++){
            if(i == N){
                count1++;
            }
        }
        for(j = SA; j <= SB; j++){
            if(j == N){
                count2++;
            }
        }
    
        if(count1 > 0 && count2 > 0){
            System.out.println("possivel");
        }
        else{
            System.out.println("impossivel");
        }
       
    scan.close();
    }
}
