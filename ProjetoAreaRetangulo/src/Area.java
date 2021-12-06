import java.util.Scanner;

public class Area {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int a, b, c;
	System.out.println("Por favor, digite o valor da base do retângulo:");
	a = teclado.nextInt();
	System.out.println("Por favor, digite o valor do lado do retângulo:");
	b = teclado.nextInt();
	c = a * b;
	System.out.println("A área do retângulo é:" + c);
}
}
