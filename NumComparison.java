import java.util.Scanner;
class NumComparison{
public static void main(String[]args){
System.out.println("Comparison of two numbers \nEnter two numbers:");
Scanner scan=new Scanner(System.in);
int num1=scan.nextInt();
int num2=scan.nextInt();
if (num1>num2)
System.out.println(num1+"is greater");
else
System.out.println(num2+"is greater");
}
}

