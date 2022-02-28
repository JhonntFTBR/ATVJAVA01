package portugolAtv;

import java.util.Scanner;

public class Portugol04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a, b, c;
		double R, S, D;


		System.out.println("Entre com o primeiro numero: ");
		a = leia.nextInt();

		System.out.println("Entre com o segundo numero: ");
		b = leia.nextInt();

		System.out.println("Entre com o terceiro numero: ");
		c = leia.nextInt();

		R = (a+b)^2;
		S = (b+c)^2;
		D = (R+S)/2;

				System.out.println(D);
	}

	}


