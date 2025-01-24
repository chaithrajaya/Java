import java.util.Scanner;
public class Fibonacci{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number:");
int n = sc.nextInt();
int n1 = 0;
int n2 = 1;
int n3;
System.out.println("The fibonacci series is:");
for(int i=0;i<=10;i++){

System.out.println(n1);
n3=n1+n2;
n1=n2;
n2=n3;
}
}
}