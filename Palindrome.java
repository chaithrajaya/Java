import java.util.Scanner;
public class Palindrome{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number:");
int n = sc.nextInt();
int reverse = 0;
int temp=n;
while(temp!=0){
int remainder = temp%10;
reverse=reverse*10+remainder;
temp/=10;
}
if(n == reverse){
System.out.println("The number is palindrome");
}
else{
System.out.println("The number is not palindrome");
}
}
}