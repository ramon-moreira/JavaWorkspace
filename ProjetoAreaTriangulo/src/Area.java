import java.util.Scanner;

public class Area {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int a, b, c;
	System.out.println("Por favor, digite o valor da base do triângulo:");
	a = teclado.nextInt();
	System.out.println("Por favor, digite o valor do lado do triângulo:");
	b = teclado.nextInt();
	c = a * b / 2;
	System.out.println("A área do triângulo é igual a:" + c);
}
}
