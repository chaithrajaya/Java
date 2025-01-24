import java.util.Scanner;
public class PrimeOrNot{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number:");
int n = sc.nextInt();
if(n<=1){
System.out.println("It is not a prime number");
}
else{
boolean isPrime = true;
for(int i=2;i<=n/2;i++){
if(n%i==0){
isPrime = false;
break;
}
}
if(isPrime){
System.out.println("It is a prime number");}
else{
System.out.println("It is not a prime number");}
}
}
}