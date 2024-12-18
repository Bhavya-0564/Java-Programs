import java.util.Scanner;
class DecideTheDay{
public static void main(String[]args){
Scanner scan=new Scanner(System.in);
System.out.println("Enter the day");
String day=scan.next();
if(day.equals("Monday")||day.equals("Tuesday")||day.equals("Wednesday")||day.equals("Thursday")||day.equals("Friday")){
System.out.println("Working day");
}
else if(day.equals("Saturday")){
System.out.println("optional working day");
}
else{
System.out.println("willingly working day");
}
}
}
