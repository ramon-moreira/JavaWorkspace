import java.util.Scanner;

public class Area {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int lado, resultado;
	System.out.println("Por favor, digite o valor do lado do quadrado:");
	lado = teclado.nextInt();
	resultado = lado * lado;
	System.out.println("A área do quadrado é:" + resultado);
}
}
