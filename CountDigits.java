import java.util.Scanner;
public class CountDigits{
public static void main(String[] args){
int count=0;
int n;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number:");
n=sc.nextInt();
while(n!=0){
n=n/10;
count++;

}

System.out.println("The Entered number of Digit is:"+count);

}
}