import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        int n;
        Scanner pt = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        n=pt.nextInt();
        for(int i=1;i<=n;i++){
           for(int j=1;j<=n;j++){
            System.out.print(" * ");
           }
           System.out.println();
        }
    }
}
