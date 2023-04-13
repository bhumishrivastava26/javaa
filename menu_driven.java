import java.util.Scanner;
import java.util.jar.Manifest;

public class menu_driven {
    public static void main(String[] args) {
        int mr,val;
       Scanner marks = new Scanner(System.in);
       do{
       System.out.print("Enter the marks of a student: ");
        mr = marks.nextInt();
        if(100>=mr && mr>=90){
            System.out.println("This is Good");
        }else if(89>=mr && mr>=60){
            System.out.println("This is also Good");
        }else if(59>=mr && mr>=0){
            System.out.println("This is Good as Well");
        }else{
            System.out.println("Invalid value");
        }
        System.out.println("You want continue then press 1 or you want exit then press 0 :");
        val=marks.nextInt();
    }while(val==1);
    }
}
