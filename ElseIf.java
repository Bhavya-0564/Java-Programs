import java.util.Scanner;
class ElseIf{
public static void main(String[]args){
Scanner scan=new Scanner(System.in);
System.out.println("Enter two numbers:");
int a=scan.nextInt();
int b=scan.nextInt();
int sum=0;
sum=a+b;
if(sum>0){
System.out.println("+ve==>Square "+sum*sum);
}
else if(sum<0){
System.out.println("-ve==>Cube "+ -1*sum*sum*sum);
}
else{
System.out.println("0==>Zero");
}
}
}