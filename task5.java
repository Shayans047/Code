import java.util.*;
public class task5 {
    public static void conversion(int num1,int num2){
        System.out.println("first binary number in decimal is :  "+num1);
        System.out.println("second binary number in decimal is :  "+num2);

    }
    public static void main(String []args){
        String bOne, bTwo;
        int iOne, iTwo;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Binary Number");
        bOne = scanner.next();
        System.out.println("Enter Second Binary Number");
        bTwo = scanner.next();
        iOne = Integer.parseInt(bOne, 2);
        iTwo = Integer.parseInt(bTwo, 2);
        conversion(iOne,iTwo);
    }
}
