//To reverse a number
import java.util.Scanner;
public class ReverseNumber{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number:");   
int n = sc.nextInt();
int reverse = 0;           
while(n!=0){                               
int temp = n%10;                          
reverse = reverse*10 + temp;              
n=n/10;      
}
System.out.println("The reversed number is:" + reverse);
}
}                             