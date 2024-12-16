import java.util.Scanner;
class Addition{
public static void main(String[]args){
System.out.println("Addition of two numbers \nEnter two numbers");
Scanner scan= new Scanner(System.in);
int num1=scan.nextInt();
int num2=scan.nextInt();
int sum=0;
sum=num1+num2;
System.out.println("The sum of two numbers is:"+sum);
}
}