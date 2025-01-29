//To check whether the given number is prime or not
import java.util.Scanner;//import scanner class
public class PrimeOrNotPrime{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);//create scanner object
System.out.println("Enter a number:");
int n = sc.nextInt();
int count = 0;
for(int i = 1;i<=n;i++){
if(n%i==0){
count++;//count factor "i"
}
}
if(count == 2){//A prime number has exactly 2 factors:1 and itself
System.out.println("It is a prime number");
}
else{
System.out.println("It is not a prime number");
}
}
}