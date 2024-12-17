import java.util.Scanner;
class WashingMachine{
public static void main(String[]args){
Scanner scan=new Scanner(System.in);
System.out.println("Enter the weight in grams:");
int grams=scan.nextInt();
if(grams>0 && grams<=2000){
	System.out.println("It takes 25 minutes");
	}
else if(grams>2000 && grams<=4000){
	System.out.println("It takes 35 minutes");
	}
else if(grams>4000 && grams<=7000){
	System.out.println("It takes 45 minutes");
	}
else if(grams>7000){
	System.out.println("OVERLOADED");
	}
else if(grams==0){
	System.out.println("It takes zero minutes");
	}
else{
	System.out.println("INVALID INPUT");
	}
}
}
