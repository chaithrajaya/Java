import java.util.Scanner;
public class AgeClassification{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter your Age:");
int age = sc.nextInt();
if(age<0){
System.out.println("Invalid age");
}
else if(age==0||age<=12){
System.out.println("You are a Child");
}
else if(age==13||age<=19){
System.out.println("You are an Teenager");
}
else if(age==20||age< =64){
System.out.println("You are an Adult");
}
else{
System.out.println("You are a Senior");
}

}
}