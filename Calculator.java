import java.util.Scanner;
class Calculator{
public static void main(String[]args){
Scanner obj=new Scanner(System.in);
System.out.println("Enter two numbers followed by char");
int a=obj.nextInt();
int b=obj.nextInt();
char operation=obj.next().charAt(0);
int ans=0;
switch(operation){
	case '+':
		ans=a+b;
		break;
	case '-':
		ans=a-b;
		break;
	case '*':
		ans=a*b;
		break;
	case '/':
		ans=a/b;
		break;
	case '%':
		ans=a%b;
		break;
}
System.out.println("ans="+ans);
}
}


