import java.util.Scanner;

public class month {
   public static void main(String[] args){
        int no;
        Scanner mn = new Scanner(System.in);

        no = mn.nextInt();

        switch(no){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("JULY");
                break;
            case 8:
                System.out.println("AUGUST");
                break;
            case 9:
                System.out.println("SEPTEMBER");
                break;
            case 10:
                System.out.println("OCTOMBER");
                break;
            case 11:
                System.out.println("NOVMBER");
                break;
            default:
                System.out.println("December");
            }
   }
}
