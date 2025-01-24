import java.util.Scanner;
public class FloatCompare{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first float:");
float n1=sc.nextFloat();
System.out.println("Enter the second float:");
float n2 = sc.nextFloat();
n1=((int)(n1*1000))/1000;
n2=((int)(n2*1000))/1000;
if(n1==n2){
System.out.println("The numbers are equal");
}
else{
System.out.println("The numbers are not equal");
}
}
}