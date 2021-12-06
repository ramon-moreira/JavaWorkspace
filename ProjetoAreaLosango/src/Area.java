import java.util.Scanner;

public class Area {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	double diagonal1, diagonal2, resultado;
	System.out.println("Por favor, informe a diagonal1:");
	diagonal1 = entrada.nextDouble();
	System.out.println("Por favor, digite a diagonal2:");
	diagonal2 = entrada.nextDouble();
	resultado = diagonal1 * diagonal2;
	System.out.println("A área do losango é:" + resultado);
}
}
