import java.util.Scanner;
public class TrailingZeros{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number:");
int n = sc.nextInt();
int count=0;
while(n>0){
n=n/5;
count+=n;
}
System.out.println("The number of trailing zeros are:" + count);
}
}