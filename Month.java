import java.util.Scanner;
class Month{
public static void main(String[]args){
Scanner scan=new Scanner(System.in);
System.out.println("Enter the month number");
int month=scan.nextInt();
if(month==1||month==3||month==5||month==8||month==10||month==12||month==7){
	System.out.println("It has 31 days");
}
else if(month==4||month==6||month==9||month==11){
	System.out.println("It has 30 days");
}
else{
	System.out.println("If it is a leap year it has 29 days or 28 day if not a leap year");
}
}
}