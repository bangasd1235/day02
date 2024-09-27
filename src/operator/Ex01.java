package operator;

public class Ex01 {
public static void main(String[] args) {
	int n1 = 9, n2 = 2;
	System.out.println( n1/ n2);
	System.out.println( n1/ (double)n2);
	System.out.println( n1% n2);
	
	System.out.println("================================");
	n1= n2= 5;
	System.out.println(n1 += n2);
	System.out.println(n1 -= n2);
	System.out.println(n1 *= n2);
	System.out.println(n1 /= n2);
	System.out.println(n1 %= n2);
	
	n1 = 5;
	n2 = 4;
	System.out.println(n1 > n2);
	System.out.println(n1 <= n2);
	System.out.println(n1 == n2);
	System.out.println(n1 != n2);
	
	boolean result = (n1 !=n2);
	System.out.println(result);
	
	int n3 =10;
	n1 = 5; n2 = 7;
	System.out.println(n1 > n2);
	System.out.println(n1 > n3);
	System.out.println(n1 > n2 && n1 > n3);
	System.out.println(n2 > n1 && n2 > n3);
	System.out.println(n3 > n2 && n3 > n1);
	
	System.out.println(true || true);
	System.out.println(true || false);
	System.out.println(false || true);
	System.out.println(false || false);
	
	System.out.println(!(true));
	System.out.println(!(10>20));
	
	n1= 5;
	++n1;
	System.out.println(n1);
	
	n2 = 5;
	n2++;
	System.out.println(n2);

	n1= 10;
	n2 = ++n1;
	System.out.println(n1);
	System.out.println(n2);
	
	n1= 10;
	n2 = n1++;
	System.out.println(n1);
	System.out.println(n2);

	n1 = 30; n2 = 20;
	String r = (n1 > n2)?"n1이 n2보다 크다" :"n2이 n1보다 크다" ;
	System.out.println(r);

}
}
