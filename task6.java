import java.util.*;
public class task6 {
    public static void main(String[] args){
        int number,quotient,i=1,j;
        int binNum[]=new int[20];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the  Decimal  Number");
        number =s.nextInt();
        quotient=number;
        while(quotient!=0){
            binNum[i]=quotient%2;
            quotient=quotient/2;
            i++;
        }
        System.out.println("the binary number is : ");
        for(j=i-1; j>0; j--)
        {
            System.out.print(binNum[j]);
        }
        System.out.print("\n");


    }
}
