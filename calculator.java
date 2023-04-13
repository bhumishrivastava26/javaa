import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        int num1,num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the numbers :");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println("enter the operator (+,-,*,/,%): ");
        char op = sc.next().charAt(0);
        float o=0;

        switch(op){
            case '+':
                o = num1+num2;
                System.out.println(num1+" "+op+" "+num2+" = "+ o);
                break;
            case '-':
                o = num1-num2;
                System.out.println(num1+" "+op+" "+num2+" = "+ o);
                break;
            case '*':
                o = num1*num2;
                System.out.println(num1+" "+op+" "+num2+" = "+ o);
                break;
            case '/':
                o = num1/num2;
                System.out.println(num1+" "+op+" "+num2+" = "+ o);
                break;
            case '%':
                o = num1%num2;
                System.out.println(num1+" "+op+" "+num2+" = "+ o);
                break;
            default:
                System.out.println("you enter wrong input.");

        }
       
    }
}