import java.util.Scanner;
public class LCM{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a:");
int a = sc.nextInt();
System.out.println("Enter b:");
int b = sc.nextInt();
int GCD_a = a;
int GCD_b = b;
while(b!=0){
int remainder = a%b;
a = b;
b = remainder;
}
int GCD = a;
int LCM = (GCD_a *GCD_b)/GCD;
System.out.println("The LCM is :" + LCM);
}
}