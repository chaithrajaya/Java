import java.util.Scanner;
public class PositiveOrNegative{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number:");
int n = sc.nextInt();
if(n==0){
System.out.println("The number is Zero.");
}
else if(n<0){
System.out.println("The number is Negative.");
}
else{
System.out.println("The number is Positive.");
}
}
}