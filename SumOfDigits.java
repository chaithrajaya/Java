import java.util.Scanner;
public class SumOfDigits{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number:");
int n = sc.nextInt();
int Sum = 0;
while(n>0)
{
int R = n%10;
Sum+=R;
n/=10;
}
System.out.println("The sum is:"+Sum);

}
}