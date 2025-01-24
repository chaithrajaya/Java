import java.util.Scanner;
public class SwapTemp{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of a:");
int a = sc.nextInt();
System.out.println("Enter the value of b:");
int b = sc.nextInt();
System.out.println("The value of a and b before swapping:");
System.out.println("a = "+a);
System.out.println("b = "+b);
int temp = a;
a = b;
b = temp;
System.out.println("The value of a and b after swapping:");
System.out.println("a = "+a);
System.out.println("b = "+b);
}
}