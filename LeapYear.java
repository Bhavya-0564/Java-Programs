import java.util.Scanner;
class LeapYear{
public static void main(String[]args){
Scanner obj=new Scanner(System.in);
System.out.println("Enter the Year");
int num=obj.nextInt();

   if(num%100==0){
	if(num%400==0){
		System.out.println(num+"is a leap year.");
		}  
         else{
System.out.println(num+"is not a leap year");
}
     }
   else if(num%4==0){
		System.out.println(num+"is a leap year.");
		}
else{
		System.out.println(num+"is not a leap year.");
}
	
}
}




