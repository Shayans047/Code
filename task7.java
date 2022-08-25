import java.util.*;
public class task7 {
    public static void octalConversion(int numOne,int numTwo[],int numThree){
        while(numOne!=0){
         numTwo[numThree]=numOne%8;
         numOne=numOne/8;
         numThree++;

}
        System.out.println("the octal number is : ");
        for (int j=numThree-1;j>0;j--){
            System.out.print(numTwo[j]);
        }
        System.out.println("\n");

   }
    public static void main(String[] args){
        int i=1;

        int octalNum[]=new int[20];
        Scanner sc= new Scanner(System.in);
        int number=sc.nextInt();
        octalConversion(number,octalNum,i);
    }
}






