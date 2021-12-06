import java.util.Scanner;

public class TrianguloOuNaoTriangulo {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	Double a, b, c;
	System.out.println("Por favor, digite o valor do lado1:");
	a = entrada.nextDouble();
	System.out.println("Por favor, digite o valor do lado2:");
	b = entrada.nextDouble();
	System.out.println("Por favor, digite o valor do lado3:");
	c = entrada.nextDouble();
	System.out.println("O valor do lado 1 é:" + a);
	System.out.println("O valor do lado 2 é:" + b);
	System.out.println("O valor do lado 3 é:" + c);
	if (a + b < c || b + c < a || a + c < b) {
		System.out.println("Não, não é um triângulo");
}
	else {
		System.out.println("Sim, é um triângulo");
}
}
}
