import java.util.*;
public class task1 {
    public static void calculateArea(float wid,float hei){
        System.out.println("area of rectangle is :");
        float area=wid*hei;
        System.out.println(area);
    }
    public static void calculatePerimeter(float width,float height){
        System.out.println("perimeter of rectangle is :");
        float perimeter=2*(width+height);
        System.out.println(perimeter);
    }
    public static void main(String[] args)
    {
        Scanner S=new Scanner(System.in);
        System.out.println("enter the width :");
        float width=S.nextFloat();
        System.out.println("enter the height :");
        float height=S.nextFloat();
        calculateArea(width,height);
        calculatePerimeter(width,height);
    }
}