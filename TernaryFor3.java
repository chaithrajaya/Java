import java.util.Scanner;
public class TernaryFor3{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of a:");
int a = sc.nextInt();
System.out.println("Enter the value of b:");
int b = sc.nextInt();
System.out.println("Enter the value of c:");
int c = sc.nextInt();
int greatest = (a>b)?((a>c)?a:c):((b>c)?b:c);
System.out.println("The greatest value is:" + greatest);
}
}
