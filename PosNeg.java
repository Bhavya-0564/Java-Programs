import java.util.Scanner;
class PosNeg{
public static void main(String[]args){
Scanner obj=new Scanner(System.in);
System.out.println("Enter a Number");
int num=obj.nextInt();
if(num>0){
	System.out.println(num+"is positive");
}
else if(num<0){
	System.out.println(num+"is negative");
}
else{
	System.out.println("Neither negative nor positive");
}
}
}