import java.util.Scanner;
public class GCD{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a:");
int a = sc.nextInt();
System.out.println("Enter b:");
int b = sc.nextInt();
while(b!=0){
int remainder = a%b;
a = b;
b = remainder;
}
System.out.println("The GCD is: "+a);
}
}