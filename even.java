import java.util.Scanner;

/**
 * even
 */
public class even {
    public static void main(String[] args) {
        int n;
        Scanner ev = new Scanner(System.in);

        System.out.print("Enter the numbers wants to even numbeer: ");
        n = ev.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }/*else{
                System.out.println("odd " + i);
            }*/
        }
    }
}