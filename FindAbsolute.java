import java.util.Scanner;
class FindAbsolute{
public static void main(String[]args){
Scanner scan=new Scanner(System.in);
System.out.println("Enter the value");
int num=scan.nextInt();
num=Math.abs(num);
System.out.println("The absolute value is:"+num);
}
}