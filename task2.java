import java.util.*;

public class task2 {
    public static void swap(float num1,float num2 ){
        float temp=0f;
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("after swapping numbers is :");
        System.out.println("first number is :  "+num1+"\n"+"second number is :  "+num2);


    }
    public static void main(String []args){
        Scanner S=new Scanner(System.in);
        System.out.println("enter first number :");
        float number1=S.nextFloat();
        System.out.println("enter second number  :");
        float number2=S.nextFloat();
        System.out.println("before swapping numbers is : ");
        System.out.println("first number is :  "+number1+"\n"+"second number is :  "+number2);
        swap(number1,number2);

    }
}
