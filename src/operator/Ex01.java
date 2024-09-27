package operator;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Ex01 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("수 입력: ");
	int a,num1,num2;
	a = input.nextInt();
	String str = (a%3==0)?"3의 배수이다":"3의 배수가 아니다"; 
	System.out.println(a + " = "+str);
	
	System.out.println("두 수 입력: ");
	num1 = input.nextInt();
	num2 = input.nextInt();
	System.out.println("num1 : "+num1 + " ,num2 : "+num2);
	str = (num1>num2)?"num1가 num2보다 크다":"num2가 num1보다 크다"; 
	System.out.println(str);
	
	
	
	
}
}
