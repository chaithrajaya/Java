import java.util.Scanner;
public class Ternary{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of a:");
int a = sc.nextInt();
System.out.println("Enter the value of b:");
int b = sc.nextInt();
System.out.println("The value of a =" + a + " and b = " + b); 
int c = ((a>b)?a:b);
System.out.println("The larger value is "+c);

}
}
