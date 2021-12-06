import java.util.Scanner;

public class TesteEntrada {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int valor;
	System.out.println("Por favor, digite um valor inteiro");
	valor = teclado.nextInt();
	System.out.println("O valor digitado foi:" + valor);
}
}
