import java.util.Scanner;

public class Area {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int a, b, c;
	System.out.println("Por favor, digite o valor da base do tri�ngulo:");
	a = teclado.nextInt();
	System.out.println("Por favor, digite o valor do lado do tri�ngulo:");
	b = teclado.nextInt();
	c = a * b / 2;
	System.out.println("A �rea do tri�ngulo � igual a:" + c);
}
}
