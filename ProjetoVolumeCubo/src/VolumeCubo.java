import java.util.Scanner;

public class VolumeCubo {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	double lado, resultado;
	System.out.println("Por favor, digite o valor do lado do cubo. Ent�o ser� efetuado o c�lculo do volume do mesmo:");
	lado = entrada.nextDouble();
	System.out.println("O valor do lado do cubo �:" + lado);
	resultado = lado * lado * lado;
	System.out.println("O volume do cubo �:" + resultado);
}
}
