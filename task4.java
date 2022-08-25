import java.util.*;
public class task4 {
    public static void binaryAdd(int numOne,int numTwo){
        System.out.println("Sum = " + Integer.toBinaryString(numOne + numTwo));
    }
    public static void binaryMul(int numOne,int numTwo){
        System.out.println("Product = " + Integer.toBinaryString(numOne * numTwo));
    }
    public static void binaryDiv(int numOne,int numTwo){
        System.out.println("Division = " + Integer.toBinaryString(numOne / numTwo));
    }
    public static void main(String[] args) {
String bOne, bTwo;
int iOne, iTwo;
Scanner scanner = new Scanner(System.in);
System.out.println("Enter First Binary Number");
bOne = scanner.next();
System.out.println("Enter Second Binary Number");
bTwo = scanner.next();
iOne = Integer.parseInt(bOne, 2);
iTwo = Integer.parseInt(bTwo, 2);
binaryAdd(iOne,iTwo);
binaryMul(iOne,iTwo);
binaryDiv(iOne,iTwo);

    }

}
