import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
				
		System.out.println("Entre com as medidas do triangulo x : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int x = (a + b + c) /2;
		
		System.out.println("Entre com as medidas do triangulo y : ");
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		
		int y = (d + e + f)/2;
		
		System.out.println("Area do triangulo X: " + x);
		System.out.println("Area do triangulo Y: " + y);
		
		if(x > y) {
			System.out.println("A maior area é do triangulo X: " + x);
		}else {
			System.out.println("A maior area é do triangulo Y: " + y);
		}
		
		sc.close();
	}

}
