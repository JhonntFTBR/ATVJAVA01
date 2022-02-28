package portugolAtv;

import java.util.Scanner;

public class Portugol01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int anos, mes, di, D;
		anos = 365;
		mes = 30;

		System.out.println("escreva sua idade (somente em dias) " );
		di = leia.nextInt();

		anos = di / anos;
		
		System.out.println("Sua idade em anos é: " + anos);

		mes = di / mes;
				System.out.println("Sua idade em meses é: " + mes );

		D = di;
		System.out.println(D);

		
	}

	}


