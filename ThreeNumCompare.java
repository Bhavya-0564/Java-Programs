import java.util.Scanner;
class ThreeNumCompare{
public static void main(String[]args){
System.out.println("Comparing three number");
Scanner obj=new Scanner(System.in);
int num1=obj.nextInt();
int num2=obj.nextInt();
int num3=obj.nextInt();
if(num1>num2 && num1>num3){
System.out.println(num1+"is greater");
}else if(num2>num1 && num2>num3){
System.out.println(num2+"is greater");
}else if(num3>num1 && num3>num2){
System.out.println(num3+"is greater");
}else{
System.out.println("Some are equal");
} 
}
}