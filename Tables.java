import java.util.Scanner;
public class Tables{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number:");
int n = sc.nextInt();
for(n=1;n<=10;n++){
for(int i=1;i<=10;i++){
System.out.println(n+"*"+i+"="+(n*i));
}
System.out.println();
}
}
}