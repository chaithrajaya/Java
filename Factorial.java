import java.util.Scanner;
public class Factorial{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number:");
int n = sc.nextInt();
int factorial = 1;
for(int i=1;i<=n;i++)
factorial*=i;
{

System.out.println("The Factorial of " + n + " is: " + factorial);
}
}
}