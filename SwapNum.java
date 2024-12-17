import java.util.Scanner;
class SwapNum{
public static void main(String[]args){
System.out.println("Swapping Numbers");
Scanner obj=new Scanner(System.in);
int num1=obj.nextInt();
int num2=obj.nextInt();
num1=num1*num2;
num2=num1/num2;
num1=num1/num2;
System.out.println("After Swapping,\nThe Num1 is:"+num1);
System.out.println("The Num2 is:"+num2);
}
}
