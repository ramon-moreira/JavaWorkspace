import java.util.Scanner;

public class AreaTrapezio {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	double baseMaior, baseMenor, altura, resultado;
	System.out.println("Por favor, digite o valor da base maior do trap�zio:");
	baseMaior = entrada.nextDouble();
	System.out.println("Por favor, digite o valor da base menor do trap�zio:");
	baseMenor = entrada.nextDouble();
	System.out.println("Por favor, digite o valor da altura do trap�zio:");
	altura = entrada.nextDouble();
	System.out.println("A base maior do trap�zio �:" + baseMaior);
	System.out.println("A base menor do trap�zio �:" + baseMenor);
	System.out.println("A altura do trap�zio �:" + altura);
	resultado = (baseMaior + baseMenor) * altura / 2;
	System.out.println("A �rea do trap�zio �:" + resultado);
}
}
