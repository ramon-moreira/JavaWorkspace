import java.util.Scanner;

public class Inversao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero, novo, unidade, dezena, centena, resto;
		System.out.println("Digite um n�mero com 3 d�gitos a ser invertido:");
	numero = entrada.nextInt();
	centena = numero / 100;
	resto = numero % 100;
	dezena = resto / 10;
	unidade = resto % 10;
	novo = unidade * 100 + dezena * 10 + centena;
	System.out.println("O Inverso do n�mero �:" + novo);
}
}
